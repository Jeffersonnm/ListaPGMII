/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExecsGeometria;

import java.util.Random;

/**
 *
 * @author Windows10
 */
public class Exec33 {

    public static void main(String[] args) {
        Exec33 exec = new Exec33();
        exec.initSistema();

    }

    void initSistema() {
        Circulo c = geraCirculo(); // gera um circulo aleatorio
        Ponto[] listaPontos = new Ponto[200]; // array de pontos para armazenar possíveis pontos
        int cont = 0;
        while (true) {

            if (cont == 200) {
                break;
            } else {
                Ponto p = geraPonto(c);
                if (!jaExiste(p.getxPonto(), p.getyPonto(), listaPontos)) {
                    System.out.println("Ponto possível encontrado...");
                    listaPontos[cont] = p;
                    cont++;
                }
            }

        }
        printPontos(listaPontos, c);
    }

    void printPontos(Ponto[] lista, Circulo c) {
        System.out.println("C(" + c.getX() + "," + c.getY() + "," + c.getRaio() + ")");
        for (Ponto p : lista) {
            System.out.println("P(" + p.getxPonto() + "," + p.getyPonto() + ")");
        }
    }

    boolean jaExiste(double x, double y, Ponto[] lista) {
        boolean ret = false;
        for (Ponto p : lista) {
            if (p != null) {
                if (p.getxPonto() == x && p.getyPonto() == y) {
                    ret = true;
                }
            }

        }
        return ret;
    }

    Ponto geraPonto(Circulo max) {
        Random gerador = new Random();
        double pontoMinimoX = max.getX() - max.getRaio();
        double pontoMaximoX = max.getX() + max.getRaio();
        double pontoMinimoY = max.getY() - max.getRaio();
        double pontoMaximoY = max.getY() + max.getRaio();

        double xGerado = pontoMinimoX - 1;
        double yGerado = pontoMinimoY - 1;
        while (xGerado < pontoMinimoX || xGerado > pontoMaximoX || yGerado < pontoMinimoY || yGerado > pontoMaximoY) {
            xGerado = gerador.nextDouble();
            yGerado = gerador.nextDouble();
            System.out.println("Gerando...");
        }
        return new Ponto(xGerado, yGerado);
    }

    Circulo geraCirculo() {
        Random gerador = new Random();
        Circulo circulo = new Circulo(gerador.nextDouble(), gerador.nextDouble(), gerador.nextDouble());
        return circulo;
    }

    static boolean isSobreCirculo(Ponto p, Circulo c) {
        return valorPontoCirculo(p, c) > c.getRaio();
    }

    static double valorPontoCirculo(Ponto p, Circulo c) {
        return Math.sqrt(Math.pow(c.getX() - p.getxPonto(), 2) + Math.pow(c.getY() - p.getyPonto(), 2));
    }
}
