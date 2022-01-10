package Carl.JPASHOP.domain;


import lombok.*;

import javax.persistence.*;

// 도메인은 DTO(DATA TRANSFER OBJECT) 객체 전송 데이터(게터세터), 엔티티클래스의 합쳐진 곳이다.
// 엔티티(DB테이블과 1:1 매칭) 정한 클래스가 도메인

@Entity
@Table(name = "roktask")
@Data
@ToString
public class Roktask {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) // 컨트롤러로 안넣어줘도 JPA 구현체가 자동생성
    private Long usernumber;
    @Column
    private String name;
    @Column
    private String phonenumber;
}
