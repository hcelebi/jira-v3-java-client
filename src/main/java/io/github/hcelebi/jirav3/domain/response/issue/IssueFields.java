package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.hcelebi.jirav3.serializer.CustomDateTimeDeserializer;
import lombok.Data;
import org.joda.time.DateTime;

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
    private IssueResolution issueResolution;
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    private DateTime resolutiondate;
    private IssueAssignee assignee;
    @JsonProperty("customfield_10224")
    private IsTestable isTestable;
    @JsonProperty("customfield_10225")
    private NotTestingReason notTestingReason;
    @JsonProperty("customfield_10019")
    private String rank;
}
