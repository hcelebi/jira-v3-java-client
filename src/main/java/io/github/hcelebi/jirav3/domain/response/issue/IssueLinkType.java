package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueLinkType implements Serializable {
    @Serial
    private static final long serialVersionUID = 7575242863000789329L;
    private String id;
    private String name;
    private String inward;
    private String outward;
    private String self;
}
