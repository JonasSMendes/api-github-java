package com.example.consumindo_api_github.client;

import com.example.consumindo_api_github.dto.RepositoryResponse;
import com.example.consumindo_api_github.dto.ResponseUsers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface GithubClient {

    @GetExchange("/user/repos")
    public List<RepositoryResponse> listRepos(
            @RequestHeader("Authorization") String token,
            @RequestHeader(value = "X-GitHub-Api-Version", defaultValue = "2022-11-28") String apiVersion,
            @RequestParam("visibility") String visibility
    );

    @GetExchange("/users/{username}")
    public ResponseUsers getUserByName (
            @PathVariable("username") String username,
            @RequestHeader("Accept") String acceptHeader,
            @RequestHeader(value = "X-GitHub-Api-Version", defaultValue = "2022-11-28") String apiVersion
    );



}
