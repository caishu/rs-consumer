/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name.caishu.restConsumer;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author caishu
 */
@RestController
public class QuoteController {
    @RequestMapping("/quote")
    public Quote quote(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://gs-sample.myproject.svc:8080/greeting", Quote.class);
    }
}
