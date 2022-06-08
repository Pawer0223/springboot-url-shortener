package com.taehan.urlshortener.dto;

import com.taehan.urlshortener.model.AlgorithmType;

public class UrlRequestDto {

    private String url;

    private AlgorithmType algorithmType;

    public UrlRequestDto(String url, AlgorithmType algorithmType) {
        this.url = url;
        this.algorithmType = algorithmType;
    }

    public String getUrl() {
        return url;
    }

    public AlgorithmType getAlgorithmType() {
        return algorithmType;
    }
}
