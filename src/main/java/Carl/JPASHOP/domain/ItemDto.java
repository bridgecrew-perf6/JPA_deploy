package Carl.JPASHOP.domain;

// Dto 객체, 상품 출력용 DTO 클래스다.
// ThymeleafExcontroller 에서 이 DTO 클래스에 객체를 사용하여 VIEW 파일에 전달할 것임.

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

// 엔티티 설정하고
@Entity
@Table(name = "ItemDto")
@Data
public class ItemDto {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String itemNm;
    @Column
    private Integer price;
    @Column
    private String itemdetail;
    @Column
    private String sellStatcd;
    @Column
    private LocalDateTime regTime;
    @Column
    private LocalDateTime updateTime;
}
