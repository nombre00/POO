/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Auto {
    
    private String marca, modelo, color, tipoTransmision,tipoCombustible;
    private int año, cantidadPuertas;
    private double cilincrada;

    public Auto() {
        marca = "toyota";
        modelo = "corolla";
        
    }

    public Auto(String marca, String modelo, String color, String tipoTransmision, String tipoCombustible, int año, int cantidadPuertas, double cilincrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoTransmision = tipoTransmision;
        this.tipoCombustible = tipoCombustible;
        this.año = año;
        this.cantidadPuertas = cantidadPuertas;
        this.cilincrada = cilincrada;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }
    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public double getCilincrada() {
        return cilincrada;
    }
    public void setCilincrada(double cilincrada) {
        this.cilincrada = cilincrada;
    }

    // sirve para imprimir la informacion.
    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipoTransmision=" + tipoTransmision + ", tipoCombustible=" + tipoCombustible + ", a\u00f1o=" + año + ", cantidadPuertas=" + cantidadPuertas + ", cilincrada=" + cilincrada + '}';
    }
    
    // main + tab
    public static void main(String[] args) {
        
        Auto objetoAuto1 = new Auto();
        System.out.println("marca: "+objetoAuto1.getMarca());
        System.out.println("Modelo: "+objetoAuto1.getModelo());
        
        
        Auto objAuto2 = new Auto("chevrolet", "luv", "blanco", "mecanica", "vencina", 1997, 4, 6);
        
        System.out.println(objAuto2.toString());
    }
    
    
    
    }
