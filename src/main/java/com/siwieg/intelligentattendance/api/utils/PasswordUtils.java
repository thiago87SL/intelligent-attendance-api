package com.siwieg.intelligentattendance.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {
		
	}
	
	/**
	 * Gera um hash utilizando BCrypt.
	 * 
	 *  @param senha - senha informada por usuário
	 *  @return String - encoded senha (hash da senha) usando <b>BCrypt</b>. 
	 */
	public static String gerarBCrypt(String senha) {
		if(senha == null) return senha;
		
		log.info("Gerando hash com BCrypt");
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		
		return bCryptEncoder.encode(senha);
	}
}
