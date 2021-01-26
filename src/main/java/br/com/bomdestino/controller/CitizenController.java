package br.com.bomdestino.controller;

import br.com.bomdestino.dto.STURRequestDTO;
import br.com.bomdestino.dto.STURResponseDTO;
import br.com.bomdestino.service.CitizenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.validation.constraints.NotNull;
import java.security.Principal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cidadao")
@Slf4j
public class CitizenController {

    @Autowired
    private CitizenService citizenService;

    @RolesAllowed({"cpf", "cnpj"})
    @RequestMapping(value = "/iptu", method = RequestMethod.POST)
    public ResponseEntity<List<STURResponseDTO>> getIPTU(@RequestHeader String Authorization,
                                                   @RequestBody STURRequestDTO requestDTO) {
        log.info("CitizenController.getIPTU - start - receive request [{}]", requestDTO);

        return ResponseEntity.ok(citizenService.getIPTU(requestDTO));
    }

    @RolesAllowed("rural")
    @RequestMapping(value = "/itr", method = RequestMethod.GET)
    public ResponseEntity<List<STURResponseDTO>> getITR(@RequestHeader String Authorization,
                                                        @RequestBody STURRequestDTO requestDTO) {
        log.info("CitizenController.getITR - start - receive request [{}]", requestDTO);
        return citizenService.getITR(requestDTO);
    }

}