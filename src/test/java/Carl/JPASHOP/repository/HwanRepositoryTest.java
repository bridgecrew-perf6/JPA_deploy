package Carl.JPASHOP.repository;

import Carl.JPASHOP.domain.Roktask;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HwanRepositoryTest {

    @Autowired
    private HwanRepository hwanRepository;

    @Test
    @DisplayName("create기능")
    @GetMapping(value = "/injection")
    public void create() {
        Roktask roktask = new Roktask();
        roktask.setName("Hwan");
        roktask.setPhonenumber("010-3392-7642");
        Roktask newRoktask = hwanRepository.save(roktask);
    }

}