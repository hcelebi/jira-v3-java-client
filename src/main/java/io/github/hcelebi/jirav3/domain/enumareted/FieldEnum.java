package io.github.hcelebi.jirav3.domain.enumareted;

public enum FieldEnum {
    SUMMARY("summary"),
    ISSUE_LINKS("issuelinks"),
    ISSUE_TYPE("issuetype"),
    PARENT("parent"),
    STATUS("status"),
    STORY_POINT("customfield_10032"),
    RESOLUTION("resolution"),
    RESOLUTION_DATE("resolutiondate"),
    ASSIGNEE("assignee"),
    IS_TESTABLE("customfield_10224"),
    NOT_TESTING_REASON("customfield_10225"),
    RANK("customfield_10019"),
    SUBTASKS("subtasks"),
    CREATED("created"),
    SPRINTS("customfield_10020"),
    MAJOR_INCIDENT_SQUAD("customfield_11071"),

    LABELS("labels");

    public final String value;

    private FieldEnum(String label) {
        this.value = label;
    }
}
