package com.gonzalez.examenes.service.impl;

import org.springframework.stereotype.Service;

import com.gonzalez.common.usuario.models.entity.Examen;
import com.gonzalez.commons.service.CommonService;
import com.gonzalez.commons.service.CommonServiceImpl;
import com.gonzalez.examenes.repository.ExamenRepository;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements CommonService<Examen> {

}
