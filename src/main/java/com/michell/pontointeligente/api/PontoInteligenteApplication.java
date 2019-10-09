package com.michell.pontointeligente.api;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.BindingResult;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.michell.pontointeligente.api.controllers.LancamentosController;
import com.michell.pontointeligente.api.dtos.LancamentoDto;
import com.michell.pontointeligente.api.entities.Lancamento;

@SpringBootApplication
//@EnableCaching
//public class PontoInteligenteApplication implements CommandLineRunner {
public class PontoInteligenteApplication {

	private static final BindingResult result = null;

	@Autowired
	private LancamentosController lancamentosController;

	public static void main(String[] args) {
		SpringApplication.run(PontoInteligenteApplication.class, args);

	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 * Date dateObj = formatDate.parse("2017-07-18 09:00:00");
	 * 
	 * LancamentoDto lancamentoDto = new LancamentoDto();
	 * lancamentoDto.setData("2017-07-18 09:00:00");
	 * lancamentoDto.setTipo("INICIO_TRABALHO");
	 * lancamentoDto.setDescricao("Início de trabalho");
	 * lancamentoDto.setLocalizacao("1.23423,2.12312");
	 * lancamentoDto.setFuncionarioId(5L);
	 * 
	 * this.lancamentosController.adicionar(lancamentoDto, result); }
	 */

}
