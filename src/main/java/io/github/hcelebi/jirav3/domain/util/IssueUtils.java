package io.github.hcelebi.jirav3.domain.util;

import io.github.hcelebi.jirav3.domain.response.issue.Issue;
import io.github.hcelebi.jirav3.domain.response.issue.IssueLink;

public class IssueUtils {
    public static Issue getLinkedIssue(IssueLink issueLink) {
        Issue linkedIssue = issueLink.getOutwardIssue();
        if (issueLink.getInwardIssue() != null) {
            linkedIssue = issueLink.getInwardIssue();
        }
        return linkedIssue;
    }
}
