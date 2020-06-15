package com.projetobeta.techescola.configs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetobeta.techescola.entities.CadastroAluno;
import com.projetobeta.techescola.entities.CadastroProfessor;
import com.projetobeta.techescola.entities.Serie;
import com.projetobeta.techescola.repositories.CadastroAlunoRepository;
import com.projetobeta.techescola.repositories.CadastroProfessorRepository;
import com.projetobeta.techescola.repositories.SerieRepository;

@Configuration
@Profile("test")
public class ClasseDeTestes implements CommandLineRunner {

	@Autowired
	private CadastroAlunoRepository alunoRepository;

	@Autowired
	private CadastroProfessorRepository professorRepository;

	@Autowired
	private SerieRepository serieRepository;

	@Override
	public void run(String... args) throws Exception {

		Serie serie1 = new Serie(null, "Primeiro ano");
		Serie serie2 = new Serie(null, "Segundo ano");
		Serie serie3 = new Serie(null, "Terceiro ano");

		CadastroProfessor professor1 = new CadastroProfessor(null, "Marcio", "marcio@hotmali.com", "54321", null);
		CadastroProfessor professor2 = new CadastroProfessor(null, "Caio", "caio@hotmali.com", "12345", null);
		CadastroProfessor professor3 = new CadastroProfessor(null, "Leo", "leo@hotmali.com", "33211", null);

		CadastroAluno aluno1 = new CadastroAluno(null, "João", "joao@hotmail.com", "123", "academico", "22222", serie1);
		CadastroAluno aluno2 = new CadastroAluno(null, "Mario", "mario@hotmail.com", "321", "sartre", "11111", serie2);
		CadastroAluno aluno3 = new CadastroAluno(null, "Kaique", "kaique@hotmail.com", "456", "vieira", "33333",
				serie2);
		CadastroAluno aluno4 = new CadastroAluno(null, "O outro joão", "joao2@hotmail.com", "654", "academico", "44444",
				serie3);

		serie1.getAlunos().add(aluno1);
		serie2.getAlunos().addAll(Arrays.asList(aluno2, aluno3));
		serie3.getAlunos().add(aluno4);

		serieRepository.saveAll(Arrays.asList(serie1, serie2, serie3));
		alunoRepository.saveAll(Arrays.asList(aluno1, aluno2, aluno3, aluno4));
		professorRepository.saveAll(Arrays.asList(professor1, professor2, professor3));

	}

}
