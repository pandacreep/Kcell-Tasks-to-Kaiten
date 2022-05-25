package kz.kcell.kaiten.model;

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
}
