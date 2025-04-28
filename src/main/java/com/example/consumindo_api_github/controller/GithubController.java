package com.example.consumindo_api_github.controller;

import com.example.consumindo_api_github.client.GithubClient;
import com.example.consumindo_api_github.dto.RepositoryResponse;
import com.example.consumindo_api_github.dto.ResponseUsers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class GithubController {

    private GithubClient githubClient;

    public GithubController(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    @GetMapping("/repos")
    public ResponseEntity<List<RepositoryResponse> > listRepos (@RequestHeader("token") String token){

       var repost = githubClient.listRepos(
                "Bearer " + token,
                null,
                "public"
        );

       return ResponseEntity.ok(repost);
    }

    @GetMapping("/users/{username}")
    public ResponseEntity<ResponseUsers> usersResponse (@PathVariable String username){

        var userRepos = githubClient.getUserByName(
                username,
                "application/vnd.github+json",
                null
        );

        return ResponseEntity.ok(userRepos);
    }

}
