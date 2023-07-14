/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author josep
 */
public class Modelo {
    private int v1=0;
    
    private int v2=0;
    private int v3=0;
    private int v4=0;
    private int v5=0;
    private int v6=0;
    private int v7=0;
    private int v8=0;
    private int total=0;
    
    public Modelo(){
        
        
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getV3() {
        return v3;
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }

    public int getV4() {
        return v4;
    }

    public void setV4(int v4) {
        this.v4 = v4;
    }

    public int getV5() {
        return v5;
    }

    public void setV5(int v5) {
        this.v5 = v5;
    }

    public int getV6() {
        return v6;
    }

    public void setV6(int v6) {
        this.v6 = v6;
    }

    public int getV7() {
        return v7;
    }

    public void setV7(int v7) {
        this.v7 = v7;
    }

    public int getV8() {
        return v8;
    }

    public void setV8(int v8) {
        this.v8 = v8;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    public void sumar(){
        this.total=this.v1+this.v2;
    }
    public void restar(){
        this.total=this.v3-this.v4;
    }
    public void dividir(){
        this.total=this.v5*this.v6;
    }
    public void multiplicar (){
        this.total=this.v7/this.v8;
    }
    
}
