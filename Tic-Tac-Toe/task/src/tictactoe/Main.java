package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        // ---------------------------------Input
        System.out.println("Enter cells:");
        String s = kb.nextLine();
        String[] L = new String[3];
        L[0] = s.substring(0, 3);
        L[1] = s.substring(3, 6);
        L[2] = s.substring(6);

        int k = 0, x = 0, o = 0;
        char[][] m = new char[3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                m[i][j] = L[i].charAt(j);
            }
        }
        Print(m);

        /*
         * ---------------------------------Part-2 char win = ' '; int l = 0; if
         * (m[0][0] == m[1][1] && m[1][1] == m[2][2]) { win = m[0][0]; l++; } else if
         * (m[0][2] == m[1][1] && m[1][1] == m[2][0]) { win = m[0][0]; l++; } else { for
         * (int i = 0; i < 3; i++) { if (m[i][0] == m[i][1] && m[i][1] == m[i][2]) { win
         * = m[i][0]; l++; } else if (m[0][i] == m[1][i] && m[1][i] == m[2][i]) { win =
         * m[0][i]; l++; } else {
         * 
         * } } }
         * 
         * if (Math.abs(x - o) >= 2) { System.out.println("Impossible"); } else if (l ==
         * 0 && k == 9) { System.out.println("Draw"); } else if (l == 1) {
         * System.out.println(win + " wins"); } else if (l > 1) {
         * System.out.println("Impossible"); } else if (k != 9) {
         * System.out.println("Game not finished"); } else {
         * System.out.println("Impossible"); }
         */

        // ---------------------------------Part-3

        int xx = -1, yy = -1;
        while (xx == -1 && yy == -1) {
            System.out.println("Enter the coordinates:");

            String c = kb.nextLine();
            
            if (Character.isDigit(c.charAt(0)) == true && Character.isDigit(c.charAt(2)) == true) {
                String[] cc=c.split(" ");
                xx = Integer.parseInt(cc[0]);
                yy = Integer.parseInt(cc[1]);
                if ((xx <= 3 && xx >= 1) && (yy <= 3 && yy >= 1)) {
                    if (m[3 - yy ][xx - 1] == '_') {
                        m[3 - yy ][xx - 1] = 'X';
                        Print(m);
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        xx = -1;
                        yy = -1;
                    }
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                    xx = -1;
                    yy = -1;
                }
            } else {
                System.out.println("You should enter numbers!");
            }

        }
    }

    static void Print(char[][] m) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }
}
