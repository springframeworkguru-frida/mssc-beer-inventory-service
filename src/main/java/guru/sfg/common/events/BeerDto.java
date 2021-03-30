package guru.sfg.common.events;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Null 外部无法修改read-only properties for client's side，create beer pojo will bind to 会有id version等
public class BeerDto implements Serializable {

    static final long serialVersionUID = -6559000858289847715L;


    @Null
    private UUID id;

    @Null
    private Integer version;

    @Null
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ",shape = JsonFormat.Shape.STRING )
    private OffsetDateTime createdDate;
    @Null
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ",shape = JsonFormat.Shape.STRING )
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String beerName;

    @NotNull
    private String beerStyle;

    //@Positive long可以string无
    @NotNull
    private String upc;

    @NotNull
    @Positive
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;

    private Integer quantityOnHand;


}
