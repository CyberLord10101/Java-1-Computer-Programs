/*
Cole Proffitt
Due: 2/16/17
MultTable.java LabA
Ask the user for a multiple to for a mutiplication table off of
then at the end ask if the user want to make another one.
*/
import java.util.Scanner;

public class MultTable {
	public static void main(String[] args){
		Scanner myInput = new Scanner(System.in);
		int row, col, num;
		char answer = 'y';
		while(answer == 'y'){
			System.out.println("Please enter a size to be multipled by: ");
			int size = myInput.nextInt();
			System.out.print("    MATHMATICAL TABLE\n");
			for(num = 0; size >= num; num++)
				System.out.printf("%4dv", num);
				System.out.print("\n");
			for(row = 1;row <= size;row++){
				System.out.printf("%3d|", row);
				for(col = 1; col <=size; col++){
					String black = String.format("%5d", row * col);
					System.out.print(black);
				}
				System.out.print("\n\n");
			}
			System.out.println("Would you like to create another table?" + answer + " or n.");
			String ansStr = myInput.next();
			answer = ansStr.charAt(0);
		}
	}
} 
/*
Program Output:
Please enter a size to be multipled by:
12
    MATHMATICAL TABLE
   0v   1v   2v   3v   4v   5v   6v   7v   8v   9v  10v  11v  12v
  1|    1    2    3    4    5    6    7    8    9   10   11   12

  2|    2    4    6    8   10   12   14   16   18   20   22   24

  3|    3    6    9   12   15   18   21   24   27   30   33   36

  4|    4    8   12   16   20   24   28   32   36   40   44   48

  5|    5   10   15   20   25   30   35   40   45   50   55   60

  6|    6   12   18   24   30   36   42   48   54   60   66   72

  7|    7   14   21   28   35   42   49   56   63   70   77   84

  8|    8   16   24   32   40   48   56   64   72   80   88   96

  9|    9   18   27   36   45   54   63   72   81   90   99  108

 10|   10   20   30   40   50   60   70   80   90  100  110  120

 11|   11   22   33   44   55   66   77   88   99  110  121  132

 12|   12   24   36   48   60   72   84   96  108  120  132  144

Would you like to create another table?y or n.
y
Please enter a size to be multipled by:
5
    MATHMATICAL TABLE
   0v   1v   2v   3v   4v   5v
  1|    1    2    3    4    5

  2|    2    4    6    8   10

  3|    3    6    9   12   15

  4|    4    8   12   16   20

  5|    5   10   15   20   25

Would you like to create another table?y or n.
n
*/