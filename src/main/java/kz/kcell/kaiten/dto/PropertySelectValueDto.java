package kz.kcell.kaiten.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PropertySelectValueDto {
    private int id;
    private int custom_property_id;
    private String value;
    private int color;
    private boolean deleted;
    private double sort_order;
    private String external_id;
    private LocalDateTime updated;
}
