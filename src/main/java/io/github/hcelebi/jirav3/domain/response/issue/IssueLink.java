package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueLink implements Serializable {
    @Serial
    private static final long serialVersionUID = -2775700806974348503L;
    private String id;
    private String self;
    private IssueLinkType type;
    private Issue inwardIssue;
    private Issue outwardIssue;
}
