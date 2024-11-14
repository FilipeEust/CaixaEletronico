import java.util.Scanner;

public class CaixaEletronico{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);

		double contaBancaria = 10000;
		boolean continuar = true;
		double saque = 0;

		while(continuar){
			System.out.printf("\nValor na conta bancaria: %.2f\n",contaBancaria);

			System.out.print("Saque: ");

			if(scanner.hasNextDouble()){
				saque = scanner.nextDouble();
				scanner.nextLine();

				if(saque > 0){
					if(saque <= contaBancaria){
						contaBancaria = contaBancaria - saque;
						saque = 0;
					}else{
						System.out.println("ERRO: O valor do saque deve ser menor que o valor em conta.");
					}
				}else{
					System.out.println("ERRO: O valor do saque deve ser maior que 0 (zero)");
				}
			}else{
				scanner.nextLine();
				System.out.println("Valor Invalido!");
			}

			System.out.println("Para nova operação digite (S): ");
			if(scanner.nextLine().trim().toUpperCase().equals("S")){
				
			}else{
				continuar = false;
			}
		}
		System.out.printf("\nSaldo atual em conta: %.2f\n",contaBancaria);
	}
}
