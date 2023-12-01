package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueFields implements Serializable {
    @Serial
    private static final long serialVersionUID = 5043710659039528322L;
    private String summary;
    private List<IssueLink> issuelinks;
    private IssueType issuetype;
    private Issue parent;
    private IssueStatus status;
    private Long customfield_10032;
}
