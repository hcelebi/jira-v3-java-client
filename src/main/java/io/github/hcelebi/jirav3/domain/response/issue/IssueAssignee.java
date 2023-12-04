package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueAssignee implements Serializable {
    @Serial
    private static final long serialVersionUID = -847160589463205282L;
    private String self;
    private String accountId;
    private String emailAddress;
    private String displayName;
    private Boolean active;
    private String timeZone;
    private String accountType;
    private AvatarUrls avatarUrls;
}
