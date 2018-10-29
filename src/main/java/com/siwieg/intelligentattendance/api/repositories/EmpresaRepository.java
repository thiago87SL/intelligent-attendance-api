package com.siwieg.intelligentattendance.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.siwieg.intelligentattendance.api.entities.Empresa;

/**
 * @author Thiago
 *
 */
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	@Transactional(readOnly=true)
	Empresa findByCnpj(String cnpj);
}
