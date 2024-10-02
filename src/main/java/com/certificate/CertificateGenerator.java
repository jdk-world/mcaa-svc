package com.certificate;

import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.jcajce.JcaPEMWriter;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.X509Certificate;
import java.util.Date;

public class CertificateGenerator {

    public static void main(String[] args) {
        try {
            // Add Bouncy Castle Provider
            Security.addProvider(new BouncyCastleProvider());

            // Generate Key Pair
            KeyPair keyPair = generateKeyPair();

            // Generate Self-Signed Certificate
            X509Certificate certificate = generateSelfSignedCertificate(keyPair);

            // Write Public Key and Certificate to PEM
            writeToPEM("publicKey.pem", keyPair.getPublic());
            writeToPEM("certificate.pem", certificate);
            // Write Private Key to PEM
            writeToPEM("privateKey.pem", keyPair.getPrivate());

            System.out.println("Certificate and keys generated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static KeyPair generateKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        return keyGen.generateKeyPair(); // Generates public and private keys
    }

    private static X509Certificate generateSelfSignedCertificate(KeyPair keyPair) throws Exception {
        long now = System.currentTimeMillis();
        Date startDate = new Date(now);
        Date endDate = new Date(now + (365 * 24 * 60 * 60 * 1000)); // 1 year validity

        X500Name issuer = new X500Name("CN=My Company");
        X500Name subject = new X500Name("CN=My Company");

        BigInteger serialNumber = BigInteger.valueOf(System.currentTimeMillis());

        JcaX509v3CertificateBuilder certBuilder = new JcaX509v3CertificateBuilder(
                issuer,
                serialNumber,
                startDate,
                endDate,
                subject,
                keyPair.getPublic()
        );

        X509CertificateHolder certHolder = certBuilder.build(new JcaContentSignerBuilder("SHA256WithRSA").build(keyPair.getPrivate()));
        return new JcaX509CertificateConverter().setProvider("BC").getCertificate(certHolder);
    }

    private static void writeToPEM(String fileName, Object object) {
        try (JcaPEMWriter pemWriter = new JcaPEMWriter(new FileWriter(fileName))) {
            pemWriter.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
