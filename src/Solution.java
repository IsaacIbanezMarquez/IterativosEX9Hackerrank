import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

// Sumes per multiplicació:

/*  Fes un programa, similar al de "Multiplicacions per potència" però ara cal que llegeixis dos nombres enters positius a i b, i escrigui el resultat de realitzar la seva multiplicació sense emprar l'operador * , sinó que fes-ho a partir de sumes. És a dir:

a⋅b=a+a+a+...+a (a sumat b vegades)

Input Format

a: nombre enter

b: nombre enter

Constraints

no n'hi ha.

Output Format

s'imprimeix la solució de l'operació a * b

Sample Input 0

4 5
Sample Output 0

20
Sample Input 1

0 5
Sample Output 1

0

*/





public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        while ( b >= 1 )
        {
            count = count + a;

            b--;
        }
        System.out.println(count);



    }
}
