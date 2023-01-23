package principal;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descricao curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descricao curso JS");
		curso2.setCargaHoraria(6);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Mentoria curso de Java");
		mentoria1.setData(LocalDate.now());
		
		/*
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1); */
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devMarcos = new Dev();
		devMarcos.setNome("Marcos");
		devMarcos.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos " + devMarcos.getConteudosInscritos());
		devMarcos.progredir();
		devMarcos.progredir();
		System.out.println("Conteudos inscritos " + devMarcos.getConteudosInscritos());
		System.out.println("Conteudos concluidos " + devMarcos.getConteudosConcluidos());
		System.out.println("XP: " + devMarcos.calcularTotalXp());

		System.out.println("=============================");
		
		Dev devJulia = new Dev();
		devJulia.setNome("Julia");
		devJulia.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos " + devJulia.getConteudosInscritos());
		devJulia.progredir();
		devJulia.progredir();
		devJulia.progredir();
		System.out.println("Conteudos inscritos " + devJulia.getConteudosInscritos());
		System.out.println("Conteudos concluidos " + devMarcos.getConteudosConcluidos());
		System.out.println("XP: " + devJulia.calcularTotalXp());



		
		
		
		
		
		
	
	}

}