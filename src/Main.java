public class Main {

    private static void ejemploPrivate(){}//Ejemplo de encansulamiento private
    protected static void ejemploProtected(){}//Ejemplo de encansulamiento Protected
    public static void ejemploPulic(){}//Ejemplo de encansulamiento Public

    //Ejemplo de abstraccion:
    abstract class medidas {
        abstract void pasarMedidas();//el metedo
    }
    class kilometros extends medidas {
        void pasarMedidas(){//aqui se utiliza el metetodo
            System.out.println("1 kilometro vale 1000 metro");
        }
    }
    class centimetros extends medidas {
        void pasarMedidas(){
            System.out.println("1 centimetro vale 0.01 metro");
        }
    }


    //Ejemplo record
    public record persona(String nombre, int edad) {}

    public class EjemploRecord {
        public static void main(String[] args) {
            persona p = new persona("Ana", 25);
            System.out.println(p.nombre());
            System.out.println(p.edad());
            System.out.println(p);
        }
    }


}