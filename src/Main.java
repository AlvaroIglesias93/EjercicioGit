import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        class empleado {

            //datos
            public String nombre;
            public float sueldo;
            public float porc_descuento;
            public byte horas_trabajadas;
            public float precio_hora;
            public String mes;



            //constructor

            BufferedReader lee = new BufferedReader(new InputStreamReader(System.in));

            public empleado() throws IOException {
                System.out.printf("Nombre del empleado ");
                String nombre=lee.readLine();

                System.out.printf("Mes Actual: ");
                String mes=lee.readLine();
            }

            //get y set

            public String getMes() {
                return mes;
            }

            public void setMes(String mes) {

                this.mes = mes;
            }


        }

        empleado e = new empleado();



        System.out.println("Nombre "+ e.nombre);
        System.out.println("Mes "+ e.getMes());

    }
}