package az.company.paymentms.service;


import az.company.paymentms.error.ErrorsFinal;
import az.company.paymentms.exception.ApplicationException;
import az.company.paymentms.intergration.ProductClient;
import az.company.paymentms.model.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductClient productClient;

    public ProductDto getProductById(Long id) {
        ProductDto productDto = productClient.getProductById(id).getBody();

        if (Objects.isNull(productDto))
            throw new ApplicationException(ErrorsFinal.DATA_NOT_FOUND);

        return productClient.getProductById(id).getBody();
    }


}
