package com.projetoSpring.projetoAGG2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoSpring.projetoAGG2.model.PServico;

@Repository
public interface PServicoRepository extends JpaRepository<PServico, Long> {

	
	public PServico findByCpfAndSenha(Long cpf , String nome);
	public PServico findByCpf(Long cpf);
	public List<PServico> findByServicoId(Long id);
}
