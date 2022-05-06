package kz.kcell.kaiten.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardRetrive {
    private int id;
    private String title;
    private LocalDateTime created;
    private LocalDateTime updated;
    private boolean archived;
    private boolean asap;
    private LocalDateTime due_date;
    private double sort_order;
    private String description;
    private int state;
    private boolean expires_later;

    private int board_id;
    private int column_id;
    private int lane_id;
}
