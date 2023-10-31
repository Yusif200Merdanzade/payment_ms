package az.company.paymentms.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDto {

//    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
//    Long productId;

    String name;

    int stock;

    double price;

//    Character status;
//
//    LocalDateTime update_date;
}
