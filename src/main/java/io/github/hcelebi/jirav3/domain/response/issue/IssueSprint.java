package io.github.hcelebi.jirav3.domain.response.issue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.hcelebi.jirav3.serializer.CustomDateTimeDeserializer;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueSprint implements Serializable {
    @Serial
    private static final long serialVersionUID = -7400710475373442615L;

    private Integer id;
    private String name;
    private String state;
    private Integer boardId;
    private String goal;
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    private DateTime startDate;
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    private DateTime endDate;
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    private DateTime completeDate;
}
