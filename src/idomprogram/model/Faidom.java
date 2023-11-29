
package idomprogram.model;


public abstract class Faidom {
  private double fajsuly = 0.8;
    
  public abstract double terfogat();
  
  
  public Faidom(){
 
  }
  
  
 
    
  public double suly(){
      return fajsuly*terfogat();
  
  }

    @Override
    public String toString() {
        return "Faidom{" + "fajsuly=" + fajsuly + '}';
    }
  
  
  
  
}
