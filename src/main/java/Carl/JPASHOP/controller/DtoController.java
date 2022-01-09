package Carl.JPASHOP.controller;

import Carl.JPASHOP.domain.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/api") // localhost:8000/api
public class DtoController {

    @GetMapping(value = "/test") // localhost:8000/api/test
    public UserDto test(){

        UserDto userDto = new UserDto();
        userDto.setName("Hwan");
        userDto.setAge(33);
        userDto.setPhonenumber("010-3392-7642");

        return userDto;
    }
}
