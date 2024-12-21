import java.util.Scanner;

public class App {
	
	public static void dinheiro(Scanner input) { //pagamento de dinheiro
		while (true) {
			
			System.out.print("qual o valor da compra: ");
			float valor = input.nextFloat();
			
			System.out.print("qual foi o valor pago que foi passado");
			float pago = input.nextFloat();
				
			float total = pago - valor; // vai fazer uma diminuição para saber quanto de troco vai passar por cliente
						
			if( pago > valor) {
				
				System.out.println("o seu troco foi "+total+" reais");
				
			}else if (pago < valor) { 
				// quanto o valor do dinheiro for menor da compra vai dizer que é pouco dinheiro.
				// e vai retorna ao inicio do valor da compra.
				System.out.println("esta faltando "+total+" para fechar a conta.");
				continue;				
				
			}else {
				System.out.println("você pagou tudo certinho muito obrigado pela compra.");
			}
			
			break;
		}
		
					
	}
	public static void debito(Scanner input) { // pagamento em débito
		
		while (true) {
			
			System.out.println("qual o valor da compra: ");
			float valor = input.nextFloat();
		
			System.out.println("adicione dinheiro no cartão de débito: ");
			float debito = input.nextFloat();
			
			float total = debito - valor;
			debito = debito - valor; //o resto do dinheiro que sobrou vai retorna para conta.
			
			if(total > 0) {
				System.out.println("você passou mais que devia, nos retonamos o seu valor que foi ultrapassado");
								
				System.out.println("valor do seu cartão: "+debito+"\nsua compra foi realizadar.");
				
			}else if(total < 0) {
				System.out.println("você não tem saldo suficiênte");
				continue;
				
				
			}else {
				System.out.println("valor do seu cartão: "+debito+"\nsua compra foi realizadar.");
			}
			
			break;
		}
		
	}
	public static void credito(Scanner input) { //pagamento em cartão de credito
		
		System.out.print("qual o valor da compra: ");
		float valor = input.nextFloat();
		
		System.out.println("o valor da compra foi "+valor+" quantas vezes vai passa no cartão");
		float credito = input.nextFloat();
		
		float pacelas = valor / credito;
				
		if(credito >= 2) {
			System.out.println("você pacelou "+credito+" vezes e vai pagar "+pacelas+" por pacelas.");
			
		}else {
			System.out.println("você pacelou "+credito+" vez e vai pagar "+valor+" na proxima pacela");
			
		}
	
	}
	

    public static void main(String[] args) throws Exception {
        
        System.out.println("caixa eletronica");
        
        System.out.println("qua o tipo de pagamento.");
        System.out.println("dinheiro(1) débito(2) catão de credito(3)");
                
        Scanner input = new Scanner(System.in);
        
        while (true) {
        	
        	try {
    			
            	int pagamento = input.nextInt();   	
            	switch (pagamento) {
            	
            		case 1:
            			System.out.println("você escolheu em paga em dinheiro.");            			
            			dinheiro(input);            			
            			break;
            			
            		case 2:
            			System.out.println("você escolheu em paga em débito.");
            			debito(input);
            			break;
            			
            		case 3:
            			System.out.println("você escolheu em paga em credito.");
            			credito(input);
            			break;
            			
            		default:
            			System.out.println("ops! essa opção não existe.");
						break;
    			}
            	            	
    		} catch (Exception e) {
    			System.out.println("essa opção não existem tente novamente.");
    			continue;
    		}
        	
        		
        }
        		
		}
    
}


