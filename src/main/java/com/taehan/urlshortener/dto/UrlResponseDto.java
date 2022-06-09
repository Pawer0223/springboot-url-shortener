package com.taehan.urlshortener.dto;

public class UrlResponseDto {
    private static final String PREFIX = "localhost:8080/";

    String shortUrl;

    public UrlResponseDto(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getShortUrl() {
        return PREFIX + shortUrl;
    }
}
