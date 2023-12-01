package io.github.hcelebi.jirav3.domain.enumareted;

public enum FieldEnum {
    SUMMARY("summary"),
    ISSUE_LINKS("issuelinks"),
    ISSUE_TYPE("issuetype"),
    PARENT("parent"),
    STATUS("status"),
    STORY_POINT("customfield_10032");

    public final String value;

    private FieldEnum(String label) {
        this.value = label;
    }
}
