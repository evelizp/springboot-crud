package com.evelizp.springbootcrud.dao;

import org.springframework.data.repository.CrudRepository;

import com.evelizp.springbootcrud.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Long> {

}
