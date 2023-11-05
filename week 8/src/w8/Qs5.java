package w8;

import java.util.Scanner;

/*Write a java program to input student Name, roll No, and three subjects Math, Science and English
        marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
        should between 0 to 100”) and find out total, percentage and result.
        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
        |
        |

        Mark Sheet

        |
        |

        |
        |
        |
        Name
        Roll No

        : 08
        : 23

        J
        a
        y
        |
        |
        |
        | |
        | Subjects : Marks |
        | |
        | Math : 98 |
        | Science: : 90 |
        | English : : 85 |
        | |
        | Total : 273 |
        | |
        | Percentage : 91.0 |
        | Result : Pass |
        | Grade : A+ |
        | | */
public class Qs5 {
 public static void main(String[] args)
 {
  Scanner a = new Scanner(System.in);
  System.out.println("Enter Name : ");
  String x = a.nextLine();
  System.out.println("Enter Roll no : ");
  int y = a.nextInt();
  System.out.println("Enter Math marks: ");
  int z = a.nextInt();
  if (z < 0 || z > 100) {
   System.out.println("Invalid Input. Marks should be between 0 to 100.");
   return;
  }

  System.out.println("Enter Science marks : ");
  int p = a.nextInt();
  if (p < 0 || p > 100) {
   System.out.println("Invalid Input. Marks should be between 0 to 100.");
   return;
  }

  System.out.println("Enter English mark  s : ");
  int q = a.nextInt();
  if (q < 0 || q > 100) {
   System.out.println("Invalid Input. Marks should be between 0 to 100.");
   return;
  }

  int total = z+p+q;
  System.out.println("Total mark is "+total);
  double percentage = (total / 300.0) * 100;
  String result = (percentage >= 35) ? "Pass" : "Fail";


  String grade;
  if (percentage >= 80) {
   grade = "A+";
  } else if (percentage >= 60) {
   grade = "A";
  } else if (percentage >= 50) {
   grade = "B";
  } else {
   grade = "C";
  }

  System.out.println("-----------------------------");
  System.out.println("|                             |");
  System.out.println("|         Mark Sheet          |");
  System.out.println("|                             |");
  System.out.println("|  Name :"+x+"                 |");
  System.out.println("|  Roll no :"+y+ "                |");
  System.out.println("|                             |");
  System.out.println("|                             |");
  System.out.println("|-----------------------------|");
  System.out.println("|  Subjects :      Marks      |");
  System.out.println("|-----------------------------|");

  System.out.println("|  Math     :"+z+ "               |");
  System.out.println("|  Science     :"+p+ "            |");
  System.out.println("|  English     :"+q+ "            |");
  System.out.println("|-----------------------------|");
  System.out.println("|  Total     :"+total+ "               |");
  System.out.println("|  Percentage     :"+percentage+ "               |");
  System.out.println("|  Result     :"+result+ "             |");
  System.out.println("|  Grade     :"+grade+ "               |");
  System.out.println("|-----------------------------|");


 }
}
