
public class CriarConta {

	public static void main(String[] args) {
	
		Conta conta1 = new Conta();
		conta1.saldo = 100.00;
		conta1.agencia = 1234;
		conta1.numero = 123456;
		
		Conta conta2 = new Conta();
		conta2.saldo = 100.00;
		conta2.agencia = 1234;
		conta2.numero = 123456;

		Titular titular = new Titular();

		
		conta2.titular = titular;
		
		if(conta1 == conta2) {
			System.out.println("Contas iguais!");
		} else {
			System.out.println("Contas diferentes");
			System.out.println(conta1);
			System.out.println(conta2);
		}
		
		if(conta1.agencia == conta2.agencia) {
			System.out.println("Ag�ncias iguais!");
		} else {
			System.out.println("Ag�ncias diferentes");
		}
		
		int numero1 = 5;
		int numero2 = 5;
		
		if(numero1 == numero2) {
			System.out.println("N�meros iguais");
		} else {
			System.out.println("N�meros diferentes");
		}
		

	}

}