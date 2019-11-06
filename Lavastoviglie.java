/**
 * Lavastoviglie
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 06/11/2019)
 */
public class Lavastoviglie implements ILavastoviglie
{   
    //Indicatori
    private boolean onOff;
    private boolean mancaSale;
    private boolean fineCiclo;
    
    //Attributi
    private boolean acceso;
    private int serbatoioDet=0;
    private int lavaggi=0;
    public String marca;
    
    public Lavastoviglie(String marca)
    {
        this.acceso=false;
        this.onOff=false;
        this.mancaSale=false;
        this.fineCiclo=false;
        setMarca(marca);
    }
    
    private void setMarca(String m)
    {
        marca=m;
    }
    
    public void accendi()
    {
        acceso=true;
        onOff=false;
        fineCiclo=false;
    }
    
    public void spegni()
    {
        acceso=false;
        onOff=false;
        fineCiclo=false;
    }
    
    public String riempiSerbDet(Detersivo a)
    {
        if(serbatoioDet==0)
        {
            serbatoioDet = a.getContenuto();
            return "Ho riempito il serbatoio con: "+a.toString();
        }
        else
            return "C'è già del detersivo nel serbatoio!";
    }
    
    public String lavaggio(String tipo)
    {
        if(acceso==true)
        {
            fineCiclo=false;
            if(tipo=="ammollo")
            {
                onOff=true;
                fineCiclo();    
                return "Ciclo lavaggio concluso con successo!";
            }
            else
            {
                if(serbatoioDet!=0)
                {
                    if(mancaSale==false)
                    {
                        onOff=true;
                        lavaggi++;
                        serbatoioDet-=10;
                        fineCiclo();
                        return "Ciclo lavaggio concluso con successo!";
                    }
                    else
                        return "Manca sale!";
                }
                else
                    return "Il serbatoio del detersivo è vuoto!";
            }   
        }
        return "La lavastoviglie è spenta!";
    }
    
    public void fineCiclo()
    {
        onOff=false;
        fineCiclo=true;
        
        if(lavaggi==30)
        {
            mancaSale=true;
        }
    }
    
    public String aggiungiSale()
    {
        lavaggi=0;
        return "Sale aggiunto!";
    }
}
