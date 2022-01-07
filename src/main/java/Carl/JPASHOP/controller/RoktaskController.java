package Carl.JPASHOP.controller;


import Carl.JPASHOP.domain.Roktask;
import Carl.JPASHOP.repository.HwanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Enumerated;
import javax.persistence.PostUpdate;
import java.util.List;

@RestController
public class RoktaskController {

    @Autowired // 오토와이어드 작업 안하면 빈 주입 안되어서 작동 안한다. 레파지토리에 빈 주입
    HwanRepository hwanRepository;


    public void creattalbe() {
        Roktask roktask = new Roktask();
        roktask.setName("Hwan");
        roktask.setPhonenumber("010-3392-7642");
        Roktask saveRoktask = hwanRepository.save(roktask);
        System.out.println(saveRoktask.toString());
    }


    @GetMapping(value = "/find")
    public void findByname() {
        this.creattalbe();
        List<Roktask> roktaskList = hwanRepository.findByname("Hwan");
        for (Roktask roktask : roktaskList) {
            System.out.println(roktask.toString()); // 조회로 얻은 객체 한 줄 출력하기
        }
    }
}




