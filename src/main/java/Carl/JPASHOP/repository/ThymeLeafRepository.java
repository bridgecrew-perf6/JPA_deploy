package Carl.JPASHOP.repository;

import Carl.JPASHOP.domain.ItemDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ThymeLeafRepository extends JpaRepository<ItemDto, Long> {

    List<ItemDto> findByContainingIgnoreCaseOrTitleContainingIgnoreCase(Long id, String content);

}
