import java.util.List;

public class Pessoa {
	
	private String nome;
	private List<Telefone> telefones;
	
	public Pessoa() {}

	public Pessoa(String nome, List<Telefone> telefones) {
		this.nome = nome;
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
		
}
