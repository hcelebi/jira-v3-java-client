package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotTestingReason implements Serializable {
    @Serial
    private static final long serialVersionUID = 7181746428850017977L;

    private String self;
    private String value;
    private String id;
}
