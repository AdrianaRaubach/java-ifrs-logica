public class ForcarConversao {
    public static void main(String[] args) {
        float n1, forcarResultado; 
        float n2, res;
      
        n1 = 10;
        n2 = 5.33f;

        res = n1 + n2;
        forcarResultado = (int) res;

        System.out.println("resultado normal: " + res);
        System.out.println("resultado normal: " + forcarResultado);
        
    }
}
