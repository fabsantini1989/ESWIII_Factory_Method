package model;

public class Funcionario {

	private int id;
	private String nome;
	private Long salario;

	public Funcionario() {
	}

	public Funcionario(String nome, int id, Long salario) {
		this.id = id;
		this.nome = nome;
	    this.salario = salario;
	}

	public void ContrataFuncionario() {
	    System.out.println("Novo Funcionário Contratado");
	    System.out.println(id);	
	    System.out.println(nome);	
	    System.out.println(salario);	
	  	}
	
	public int getId() {
		return id;
		}

	public void setId(int id) {
		this.id = id;
		}
	
	public String getNome() {
		return nome;
		}

	public void setNome(String nome) {
		this.nome = nome;
		}

	public Long getSalario() {
	    return salario;
	 	}

	public void setSalario(Long salario) {
	    this.salario = salario;
	 	}

	}



