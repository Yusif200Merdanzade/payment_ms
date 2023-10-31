package az.company.paymentms.controller;

import az.company.paymentms.model.PaymentInsertDto;
import az.company.paymentms.service.PaymentServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/payments")
@SecurityRequirement(name = "bearerAuth")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentServiceImpl paymentServiceImpl;

    @GetMapping()
    public ResponseEntity<?> getAllPayment() throws JsonProcessingException {
        return ResponseEntity.ok(paymentServiceImpl.getAllPayment());
    }

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody PaymentInsertDto dto) {
        return ResponseEntity.ok(paymentServiceImpl.save(dto));
    }


}
