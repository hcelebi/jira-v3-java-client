package io.github.hcelebi.jirav3.domain.request;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class GetSearchResultRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 5102154650035149868L;

    private String jql;
    @Builder.Default
    private Integer startAt = 0;
    @Builder.Default
    private Integer maxResults = 100;
    private List<String> fields;
}
