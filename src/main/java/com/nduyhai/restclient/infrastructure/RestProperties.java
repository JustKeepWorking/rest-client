package com.nduyhai.restclient.infrastructure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "http.client")
public class RestProperties {
    private int maxConnPerRoute;
    private int maxConnTotal;
    private String url;

    public int getMaxConnPerRoute() {
        return maxConnPerRoute;
    }

    public void setMaxConnPerRoute(int maxConnPerRoute) {
        this.maxConnPerRoute = maxConnPerRoute;
    }

    public int getMaxConnTotal() {
        return maxConnTotal;
    }

    public void setMaxConnTotal(int maxConnTotal) {
        this.maxConnTotal = maxConnTotal;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
