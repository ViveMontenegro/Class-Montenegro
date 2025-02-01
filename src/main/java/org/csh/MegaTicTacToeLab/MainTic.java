import java.util.Scanner;

public class MainTic {
    public static void main(String[] args) {
        System.out.print("\n");
        TicTacToe game = new TicTacToe();
        Scanner scan = new Scanner(System.in);
        int turnO = 0;
        int con = 0;
        int tempK = 0;
        int tempJ = 0;
        int tempL = 0;
        int tempM = 0;
        int inputK = 2;
        int inputJ = 2;
        int inputL = 2;
        int inputM = 2;
        System.out.print("Mega TicTacToe: X will start\n\n");
        game.board();

        System.out.print("\n\nbig row 1/2/3?  ");
        inputK = scan.nextInt();
        
        if (inputK == 1)
            tempK = 0;
        else if (inputK == 2)
            tempK = 1;
        else if (inputK == 3)
            tempK = 2;
        else
            System.out.print("please restart: invalid input");
        System.out.print("\n\nbig column 1/2/3?  ");
        inputJ = scan.nextInt();
        if (inputJ == 1)
            tempJ = 0;
        else if (inputJ == 2)
            tempJ = 1;
        else if (inputJ == 3)
            tempJ = 2;
        else
            System.out.print("please restart: invalid input");

        System.out.print("\n\nsmall row 1/2/3?  ");
        inputL = scan.nextInt();
        if (inputL == 1)
            tempL = 0;
        else if (inputL == 2)
            tempL = 1;
        else if (inputL == 3)
            tempL = 2;
        else
            System.out.print("please restart game: invalid input");
    
        System.out.print("\n\nsmall column 1/2/3?  ");
        inputM = scan.nextInt();
        if (inputM == 1)
            tempM = 0;
        else if (inputM == 2)
            tempM = 1;
        else if (inputM == 3)
            tempM = 2;
        else
            System.out.print("please restart game: invalid input");
        game.setX(tempK,tempJ,tempL,tempM);
        System.out.print("O's turn\n\n");
        game.board();
        //
        //
        //
        //
        while (con < 1)
        {
            tempK = tempL;
            tempJ = tempM;
            //
            if (turnO % 2 == 0 && game.winO(tempL,tempM))
            {
                System.out.print("\n\nbig row 1/2/3?  ");
                inputK = scan.nextInt();
        
                if (inputK == 1)
                    tempK = 0;
                else if (inputK == 2)
                    tempK = 1;
                else if (inputK == 3)
                    tempK = 2;
                else
                    System.out.print("please restart: invalid input");
                System.out.print("\n\nbig column 1/2/3?  ");
                inputJ = scan.nextInt();
                if (inputJ == 1)
                    tempJ = 0;
                else if (inputJ == 2)
                    tempJ = 1;
                else if (inputJ == 3)
                    tempJ = 2;
                else
                    System.out.print("please restart: invalid input");

                System.out.print("\n\nsmall row 1/2/3?  ");
                inputL = scan.nextInt();
                if (inputL == 1)
                    tempL = 0;
                else if (inputL == 2)
                    tempL = 1;
                else if (inputL == 3)
                    tempL = 2;
                else
                    System.out.print("please restart game: invalid input");
                
                System.out.print("\n\nsmall column 1/2/3?  ");
                inputM = scan.nextInt();
                if (inputM == 1)
                    tempM = 0;
                else if (inputM == 2)
                    tempM = 1;
                else if (inputM == 3)
                    tempM = 2;
                else
                System.out.print("please restart game: invalid input");
            }
            else if (turnO % 2 != 0 && game.winX(tempL,tempM))
            {
                System.out.print("\n\nbig row 1/2/3?  ");
                inputK = scan.nextInt();
        
                if (inputK == 1)
                    tempK = 0;
                else if (inputK == 2)
                    tempK = 1;
                else if (inputK == 3)
                    tempK = 2;
                else
                    System.out.print("please restart: invalid input");
                System.out.print("\n\nbig column 1/2/3?  ");
                inputJ = scan.nextInt();
                if (inputJ == 1)
                    tempJ = 0;
                else if (inputJ == 2)
                    tempJ = 1;
                else if (inputJ == 3)
                    tempJ = 2;
                else
                    System.out.print("please restart: invalid input");

                System.out.print("\n\nsmall row 1/2/3?  ");
                inputL = scan.nextInt();
                if (inputL == 1)
                    tempL = 0;
                else if (inputL == 2)
                    tempL = 1;
                else if (inputL == 3)
                    tempL = 2;
                else
                    System.out.print("please restart game: invalid input");
                
                System.out.print("\n\nsmall column 1/2/3?  ");
                inputM = scan.nextInt();
                if (inputM == 1)
                    tempM = 0;
                else if (inputM == 2)
                    tempM = 1;
                else if (inputM == 3)
                    tempM = 2;
                else
                System.out.print("please restart game: invalid input");
            }
            else
            {
                System.out.print("\n\nrow 1/2/3?  ");
                inputL = scan.nextInt();
                if (inputL == 1)
                    tempL = 0;
                else if (inputL == 2)
                    tempL = 1;
                else if (inputL == 3)
                    tempL = 2;
                else
                    System.out.print("please restart game: invalid input");
                //
                System.out.print("\n\ncolumn 1/2/3?  ");
                inputM = scan.nextInt();
                if (inputM == 1)
                    tempM = 0;
                else if (inputM == 2)
                    tempM = 1;
                else if (inputM == 3)
                    tempM = 2;
                else
                    System.out.print("please restart game: invalid input");
            }
            //
            //
            //
            if (turnO % 2 == 0)
            {
                game.setO(tempK,tempJ,tempL,tempM);
                System.out.print("X's turn\n\n");
            }
            else 
            {
                game.setX(tempK,tempJ,tempL,tempM);
                System.out.print("O's turn\n\n");        
            }
            game.board();

            if (game.bigwinX())
            {
                con = 1;
                System.out.print("\n\nX WINS!!!!!");
            }
            else if (game.bigwinO())
            {
                con = 1;
                System.out.print("\n\nO WINS!!!!!!");
            }
            turnO++;
        }






        
        scan.close();
        
        
        
        // All I have left to do HERE (in Main) is to set up the Scanners regarding where someone goes and what the outcome of a game is

        System.out.print("\n\n");
    }
}
