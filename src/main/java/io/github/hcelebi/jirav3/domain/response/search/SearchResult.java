package io.github.hcelebi.jirav3.domain.response.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.github.hcelebi.jirav3.domain.response.issue.Issue;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResult implements Serializable {
    @Serial
    private static final long serialVersionUID = -3979685397403719193L;
    private Integer startIndex;
    private Integer maxResults;
    private Integer total;
    private List<Issue> issues;
}
