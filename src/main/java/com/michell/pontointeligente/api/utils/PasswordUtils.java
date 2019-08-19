package com.michell.pontointeligente.api.utils;

import org.hibernate.validator.internal.util.logging.LoggerFactory;

import org.slf4j.Logger;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



public class PasswordUtils {

	private static final Logger log = org.slf4j.LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {}
	
	public static String gerarBCrypt(String senha) {
		if(senha == null) {
			return senha;
		}
		
		log.info("Gerando hash com ByCript");
		BCryptPasswordEncoder bCriptEncoder = new BCryptPasswordEncoder();
		return bCriptEncoder.encode(senha);
	}
	
}
