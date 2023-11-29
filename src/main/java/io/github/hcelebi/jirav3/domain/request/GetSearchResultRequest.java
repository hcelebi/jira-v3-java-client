package io.github.hcelebi.jirav3.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class GetSearchResultRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 5102154650035149868L;

    private String jql;
    private Integer startAt;
    private Integer maxResults;
}
