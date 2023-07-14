/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Modelo;
import view.Vista;
/**
 *
 * @author josep
 */
public class Control implements ActionListener{
    private Vista view;
    private Modelo model;

    public Control(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnSumar.addActionListener(this);
        
    }
    
    public void iniciar(){
        view.setTitle("USTED VA A SUMAR POR MEDIO");
        view.setLocationRelativeTo(null);
        //view.txtN1.setText(String.valueOf(model.getV1()));
        //view.txtN1.setText(String.valueOf(model.getV2()));
        //view.txtResult.setText(String.valueOf(model.getTotal()));
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setV1(Integer.parseInt(view.txtN1.getText()));
        model.setV2(Integer.parseInt(view.txtN2.getText()));
        model.sumar();
        view.txtResult.setText(String.valueOf(model.getTotal()));
        model.setV3(Integer.parseInt(view.txtN3.getText()));
        model.setV4(Integer.parseInt(view.txtN4.getText()));
        model.restar();
        view.txtResult1.setText(String.valueOf(model.getTotal()));
        model.setV7(Integer.parseInt(view.txtN7.getText()));
        model.setV8(Integer.parseInt(view.txtN8.getText()));
        model.multiplicar();
        view.txtResult3.setText(String.valueOf(model.getTotal()));
        model.setV5(Integer.parseInt(view.txtN5.getText()));
        model.setV6(Integer.parseInt(view.txtN6.getText()));
        model.dividir();
        view.txtResult2.setText(String.valueOf(model.getTotal()));
    }
    
}
