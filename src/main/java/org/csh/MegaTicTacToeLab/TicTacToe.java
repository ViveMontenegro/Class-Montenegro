public class TicTacToe
{
    private byte[][][][] bigGrid;
    //A 2D matrix of 2D matrices = 4D
    
    public TicTacToe()
    {
        bigGrid = new byte[3][3][3][3];
        for (int k = 0;k < 3;k++)
        {
            for (int j = 0;j < 3;j++)
            {
                for (int l = 0;l < 3;l++)
                {
                    for (int m = 0;m < 3;m++)
                    {
                        bigGrid[k][j][l][m] = 0;
                    }
                }
            }
        }
    }
    
    
    public byte coords(int k,int j,int l,int m)
    {
        return bigGrid[k][j][l][m];
    }
    public void setX(int k,int j,int l,int m)
    {
        bigGrid[k][j][l][m] = 1;
    }
    public void setO(int k,int j,int l,int m)
    {
        bigGrid[k][j][l][m] = 2;
    }

    //
    
    
    
    //
    //

    public void board()
    {
        String triplebool = "";
        for (int k = 0;k < 3;k++)
        {
            for (int l = 0;l < 3;l++)
            {
                for(int j = 0;j < 3;j++)
                {
                    for (int m = 0;m < 3;m++)
                    {
                        if (bigGrid[k][j][l][m] == 0)
                            triplebool = " ";
                        else if (bigGrid[k][j][l][m] == 1)
                            triplebool = "X";
                        else if (bigGrid[k][j][l][m] == 2)
                            triplebool = "O";
                        if (l == 2)
                            System.out.print((char)27 + "[2m" + triplebool);
                        else
                            System.out.print((char)27 + "[2m" + (char)27 + "[4m" + triplebool);
                        if (m != 2)
                            System.out.print("|");
                    }
                    if (j != 2)
                        System.out.print((char)27 + "[0m" + (char)27 + "[1m" + " | ");
                    else
                        System.out.print((char)27 + "[0m");
                }
                System.out.print("\n");
            }
            if (k != 2)
                border();
        }
    }


    public void border()
    {
        System.out.print((char)27 + "[1m" + (char)27 + "[4m" + " " + (char)27 + "[8m" + "|" + (char)27 + "[28m" +
        " " + (char)27 + "[8m" + "|" + (char)27 + "[28m" + "  |  " + (char)27 + "[8m" + "|" + (char)27 + "[28m" +
        " " + (char)27 + "[8m" + "|" + (char)27 + "[28m" + "  |  " + (char)27 + "[8m" + "|" + (char)27 + "[28m" +
        " " + (char)27 + "[8m" + "|" + (char)27 + "[28m" + " " + (char)27 + "[0m" + "\n");
        System.out.print((char)27 + "[1m" + /*(char)27 + "[4m" + */" " + (char)27 + "[8m" + "|" + (char)27 + "[28m" +
        " " + (char)27 + "[8m" + "|" + (char)27 + "[28m" + "  |  " + (char)27 + "[8m" + "|" + (char)27 + "[28m" +
        " " + (char)27 + "[8m" + "|" + (char)27 + "[28m" + "  |  " + (char)27 + "[8m" + "|" + (char)27 + "[28m" +
        " " + (char)27 + "[8m" + "|" + (char)27 + "[28m" + " " + (char)27 + "[0m" + "\n");
    }
    
    public boolean winX(int k,int j)
    {
        boolean output = false;
        for (int l = 0;l < 3;l++)
        {
            if (bigGrid[k][j][l][0] == bigGrid[k][j][l][1] && bigGrid[k][j][l][0] == bigGrid[k][j][l][2] && bigGrid[k][j][l][0] == 1)
                output = true;
        }
        for (int m = 0;m < 3;m++)
        {
            if (bigGrid[k][j][0][m] == bigGrid[k][j][1][m] && bigGrid[k][j][0][m] == bigGrid[k][j][2][m] && bigGrid[k][j][0][m] == 1)
                output = true;
        }
        if (bigGrid[k][j][0][0] == bigGrid[k][j][1][1] && bigGrid[k][j][0][0] == bigGrid[k][j][2][2] && bigGrid[k][j][0][0] == 1)
            output = true;
        if (bigGrid[k][j][0][2] == bigGrid[k][j][1][1] && bigGrid[k][j][0][2] == bigGrid[k][j][2][0] && bigGrid[k][j][0][2] == 1)
            output = true;
        return output;
    }
    public boolean winO(int k,int j)
    {
        boolean output = false;
        for (int l = 0;l < 3;l++)
        {
            if (bigGrid[k][j][l][0] == bigGrid[k][j][l][1] && bigGrid[k][j][l][0] == bigGrid[k][j][l][2] && bigGrid[k][j][l][0] == 2)
                output = true;
        }
        for (int m = 0;m < 3;m++)
        {
            if (bigGrid[k][j][0][m] == bigGrid[k][j][1][m] && bigGrid[k][j][0][m] == bigGrid[k][j][2][m] && bigGrid[k][j][0][m] == 2)
                output = true;
        }
        if (bigGrid[k][j][0][0] == bigGrid[k][j][1][1] && bigGrid[k][j][0][0] == bigGrid[k][j][2][2] && bigGrid[k][j][0][0] == 2)
            output = true;
        if (bigGrid[k][j][0][2] == bigGrid[k][j][1][1] && bigGrid[k][j][0][2] == bigGrid[k][j][2][0] && bigGrid[k][j][0][2] == 2)
            output = true;
        return output;
    }    


    public boolean bigwinX()
    {
        boolean output = false;
        for (int k = 0;k < 3;k++)
        {
            if (winX(k,0) && winX(k,1) && winX(k,1))
                output = true;
        }
        for (int j = 0;j < 3;j++)
        {
            if (winX(0,j) && winX(1,j) && winX(2,j))
                output = true;
        }
        if (winX(0,0) && winX(1,1) && winX(2,2))
                output = true;
        if (winX(0,2) && winX(1,1) && winX(2,0))
            output = true;
        return output;
    }
    public boolean bigwinO()
    {
        boolean output = false;
        for (int k = 0;k < 3;k++)
        {
            if (winO(k,0) && winO(k,1) && winO(k,1))
                output = true;
        }
        for (int j = 0;j < 3;j++)
        {
            if (winO(0,j) && winO(1,j) && winO(2,j))
                output = true;
        }
        if (winO(0,0) && winO(1,1) && winO(2,2))
                output = true;
        if (winO(0,2) && winO(1,1) && winO(2,0))
            output = true;
        return output;
    }





}
