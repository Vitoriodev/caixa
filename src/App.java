import java.util.Scanner;

public class App {
	
	public static void dinheiro(Scanner input) {
		
		
		
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



