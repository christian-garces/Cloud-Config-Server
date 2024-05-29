package com.gonzalez.examenes.service.impl;

import org.springframework.stereotype.Service;

import com.gonzalez.common.usuario.models.entity.Pregunta;
import com.gonzalez.commons.service.CommonService;
import com.gonzalez.commons.service.CommonServiceImpl;
import com.gonzalez.examenes.repository.PreguntaRepository;

@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta, PreguntaRepository> implements CommonService<Pregunta> {

}
