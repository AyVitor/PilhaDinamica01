package Pilha;

public class Main { 
    public static void main(String[] args) {
        
        String[] expressoes = {
            "((7*5)*4-(8/3))",  
            "(({})*4-()",    
            "{[()]}",            
            "{[(])}",            
            "(a+b)*(c-d)",        
            "((a+b)*(c-d)",      
            "{[()()]}",          
            "{[()()]}}",
            "((({}}}[[]])))"     
        };

        
        for (String expressao : expressoes) {
            if (VerificadorExpressao.VerificarExpressao(expressao)) { 
                System.out.println("Expressão correta: " + expressao);
            } else {
                System.out.println("Expressão incorreta: " + expressao);
            }
        }
    }

}