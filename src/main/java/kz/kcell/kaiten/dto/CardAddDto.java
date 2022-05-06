package kz.kcell.kaiten.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CardAddDto {
    @NotBlank(message = "Поле 'ФИО заказчика' не должно быть пустым")
    private String customerName;

    @NotBlank(message = "Поле 'Код заказчика' не должно быть пустым")
    private String customerCode;

    @NotBlank(message = "Поле 'Наименование' не должно быть пустым")
    private String title;

    @NotBlank(message = "Поле 'Описание' не должно быть пустым")
    private String description;

    private String descriptionExpectedResult;
    private String descriptionInputData;
    private String descriptionDataLabeling;
    private String descriptionTarget;
    private String descriptionFinancialImpact;
    private String descriptionFrequency;
    private String descriptionExtraInfo;
}
