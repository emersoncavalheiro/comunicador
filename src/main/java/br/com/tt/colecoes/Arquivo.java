package br.com.tt.colecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("C:\\Users\\aluno05sala02\\emerson\\cursoJava\\comunicador\\src\\main\\resources\\input_1.txt"));

        while (scanner.hasNextLine()) {
            List<String> partes = Arrays.asList(scanner.nextLine().split(","));
            System.out.println(partes.get(1));
            }

            }

}
