
/**
 * 在这里给出对类 GCF 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class GCF
{ 
    public int fst;
    public int scd;
    public GCF(int one, int two){
        fst=one;
        scd=two;
    }
    
    public void gogo(){
        while (fst!=scd){
            if (fst>scd) fst=fst-scd;
            if (scd>fst) scd=scd-fst;
        }
        System.out.print("Their GCF is "+fst);
    }
}
