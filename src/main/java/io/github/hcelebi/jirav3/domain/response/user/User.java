package io.github.hcelebi.jirav3.domain.response.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -7805131940684718428L;
    private String accountId;
    private String displayName;
    private String emailAddress;
}
