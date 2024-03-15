import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    private static ArrayList<ubicacion> ubicaciones=new ArrayList<>();

    public main(){
        ubicacion clase=new ubicacion(0,"Estás sentado en la clase de programación");
        ubicaciones.add(0,clase);
        ubicacion montanya=new ubicacion(1,"Estás en la cima de una montaña");
        ubicaciones.add(1,montanya);
        ubicacion playa=new ubicacion(2,"Estás bañándote en la playa");
        ubicaciones.add(2,playa);
        ubicacion edificio=new ubicacion(3,"Estás dentro de un edificio muy alto");
        ubicaciones.add(3,edificio);
        ubicacion puente=new ubicacion(4,"Estás de pie en un puente");
        ubicaciones.add(4,puente);
        ubicacion boshque=new ubicacion(5,"Estás en un bosque");
        ubicaciones.add(5,boshque);

        montanya.addExit("Q",0);
        montanya.addExit("N",5);
        montanya.addExit("S",4);
        montanya.addExit("E",3);
        montanya.addExit("O",2);

        playa.addExit("Q",0);
        playa.addExit("N",5);

        edificio.addExit("Q",0);
        edificio.addExit("O",1);

        puente.addExit("Q",0);
        puente.addExit("N",1);
        puente.addExit("O",2);

        boshque.addExit("Q",0);
        boshque.addExit("S",1);
        boshque.addExit("O",2);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String opcion="";
        int num =1;
        main am=new main();

        System.out.println(am.ubicaciones.get(1).getDescripcion());
        System.out.println("tus opciones validas son: ");

        for (Map.Entry<String,Integer> entry:ubicaciones.get(1).getExits().entrySet()){
            System.out.print(entry.getKey() +" ");
        }
        System.out.println();

        do {
            System.out.println("Introduce la direccion a la que quieres ir:");
            opcion=sc.nextLine();

            if (!opcion.equalsIgnoreCase("Q")){
                if (!opcion.equalsIgnoreCase("Q")){
                    for (Map.Entry<String,Integer> gar:ubicaciones.get(num).getExits().entrySet()){
                        if (opcion.equalsIgnoreCase(gar.getKey())){
                            num= gar.getValue();
                        }
                    }
                }
                System.out.println(am.ubicaciones.get(num).getDescripcion());
                System.out.println("tus opciones validas son: ");

                for (Map.Entry<String,Integer> paco: ubicaciones.get(num).getExits().entrySet()){
                    System.out.print(paco.getKey() + " ");
                }
                System.out.println();
            } else{
                System.out.println("estás en clase de programación");
            }

        }while (!opcion.equalsIgnoreCase("Q"));
        System.out.println("adiós");
    }
}
