package br.com.tt.comunicador.common;

import javax.swing.*;
import java.util.Scanner;

public class Util {

    public void print(String texto){
        //System.out.println(texto);
        JOptionPane.showMessageDialog(null, texto);

    }

    public String read(){
        return JOptionPane.showInputDialog(null);
        //Scanner scanner = new Scanner(System.in);
        //return scanner.nextLine();
    }

}
