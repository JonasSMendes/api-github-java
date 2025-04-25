package com.example.consumindo_api_github.controller;

import com.example.consumindo_api_github.client.GithubClient;
import com.example.consumindo_api_github.dto.RepositoryResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class GithubController {

    private GithubClient githubClient;

    public GithubController(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    @GetMapping("/repos")
    public ResponseEntity<List<RepositoryResponse> > listRepos (){
        return null;
    }

}
