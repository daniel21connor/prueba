package paquete;
public class operaciones {
    private int a1;
    private int b1;
    private double A1;
    private double B1;
    private int a;
    
    public operaciones(){
        
    }
      public void serA1(int a){
          this. a = a1;
          
          }
               
        public int geta1(){
            return a1;
            
    }       

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    /**
     *
     * @param A1
     */
   

    public void setA1(double A1) {
        this.A1 = A1;
    }

 
    public void setB1(double B1) {
        this.B1 = B1;
    }
    public int sumar (){
      int resultado= this.a1+this.b1;
      return resultado ;
    }
      public int resta (){
      int resultado= this.a1-this.b1;
      return resultado ;
    }
      public int multiplicacion  (){
      int resultado= this.a1*this.b1;
      return resultado ;
    }
      public double division(){
      double resultado=this.A1/this.B1;
      return resultado;
 
    }

    void seta(int num1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setb(int num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setaA(int num1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setB(int num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setaAA(int num1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setBB(int num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
