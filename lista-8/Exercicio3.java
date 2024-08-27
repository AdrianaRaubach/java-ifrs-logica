public class Exercicio3 {
    public static void main(String[] args) {
        
        float [] valores = {10,20,30,40,50,60,70,80,90,100};
        float media = 0;

        for (int i = 0; i < valores.length; i++) {
            media = media + valores[i];
        }

        media = media/valores.length;
        System.out.println(media);


    }
}
