package com.projetobeta.techescola.configs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetobeta.techescola.entities.CadastroAluno;
import com.projetobeta.techescola.repositories.CadastroAlunoRepository;

@Configuration
@Profile("test")
public class ClasseDeTestes implements CommandLineRunner {
	
	@Autowired
	private CadastroAlunoRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		CadastroAluno aluno1 = new CadastroAluno(null, "João", "joao@hotmail.com", "123", "academico", "22222" );
		CadastroAluno aluno2 = new CadastroAluno(null, "Mario", "mario@hotmail.com", "321", "sartre", "11111" );
		CadastroAluno aluno3 = new CadastroAluno(null, "Kaique", "kaique@hotmail.com", "456", "vieira", "33333" );
		CadastroAluno aluno4 = new CadastroAluno(null, "O outro joão", "joao2@hotmail.com", "654", "academico", "44444" );

		repository.saveAll(Arrays.asList(aluno1,aluno2,aluno3,aluno4));
		
	}

}
