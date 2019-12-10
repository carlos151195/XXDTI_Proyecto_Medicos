package com.medicos.springboot.app.models.dao;

import com.medicos.springboot.app.models.entity.Embarazos;

public interface IEmbarazosDao {

	void save(Embarazos embarazos);

	void delete(Long AntecedentesFamiliaresId);

	void findLastEmbarazosId();

	Embarazos findOne(Long EmbarazosId);
	

}