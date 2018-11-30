package ExecsGeometria;

public class Ex19 {

    Reta reta1 = new Reta(1, 10);
    Reta reta2 = new Reta(2, 11);
    
    public Ex19() {
        if (reta1.a == reta2.a) {
            System.out.println("É paralela");
        } else {
            System.out.println("É perpendicular");
        }
    }
    
}
