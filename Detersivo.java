
/**
 * Detersivo
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 06/11/2019)
 */
public class Detersivo
{
    private String nome;
    private int contenuto;
    
    public Detersivo(String nome, int contenuto)
    {
        setNome(nome);
        setContenuto(contenuto);
    }
    
    private void setNome(String n)
    {
        nome=n;
    }
    
    private void setContenuto(int c)
    {
        contenuto=c;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getContenuto()
    {
        return contenuto;
    }
    
    public String toString()
    {
        return getNome() + ", " + getContenuto() + "ml";
    }
}
