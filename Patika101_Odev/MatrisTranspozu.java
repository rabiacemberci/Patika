public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] array = {
                {6, 2, 3},
                {4, 5, 6},

        };
        int[][] newArray = new int[3][2];
        System.out.println("Dizi: ");
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print((array[i][j] + " "));
            }
            System.out.println();
        }
        System.out.println( "Transpozu:");
        for (int i=0;i<array.length+1;i++){
            for (int j=0;j<array.length;j++){
                newArray[i][j]=array[j][i];
                System.out.print((newArray[i][j] + " "));
            }
            System.out.println();
        }

    }
}
