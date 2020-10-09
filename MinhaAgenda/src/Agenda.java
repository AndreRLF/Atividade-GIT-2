import java.util.List;

public class Agenda {
	
	private List<Pessoa> pessoas;

	public Agenda(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
		
	public void dev2(String a){
		 System.out.println(a);
	}
}
