import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.print("Digite o salario: \n");
	        double salario = ler.nextDouble();
	        
	        System.out.print("A porcentagem do reajuste: \n");
	        double reajuste = ler.nextDouble();
	        double conta = (salario*reajuste) /100;
	        
	        
	        System.out.println("O Salário reajustado é  "+(conta+salario));

	}

}
