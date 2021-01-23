package br.com.bomdestino.service;


import br.com.bomdestino.clients.STURClient;
import br.com.bomdestino.dto.STURRequestDTO;
import br.com.bomdestino.dto.STURResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.time.LocalDate;

@Service
@Slf4j
public class CitizenService {

    @Autowired
    private STURClient sturClient;

    public ResponseEntity<STURResponseDTO> getIPTU(STURRequestDTO requestDTO) {

        ResponseEntity<STURResponseDTO> responseEntity = sturClient.getIPTU(requestDTO);
        log.info("CitizenService.getIPTU - response [{}]", responseEntity);
        return responseEntity;

    }

    public ResponseEntity<STURResponseDTO> getITR(STURRequestDTO requestDTO){
        ResponseEntity<STURResponseDTO> responseEntity = sturClient.getIPTU(requestDTO);

        log.info("CitizenService.getITR - response [{}]", responseEntity);

        return  responseEntity;
    }
}
