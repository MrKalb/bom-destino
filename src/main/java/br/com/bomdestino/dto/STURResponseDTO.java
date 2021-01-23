package br.com.bomdestino.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class STURResponseDTO {

    private String name;

    private String territory;

    private BigDecimal value;

    private LocalDate limitToPay;

}
