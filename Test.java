
/**
 * Test
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0)
 */
public class Test
{
    public static void main (String[] args)
    {
        Lavastoviglie l;
        Detersivo d1;
        
        d1 = new Detersivo("Finish", 750);
        l = new Lavastoviglie("Whirpool");
        
        l.accendi();
        System.out.println(l.riempiSerbDet(d1));
        System.out.println(l.lavaggio("ammollo"));
        System.out.println(l.lavaggio("eco"));
    }
}
