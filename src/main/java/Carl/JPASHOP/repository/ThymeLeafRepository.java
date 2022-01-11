package Carl.JPASHOP.repository;

import Carl.JPASHOP.domain.ItemDto;
import Carl.JPASHOP.domain.Roktask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThymeLeafRepository extends JpaRepository<ItemDto, Long> {

    List<ItemDto> findAll();
}
