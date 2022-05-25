package kz.kcell.kaiten.services;

import kz.kcell.kaiten.config.Param;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContexts;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class ProxyCustomizer implements RestTemplateCustomizer {
    @Override
    public void customize(RestTemplate restTemplate) {
        HttpHost proxy = new HttpHost(Param.PROXY_HOST, Param.PROXY_PORT);

        TrustStrategy acceptingTrustStrategy = new TrustStrategy() {
            @Override
            public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                return true;
            }
        };

        DefaultProxyRoutePlanner defaultProxyRoutePlanner = new DefaultProxyRoutePlanner(proxy) {
            @Override
            public HttpHost determineProxy(HttpHost target, HttpRequest request, HttpContext context) throws HttpException {
                return super.determineProxy(target, request, context);
            }
        };

        HttpClient httpClient = null;
        try {
            httpClient = HttpClientBuilder.create()
                    .setRoutePlanner(defaultProxyRoutePlanner)
                    .setSSLContext(SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build())
                    .build();
//        } catch (Exception e) {
        } catch (NoSuchAlgorithmException | KeyManagementException | KeyStoreException e) {
            e.printStackTrace();
        }
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory(httpClient));
    }
}
