package mx.fmre.contable.control;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.fmre.contable.control.dto.BancoDto;

@RestController
@RequestMapping("/bancos")
public class BancosController {
	@GetMapping
	public List<BancoDto> getBancos() {
		BancoDto bancoDto1 = new BancoDto();
		bancoDto1.setId(1);
		bancoDto1.setDescripcion("banco 1");
		BancoDto bancoDto2 = new BancoDto();
		bancoDto2.setId(2);
		bancoDto2.setDescripcion("banco 2");
		return Arrays.asList(bancoDto1, bancoDto2);
	}
}
