package az.company.paymentms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResponsePaymentDto {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Long id;

    Long userId;

    ProductDto product;

    CardDto card;

    int count;

    double amount;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Character status = '1';

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy HH:mm:ss")
    LocalDateTime update_date;
}
