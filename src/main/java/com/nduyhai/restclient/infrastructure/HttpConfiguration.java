package com.nduyhai.restclient.infrastructure;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


@Configuration
public class HttpConfiguration {

    @Autowired
    private RestProperties restProperties;

    @Bean
    public RestTemplate restTemplate() {
        final CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setMaxConnPerRoute(this.restProperties.getMaxConnPerRoute())
                .setMaxConnTotal(this.restProperties.getMaxConnTotal())
                .build();
        final HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setHttpClient(httpClient);



        return new RestTemplate(factory);
    }




}
