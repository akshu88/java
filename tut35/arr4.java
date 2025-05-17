package tut35;

public class arr4 {
    public static void main(String[] args) {
        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

       

        /* 
        String[][] groceries = { {"apple", "banana", "orange" }, {"carrot", "potato", "broccoli" }, {"milk", "cheese", "yogurt" } };

        groceries[0][0] = "pineapple";
        groceries[1][2] = "cabbage";
        groceries[2][1] = "butter";
        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            
            }
            System.out.println();
        }
        */

        char[][]telephone = {{'1', '2', '3'},
                             {'4', '5', '6'},
                             {'7', '8', '9'},
                             {'*', '0', '#'}};
        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}
