
package com.mycompany.culebra;
// Importaciones necesarias
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

// Clase para el panel del juego de Snake
public class PanelSnake extends JPanel {
    
    
    private Clip eatClip; // Para el sonido de comer
    // Imágenes de fondo, serpiente y obstáculo
    private BufferedImage imagenfondo;
    private BufferedImage imagenSerpiente;
    private BufferedImage imagenObstaculo;
    private Clip crashClip; // Para el sonido de choque
    private Clip limitClip; // Para el sonido de choque con límites
    
   // Lista de coordenadas de los obstáculos 
    List<int[]> obstaculos = new ArrayList<>();
   // Puntuación del jugador
    int score = 0;
     // Colores de la serpiente y la comida
    Color colosnake= Color.green;
    Color colorcomida=Color.red;
   
    // Dimensiones y características del tablero
    int tammax,tam,can,res;
  
    // Lista de coordenadas de la serpiente
    List<int[]>snake=new ArrayList<>();
     // Coordenadas de la comida
    int[] comida=new int[2];
    // Direcciones de movimiento de la serpiente
    String direccion="de";
    String direccionproxima="de";
    
    // Hilo y objeto Caminante para controlar el movimiento
    Thread hilo;
    Caminante camino;
    
    // Constructor de PanelSnake
    public PanelSnake(int tammax, int can) {
    
    this.tammax = tammax;
    this.can = can;
    this.tam = tammax / can;
    this.res = tammax % can;
    // Inicialización de la serpiente con dos segmentos
    int[] a={can/2-1,can/2-1};
    int[] b={can/2,can/2-1};
    snake.add(a);
    snake.add(b);
    // Generación de la comida
    generarcomida();
    
    
    // Inicialización del hilo y el objeto Caminante
    camino=new Caminante(this);
    hilo = new Thread(camino);
    hilo.start();
    // Ubicaciones de los obstáculos
    obstaculos.add(new int[]{5, 10});
    obstaculos.add(new int[]{6, 10});
    obstaculos.add(new int[]{5, 11});
    obstaculos.add(new int[]{6, 11});
    obstaculos.add(new int[]{23, 10});
    obstaculos.add(new int[]{24, 10});
    obstaculos.add(new int[]{23, 11});
    obstaculos.add(new int[]{24, 11});
    obstaculos.add(new int[]{5, 23});
    obstaculos.add(new int[]{6, 23});
    obstaculos.add(new int[]{5, 24});
    obstaculos.add(new int[]{6, 24});
    obstaculos.add(new int[]{23, 23});
    obstaculos.add(new int[]{24, 23});
    obstaculos.add(new int[]{23, 24});
    obstaculos.add(new int[]{24, 24});
    // Carga de imágenes de fondo, serpiente y obstáculo
  try {
    // Cargar la imagen de fondo desde el paquete
    imagenfondo = ImageIO.read(getClass().getResource("imagenfondo.jpg"));
} catch (IOException e) {
    e.printStackTrace();
}
try {
    // Cargar la imagen de la serpiente desde el paquete
    imagenSerpiente = ImageIO.read(getClass().getResource("culebra.jpg"));
} catch (IOException e) {
    e.printStackTrace();
}
try {
    // Cargar la imagen de los obstáculos desde el paquete
    imagenObstaculo = ImageIO.read(getClass().getResource("enemigo.jpg"));
} catch (IOException e) {
    e.printStackTrace();
}
// Cargar los sonidos de choque y límites
        try {
            AudioInputStream crashSound = AudioSystem.getAudioInputStream(getClass().getResource("perder.wav"));
            crashClip = AudioSystem.getClip();
            crashClip.open(crashSound);

            AudioInputStream limitSound = AudioSystem.getAudioInputStream(getClass().getResource("perder.wav"));
            limitClip = AudioSystem.getClip();
            limitClip.open(limitSound);
            
            // Cargar el sonido de comer
            AudioInputStream eatSound = AudioSystem.getAudioInputStream(getClass().getResource("son_comer.wav"));
            eatClip = AudioSystem.getClip();
            eatClip.open(eatSound);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
// Cargar los sonidos de choque y límites
    }
    
    
       // Método para pintar en el panel
    
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
           
        pintor.setColor(colosnake);
        //for(int i=0; i<snake.size();i++){
        //    pintor.fillRect(res/2+snake.get(i)[0]*tam, res/2+snake.get(i)[1]*tam, tam-1, tam-1);
        //}
         // Dibujo del fondo
        pintor.drawImage(imagenfondo, 0, 0, this);
        // Dibujo de obstáculos
        for (int[] obstaculo : obstaculos) {
            pintor.setColor(Color.BLUE);
            pintor.fillRect(res / 2 + obstaculo[0] * tam, res / 2 + obstaculo[1] * tam, tam - 1, tam - 1);
        }
        
        for (int[] obstaculo : obstaculos) {
        // Cambia el siguiente código para dibujar una imagen en lugar de un rectángulo
            int obstaculoX = res / 2 + obstaculo[0] * tam;
            int obstaculoY = res / 2 + obstaculo[1] * tam;
            pintor.drawImage(imagenObstaculo, obstaculoX, obstaculoY, tam - 1, tam - 1, this);
        }
         // Dibujo de la serpiente y su imagen
        for(int[] par:snake){
            
            pintor.setColor(Color.GREEN);
            pintor.fillRect(res/2+par[0]*tam, res/2+par[1]*tam, tam-1, tam-1);
            pintor.drawImage(imagenSerpiente, res / 2 + par[0] * tam, res / 2 + par[1] * tam, tam - 1, tam - 1, this);
            
        }
        //pintando comida
        pintor.setColor(colorcomida);
        pintor.fillRect(res/2+comida[0]*tam, res/2+comida[1]*tam, tam-1, tam-1);
        pintor.setColor(Color.white);
        pintor.drawString("Puntuación: " + score, 10, 20);
    }
    // Método para avanzar la serpiente
    public void avanzar() {
    igualardir();
    int[] ultimo = snake.get(snake.size() - 1);
    int agregarx = 0;
    int agregary = 0;
    switch (direccion) {
       
     // Determinar el cambio en las coordenadas según la dirección   
        case "de":
            agregarx = 1;
            break;
        case "iz":
            agregarx = -1;  // Cambia aquí de 1 a -1
            break;
        case "ar":
            agregary = -1;  // Cambia aquí de 1 a -1
            break;
        case "ab":
            agregary = 1;  // Cambia aquí de 1 a -1
            break;
    }

    int[] nuevo = {
        Math.floorMod(ultimo[0] + agregarx, can),
        Math.floorMod(ultimo[1] + agregary, can)
    };
        
        boolean existe=false;
        // Cuando choca con un obstáculo
    if (haChocadoConObstaculo(nuevo)) {
        crashClip.setFramePosition(0); // Reiniciar el clip al principio
        crashClip.start(); // Reproducir el sonido
        // Resto del código para tratar la colisión
    }

    // Cuando choca con los límites
    if (haLlegadoAlBorde(nuevo)) {
        limitClip.setFramePosition(0); // Reiniciar el clip al principio
        limitClip.start(); // Reproducir el sonido
        // Resto del código para tratar la colisión con los límites
    }
        for(int i=0; i<snake.size(); i++){
            if(nuevo[0]==snake.get(i)[0]&&nuevo[1]==snake.get(i)[1]){
                existe=true;
                break;
            }
            
        }
        if(existe || haLlegadoAlBorde(nuevo) || haChocadoConObstaculo(nuevo)){
           JOptionPane.showMessageDialog(this,"has perdido"+ score);
           camino.parar();
           
        }else{
            if(nuevo[0]==comida[0]&&nuevo[1]==comida[1]){
                eatClip.setFramePosition(0); // Reiniciar el clip al principio
                eatClip.start(); // Reproducir el sonido
                snake.add(nuevo);
                generarcomida();
                incrementarScore();
            }else{
                snake.add(nuevo);
        snake.remove(0);
            }
        }
        if (haExcedidoTiempoLimite()) {
            
            JOptionPane.showMessageDialog(this, "Tiempo agotado. Has jugado 60 segundos.");
            String playerName = JOptionPane.showInputDialog(this, "¡Juego completado!\nIngrese su nombre:", "Final del Juego", JOptionPane.PLAIN_MESSAGE);

            if (playerName != null && !playerName.isEmpty()) {
                String message = "Jugador: " + playerName + "\n" +
                                 "Puntaje: " + score;
                JOptionPane.showMessageDialog(this, message, "Resultado del Juego", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Debes ingresar un nombre válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            camino.parar();
            return;
        }
    }
    
    private boolean haChocadoConObstaculo(int[] posicion) {
        for (int[] obstaculo : obstaculos) {
            if (posicion[0] == obstaculo[0] && posicion[1] == obstaculo[1]) {
                return true;
            }
        }
        return false;
    }
    
     private boolean haLlegadoAlBorde(int[] posicion) {
        return posicion[0] == 0 || posicion[0] == can-1 || posicion[1] == 0 || posicion[1] == can-1;
    }
     
    private void incrementarScore() {
        score += 10;  // Puedes ajustar la cantidad de puntos por comida
        repaint();  // Vuelve a dibujar el componente para actualizar la puntuación mostrada
    }
    // Método para generar la ubicación de la comida
    public void generarcomida() {
     // Generar las coordenadas aleatoriamente y verificar si chocan con la serpiente u obstáculos
    boolean existe = false;
    int a, b;

    // Generar coordenadas aleatorias para la comida
    do {
        a = (int) (Math.random() * (can-2)+1);
        b = (int) (Math.random() * (can-2)+1);

        // Verificar si las coordenadas generadas coinciden con la posición de la serpiente o los obstáculos
        for (int[] par : snake) {
            if (par[0] == a && par[1] == b) {
                existe = true;
                break;
            }
        }
        for (int[] obstaculo : obstaculos) {
            if (obstaculo[0] == a && obstaculo[1] == b) {
                existe = true;
                break;
            }
        }
    } while (existe);
// Asignar las coordenadas generadas a la comida
    this.comida[0] = a;
    this.comida[1] = b;
}


    // Método para cambiar la dirección de la serpiente
    public void cambiardireccion(String dir){
      // Cambiar la dirección de movimiento de la serpiente
        if(this.direccion.equals("de")||this.direccion.equals("iz")&&(dir.equals("ar")||dir.equals("ab"))){
            this.direccionproxima=dir;
        }
        
        if(this.direccion.equals("ar")||this.direccion.equals("ab")&&(dir.equals("iz")||dir.equals("de"))){
            this.direccionproxima=dir;
        }
        
    }
     // Método para igualar la dirección actual y la próxima
    public void igualardir(){
         // Igualar las direcciones
        this.direccion=this.direccionproxima;
    }
     // Método para verificar si ha excedido el tiempo límite
    private boolean haExcedidoTiempoLimite() {
       // Verificar el tiempo transcurrido y compararlo con el tiempo límite
        long currentTime = System.currentTimeMillis();
        return (currentTime - camino.startTime) > camino.tiempoLimite;
    }

    
}