package nomor1;

/**
 *
 * @author Rizka Nadila
 */

public class Matematika {
    int c;
    
    public void pertambahan(int a, int b){
    c=a+b;        
    System.out.println("Pertambahan :"+ a + "+"+ b + "=" + c);
    }
    
    public void pengurangan(int a, int b){
    c=a-b;      
    System.out.println("Pengurangan :"+ a + "-"+ b + "=" + c);
    }
    
    public void perkalian(int a, int b){
    c=a*b;        
    System.out.println("Perkalian   :"+ a + "*"+ b + "=" + c);
    }
    
    public void pembagian(int a, int b){
    c=a/b;      
    System.out.println("Pembagian   :"+ a + "/"+ b + "=" + c);
    }
}