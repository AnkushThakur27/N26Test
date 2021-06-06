package com.n26.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Transaction {
    @NotNull(message = "amount can not be null!")
    private Double amount;
    @NotNull(message = "time can not be null!")
    private Instant timestamp;

}

