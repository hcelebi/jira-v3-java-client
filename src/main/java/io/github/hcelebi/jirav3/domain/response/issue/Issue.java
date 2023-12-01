package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Issue implements Serializable {
    @Serial
    private static final long serialVersionUID = -2187175487844074608L;
    private String id;
    private String self;
    private String key;
    private IssueFields fields;
}