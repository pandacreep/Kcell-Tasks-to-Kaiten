package kz.kcell.kaiten.services;

import kz.kcell.kaiten.config.Param;
import kz.kcell.kaiten.dto.PropertySelectValueDto;
import kz.kcell.kaiten.model.CardRetrive;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class PropertyService {
    private final HeaderService headerService;

    public List<PropertySelectValueDto> getSelectedValues(int id) {
        final String URL = Param.URL_PROPERTIES_SELECT_VALUES + id + "/select-values";

        HttpHeaders headers = headerService.getHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<PropertySelectValueDto>> response = restTemplate.exchange(
                URL, HttpMethod.GET, entity,
                new ParameterizedTypeReference<List<PropertySelectValueDto>>() {});
        var selectedValues = response.getBody();
        return selectedValues;
    }
}
