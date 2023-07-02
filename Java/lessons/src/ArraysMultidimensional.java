public class ArraysMultidimensional {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int[][] matrix =   {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
        /* int[] number = {1,2,3};
        int [][] matrix =  {{1,2,3,4,5},
                            {4,5,6},
                            {7,8,9}};
        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[0][4]);
        int[] number1 = new int[5];

        String[][] strings = {{"one","two","three"},
                             {"four","five", "six"}};
        System.out.println(strings[0][1]);*/

