package com.designpatterns.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class Project {

    private String name;
    private LocalDate deadLine;
    private String author;
    private BigDecimal budget;
    private String company;
    private boolean closed;


}
