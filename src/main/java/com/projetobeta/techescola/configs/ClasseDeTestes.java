package com.projetobeta.techescola.configs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetobeta.techescola.entities.CadastroAluno;
import com.projetobeta.techescola.entities.CadastroProfessor;
import com.projetobeta.techescola.entities.Disciplinas;
import com.projetobeta.techescola.entities.Serie;
import com.projetobeta.techescola.repositories.CadastroAlunoRepository;
import com.projetobeta.techescola.repositories.CadastroProfessorRepository;
import com.projetobeta.techescola.repositories.DisciplinasRepository;
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
	
	@Autowired
	private DisciplinasRepository disciplinasRepository;

	@Override
	public void run(String... args) throws Exception {

		Serie serie1 = new Serie(null, "Primeiro ano");
		Serie serie2 = new Serie(null, "Segundo ano");
		Serie serie3 = new Serie(null, "Terceiro ano");
		
		Disciplinas disc1 = new Disciplinas(null, "Matemática");
		Disciplinas disc2 = new Disciplinas(null, "Português");
		Disciplinas disc3 = new Disciplinas(null, "Geografia");
		Disciplinas disc4 = new Disciplinas(null, "Inglês");
		Disciplinas disc5 = new Disciplinas(null, "História");

		
		CadastroProfessor professor1 = new CadastroProfessor(null, "Marcio", "marcio@hotmali.com", "54321", null);
		CadastroProfessor professor2 = new CadastroProfessor(null, "Caio", "caio@hotmali.com", "12345", null);
		CadastroProfessor professor3 = new CadastroProfessor(null, "Leo", "leo@hotmali.com", "33211", null);

		CadastroAluno aluno1 = new CadastroAluno(null, "João", "joao@hotmail.com", "123", "academico", "22222", serie1);
		CadastroAluno aluno2 = new CadastroAluno(null, "Mario", "mario@hotmail.com", "321", "sartre", "11111", serie2);
		CadastroAluno aluno3 = new CadastroAluno(null, "Kaique", "kaique@hotmail.com", "456", "vieira", "33333",
				serie2);
		CadastroAluno aluno4 = new CadastroAluno(null, "O outro joão", "joao2@hotmail.com", "654", "academico", "44444",
				serie3);
		
		professor1.getDisciplinas().addAll(Arrays.asList(disc2,disc3));
		professor2.getDisciplinas().addAll(Arrays.asList(disc1));
		professor3.getDisciplinas().addAll(Arrays.asList(disc5,disc4));
		
		disc1.getProfessores().add(professor2);
		disc2.getProfessores().add(professor1);
		disc3.getProfessores().add(professor1);
		disc4.getProfessores().add(professor3);
		disc5.getProfessores().add(professor3);
		
		serie1.getAlunos().add(aluno1);
		serie2.getAlunos().addAll(Arrays.asList(aluno2, aluno3));
		serie3.getAlunos().add(aluno4);
		
		disciplinasRepository.saveAll(Arrays.asList(disc1,disc2,disc3,disc4,disc5));
		professorRepository.saveAll(Arrays.asList(professor1, professor2, professor3));
		serieRepository.saveAll(Arrays.asList(serie1, serie2, serie3));
		alunoRepository.saveAll(Arrays.asList(aluno1, aluno2, aluno3, aluno4));
		

	}

}
