package cl.keanzato.app.AdapterApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
  
    {
       GuitarraAcustica acustica = new GuitarraAcustica();
       Guitarra guitarra1 = new GuitarraElectrica();
       GuitarraElectricaAcustica guitarra2 =new GuitarraElectricaAcustica();
       guitarra2.setGuitarraAcustica(acustica);
       
       Musico musico = new Musico();
       musico.tocar(guitarra2);
      
       
    }
}
