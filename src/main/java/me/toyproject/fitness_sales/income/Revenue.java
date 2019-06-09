package me.toyproject.fitness_sales.income;

import lombok.*;
import me.toyproject.fitness_sales.model.Money;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(of = "id")
public class Revenue {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false)
    private Integer id;

    @Column(name = "user_no", nullable = false, updatable = false)
    private Integer userNo;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    @Column(name = "description", nullable = false)
    private String description;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "methodOfPayment", column = @Column(name = "method_of_payment", nullable = false)),
            @AttributeOverride(name = "value", column = @Column(name = "amount", nullable = false)),
    })
    private Money amount;

    @Column(name = "memo")
    private String memo;

    @Column(name = "is_cancel", updatable = false)
    private boolean isCancel = false;

    @Column(name = "is_delete", updatable = false)
    private boolean isDelete = false;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @CreationTimestamp
    @Column(name = "createAt", nullable = false, updatable = false)
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(name = "updateAt", nullable = false)
    private LocalDateTime updateAt;

    @Builder
    public Revenue(Integer userNo, Integer categoryId, String description, Money amount, String memo, boolean isCancel, boolean isDelete, LocalDate date) {
        this.userNo = userNo;
        this.categoryId = categoryId;
        this.description = description;
        this.amount = amount;
        this.memo = memo;
        this.isCancel = isCancel;
        this.isDelete = isDelete;
        this.date = date;
    }
}
