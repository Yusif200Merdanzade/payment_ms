package az.company.paymentms.service;


import az.company.paymentms.error.ErrorsFinal;
import az.company.paymentms.exception.ApplicationException;
import az.company.paymentms.intergration.CardClient;
import az.company.paymentms.model.CardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardClient cardClient;

    public CardDto getCardById(Long id) {
        CardDto cardDto = cardClient.getCardById(id).getBody();

        if (Objects.isNull(cardDto))
            throw new ApplicationException(ErrorsFinal.DATA_NOT_FOUND);

        return cardClient.getCardById(id).getBody();
    }

}
