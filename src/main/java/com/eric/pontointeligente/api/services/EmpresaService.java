package com.eric.pontointeligente.api.services;

import java.util.Optional;

import com.eric.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	
	/**
	 * Retorna uma empresa dado um CNPJ
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova empresa
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Empresa persistir(Empresa empresa);

}
