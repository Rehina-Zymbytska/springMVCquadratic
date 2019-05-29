package ua.com.quadr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Coefficients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int a;
    private int b;
    private int c;
    private int discriminant;
    private double squareRoot1;
    private double squareRoot2;

    public Coefficients() {
    }

    public Coefficients(int a, int b, int c, int discriminant) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = discriminant;
    }

    public Coefficients(int a, int b, int c, int discriminant, double squareRoot1) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = discriminant;
        this.squareRoot1 = squareRoot1;
    }

    public Coefficients(int a, int b, int c, int discriminant, double squareRoot1, double squareRoot2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = discriminant;
        this.squareRoot1 = squareRoot1;
        this.squareRoot2 = squareRoot2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getDiscriminant() {
        return discriminant;
    }

    public void setDiscriminant(int discriminant) {
        this.discriminant = discriminant;
    }

    public double getSquareRoot1() {
        return squareRoot1;
    }

    public void setSquareRoot1(double squareRoot1) {
        this.squareRoot1 = squareRoot1;
    }

    public double getSquareRoot2() {
        return squareRoot2;
    }

    public void setSquareRoot2(double squareRoot2) {
        this.squareRoot2 = squareRoot2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coefficients that = (Coefficients) o;

        if (id != that.id) return false;
        if (a != that.a) return false;
        if (b != that.b) return false;
        if (c != that.c) return false;
        if (discriminant != that.discriminant) return false;
        if (Double.compare(that.squareRoot1, squareRoot1) != 0) return false;
        return Double.compare(that.squareRoot2, squareRoot2) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + a;
        result = 31 * result + b;
        result = 31 * result + c;
        result = 31 * result + discriminant;
        temp = Double.doubleToLongBits(squareRoot1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(squareRoot2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Coefficients{" +
                "id=" + id +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", discriminant=" + discriminant +
                ", squareRoot1=" + squareRoot1 +
                ", squareRoot2=" + squareRoot2 +
                '}';
    }
}