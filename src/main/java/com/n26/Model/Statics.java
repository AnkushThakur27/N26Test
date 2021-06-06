package com.n26.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.RoundingMode;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Statics {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal sum;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal avg;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal max;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal min;
    private Long count;

    public Statics() {
        sum = BigDecimal.valueOf(0.00).setScale(2, RoundingMode.HALF_UP);
        avg = BigDecimal.valueOf(0.00).setScale(2, RoundingMode.HALF_UP);
        max = BigDecimal.valueOf(0.00).setScale(2, RoundingMode.HALF_UP);
        min = BigDecimal.valueOf(0.00).setScale(2, RoundingMode.HALF_UP);
        count = 0L;
    }

}
