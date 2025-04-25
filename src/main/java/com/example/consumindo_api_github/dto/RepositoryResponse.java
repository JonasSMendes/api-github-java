package com.example.consumindo_api_github.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponse(
        String id,
        @JsonProperty("html_url") String htmlUrl,
        @JsonProperty("private") boolean isprivate

        ) {
}
