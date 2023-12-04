package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AvatarUrls implements Serializable {
    @Serial
    private static final long serialVersionUID = -1101596686613138136L;

    @JsonProperty("48x48")
    private String size48;
    @JsonProperty("32x32")
    private String size32;
    @JsonProperty("24x24")
    private String size24;
    @JsonProperty("16x16")
    private String size16;
}
