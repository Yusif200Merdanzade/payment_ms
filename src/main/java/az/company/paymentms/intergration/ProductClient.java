package az.company.paymentms.intergration;


import az.company.paymentms.config.FeignConfiguration;
import az.company.paymentms.model.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-ms", url = "${urls.product}/products",
        configuration = {
                FeignConfiguration.class
        })
public interface ProductClient {

    @GetMapping("/{id}")
    ResponseEntity<ProductDto> getProductById(@PathVariable Long id);

}
