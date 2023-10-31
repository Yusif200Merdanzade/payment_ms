package az.company.paymentms.service;

import az.company.paymentms.model.PaymentInsertDto;
import az.company.paymentms.model.ResponsePaymentDto;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface PaymentService {

    List<ResponsePaymentDto> getAllPayment() throws JsonProcessingException;

    PaymentInsertDto save(PaymentInsertDto paymentDto);
}
