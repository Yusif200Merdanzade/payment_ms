package az.company.paymentms.intergration;

import az.company.paymentms.config.FeignConfiguration;
import az.company.paymentms.model.CardDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "card-ms", url = "${urls.card}/cards",
        configuration = {
                FeignConfiguration.class
        })
public interface CardClient {

    @GetMapping("/{id}")
    ResponseEntity<CardDto> getCardById(@PathVariable Long id);

}
