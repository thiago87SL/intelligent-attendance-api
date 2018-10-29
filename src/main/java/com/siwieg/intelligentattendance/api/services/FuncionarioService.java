package com.siwieg.intelligentattendance.api.services;

import java.util.Optional;

import com.siwieg.intelligentattendance.api.entities.Funcionario;

public interface FuncionarioService {

	/**	
	 * Retorna um funcionario dado um CPF.
	 * 
	 * @param cpf
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**	
	 * Retorna um funcionario dado um email.
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorEmail(String email);

	/**	
	 * Retorna um funcionario dado um id.
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorId(Long id);
	
	/**	
	 * Cadastra um funcionario na base de dados.
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	Funcionario persistir(Funcionario funcionario);
}
