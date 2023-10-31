package az.company.paymentms.intergration;


import az.company.paymentms.config.FeignConfiguration;
import az.company.paymentms.model.security.JwtRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-ms", url = "${auth.url}",
        configuration = {
                FeignConfiguration.class
        })
public interface UserClient {


    @PostMapping(value = "/login")
    ResponseEntity<?> login(@RequestBody JwtRequest authenticationRequest);


}
