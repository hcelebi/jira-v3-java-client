package io.github.hcelebi.jirav3.domain.response.issue;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class IssueResolution implements Serializable {
    @Serial
    private static final long serialVersionUID = 6504776853853561566L;

    private String self;
    private String id;
    private String description;
    private String name;
}
