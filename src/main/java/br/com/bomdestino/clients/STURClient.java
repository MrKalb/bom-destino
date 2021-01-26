package br.com.bomdestino.clients;

import br.com.bomdestino.dto.STURRequestDTO;
import br.com.bomdestino.dto.STURResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "wiremock", url = "http://2vwlq.mocklab.io")
public interface STURClient {

    @PostMapping("/iptu")
    ResponseEntity<List<STURResponseDTO>> getIPTU(@RequestBody STURRequestDTO requestDTO);

    @PostMapping("/itr")
    ResponseEntity<List<STURResponseDTO>> getITR(@RequestBody STURRequestDTO requestDTO);

}
