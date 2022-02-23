package Carl.JPASHOP.controller;


import Carl.JPASHOP.domain.ItemDto;
import Carl.JPASHOP.domain.Roktask;
import Carl.JPASHOP.repository.ThymeLeafRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafExController {

    @GetMapping(value = "/ex01")
    public String thymeleafExample01(Model model) {
        model.addAttribute("data", "타임리프 예제 입니다2.");
        // model 객체를 이용 뷰에 key,valule 구조
//        // data 라는 값을 thymeleaEx01 파일에 넣어놨음 {data}
        return "thymeleafEx/thymeleafEx01";
        // 리턴값은 templates 폴더 기준으로 뷰의 위치와 이름(thymeleafEx01.html에 반환함.
    }

    @GetMapping(value = "/ex02")
    public String thymeleafExample02(Model model) {
        ItemDto itemDto = new ItemDto();
        itemDto.setItemdetail("상품 상세 설명");
        itemDto.setItemNm("테스트 상품 1");
        itemDto.setPrice(10000);
        itemDto.setRegTime(LocalDateTime.now());

        model.addAttribute("itemDto", itemDto);
        return "thymeleafEx/thymeleafEx02";
    }

    @Autowired
    ThymeLeafRepository thymeLeafRepository;

    @GetMapping(value = "/insertDB")
    public String thymeleafcreate(Model model) {

        ItemDto itemDto = new ItemDto();
        itemDto.setItemNm("nomu");
        itemDto.setPrice(523);
        itemDto.setItemdetail("Delicious");
        itemDto.setSellStatcd("on");
        itemDto.setRegTime(LocalDateTime.now());
        itemDto.setUpdateTime(LocalDateTime.now());

        ItemDto repository2 = thymeLeafRepository.save(itemDto);

        model.addAttribute("itemDto", itemDto);
        return "thymeleafEx/thymeleafEx03";
        //  return "MYSQL Schemas Name : roktask, Table name ; item_dto inserts complete.";
    }

    // mysql에서 DB 화면 그대로 타임리프 템플릿에 출력하게 할 것.
    // 위에 작성한 insert 기능으로 db에 값을 입력
    // DB에 저장된 값을 find 기능으로 n개 출력
    // 출력된 데이터들을 modellist 화 해서 view로 날림
    @GetMapping(value = "/main")
    public String print(Model model) {
        List<ItemDto> itemDtoList = thymeLeafRepository.findAll();
        for (ItemDto itemDto : itemDtoList) {
            System.out.println(itemDto.toString()); // 조회로 얻은 객체 한 줄 출력하기
        }
        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx/thymeleafList1";
        // 리스트로 넘겨야 리스트형 글로 출력할 수 있어.
    }

    // href 기능을 쓸 것이다.
    // 리스트까지는 띄웠고
    // 리스트 중에 하나를 클릭하면 상품 데이터 출력이 되도록 만들면 됨.
    // 글 목록에 링크를 걸면 되는 기능을 추가한다.
    // id를 가지고 DB에 셀렉트를 해야함. 그렇게 해야 링크가 걸림.
    // 부분만 띄우게.
    // 글을 클릭하면 글 내용으로 넘어가는 기능을 만드는거임
    @GetMapping(value = "/ex06")
    public String thymeleafExample06(String param1, String param2, Model model) {
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);
        return "thymeleafEx/thymeleafEx06";

        // 여기는 받는 작업, 디비에서 받은 내용
    }

    @GetMapping(value = "/ex05")
    public String thymeleafExample05() {
        return "thymeleafEx/thymeleafEx05";
    }

    @GetMapping(value = "/printid")
    public List<ItemDto> findByidfunction() {
    // id를 0,1,2,3, 를 넣으면 아이디와 같은 줄에 있는 애들 모두 나오게 할 것임.


    }
}

