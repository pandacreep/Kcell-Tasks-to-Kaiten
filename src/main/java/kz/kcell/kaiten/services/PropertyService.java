package kz.kcell.kaiten.services;

import kz.kcell.kaiten.config.Param;
import kz.kcell.kaiten.dto.PropertySelectValueDto;
import lombok.AllArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class PropertyService {
    private final HeaderService headerService;

    public List<PropertySelectValueDto> getSelectedValues(int id) throws Exception {
        final String URL = Param.URL_PROPERTIES_SELECT_VALUES + id + "/select-values";

        HttpHeaders headers = headerService.getHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplateBuilder(new ProxyCustomizer()).build();
        ResponseEntity<List<PropertySelectValueDto>> response = restTemplate.exchange(
                URL, HttpMethod.GET, entity,
                new ParameterizedTypeReference<List<PropertySelectValueDto>>() {});
        var selectedValues = response.getBody();
        return selectedValues;
    }
}
