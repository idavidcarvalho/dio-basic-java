public class SistemaCadastro {
	public static void main(String[] args) {

		Pessoa marcos = new Pessoa("46545464", "Marcos");
		
		marcos.setEndereco("RUA DAS MARIAS");
		
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
