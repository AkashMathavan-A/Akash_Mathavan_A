public class Cube_Series
{
    static void Cubes(int Num)
    {
     int sum=0;
     int i;
     for(i=1;i<=Num;i++){
         sum+=(i*i*i);
         if(i==Num)
         System.out.print(i+"^3 ");
         else
             System.out.print(i+"^3 "+" + ");
     }
        System.out.print(" = "+sum);
    }
    public static void main(String[] args) {
        int num=10;
        Cubes(num);
    }
}
