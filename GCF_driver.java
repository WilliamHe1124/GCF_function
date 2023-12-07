import java.util.Scanner;
/**
 * 在这里给出对类 GCF_driver 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class GCF_driver
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int ft=input.nextInt();
        int sd=input.nextInt();
        GCF obj=new GCF(ft, sd);
        obj.gogo();
    }
}
