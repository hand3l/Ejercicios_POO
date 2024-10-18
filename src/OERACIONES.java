
import static java.lang.Math.sqrt;

public class OPERACIONES {

    private Double n1;
    private Double n2;

    public OPERACIONES() {
    }

    public OPERACIONES(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    //SETTERS

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }


    //GETTERS
    private Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    //METODOS PERSONALIZADOS
    public void imprimirDatos(){
        System.out.println("N1: " + getN1());
        System.out.println("N2: " + getN2());
    }

    public Double sumatoria(){ //SIEMPRE NOS RETORNA ALGO
        return n1 + n2;
    }

    public void sumaeimpresion(){ //SE IMPRIME DENTRO DE LA CLASE
        Double suma  = n1 + n2;
        System.out.println(suma);
    }

    public void raiz(){
        System.out.println(sqrt(n1));
        System.out.println(sqrt(n2));
    }

    public Double resta(){
        return n1 - n2;
    }

    public void restaeimpresion(){
        Double resta = n1 - n2;
        System.out.println(resta);
    }

    public Double multiplicacion(){
        return n1 * n2;
    }


}