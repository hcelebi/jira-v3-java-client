package io.github.hcelebi.jirav3.domain.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.hcelebi.jirav3.serializer.CustomDateTimeDeserializer;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangeLogValue implements Serializable {

    @Serial
    private static final long serialVersionUID = 6705099523673249056L;

    private Integer id;
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    private DateTime created;
    private List<ChangeLogItem> items;

}
