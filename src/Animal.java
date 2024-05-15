import java.util.Scanner;
public class Animal {
            String comer;
            String alimento;
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void setComer(String comer) {
        this.comer = comer;
    }

    public String getComer() {
        return comer = "O peixe está comedo o";
    }

    public String getAlimento() {
        return alimento = "alimento";
    }
}

class Peixe extends Animal {

        void função(){
            System.out.println(" ");
            System.out.println("========================================");
            System.out.println(getComer() + " " + getAlimento());
            System.out.println("========================================");
        }
    }
class função extends Animal{
    public static void main(String[] args) {
    Peixe peixe = new Peixe();
    peixe.função();
}
}
