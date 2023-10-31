package az.company.paymentms.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CardDto {

//    Long cardId;

    String cardNumber;

    @JsonFormat(pattern = "dd.MM.yyyy")
    LocalDate expirationDate;

    String cvv;

    double balance;

//    Long userId;
//
//    Character status = '1';

//    private LocalDateTime updateDate;
}
