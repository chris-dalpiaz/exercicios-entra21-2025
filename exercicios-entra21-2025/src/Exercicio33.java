import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //33
        int maiorTamanho;
        ArrayList<Character> caracteres1 = new ArrayList<>();
        caracteres1.add('a');
        caracteres1.add('b');
        caracteres1.add('d');
        caracteres1.add('f');
        caracteres1.add('g');
        caracteres1.add('z');
        caracteres1.add('u');

        ArrayList<Character> caracteres2 = new ArrayList<>();
        caracteres2.add('z');
        caracteres2.add('y');
        caracteres2.add('x');
        caracteres2.add('w');
        caracteres2.add('v');
        caracteres2.add('b');
        caracteres2.add('u');

        ArrayList<Character> elementosComuns = new ArrayList<>();

        if (caracteres1.size() > caracteres2.size()) {
            maiorTamanho = caracteres1.size();
        } else {
            maiorTamanho = caracteres2.size();
        }

        for (int i = 0; i < maiorTamanho; i++) {
            if (caracteres1.contains(caracteres2.get(i))){
                elementosComuns.add(caracteres2.get(i));
            }
        }
        System.out.println(elementosComuns);
    }
}
