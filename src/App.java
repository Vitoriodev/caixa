import java.util.Scanner;

public class App {
	
	public static void dinheiro(Scanner input) {
		while (true) {
			
			System.out.print("qual o valor da compra: ");
			float valor = input.nextFloat();
			
			System.out.print("qual foi o valor pago que foi passado");
			float pago = input.nextFloat();
				
			float total = pago - valor;
						
			if( pago > valor) {
				
				System.out.println("o seu troco foi "+total+" reais");
				
			}else if (pago < valor) {
				System.out.println("esta faltando "+total+" para fechar a conta.");
				continue;				
				
			}else {
				System.out.println("você pagou tudo certinho muito obrigado pela compra.");
			}
			
			break;
		}
		
		
		
		
	}
	public static void debito(Scanner input) {
		
		
		
	}
	public static void credito(Scanner input) {
		
		
		
	}
	

    public static void main(String[] args) throws Exception {
        
        System.out.println("caixa eletronica");
        
        System.out.println("qua o tipo de pagamento.");
        
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
            			
            			break;
            			
            		case 3:
            			System.out.println("você escolheu em paga em credito.");
            			
            			break;
            		default:
            			System.out.println("ops! essa opção não existe.");
						break;
    			}
            	
            	
    		} catch (Exception e) {
    			// TODO: handle exception
    		}
        	
        	
        	
        }
        
        
			
		}
        
        
           
}



