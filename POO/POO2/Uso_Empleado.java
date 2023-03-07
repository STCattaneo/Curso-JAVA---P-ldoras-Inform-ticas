package POO.POO2;

import java.util.*;

public class Uso_Empleado {
    public static void main(String[] args) {
    
    }

}

class empleado{

    public empleado(String name, double salary, int year, int mounth, int day){

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

        double aumento=sueldo+(porcentaje/100);

        sueldo+=aumento;

    }

    private String nombre;

    private double sueldo;

    private Date AltaContrato;

}