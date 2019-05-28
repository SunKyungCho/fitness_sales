package me.toyproject.fitness_sales.domain;

import lombok.*;

import java.time.LocalDateTime;


@Builder @RequiredArgsConstructor
@Getter @EqualsAndHashCode(of = "id")
public class Income {

    private Integer id;
    @NonNull
    private Integer userNo;
    @NonNull
    private Account account;
    private boolean isCancel;
    private boolean isDelete;
    private LocalDateTime registerDate;
    private LocalDateTime lastModifyDate;
}
