package com.andersenlab.vorobei.school.lesson4;

import java.util.Scanner;

public class Payment {
    public static Scanner sc = new Scanner(System.in);
    private String name;
    private int cost;
    public Products products;

    public Payment() {
        System.out.println("Введите название покупки");
        setName(sc.nextLine());
        products = new Products();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public class Products {
        private String productsName;
        private int productsCost;
        public int kolvoProducts = 5;

        public Products() {
            cost = 0;
            for (int i = 0; i < getKolvoProducts(); i++) {
                System.out.println("Введите наименование товара");
                setProuctName(sc.next());
                System.out.println("Введите стоимость товара");
                setProductsCost(sc.nextInt());
                cost = cost + getProductsCost();
            }
        }

        public String getProductsName() {
            return productsName;
        }

        public void setProuctName(String productsName) {
            this.productsName = productsName;
        }

        public int getProductsCost() {
            return productsCost;
        }

        public void setProductsCost(int productsCost) {
            this.productsCost = productsCost;
        }

        public int getKolvoProducts() {
            return kolvoProducts;
        }

        public void setKolvoProducts(int kolvoProducts) {
            this.kolvoProducts = kolvoProducts;
        }

        public int resultCost() {
            setCost(getCost());
            return cost;
        }

        public void print() {
            System.out.println("Покупка " + getName() + " имеет стоимость " + resultCost());
        }
    }

    public static void main(String[] args) {
        Payment payment1 = new Payment();
        payment1.products.print();
    }
}
