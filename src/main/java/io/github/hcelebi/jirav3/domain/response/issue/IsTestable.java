package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IsTestable implements Serializable {
    @Serial
    private static final long serialVersionUID = -2282566272602330519L;
    private String self;
    private String value;
    private String id;
}
