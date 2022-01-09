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
@RequestMapping(value = "/api")
public class RoktaskController {

    @Autowired // 오토와이어드 작업 안하면 빈 주입 안되어서 작동 안한다. 레파지토리에 빈 주입
    HwanRepository hwanRepository;

    @GetMapping(value = "/create") // select
    public void create() {
        Roktask roktask = new Roktask();
        roktask.setName("Hwan");
        roktask.setPhonenumber("010-3392-7642");
        Roktask newRoktask = hwanRepository.save(roktask);
    }

    //

    @GetMapping(value = "/find")
    public List<Roktask> findByname(
            @RequestParam(value = "name")String name,
            @RequestParam(value = "phonenumber")String phonenumber
    ) {
        this.create();
        List<Roktask> roktaskList = hwanRepository.findByname("Hwan");
        for (Roktask roktask : roktaskList) {
            System.out.println(roktask.toString()); // 조회로 얻은 객체 한 줄 출력하기
        }
        return roktaskList;
    }


    @PostMapping(value = "/http/get") // insert
    public String updatTest(){
        return "insert 요청";
    }
    // 인터넷 브라우저 요청은 get요청 밖에 안돼.
    // update, delete, read 다 안됨. 오로지 겟만
    @PutMapping(value = "/http/put")  // update
    public String putTest() {
        return "update 요청";
    }

    @DeleteMapping(value = "/http/delete") // delete
    public String deleteTest() {
        return "delete 요청";
    }
}
//    @GetMapping(value = "/insert")
//    public Roktask creattalbe() {
//        Roktask roktask = new Roktask();
//        roktask.setName("Hwan");
//        roktask.setPhonenumber("010-3392-7642");
//        Roktask saveRoktask = hwanRepository.save(roktask);
//
//        return saveRoktask;
