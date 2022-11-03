package Librari;

import Librari.Author;

public class Main {
        public static void main(String[] args) {
        Author chekhovAnton = new Author("Anton", "Chekhov");
        Book seagull = new Book("Seagull", chekhovAnton, 1896);

        System.out.println("\"" + seagull.getName() + "\" "+seagull.getYearPublic()+ " " + seagull.getAuthor());

        seagull.setYearPublic(2020);
                System.out.println("Новый год публикации: " + seagull.getYearPublic());
                System.out.println();


        Author dostoevskiyFedor = new Author("Fedor", "Dostoevskiy");
        Book idiot = new Book("Idiot", dostoevskiyFedor, 1896);

        System.out.println("\"" + idiot.getName()+"\" "+idiot.getYearPublic()+ " " +idiot.getAuthor());
        }
}