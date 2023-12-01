package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueStatusCategory implements Serializable {
    @Serial
    private static final long serialVersionUID = 6281731305186224369L;

    private String self;
    private Integer id;
    private String key;
    private String colorName;
    private String name;
}
