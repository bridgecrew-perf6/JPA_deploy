package Carl.JPASHOP.repository;

import Carl.JPASHOP.domain.Roktask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// 레파지토리는 DAO를 사용하기에 쓰는 어노테이션
// 레파지토리 어노테이션을 추가해주지 않으면 작동안함.
// 레파지토리는 영구저장소(DBMS)에서 제공하는 API를 통해 접근하기 위해 필요함.

@Repository
public interface HwanRepository extends JpaRepository<Roktask, Long> {

        List<Roktask> findByname(String name);


}
