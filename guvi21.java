import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	 static float sumOfAP(float a, float d, 
                                  int n)
         {
	 float sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + a;
            a = a + d;
        }
        return sum;
    }
     
    // Driver function
    public static void main(String args[])
    {
        int n = 3;
        float a = 3.0f, d = 2.0f;
        System.out.println(sumOfAP(a, d, n));
}
}
