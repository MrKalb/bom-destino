package br.com.bomdestino.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class STURResponseDTO {

    private String name;

    private String territory;

    private BigDecimal value;

    private LocalDate limitToPay;

    private String link;

}
