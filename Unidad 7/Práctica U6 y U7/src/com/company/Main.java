package com.company;

import com.sun.source.doctree.SeeTree;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Map<String, Alumnado> m1=new HashMap<>();
        Set<Alumnado>s1=new TreeSet<Alumnado>(new OrdenAlumnos());

        mostrarMenu();

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("empleados.dat"));

            while (true) {
                Alumnado a = (Alumnado) ois.readObject();
                m1.put(a.getDni(),a);
                s1.add(a);
            }

        } catch (IOException e) {
            //e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int respuesta=0;

        do {
            System.out.println("Que deseas?");
            respuesta=sc.nextInt();
            sc.nextLine();

            if (respuesta==1){
                System.out.println("Introduce el Nombre");
                String nombre= sc.nextLine();
                System.out.println("Introduce los Apellidos");
                String apellidos= sc.nextLine();
                System.out.println("Introduce la dirección");
                String direccion= sc.nextLine();
                System.out.println("Introduce el dni");
                String dni= sc.nextLine();
                System.out.println("Introduce el email");
                String email= sc.nextLine();
                System.out.println("Introduce el curso");
                String curso= sc.nextLine();
                System.out.println("Introduce si cursa en dual o no (True or False)");
                String cursoDual= sc.nextLine();

                Alumnado alumno=new Alumnado(nombre, apellidos, direccion, dni, email,curso, cursoDual);

                if (m1.containsKey(dni)){
                    System.out.println("Error");
                }else {
                    s1.add(alumno);
                    m1.put(dni,alumno);
                }
            }

            if (respuesta==2){
                System.out.println("Introduce el dni del alumno que quieras borrar");
                String dniAlumn=sc.nextLine();

                if (!m1.containsKey(dniAlumn)){
                    System.out.println("Alumno con el dni "+dniAlumn+" no existe");
                }else{
                    Alumnado a1=m1.get(dniAlumn);
                    s1.remove(a1);
                    m1.remove(dniAlumn);
                }
            }

            if (respuesta==3){
                System.out.println(s1);
            }

            if (respuesta==4){
                System.out.println("Introduce un curso");
                String cursoIntroducido=sc.nextLine();

                int num=0;

                Iterator it=s1.iterator();
                while (it.hasNext()) {
                    Alumnado a = (Alumnado) it.next();
                    if (a.getCurso().equalsIgnoreCase(cursoIntroducido)) {
                        System.out.println(a);
                        num++;
                    }
                }
                if (num==0){
                    System.out.println("No hay alumnos de ese curso");
                }
            }

            if (respuesta==5){
                System.out.println("Introduce el dni del alumno que quieras modificar");
                String dni= sc.nextLine();

                if (m1.containsKey(dni)){
                    System.out.println("Introduce el Nombre");
                    String nombre= sc.nextLine();
                    System.out.println("Introduce los Apellidos");
                    String apellidos= sc.nextLine();
                    System.out.println("Introduce la dirección");
                    String direccion= sc.nextLine();
                    System.out.println("Introduce el email");
                    String email= sc.nextLine();
                    System.out.println("Introduce el curso");
                    String curso= sc.nextLine();
                    System.out.println("Introduce si cursa en dual o no (True or False)");
                    String cursoDual= sc.nextLine();

                    Alumnado alumno=new Alumnado(nombre, apellidos, direccion, dni, email, curso, cursoDual);

                    Alumnado a=m1.get(dni);

                    s1.remove(a);

                    s1.add(alumno);

                    m1.put(dni, alumno);

                }else {
                    System.out.println("NO EXISTE ALUMNO CON ESE DNI");
                }
            }

        }while (respuesta!=6);

        ObjectOutputStream oos= null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));

            Collection<Alumnado> lista = m1.values();
            for(Alumnado a : lista) {
                oos.writeObject(a);
            }
        } catch (IOException a) {
            a.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException a) {
                a.printStackTrace();
            }
        }

    }
    public static void mostrarMenu(){
        System.out.println("1. Insertar alumno");
        System.out.println("2. Borrar alumno");
        System.out.println("3. Mostrar alumnos");
        System.out.println("4. Mostrar alumnos de un curso");
        System.out.println("5. Modificar alumno");
        System.out.println("6. Salir");
        System.out.println();
    }
}
