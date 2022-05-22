package com.company;

import clasess.*;

import java.io.IOException;

public class Main {
    /**
     *
     * Создать класс квадрат, члены класса – длина стороны. Предусмотреть в классе методы
     * вычисления и вывода сведений о фигуре – диагональ, периметр, площадь. Создать производный класс
     * – правильная квадратная призма с высотой H, добавить в класс метод определения объема фигуры,
     * перегрузить методы расчета площади и вывода сведений о фигуре. Написать программу,
     * демонстрирующую работу с этими классами: дано N квадратов и M призм, найти квадрат с максимальной
     * площадью и призму с максимальной диагональю.
     *
     */
    public static final int N = 10;
    public static final int M = 10;

    public static void main(String[] args) throws IOException
    {
        int side;
        /* final int N = 10;
        final int M = 10;
        Squares squares = new Squares(N);
        for (int i = 0; i < N; i++) {
            squares.add(new Square((int) (Math.random() * 70 + 1)));
        }
        System.out.println(squares);
        System.out.println("MaxSquare = " + squares.getMaxSquare());
        System.out.println("\n");
        Prisms prisms = new Prisms(M);
        for (int i = 0; i < M+2; i++) {
            prisms.add(new Prism((int) (Math.random() * 70 + 1), (int) (Math.random() * 70 + 1)));
        }
        System.out.println(prisms);
        System.out.println("MaxDiagonal: " + prisms.getMaxDiagonal());
         */
        SquareList squareList = new SquareList();
        PrismList prismList = new PrismList();
        SquareList squareListNew = new SquareList();
        PrismList prismListNew = new PrismList();
        try {
            squareList = DateBase.deserializeSquare();
            prismList = DateBase.deserializePrism();

            squareListNew = JSONEDateBase.deserializeSquareJSONE();
            prismListNew = JSONEDateBase.deserializePrismJSONE();
        }
        catch(Exception e) {
            for (int i = 0; i < N; i++) {
                squareList.add(new Square((int) (Math.random() * 70 + 1)));
                squareListNew.add(new Square((int) (Math.random() * 70 + 1)));
            }
            System.out.println(squareList);
            System.out.println("MaxSquare = " + squareList.getMaxSquare());
            System.out.println("\n");
            for (int i = 0; i < M + 2; i++) {
                prismList.add(new Prism((int) (Math.random() * 70 + 1), (int) (Math.random() * 70 + 1)));
                prismListNew.add(new Prism((int) (Math.random() * 70 + 1), (int) (Math.random() * 70 + 1)));
            }
            System.out.println(prismList);
            System.out.println("MaxDiagonal: " + prismList.getMaxDiagonal());
            System.out.println("catch");
        }

        System.out.println(squareList);
        System.out.println(prismList);
        System.out.println("==========================================================================================");
        System.out.println(squareListNew);
        System.out.println(prismListNew);

        DateBase.serializeSquare(squareList);
        DateBase.serializePrism(prismList);

        JSONEDateBase.serializeSquareJSONE(squareListNew);
        JSONEDateBase.serializePrismJSONE(prismListNew);
    }
}
