package Carl.JPASHOP.service;


import Carl.JPASHOP.domain.ItemDto;
import Carl.JPASHOP.repository.ThymeLeafRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ThymeleafService {

    private final ThymeLeafRepository thymeLeafRepository;



}
