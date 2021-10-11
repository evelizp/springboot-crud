package com.evelizp.springbootcrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.evelizp.springbootcrud.commons.GenericServiceImpl;
import com.evelizp.springbootcrud.dao.ClienteDAO;
import com.evelizp.springbootcrud.model.Cliente;
import com.evelizp.springbootcrud.service.ClienteService;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements ClienteService{
	
	@Autowired
	private ClienteDAO clienteDAO;

	@Override
	public CrudRepository<Cliente, Long> getDao() {
		return clienteDAO;
	}

}
