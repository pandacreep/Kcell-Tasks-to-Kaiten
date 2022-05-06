package kz.kcell.kaiten.dto;

import kz.kcell.kaiten.model.CardRetrive;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class CardRetriveDto {
    private String id;
    private String title;
    private LocalDateTime created;
    private LocalDateTime updated;
    private String archived;
    private String asap;
    private LocalDateTime due_date;
    private double sort_order;
    private String description;
    private int state;
    private String expires_later;

    private int board_id;
    private int column_id;
    private int lane_id;

    public static CardRetriveDto from (CardRetrive card) {
        return CardRetriveDto.builder()
                .id(String.valueOf(card.getId()))
                .title(card.getTitle())
                .created(card.getCreated())
                .updated(card.getUpdated())
                .archived(String.valueOf(card.isArchived()))
                .asap(String.valueOf(card.isAsap()))
                .due_date(card.getDue_date())
                .sort_order(card.getSort_order())
                .description(card.getDescription())
                .state(card.getState())
                .expires_later(String.valueOf(card.isExpires_later()))

                .board_id(card.getBoard_id())
                .column_id(card.getColumn_id())
                .lane_id(card.getLane_id())
                .build();
    }
}
