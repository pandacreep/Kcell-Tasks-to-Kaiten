package kz.kcell.kaiten.model;

import kz.kcell.kaiten.dto.CardAddDto;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardAdd implements Serializable {
    private String title;
    private boolean asap;
    private LocalDateTime due_date;
    private boolean due_date_time_present;
    private int sort_order;
    private String description;
    private boolean expires_later;
    private String size_text;
    private int board_id;
    private int column_id;
    private int lane_id;
    private int owner_id;
    private Integer responsible_id;
    private String owner_email;
    private int position;
    private int type_id;
    private int external_id;
    private int text_format_type_id;

//    public static CardAdd from(CardAddDto card) {
//        return CardAdd.builder()
//                .title(card.getTitle())
//                .asap(false)
//                .due_date(null)
//                .due_date_time_present(false)
//                .sort_order(1)
//                .description(card.getDescription())
//                .expires_later(false)
//                .size_text(null)
//                .board_id(96925)
//                .column_id(331685)
//                .lane_id(170116)
//                .owner_id(167587)
//                .responsible_id(null)
//                .owner_email("test email")
//                .position(1)
//                .type_id(1)
//                .external_id(1)
//                .text_format_type_id(1)
//                .build();
//    }
}
