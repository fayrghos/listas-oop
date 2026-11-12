package colecoes.q02;

import java.util.TreeMap;

public class Principal {

    public static void main(String[] args) {
        TreeMap<Character, Integer> contaLetras = new TreeMap<>();
        String inserida = "HELLO THERE";

        for (Character caracter : inserida.toCharArray()) {
            if (!Character.isLetter(caracter)) continue;

            contaLetras.put(
                caracter,
                contaLetras.getOrDefault(caracter, 0) + 1
            );
        }

        System.out.println(contaLetras);
    }
}
