package io.github.hcelebi.jirav3.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.hcelebi.jirav3.domain.dto.ChangeLogsResult;
import io.github.hcelebi.jirav3.domain.dto.issue.Issue;
import io.github.hcelebi.jirav3.exception.JiraV3RunTimeException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class JiraV3RestClient {
    private final String baseUri;
    private final String token;
    private final HttpClient client;

    public JiraV3RestClient(String baseUri, String token) {
        this.baseUri = baseUri;
        this.token = token;
        client = HttpClient.newHttpClient();
    }

    public Issue getIssue(String issueKey) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            HttpResponse<String> response = client.send(HttpRequest.newBuilder()
                    .uri(URI.create(baseUri + "/issue/" + issueKey))
                    .header("Authorization", "Basic " + token)
                    .header("Content-Type", "application/json")
                    .GET()
                    .build(), BodyHandlers.ofString());
            return objectMapper.readValue(response.body(), Issue.class);
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new JiraV3RunTimeException(e.getMessage());
        }
    }

    public ChangeLogsResult getIssueChangeLogs(String issueKey) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            HttpResponse<String> response = client.send(HttpRequest.newBuilder()
                    .uri(URI.create(baseUri + "/issue/" + issueKey + "/changelog?startAt=0&maxResults=100"))
                    .header("Authorization", "Basic " + token)
                    .header("Content-Type", "application/json")
                    .GET()
                    .build(), BodyHandlers.ofString());
            return objectMapper.readValue(response.body(), ChangeLogsResult.class);
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new JiraV3RunTimeException(e.getMessage());
        }
    }
}
