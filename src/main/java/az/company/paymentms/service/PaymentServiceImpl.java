package az.company.paymentms.service;

import az.company.paymentms.config.CustomAuthorization;
import az.company.paymentms.entity.Payment;
import az.company.paymentms.mapper.PaymentMapper;
import az.company.paymentms.model.PaymentInsertDto;
import az.company.paymentms.model.ResponsePaymentDto;
import az.company.paymentms.repository.PaymentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    private final PaymentMapper paymentMapper;

    private final CardService cardService;
    private final ProductService productService;
    private final CustomAuthorization customAuthorization;


    @Override
    public List<ResponsePaymentDto> getAllPayment() throws JsonProcessingException {

        customAuthorization.isValid();
        List<Payment> payments = paymentRepository.findAll();
        return payments.stream()
                .map(payment -> ResponsePaymentDto.builder()
                        .id(payment.getId())
                        .product(productService.getProductById(payment.getProductId()))
                        .card(cardService.getCardById(payment.getCardId()))
                        .userId(payment.getUserId())
                        .amount(payment.getAmount())
                        .count(payment.getCount())
                        .status(payment.getStatus())
                        .build())
                .collect(Collectors.toList());
    }


    @Override
    public PaymentInsertDto save(PaymentInsertDto paymentDto) {
        Payment card = paymentMapper.dtoToEntity(paymentDto);
        paymentRepository.save(card);
        return paymentMapper.entityToDto(card);
    }


}
