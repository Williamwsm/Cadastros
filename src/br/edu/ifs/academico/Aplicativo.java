package br.edu.ifs.academico;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicativo {
		
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println(Menu.getMenu());
		int opcao = leia.nextInt(); 
		// criaçao de variaveis comuns
		char sexo;
		String nome;
		String dataNascimento;
		String localNascimento;
		double salarioBolsa;
		
		// criaçao dos Arrays 
		Pessoa Pessoa = new Pessoa(null);
		Aluno Aluno = new Aluno(null);
		Professor Professor = new Professor(null);
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Coordenador> coordenadores = new ArrayList<Coordenador>();
		ArrayList<Estagiario> estagiarios = new ArrayList <Estagiario>();
		ArrayList<Pesquisador> pesquisadores = new ArrayList <Pesquisador>();
		ArrayList<Bolsista> bolsistas = new ArrayList <Bolsista>();
		ArrayList<Psicologo> psicologos = new ArrayList <Psicologo>();
		ArrayList<Tecnico> tecnicos = new ArrayList <Tecnico>();
		ArrayList<Fornecedor> fornecedores = new ArrayList <Fornecedor>();
		while(opcao != 0) {
		
			switch (opcao) {
			case 1:
				double nota1, nota2, nota3;
				
				System.out.println("Digite seu nome: ");
				nome = leia.next();
				Aluno aluno= new Aluno(nome);
				
				System.out.println("Digite seu sexo: ");
				sexo = leia.next().charAt(0);
				aluno.setSexo(sexo);
				
				System.out.println("Digite seu local nascimento: ");
				localNascimento = leia.next();
				aluno.setLocalNascimento(localNascimento);
				
				System.out.println("Digite sua data de nascimento: ");
				dataNascimento = leia.next();
				aluno.setDataNascimento(dataNascimento);
				
				System.out.println("Digite a primeira nota ");
				nota1 = leia.nextDouble();
				aluno.setNota1(nota1);
				
				System.out.println("Digite a segunda nota ");
				nota2 = leia.nextDouble();
				aluno.setNota2(nota2);
				
				System.out.println("Digite a terceira nota ");
				nota3 = leia.nextDouble();
				aluno.setNota3(nota3);
				
				System.out.println("Informe o Salário/bolsa: ");
				salarioBolsa = leia.nextDouble();
				aluno.setSalarioBolsa(salarioBolsa);
				
				aluno.calcularDecimoTerceiro();
				
				alunos.add(aluno);
				System.out.println("Aluno cadastrado: ");
	
				break;
			case 2:
				System.out.println(" Listar aluno: ");
				System.out.println(alunos);
				break;
			case 3:
				String formacao;
	
				System.out.println("Digite seu nome: ");
				nome = leia.next();
				Professor professor = new Professor(nome);
				
				System.out.println("Digite seu sexo: ");
				sexo = leia.next().charAt(0);
				professor.setSexo(sexo);
				
				System.out.println("Digite seu local nascimento: ");
				localNascimento = leia.next();
				professor.setLocalNascimento(localNascimento);
				
				System.out.println("Digite sua data de nascimento: ");
				dataNascimento = leia.next();
				professor.setDataNascimento(dataNascimento);
				
				System.out.println("Informe sua formação: ");
				formacao = leia.next();
				professor.setFormacao(formacao);
				
				System.out.println("Informe o Salário/bolsa: ");
				salarioBolsa = leia.nextDouble();
				professor.setSalarioBolsa(salarioBolsa);
				
				professor.calcularDecimoTerceiro();
				
				professores.add(professor);
				System.out.println("Professor cadastrado: ");
	
				break;
			case 4: 
				System.out.println(" Listar professor: ");
				System.out.println(professores);
				break;
			case 5:
				String curso;
				
				System.out.println("Digite seu nome: ");
				nome = leia.next();
				Coordenador coordenador = new Coordenador(nome);
				
				System.out.println("Digite seu sexo: ");
				sexo = leia.next().charAt(0);
				coordenador.setSexo(sexo);
				
				System.out.println("Digite seu local nascimento: ");
				localNascimento = leia.next();
				coordenador.setLocalNascimento(localNascimento);
				
				System.out.println("Digite sua data de nascimento: ");
				dataNascimento = leia.next();
				coordenador.setDataNascimento(dataNascimento);
				
				System.out.println("Informe o seu curso: ");
				curso = leia.next();
				coordenador.setCurso(curso);
				
				System.out.println("Informe o Salário/bolsa: ");
				salarioBolsa = leia.nextDouble();
				coordenador.setSalarioBolsa(salarioBolsa);
				
				System.out.println("Informe o Salário/bolsa: ");
				salarioBolsa = leia.nextDouble();
				coordenador.setSalarioBolsa(salarioBolsa);
				
				Pessoa.calcularDecimoTerceiro();
				
				coordenadores.add(coordenador);
				System.out.println(" Coordenador cadastrado: ");
	
				break;
			case 6:
				System.out.println(" Listar coordenador: ");
				System.out.println(coordenadores);
				break;
			case 7:
				int cargaHoraria;
				String numeroDoConselho;
				
				System.out.println("Digite seu nome: ");
				nome = leia.next();
				Psicologo psicologo = new Psicologo(nome);
				
				System.out.println("Digite seu sexo: ");
				sexo = leia.next().charAt(0);
				psicologo.setSexo(sexo);
				
				System.out.println("Digite seu local nascimento: ");
				localNascimento = leia.next();
				psicologo.setLocalNascimento(localNascimento);
				
				System.out.println("Digite sua data de nascimento: ");
				dataNascimento = leia.next();
				psicologo.setDataNascimento(dataNascimento);
				
				System.out.println("Informe sua carga horaria: ");
				cargaHoraria = leia.nextInt();
				psicologo.setCargaHoraria(cargaHoraria); 
				
				System.out.println("Informe o numero do conselho: ");
				numeroDoConselho = leia.next();
				psicologo.setNumeroDoConselho(numeroDoConselho);
				
				System.out.println("Informe o Salário/bolsa: ");
				salarioBolsa = leia.nextDouble();
				psicologo.setSalarioBolsa(salarioBolsa);
				
				Pessoa.calcularDecimoTerceiro();
				
				psicologos.add(psicologo);
				System.out.println(" Psicologo cadastrado: ");
	
				break;
			case 8:
				System.out.println(" Listar psicologo: ");
				System.out.println(psicologos);
				break;
			case 9:
				String instituicao, periodoAtual, cursoEstagiario;
				
				System.out.println("Digite seu nome: ");
				nome = leia.next();
				Estagiario estagiario = new Estagiario (nome);
				
				System.out.println("Digite seu sexo: ");
				sexo = leia.next().charAt(0);
				estagiario.setSexo(sexo);
				
				System.out.println("Digite seu local nascimento: ");
				localNascimento = leia.next();
				estagiario.setLocalNascimento(localNascimento);
				
				System.out.println("Digite sua data de nascimento: ");
				dataNascimento = leia.next();
				estagiario.setDataNascimento(dataNascimento);
				
				System.out.println("Informe seu curso: ");
				cursoEstagiario = leia.next();
				estagiario.setCursoEstagiario(cursoEstagiario);
				
				System.out.println("Informe o seu periodo atual: ");
				periodoAtual = leia.next();
				estagiario.setPeriodoAtual(periodoAtual);
				
				System.out.println("Informe sua instituiçao: ");
				instituicao = leia.next();
				estagiario.setInstituicao(instituicao);
				
				System.out.println("Informe o Salário/bolsa: ");
				salarioBolsa = leia.nextDouble();
				estagiario.setSalarioBolsa(salarioBolsa);
				
				Pessoa.calcularDecimoTerceiro();
				
				estagiarios.add(estagiario);
				System.out.println(" Estagiario cadastrado: ");
		
			case 10:
				System.out.println(" Listar estagiario: ");
				System.out.println(estagiarios);
				break;
			case 11:
				String especialidade;
				
				System.out.println("Digite seu nome: ");
				nome = leia.next();
				Tecnico tecnico = new Tecnico(nome);
				
				System.out.println("Digite seu sexo: ");
				sexo = leia.next().charAt(0);
				tecnico.setSexo(sexo);
				
				System.out.println("Digite seu local nascimento: ");
				localNascimento = leia.next();
				tecnico.setLocalNascimento(localNascimento);
				
				System.out.println("Digite sua data de nascimento: ");
				dataNascimento = leia.next();
				tecnico.setDataNascimento(dataNascimento);
				
				System.out.println("Informe sua especialidade: ");
				especialidade = leia.next();
				tecnico.setEspecialidade(especialidade);
				
				System.out.println("Informe o Salário/bolsa: ");
				salarioBolsa = leia.nextDouble();
				tecnico.setSalarioBolsa(salarioBolsa);
				
				Pessoa.calcularDecimoTerceiro();
				
				tecnicos.add(tecnico);
				System.out.println(" Tecnico cadastrado: ");
	
				break;
			case 12:
				System.out.println(" Listar tecnico: ");
				System.out.println(tecnicos);
				
				break;
			case 13:
				int codigoPesquisa;
				String instituicaoVinculada, grupoPesquisa;
				
				System.out.println("Digite seu nome: ");
				nome = leia.next();
				Pesquisador pesquisador = new Pesquisador(nome);
				
				System.out.println("Digite seu sexo: ");
				sexo = leia.next().charAt(0);
				pesquisador.setSexo(sexo);
				
				System.out.println("Digite seu local nascimento: ");
				localNascimento = leia.next();
				pesquisador.setLocalNascimento(localNascimento);
				
				System.out.println("Digite sua data de nascimento: ");
				dataNascimento = leia.next();
				pesquisador.setDataNascimento(dataNascimento);
				
				System.out.println("Informe a instituiao vinculada: ");
				instituicaoVinculada = leia.next();
				pesquisador.setInstituicaoVinculada(instituicaoVinculada);
				
				System.out.println("Informe o codigo de pesquisada: ");
				codigoPesquisa = leia.nextInt();
				pesquisador.setCodigoPesquisa(codigoPesquisa);
				
				System.out.println("informe o seu grupo de pesquisa: ");
				grupoPesquisa = leia.next();
				pesquisador.setGrupoPesquisa(grupoPesquisa);
				
				System.out.println("Informe o Salário/bolsa: ");
				salarioBolsa = leia.nextDouble();
				pesquisador.setSalarioBolsa(salarioBolsa);
				
				Pessoa.calcularDecimoTerceiro();
				
				pesquisadores.add(pesquisador);
				System.out.println(" Pesquisador cadastrado: ");
	
				break;
			case 14: 
				System.out.println(" Listar pesquisador: ");
				System.out.println(pesquisadores);
				break;
			case 15: 
				double  valorBolsa;
				String orientador;
				System.out.println("Digite seu nome: ");
				nome = leia.next();
				Bolsista bolsista = new Bolsista (nome);
				
				System.out.println("Digite seu sexo: ");
				sexo = leia.next().charAt(0);
				bolsista.setSexo(sexo);
				
				System.out.println("Digite seu local nascimento: ");
				localNascimento = leia.next();
				bolsista.setLocalNascimento(localNascimento);
				
				System.out.println("Digite sua data de nascimento: ");
				dataNascimento = leia.next();
				bolsista.setDataNascimento(dataNascimento);
				
				System.out.println("Informe o valor da sua bolsa : ");
				 valorBolsa = leia.nextDouble();
				bolsista.setValorBolsa(valorBolsa);
				
				System.out.println("Informe o seu orientador : ");
				  orientador = leia.next();
				bolsista.setOrientador(orientador);
				
				System.out.println("Informe o Salário/bolsa: ");
				salarioBolsa = leia.nextDouble();
				bolsista.setSalarioBolsa(salarioBolsa);
				
				Pessoa.calcularDecimoTerceiro();
				
				bolsistas.add(bolsista);
				System.out.println(" Bolsista cadastrado: ");
	
				break;
			case 16:
				System.out.println(" Listar bolsista: ");
				System.out.println(bolsistas);
				break;
				
			case 17:
				int cnpj;
				String razaoSocial;
				String cidade;

				System.out.println("Informe a sua razão social: ");
				razaoSocial = leia.next();
				
				Fornecedor fornecedor = new Fornecedor (razaoSocial);
				fornecedor.setRazaoSocial(razaoSocial);
				
				System.out.println("Digite o seu CNPJ: ");
				cnpj = leia.nextInt();
				fornecedor.setCnpj(cnpj);
				 
				System.out.println("Informe o nome da sua cidade: ");
				cidade = leia.next();
				fornecedor.setCidade(cidade);
				
				fornecedores.add(fornecedor);
				System.out.println(" Fornecedor cadastrado: ");
				
				break;
				
			case 18:
				System.out.println(" Listar fornecedor: ");
				System.out.println(fornecedores);
				break;
				
			default:
				System.out.println(" OPCAO INVALIDA !!! ");
				break;
			}
			System.out.println();
			System.out.println(Menu.getMenu());
			opcao = leia.nextInt();
		}
		}
}
