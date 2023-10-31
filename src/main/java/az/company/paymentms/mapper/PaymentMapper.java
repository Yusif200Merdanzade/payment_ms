package az.company.paymentms.mapper;

import az.company.paymentms.entity.Payment;
import az.company.paymentms.model.PaymentInsertDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "Spring")
public interface PaymentMapper {


    PaymentInsertDto entityToDto(Payment payment);

    Payment dtoToEntity(PaymentInsertDto paymentDto);

}
