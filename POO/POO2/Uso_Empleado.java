package POO.POO2;

import java.util.*;

public class Uso_Empleado {
    public static void main(String[] args) {

        Empleado[] empleados=new Empleado[3];

        empleados[0]=new Empleado("Juan", 85000, 2014, 11, 10);

        empleados[1]=new Empleado("Ana", 100000, 2010, 7, 29);

        empleados[2]=new Empleado("José Maria", 80000, 2016, 5, 15);


        for(int i=0; i<empleados.length; i++){

            empleados[i].Aumentosueldo(5);
        }

        for(int i=0; i<empleados.length; i++){

            System.out.println("\nNombre: " + empleados[i].getnombre() + " Sueldo: " + empleados[i].getsueldo() + " Alta del contrato: " + empleados[i].getAltaContrato());

        }

    }

}

class Empleado{

    public Empleado(String name, double salary, int year, int mounth, int day){

        nombre=name;

        sueldo=salary;

        GregorianCalendar Calendario=new GregorianCalendar(year, mounth-1,day);

        AltaContrato=Calendario.getTime();

    }

    public String getnombre(){ //getter

        return nombre;

    }

    public double getsueldo(){ //getter

        return sueldo;

    }

    public Date getAltaContrato(){ //getter

        return AltaContrato;

    }

    public void Aumentosueldo(double porcentaje){ //setter

        double aumento=sueldo*(porcentaje/100);

        sueldo+=aumento;

    }

    private String nombre;

    private double sueldo;

    private Date AltaContrato;

}