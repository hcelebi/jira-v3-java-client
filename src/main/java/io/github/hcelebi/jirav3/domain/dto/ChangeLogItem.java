package io.github.hcelebi.jirav3.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangeLogItem implements Serializable {
    @Serial
    private static final long serialVersionUID = 4351622520027015257L;
    private String field;
    private String fieldtype;
    private String fieldId;
    private String from;
    private String fromString;
    private String to;
    private String toString;
}
