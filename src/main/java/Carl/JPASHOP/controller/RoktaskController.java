package Carl.JPASHOP.controller;


import Carl.JPASHOP.domain.Roktask;
import Carl.JPASHOP.repository.HwanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Enumerated;
import javax.persistence.PostUpdate;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/main")
public class RoktaskController {

    @Autowired // 오토와이어드 작업 안하면 spring ioc가 빈 주입 안되어서 작동 안한다. 레파지토리에 빈 의존성을 알아서 주입하게 해줌
    HwanRepository hwanRepository;

    @GetMapping(value = "/injection") // create 기능, DB에 얘가 입력되게할거야
    public void create() {
        Roktask roktask = new Roktask();
        roktask.setName("Hwan");
        roktask.setPhonenumber("010-3392-7642");
        Roktask newRoktask = hwanRepository.save(roktask);
    }

    @GetMapping(value = "/find")
    public List<Roktask> findByname() { // 가운데 void로 넣었고 return 값을 안넣었기 때문에 작동하지 않은 것.
        this.create();
        List<Roktask> roktaskList = hwanRepository.findByname("Hwan");
        for (Roktask roktask : roktaskList) {
            System.out.println(roktask.toString()); // 조회로 얻은 객체 한 줄 출력하기
        }
        return roktaskList;
    }
}

//    @GetMapping(value = "/insert")
//    public void creattalbe() { // /insert?name 이렇게 쳤을 때 뭔 값이 나오게, 주소창에 뭐 넣으면 뭐 나오게
//        Roktask roktask = new Roktask();
//        roktask.setName("Hwan");
//        roktask.setPhonenumber("010-3392-7642");
//        Roktask saveRoktask = hwanRepository.save(roktask);
//        System.out.println(saveRoktask.toString());
//    }


//
//    }






