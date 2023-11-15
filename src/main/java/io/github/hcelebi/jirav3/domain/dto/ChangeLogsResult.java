package io.github.hcelebi.jirav3.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangeLogsResult implements Serializable {
    @Serial
    private static final long serialVersionUID = -935265865657529170L;

    private Integer maxResults;
    private Integer startAt;
    private Integer total;
    private boolean isLast;
    private List<ChangeLogValue> values;

}
