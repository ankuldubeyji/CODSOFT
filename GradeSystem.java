import java.util.Scanner;
class GradeSystem
{
    public static void main(String[] args)
 {
    System.out.println("GRADING SYSTEM");
    System.out.println("PERCENTAGE\tGRADE");
    System.out.println(" 90-100   \t  A");
    System.out.println("  80-89   \t  B");
    System.out.println("  70-79   \t  C");
    System.out.println("  60-69   \t  D");
    System.out.println("  50-59   \t  E");
    System.out.println("   >=49   \t  F\n");
    System.out.println("SUBJECT-: 1.HINDI\t2.ENGLISH\t3.MATH\n\t4.PHYSICS\t5.CHEMISTRY\t6.COMPUTER");
    System.out.print("\nENTER THE NUMBER OF STUDENTS\t");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String name[]=new String[n];
    int hindi[]=new int[n];
    int english[]=new int[n];
    int math[]=new int[n];
    int physics[]=new int[n];
    int chemistry[]=new int[n];
    int computer[]=new int[n];
    float percentage[]=new float[n];
    char grade[]=new char[n];
    int total[]=new int[n];
    for(int i=0;i<n;i++)
    {
        System.out.print("ENTER THE NAME MAXIMUM 5 CHAREFCTOR:");
        name[i]=sc.next();
        System.out.print("ENTER THE MARKS OF HINDI OUT OF 100:\t");
        hindi[i]=sc.nextInt();
        System.out.print("ENTER THE MARKS OF ENGLISH OUT OF 100:\t");
        english[i]=sc.nextInt();
        System.out.print("ENTER THE MARKS OF MATH OUT OF 100:\t");
        math[i]=sc.nextInt();
        System.out.print("ENTER THE MARKS OF PHYSICS OUT OF 100:\t");
        physics[i]=sc.nextInt();
        System.out.print("ENTER THE MARKS OF CHEMISTRY OUT OF 100:\t");
        chemistry[i]=sc.nextInt();
        System.out.print("ENTER THE MARKS OF COMPUTER OUT OF 100:\t");
        computer[i]=sc.nextInt();
        total[i]=hindi[i]+english[i]+math[i]+physics[i]+chemistry[i]+computer[i];
        percentage[i]=(float)total[i]/6;
        if(percentage[i]>=90)
                    grade[i]='A';
        else if(percentage[i]>=80&&percentage[i]<90)
                    grade[i]='B';
        else if(percentage[i]>=70&&percentage[i]<80)
                    grade[i]='C';
        else if(percentage[i]>=60&&percentage[i]<70)
                    grade[i]='D';
        else if(percentage[i]>=50&&percentage[i]<60)
                    grade[i]='E';
        else
                    grade[i]='F';
        

    }
    System.out.println("NAME\t\tTOTAL\t\tPERCENTAGE\tGRADE");
    for(int i=0;i<n;i++)
    {
        System.out.println(name[i]+"\t\t"+total[i]+"/600"+"\t\t"+ String.format("%.2f",percentage[i])+"\t\t"+grade[i]);
    }



 }
}