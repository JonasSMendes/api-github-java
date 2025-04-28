package com.example.consumindo_api_github.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ResponseUsers(
        String id,
        @JsonProperty("html_url") String htmlUrl,
        @JsonProperty("followers_url") String followers,
        @JsonProperty("following_url") String following,
        String name,
        @JsonProperty("private") boolean isprivate
){
}
