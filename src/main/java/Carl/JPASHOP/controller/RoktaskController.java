package Carl.JPASHOP.controller;


import Carl.JPASHOP.domain.Roktask;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysqlController {

    @GetMapping(value = "/mysql")
    public void creattalbe(){
        Roktask mysqlConector = new Roktask();
        mysqlConector.setName("Hwan");
        mysqlConector.setPhonenumber("010-3392-7642");


    }
}
