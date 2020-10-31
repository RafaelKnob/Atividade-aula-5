
package atividadeaula05;



public class AtividadeAula05 {

    public static void main(String[] args) {
        // TODO code application logic here
        String produtos[];
        double preco[];
        double quantidades[];
        
        produtos = new String[3];
        preco = new double[3];
        quantidades = new double[3];
        
        produtos[0] = "teclado";
        preco[0] = 40.00;
        quantidades[0] = 30;
        
        produtos[1] = "mouse";
        preco[1] = 15.00;
        quantidades[1] = 20;
        
        produtos[2] = "monitor";
        preco[2] = 250.00;
        quantidades[2] = 10;
        
        System.out.println("produto: " + produtos[0] + " -> preço: " + preco[0] + " -> Quantidade: " + quantidades[0]);
        System.out.println("produto: " + produtos[1] + " -> preço: " + preco[1] + " -> Quantidade: " + quantidades[1]);
        System.out.println("produto: " + produtos[2] + " -> preço: " + preco[2] + " -> Quantidade: " + quantidades[2]);
        
        //System.out.println("Produto 1: " + produtos[0] "Preço: " + preco[0] "Quantidade: " + quantidades[0]);
        
        
            
    }
        
        
      
      
    
}
