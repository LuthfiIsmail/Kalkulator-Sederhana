/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kang L
 */
public class Kalkulator {
    private double result;

    public void tambah(double a, double b) {
        result = a + b;
    }

    public void kurang(double a, double b) {
        result = a - b;
    }

    public void kali(double a, double b) {
        result = a * b;
    }

    public void bagi(double a, double b) {
        if (b != 0) {
            result = a / b;
        } else {
            System.out.println("Error: Tidak boleh membagi dengan angka Nol");
        }
    }

    public double getResult() {
        return result;
    }
}
