import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,j;
        for (i=1;i<=10;i++)
        {
            for (j=1;j<=10;j++)
            {
                if (i==j)
                    break;
                System.out.printf("%d %d\n",i,j);
            }
        }
    }
}
