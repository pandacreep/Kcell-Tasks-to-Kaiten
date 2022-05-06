package kz.kcell.kaiten.services;

import kz.kcell.kaiten.config.Param;
import kz.kcell.kaiten.dto.CardAddDto;
import kz.kcell.kaiten.dto.CardRetriveDto;
import kz.kcell.kaiten.model.CardRetrive;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@AllArgsConstructor
public class CardServices {
    private final HeaderService headerService;

    public CardRetriveDto getCardById(int id) {
        final String URL = Param.URL_CARDS + id;
        HttpHeaders headers = headerService.getHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CardRetrive> response = restTemplate.exchange(URL, HttpMethod.GET, entity, CardRetrive.class);
        HttpStatus status = response.getStatusCode();
        CardRetrive card = response.getBody();
        return CardRetriveDto.from(card);
    }

    public CardRetrive add(CardAddDto cardDto) {
        HttpHeaders headers = headerService.getHeaders();
        Map<String, Object> map = getCardFields(cardDto);
        HttpEntity<Map<String, Object>> request = new HttpEntity<>(map, headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CardRetrive> response = restTemplate.exchange(Param.URL_CARDS, HttpMethod.POST, request, CardRetrive.class);
        HttpStatus status = response.getStatusCode();
        return response.getBody();
    }

    private Map<String, Object> getCardFields(CardAddDto cardDto) {
        Map<String, Object> map= new HashMap<>();

        Map<String, Integer[]> properties = new HashMap<>();
        properties.put("id_23280", new Integer[] {15795});
        map.put("properties", properties);

        map.put("title", cardDto.getTitle());
        map.put("board_id", String.valueOf(Param.BOARD_ID));
        map.put("column_id", String.valueOf(Param.COLUMN_ID));
        map.put("lane_id", String.valueOf(Param.LANE_ID));
        map.put("sort_order", "1");
        map.put("description", createDescription(cardDto));
        return map;
    }

    private String createDescription(CardAddDto card) {
        String description;
        description = "Заказчик:\n" + card.getCustomerName();
        description += getSubDescription(card.getDescription(), "Описание:");
        description += getSubDescription(card.getDescriptionExpectedResult(), "Ожидание на выходе:");
        description += getSubDescription(card.getDescriptionInputData(), "Есть данные:");
        description += getSubDescription(card.getDescriptionDataLabeling(), "Разметка данные:");
        description += getSubDescription(card.getDescriptionTarget(), "Гипотеза/назначение:");
        description += getSubDescription(card.getDescriptionFinancialImpact(), "Экономический эффект:");
        description += getSubDescription(card.getDescriptionExtraInfo(), "Дополнительная информация:");
        return description;
    }

    private String getSubDescription(String text, String subtitle) {
        if (text.isBlank()) {
            return "";
        }
        return "\n\n" + subtitle + "\n" + text;
    }
}