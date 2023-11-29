package io.github.hcelebi.jirav3.domain.response.issue;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class Issue implements Serializable {
    @Serial
    private static final long serialVersionUID = -6546278080526723073L;
    private String summary;
    private String key;
}