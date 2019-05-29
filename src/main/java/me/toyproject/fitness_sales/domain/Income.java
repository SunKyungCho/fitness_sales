package me.toyproject.fitness_sales.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Builder @RequiredArgsConstructor @AllArgsConstructor @NoArgsConstructor
@Getter @EqualsAndHashCode(of = "id")
@Entity
public class Income {

    @Id
    @GeneratedValue
    private Integer id;
    @NonNull
    private Integer userNo;
    @NonNull
    @Embedded
    private Account account;
    private boolean isCancel;
    private boolean isDelete;
    @CreationTimestamp
    private LocalDateTime registerDate;
    @UpdateTimestamp
    private LocalDateTime lastModifyDate;

}
