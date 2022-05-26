package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informações do Funcionario
		
		//Tipos Numericos
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos Numericos Reais
		float salario = 11_445_44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano
		boolean estaDeFerias = false;// true
		
		// Tipo Caractere
		char status = 'A'; // Ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de Viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": Ganha ->" + salario );
		System.out.println("Férias:" + estaDeFerias);
		System.out.println("Status:" + status);
		
	}
}
