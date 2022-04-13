package Lesson_2;
//8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами
// (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

public class Task_8 {

    public static void createBivariateArray() {
        int[][] bivariate = new int[3][3];

        for (int i = 0; i < bivariate.length; i++) {
            for (int j = 0; j < bivariate.length; j++) {
                if (j == i || j == (bivariate.length - 1) - i) {
                    bivariate[i][j] = 1;
                } else {
                    bivariate[i][j] = 0;
                }
                System.out.print(bivariate[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        createBivariateArray();
    }
}
