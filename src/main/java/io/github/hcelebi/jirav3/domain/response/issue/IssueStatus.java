package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueStatus implements Serializable {
    @Serial
    private static final long serialVersionUID = -8585439372176319127L;

    private String self;
    private String description;
    private String iconUrl;
    private String name;
    private String id;
    private IssueStatusCategory statusCategory;
}
