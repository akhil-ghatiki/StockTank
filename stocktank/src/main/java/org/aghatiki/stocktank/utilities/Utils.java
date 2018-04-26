package org.aghatiki.stocktank.utilities;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.TrustStrategy;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

/**
 * @author akhil_ghatiki
 * @date 4/26/2018
 * @time 2:58 PM
 */
public class Utils {

    private static Utils Instance = null;

    private Utils() {

    }

    public static Utils getInstance() {
        if (Instance == null) {
            Instance = new Utils();
        }
        return Instance;
    }

    /***
     *  This method is to handle suppressing the certificate trust manager.
     *  This has to be used when you are calling the alpha vantage API from a private network i.e., VPN.
     *  If you are calling the API using a public network you can ignore this part of code.
     *
     * @return
     */
    public HttpComponentsClientHttpRequestFactory getRequestFactory() {
        TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

        SSLContext sslContext = null;
        try {
            sslContext = org.apache.http.ssl.SSLContexts.custom()
                    .loadTrustMaterial(null, acceptingTrustStrategy)
                    .build();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }

        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

        CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLSocketFactory(csf)
                .build();

        HttpComponentsClientHttpRequestFactory requestFactory =
                new HttpComponentsClientHttpRequestFactory();

        requestFactory.setHttpClient(httpClient);

        return requestFactory;
    }
}
