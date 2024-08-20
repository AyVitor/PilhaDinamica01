package Pilha;
import java.util.Stack;
public class VerificadorExpressao {
    public static boolean VerificarExpressao(String expressao) {
        
        Stack<Character> pilha = new Stack<>();

        
        for (int i = 0; i < expressao.length(); i++) {
            char sabe = expressao.charAt(i);

            
            if (sabe == '(' || sabe == '{' || sabe == '[') {
                pilha.push(sabe);
            }
        
            else if (sabe == ')' || sabe == '}' || sabe == ']') {
        
                if (pilha.isEmpty()) {
                    return false;
                }
                char topo = pilha.pop();
                
                if ((sabe == ')' && topo != '(') || 
                    (sabe == '}' && topo != '{') || 
                    (sabe == ']' && topo != '[')) {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }
}