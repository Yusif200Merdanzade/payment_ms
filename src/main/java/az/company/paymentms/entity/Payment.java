package az.company.paymentms.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Where(clause = "status <> '0'")
@Table(name = "payment", schema = "payment_system")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDateTime timestamp;

    Long userId;

    Long productId;

    Long cardId;

    int count;

    double amount;

    Character status = '1';

    @Column(name = "update_date")
    LocalDateTime updateDate;


}
