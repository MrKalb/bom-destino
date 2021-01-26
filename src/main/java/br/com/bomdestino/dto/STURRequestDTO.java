package br.com.bomdestino.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class STURRequestDTO {

    private String id;

    private String dateToRequest;

}
