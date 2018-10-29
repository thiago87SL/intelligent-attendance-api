package com.siwieg.intelligentattendance.api.services.impl;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siwieg.intelligentattendance.api.entities.Empresa;
import com.siwieg.intelligentattendance.api.repositories.EmpresaRepository;
import com.siwieg.intelligentattendance.api.services.EmpresaService;

/**
 * @author Thiago
 *
 */
@Service
public class EmpresaServiceImpl implements EmpresaService{
	
	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("Buscando empresa para CNPJ {}", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}
	
	public Optional<Empresa> buscarPorId(Long id) {
		log.info("Buscando empresa pelo id {}", id);
		return this.empresaRepository.findById(id);
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo empresa: {}", empresa);
		return this.empresaRepository.save(empresa);
	}
}
