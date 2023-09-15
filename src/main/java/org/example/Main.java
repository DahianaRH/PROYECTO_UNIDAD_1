package org.example;

import java.util.*;
import java.text.DecimalFormat;

public class Main {

    DecimalFormat decimalFormat = new DecimalFormat("#.#");

    //Sistema de seguimiento del rendimiento acádemico de los estudiantes en una escuela
    public record Estudiante (String numeroIdentificacion,
                       String nombreCompleto,
                       double notaCalculo,
                       double notaEspanol,
                       double notaSociales,
                       double notaFisica,
                       double notaQuimica,
                       double notaFormacionCiudadana,
                       double notaFilosofia,
                       double notaEducacionFisica){
        /**Teniendo en cuenta que las materias tienen los siguientes créditos:
         * Cálculo      2 créditos
         * Español      2 créditos
         * Sociales     2 créditos
         * Fisica       2 créditos
         * Química      2 créditos
         * F. ciudadana 1 crédito
         * Filosofía    1 crédito
         * Ed. Física   1 crédito
         * Para un total de 13 créditos
         */
        public double calcularPromedioEstudiante(){
            double sumatoria = (notaCalculo*2) + (notaEspanol*2) + (notaSociales*2) +
                    (notaFisica*2) + (notaQuimica*2) + (notaFormacionCiudadana*1) +
                    (notaFilosofia*1) + (notaEducacionFisica*1);

            double promedio = (float)(sumatoria)/13F;
            return promedio;
        }
    }


    Deque<Estudiante> listaEstudiantes = new ArrayDeque<>();

    public void agregarEstudiantes(){
        //LISTA DE ESTUDIANTES----------------------------------------------------------------------
        Estudiante estudiante1 = new Estudiante("1007654522", "Isabella Acosta", 3.5,4.2,3.8,
                3.9,4.0, 4.5, 3.7, 4.1);
        Estudiante estudiante2 = new Estudiante("1008166443", "Juan David Alcaraz", 4.0,3.5,3.2,
                3.0,3.3, 3.8, 3.1, 4.0);
        Estudiante estudiante3 = new Estudiante("1002445677", "Camila Alvarez", 2.8,3.2,2.9,
                2.7,3.1, 3.0, 3.3, 3.0);
        Estudiante estudiante4 = new Estudiante("1307654321", "Andrea Arrieta", 4.3,4.5,4.2,
                4.4,4.3, 4.5, 4.0, 4.2);
        Estudiante estudiante5 = new Estudiante("1406543210", "Daniela Arteaga", 3.0,2.5,2.8,
                2.7,3.0, 2.9, 2.7, 3.1);
        Estudiante estudiante6 = new Estudiante("1708765432", "Santiago Bedoya", 4.5,4.7,4.6,
                4.8,4.7, 4.5, 4.8, 4.6);
        Estudiante estudiante7 = new Estudiante("1901234567", "Antonia Blandon", 2.5,2.5,2.7,
                2.6,2.9, 2.7, 2.4, 3.1);
        Estudiante estudiante8 = new Estudiante("1016553311", "Valentina Cardona", 3.7,3.5,3.9,
                3.8,3.6, 3.7, 3.8, 3.8);
        Estudiante estudiante9 = new Estudiante("1040977643", "Luis Castaño", 2.9,3.0,2.7,
                2.8,2.6, 2.9, 2.5, 3.0);
        Estudiante estudiante10 = new Estudiante("1802345678", "Matías Chalá", 4.2,4.5,4.3,
                4.6,4.4, 4.7, 4.5, 4.3);
        Estudiante estudiante11 = new Estudiante("1208765432", "María Córdoba", 3.2,3.9,3.5,
                3.1,3.3, 3.6, 3.0, 3.2);
        Estudiante estudiante12 = new Estudiante("1001224667", "Diego Córdoba", 4.1,4.4,4.2,
                4.3,4.1, 4.5, 4.3, 4.0);
        Estudiante estudiante13 = new Estudiante("101234567", "Javier Correa", 2.7,3.0,2.8,
                2.6,2.9, 2.5, 3.2, 3.2);
        Estudiante estudiante14 = new Estudiante("1009776553", "Alejandro David", 3.9,4.0,3.8,
                3.7,3.9, 4.0, 3.7, 3.8);
        Estudiante estudiante15 = new Estudiante("1106653110", "Catalina Díaz", 2.8,3.1,2.9,
                2.7,2.8, 2.6, 3.0, 3.1);
        Estudiante estudiante16 = new Estudiante("1040988544", "Natalia Espitia", 4.0,4.3,4.2,
                4.1,4.1, 4.5, 4.1, 4.3);
        Estudiante estudiante17 = new Estudiante("1502345678", "Lucas Fernandez", 3.1,3.3,3.0,
                3.2,3.1, 3.4, 3.2, 3.0);
        Estudiante estudiante18 = new Estudiante("1107754221", "Pedro Florez", 4.3,4.5,2.7,
                4.4,4.3, 4.5, 4.2, 4.4);
        Estudiante estudiante19 = new Estudiante("1102335677", "Martina Franco", 2.9,3.2,3.0,
                2.8,3.1, 2.8, 3.0, 3.3);
        Estudiante estudiante20 = new Estudiante("1108865422", "Lucas García", 4.2,4.4,4.3,
                4.1,4.5, 4.3, 4.4, 4.2);
        Estudiante estudiante21 = new Estudiante("1203553511", "Felipe Giron", 3.8,3.7,3.6,
                3.9,3.7, 3.5, 3.6, 3.9);
        Estudiante estudiante22 = new Estudiante("1040633522", "Carlos Gutierrez", 4.0,4.1,4.0,
                4.0,4.2, 4.1, 4.0, 4.1);
        Estudiante estudiante23 = new Estudiante("1101135567", "Sofia Henao", 2.5,2.8,2.9,
                2.4,2.7, 2.5, 2.7, 3.0);
        Estudiante estudiante24 = new Estudiante("1109776533", "Daniel Liso", 3.9,4.2,3.8,
                4.1,4.0, 4.2, 4.1, 4.0);
        Estudiante estudiante25 = new Estudiante("1106552110", "Antonella Londoño", 2.7,2.9,2.8,
                2.7,2.6, 2.5, 2.7, 3.1);
        Estudiante estudiante26 = new Estudiante("1040976773", "Juan Diego Machado", 4.1,4.3,4.2,
                4.1,4.0, 4.3, 4.2, 4.1);
        Estudiante estudiante27 = new Estudiante("1006543210", "Lucia Manco", 3.0,3.2,3.1,
                3.0,3.2, 3.1, 3.0, 3.0);
        Estudiante estudiante28 = new Estudiante("1107734355", "Sofia Mejia", 4.2,4.4,4.3,
                4.2,4.1, 4.4, 4.3, 4.2);
        Estudiante estudiante29 = new Estudiante("1402345678", "Samuel Montalvo", 3.1,3.2,3.0,
                3.1,3.0, 3.2, 3.1, 3.0);
        Estudiante estudiante30 = new Estudiante("1102375688", "Leonardo Morales", 4.0,4.1,4.0,
                4.2,4.1, 4.5, 4.2, 3.9);
        Estudiante estudiante31 = new Estudiante("1108785931", "Mateo Munera", 4.0,3.1,3.1,
                4.0,3.1, 3.4, 3.6, 3.9);
        Estudiante estudiante32 = new Estudiante("1101336788", "Laura Muñoz", 4.1,3.6,3.3,
                3.1,3.2, 3.7, 3.4, 4.2);
        Estudiante estudiante33 = new Estudiante("1109878641", "Valentina Murillo", 4.2,4.3,4.0,
                4.3,3.9, 4.0, 3.6, 3.5);
        Estudiante estudiante34 = new Estudiante("1108765432", "Sofia Ocampo", 4.0,4.1,3.9,
                3.6,3.8, 4.2, 3.9, 4.0);
        Estudiante estudiante35 = new Estudiante("1101234567", "Leonardo Ortiz", 3.8,3.9,3.7,
                3.9,3.5, 3.4, 3.3, 3.2);
        Estudiante estudiante36 = new Estudiante("1109876543", "Juan Palacio", 2.5,2.7,2.5,
                2.0,2.8, 3.0, 2.5, 3.5);
        Estudiante estudiante37 = new Estudiante("1106543210", "Andrea Pelaez", 3.7,3.9,3.8,
                3.7,3.6, 3.5, 3.7, 4.0);
        Estudiante estudiante38 = new Estudiante("1028736522", "Paula Pereira", 3.9,3.2,3.0,
                3.8,3.1, 3.8, 3.0, 3.3);
        Estudiante estudiante39 = new Estudiante("1107654321", "Laura Perez", 3.3,3.5,3.7,
                3.4,3.3, 3.3, 3.2, 4.4);
        Estudiante estudiante40 = new Estudiante("1206543210", "Laura Ramirez", 3.4,3.7,3.3,
                3.5,3.4, 3.8, 3.6, 3.2);
        Estudiante estudiante41 = new Estudiante("1102345678", "Sebastian Rodriguez", 4.1,4.2,4.1,
                4.1,4.3, 4.2, 4.1, 4.2);
        Estudiante estudiante42 = new Estudiante("1001234567", "Matias Romero", 3.1,3.2,3.0,
                3.4,3.1, 3.0, 3.3, 3.5);
        Estudiante estudiante43 = new Estudiante("1809876543", "Valeria Sanchez", 3.8,3.9,3.7,
                3.9,3.5, 3.4, 3.3, 3.2);
        Estudiante estudiante44 = new Estudiante("1040744921", "Emily Sepulveda", 3.1,3.2,3.0,
                3.1,3.5, 3.4, 3.3, 3.2);
        Estudiante estudiante45 = new Estudiante("1607654321", "Manuel Silva", 4.2,4.3,4.0,
                4.3,3.5, 3.4, 3.3, 3.2);
        Estudiante estudiante46 = new Estudiante("1202345678", "Martin Trujillo", 4.0,4.1,3.8,
                3.7,3.6, 3.4, 3.6, 3.9);
        Estudiante estudiante47 = new Estudiante("1008765432", "Ana Urzola", 4.3,4.5,2.7,
                4.4,4.3, 4.0, 3.7, 3.8);
        Estudiante estudiante48 = new Estudiante("1409876543", "Paula Valencia", 3.5,4.2,3.8,
                3.9,3.1, 3.8, 3.0, 3.3);
        Estudiante estudiante49 = new Estudiante("1407654321", "Manuel Vargas", 3.1,3.2,3.0,
                3.1,3.0, 4.0, 3.7, 3.8);
        Estudiante estudiante50 = new Estudiante("1609876543", "Gabriel Vasquez", 4.3,4.5,4.2,
                4.4,3.1, 3.0, 3.3, 3.5);

        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);
        listaEstudiantes.add(estudiante4);
        listaEstudiantes.add(estudiante5);
        listaEstudiantes.add(estudiante6);
        listaEstudiantes.add(estudiante7);
        listaEstudiantes.add(estudiante8);
        listaEstudiantes.add(estudiante9);
        listaEstudiantes.add(estudiante10);
        listaEstudiantes.add(estudiante11);
        listaEstudiantes.add(estudiante12);
        listaEstudiantes.add(estudiante13);
        listaEstudiantes.add(estudiante14);
        listaEstudiantes.add(estudiante15);
        listaEstudiantes.add(estudiante16);
        listaEstudiantes.add(estudiante17);
        listaEstudiantes.add(estudiante18);
        listaEstudiantes.add(estudiante19);
        listaEstudiantes.add(estudiante20);
        listaEstudiantes.add(estudiante21);
        listaEstudiantes.add(estudiante22);
        listaEstudiantes.add(estudiante23);
        listaEstudiantes.add(estudiante24);
        listaEstudiantes.add(estudiante25);
        listaEstudiantes.add(estudiante26);
        listaEstudiantes.add(estudiante27);
        listaEstudiantes.add(estudiante28);
        listaEstudiantes.add(estudiante29);
        listaEstudiantes.add(estudiante30);
        listaEstudiantes.add(estudiante31);
        listaEstudiantes.add(estudiante32);
        listaEstudiantes.add(estudiante33);
        listaEstudiantes.add(estudiante34);
        listaEstudiantes.add(estudiante35);
        listaEstudiantes.add(estudiante36);
        listaEstudiantes.add(estudiante37);
        listaEstudiantes.add(estudiante38);
        listaEstudiantes.add(estudiante39);
        listaEstudiantes.add(estudiante40);
        listaEstudiantes.add(estudiante41);
        listaEstudiantes.add(estudiante42);
        listaEstudiantes.add(estudiante43);
        listaEstudiantes.add(estudiante44);
        listaEstudiantes.add(estudiante45);
        listaEstudiantes.add(estudiante46);
        listaEstudiantes.add(estudiante47);
        listaEstudiantes.add(estudiante48);
        listaEstudiantes.add(estudiante49);
        listaEstudiantes.add(estudiante50);
    }

    public String calcularPromedioPorMateria(){
        int cantidadestudiantes = 0;
        float sumatoriaCalculo = 0;
        float sumatoriaEspanol = 0;
        float sumatoriaSociales = 0;
        float sumatoriaFisica = 0;
        float sumatoriaQuimica = 0;
        float sumatoriaFCiudadana = 0;
        float sumatoriaFilosofia = 0;
        float sumatoriaEdFisica = 0;
        float promedioCalculo = 0;
        float promedioEspanol = 0;
        float promedioSociales = 0;
        float promedioFisica = 0;
        float promedioQuimica = 0;
        float promedioFCiudadana = 0;
        float promedioFilosofia = 0;
        float promedioEdFisica = 0;

        for (Estudiante estudiante : listaEstudiantes) {
            sumatoriaCalculo += (float)estudiante.notaCalculo;
            sumatoriaEspanol += (float)estudiante.notaEspanol;
            sumatoriaSociales += (float)estudiante.notaSociales;
            sumatoriaFisica += (float)estudiante.notaFisica;
            sumatoriaQuimica += (float)estudiante.notaQuimica;
            sumatoriaFCiudadana += (float)estudiante.notaFormacionCiudadana;
            sumatoriaFilosofia += (float)estudiante.notaFilosofia;
            sumatoriaEdFisica+= (float)estudiante.notaEducacionFisica;
            cantidadestudiantes++;
        }

        promedioCalculo = sumatoriaCalculo/cantidadestudiantes;
        promedioEspanol = sumatoriaEspanol/cantidadestudiantes;
        promedioSociales = sumatoriaSociales/cantidadestudiantes;
        promedioFisica = sumatoriaFisica/cantidadestudiantes;
        promedioQuimica = sumatoriaQuimica/cantidadestudiantes;
        promedioFCiudadana = sumatoriaFCiudadana/cantidadestudiantes;
        promedioFilosofia = sumatoriaFilosofia/cantidadestudiantes;
        promedioEdFisica = sumatoriaEdFisica/cantidadestudiantes;

        String resultados = "\nEl promedio por materias es el siguiente: "+
                "\n\t Promedio Cálculo: "+decimalFormat.format(promedioCalculo)+
                "\n\t Promedio Español: "+decimalFormat.format(promedioEspanol)+
                "\n\t Promedio Ciencias Sociales: "+decimalFormat.format(promedioSociales)+
                "\n\t Promedio Física: "+decimalFormat.format(promedioFisica)+
                "\n\t Promedio Química: "+decimalFormat.format(promedioQuimica)+
                "\n\t Promedio Formación Ciudadana: "+decimalFormat.format(promedioFCiudadana)+
                "\n\t Promedio Filosofía: "+decimalFormat.format(promedioFilosofia)+
                "\n\t Promedio Educación Física: "+decimalFormat.format(promedioEdFisica);

        return resultados;
    }

    public String calcularPromedioPorEstudiante(){
        String nombreCompleto;
        String promedio;
        String estudiantesPromedioGanado = "";
        String estudiantesPromedioPerdido = "";
        double promedioNum;
        int indice1 = 0;
        int indice2 = 0;
        for (Estudiante estudiante : listaEstudiantes) {
             nombreCompleto = estudiante.nombreCompleto;
             promedio = decimalFormat.format(estudiante.calcularPromedioEstudiante()).replace(',','.');
             promedioNum = Double.valueOf(promedio);
             if(promedioNum >= 3.0){
                 indice1++;
                 estudiantesPromedioGanado += "\n\t\t"+indice1+"° Estudiante: "+nombreCompleto+" Tiene un promedio de: "+promedio;
             }
             else {
                 indice2++;
                 estudiantesPromedioPerdido += "\n\t\t"+indice2+"° Estudiante: "+nombreCompleto+" Tiene un promedio de: "+promedio;
             }
        }

        String promedios = "\nLos promedios de los estudiantes son los siguientes: "+
                "\n\n\tEstudiantes que ganaron:"+
                estudiantesPromedioGanado+
                "\n\n\tEstudiantes que perdieron:"+
                estudiantesPromedioPerdido;
        return promedios;
    }

    public String calcularPromedioEscuela(){
        int cantidadEstudiantes = 0;
        double sumatoriaNotas = 0.0;
        double promedioEscuela = 0.0;

        for (Estudiante estudiante: listaEstudiantes) {
            cantidadEstudiantes++;
            sumatoriaNotas += estudiante.calcularPromedioEstudiante();
        }
        promedioEscuela = sumatoriaNotas / cantidadEstudiantes;
        String resultadoPromedioEscuela = "\nEl promedio de la escuela es "+decimalFormat.format(promedioEscuela)+
                " con una cantidad de "+cantidadEstudiantes+" estudiantes de grado 11.";
        return resultadoPromedioEscuela;
    }

    public String encontrarMateriaConCalificacionMasAlta(){
        double calificacionMasAlta = 0.0;
        String nombreMateria = "";
        String nombreEstudiante = "";
        int index = 0;
        for (Estudiante estudiante : listaEstudiantes) {
            double[] notasEstudiante = new double[8];
            notasEstudiante[0] = estudiante.notaCalculo;
            notasEstudiante[1] = estudiante.notaEspanol;
            notasEstudiante[2] = estudiante.notaSociales;
            notasEstudiante[3] = estudiante.notaFisica;
            notasEstudiante[4] = estudiante.notaQuimica;
            notasEstudiante[5] = estudiante.notaFormacionCiudadana;
            notasEstudiante[6] = estudiante.notaFilosofia;
            notasEstudiante[7] = estudiante.notaEducacionFisica;

            for (double nota: notasEstudiante) {
                index++;
                if (calificacionMasAlta<nota){
                    calificacionMasAlta = nota;
                    nombreEstudiante = estudiante.nombreCompleto;
                    switch (index){
                        case 1:
                            nombreMateria = "Cálculo";
                            break;
                        case 2:
                            nombreMateria = "Español";
                            break;
                        case 3:
                            nombreMateria = "Ciencias Sociales";
                            break;
                        case 4:
                            nombreMateria = "Física";
                            break;
                        case 5:
                            nombreMateria = "Química";
                            break;
                        case 6:
                            nombreMateria = "Formación Ciudadanda";
                            break;
                        case 7:
                            nombreMateria = "Filosofía";
                            break;
                        case 8:
                            nombreMateria = "Educación Física";
                            break;
                        default: nombreMateria = "Hay algo mal";
                    }
                }
            }
            index = 0;
        }

        String materiaCalificacionMasAlta = "\nLa materia con la calificación más alta es "+nombreMateria+
                " con una nota de "+calificacionMasAlta+" por el estudiante "+nombreEstudiante;
        return materiaCalificacionMasAlta;
    }

    public static double calcularMedianaPorMateria(List<Double> lista) {
        int n = lista.size();

        if (n % 2 == 0) {
            // Si hay un número par de elementos, promedio de los dos elementos del medio
            int medio1 = n / 2 - 1;
            int medio2 = n / 2;
            double valor1 = encontrarValorEnPosicion(lista, medio1);
            double valor2 = encontrarValorEnPosicion(lista, medio2);
            return (valor1 + valor2) / 2.0;
        } else {
            // Si hay un número impar de elementos, el elemento del medio es la mediana
            int medio = n / 2;
            return encontrarValorEnPosicion(lista, medio);
        }
    }

    public static double encontrarValorEnPosicion(List<Double> lista, int posicion) {
        double valorEnPosicion = 0.0;
        int contador = 0;

        for (double valor : lista) {
            if (contador == posicion) {
                valorEnPosicion = valor;
                break;
            }
            contador++;
        }

        return valorEnPosicion;
    }

    public String encontrarMejorEstudiante(){
        String nombreCompleto;
        double promedio;
        double promedioMasAlto = 0.0;
        String estudianteMejorPromedio = "";

        for (Estudiante estudiante : listaEstudiantes) {
            nombreCompleto = estudiante.nombreCompleto;
            promedio = estudiante.calcularPromedioEstudiante();
            if (promedioMasAlto < promedio){
                promedioMasAlto = promedio;
                estudianteMejorPromedio = nombreCompleto;
            }
        }

        String resultado = "\nEl estudiante con el mejor promedio es "+estudianteMejorPromedio+
                " con un promedio de "+decimalFormat.format(promedioMasAlto);
        return resultado;
    }

    public String encontrarPeorEstudiante(){
        String nombreCompleto;
        double promedio;
        double promedioMasBajo = 5.0;
        String estudiantePromedioMasBajo = "";

        for (Estudiante estudiante : listaEstudiantes) {
            nombreCompleto = estudiante.nombreCompleto;
            promedio = estudiante.calcularPromedioEstudiante();
            if (promedioMasBajo > promedio){
                promedioMasBajo = promedio;
                estudiantePromedioMasBajo = nombreCompleto;
            }
        }

        String resultado = "\nEl estudiante con el promedio más bajo es "+estudiantePromedioMasBajo+
                " con un promedio de "+decimalFormat.format(promedioMasBajo);
        return resultado;
    }

    public String calcularModa(List<Double> listaNotas){
        double moda = 0;
        int frecuenciaMaxima = 0;

        for (double nota : listaNotas) {
            double notaActual = nota;
            int frecuenciaActual = 0;

            for (double nota1 : listaNotas) {
                if (nota1 == notaActual) {
                    frecuenciaActual++;
                }

                if (frecuenciaActual > frecuenciaMaxima) {
                    moda = notaActual;
                    frecuenciaMaxima = frecuenciaActual;
                }
            }
        }

        String resultado = "\nLa moda de las notas es "+moda+" con una frecuencia de "+frecuenciaMaxima;
        return resultado;
    }

    public static void main(String[] args) {
        Main sistemaNotas = new Main();
        sistemaNotas.agregarEstudiantes();
        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        List<Double> notasCalculo = new ArrayList<>();
        List<Double> notasEspanol = new ArrayList<>();
        List<Double> notasSociales = new ArrayList<>();
        List<Double> notasFisica = new ArrayList<>();
        List<Double> notasQuimica = new ArrayList<>();
        List<Double> notasFormacionCiudadana = new ArrayList<>();
        List<Double> notasFilosofia = new ArrayList<>();
        List<Double> notasEducacionFisica = new ArrayList<>();
        List<Double> totalNotas = new ArrayList<>();

        for (Estudiante estudiante : sistemaNotas.listaEstudiantes) {
            notasCalculo.add(estudiante.notaCalculo);
            notasEspanol.add(estudiante.notaEspanol);
            notasSociales.add(estudiante.notaSociales);
            notasFisica.add(estudiante.notaFisica);
            notasQuimica.add(estudiante.notaQuimica);
            notasFormacionCiudadana.add(estudiante.notaFormacionCiudadana);
            notasFilosofia.add(estudiante.notaFilosofia);
            notasEducacionFisica.add(estudiante.notaEducacionFisica);
            totalNotas.add(estudiante.notaCalculo);
            totalNotas.add(estudiante.notaEspanol);
            totalNotas.add(estudiante.notaSociales);
            totalNotas.add(estudiante.notaFisica);
            totalNotas.add(estudiante.notaQuimica);
            totalNotas.add(estudiante.notaFormacionCiudadana);
            totalNotas.add(estudiante.notaFilosofia);
            totalNotas.add(estudiante.notaEducacionFisica);
        }

        System.out.println("\n\n---------------------------------->RESULTADOS DE FIN DE AÑO<----------------------------------");
        String promedioEscuela = String.valueOf(sistemaNotas.calcularPromedioEscuela());
        System.out.println(promedioEscuela);
        String resultadosPromedioPorMateria = sistemaNotas.calcularPromedioPorMateria();
        System.out.println(resultadosPromedioPorMateria);
        String resultadoModa = sistemaNotas.calcularModa(totalNotas);
        System.out.println(resultadoModa);
        String resultadosPromedioPorEstudiante = sistemaNotas.calcularPromedioPorEstudiante();
        System.out.println(resultadosPromedioPorEstudiante);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        String resultadoMejorEstudiante = sistemaNotas.encontrarMejorEstudiante();
        System.out.println(resultadoMejorEstudiante);
        String materiaCalificacionMasAlta = sistemaNotas.encontrarMateriaConCalificacionMasAlta();
        System.out.println(materiaCalificacionMasAlta);
        String resultadoPeorEstudiante = sistemaNotas.encontrarPeorEstudiante();
        System.out.println(resultadoPeorEstudiante);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("\nLas medianas de las materias son las siguientes:");
        String medianaCalculo = decimalFormat.format(calcularMedianaPorMateria(notasCalculo));
        System.out.println("\tCálculo: "+medianaCalculo);
        String medianaEspanol = decimalFormat.format(calcularMedianaPorMateria(notasEspanol));
        System.out.println("\tEspañol: "+medianaEspanol);
        String medianaSociales = decimalFormat.format(calcularMedianaPorMateria(notasSociales));
        System.out.println("\tCiencias Sociales: "+medianaSociales);
        String medianaFisica = decimalFormat.format(calcularMedianaPorMateria(notasFisica));
        System.out.println("\tFísica: "+medianaFisica);
        String medianaQuimica = decimalFormat.format(calcularMedianaPorMateria(notasQuimica));
        System.out.println("\tQuímica: "+medianaQuimica);
        String medianaFormacionCiudadana = decimalFormat.format(calcularMedianaPorMateria(notasFormacionCiudadana));
        System.out.println("\tFormación Ciudadana: "+medianaFormacionCiudadana);
        String medianaFilosofia = decimalFormat.format(calcularMedianaPorMateria(notasFilosofia));
        System.out.println("\tFilosofía: "+medianaFilosofia);
        String medianaEducacionFisica = decimalFormat.format(calcularMedianaPorMateria(notasEducacionFisica));
        System.out.println("\tEducación Física: "+medianaEducacionFisica);
    }
}