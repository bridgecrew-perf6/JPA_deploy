package Carl.JPASHOP.repository;

import Carl.JPASHOP.domain.Roktask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HwanRepository extends JpaRepository<Roktask, Long> {

        List<Roktask> findByname(String name);
}
