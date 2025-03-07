package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssuePriority implements Serializable {
    @Serial
    private static final long serialVersionUID = -391951426299447436L;

    private String self;
    private String iconUrl;
    private String name;
    private Integer id;
}
