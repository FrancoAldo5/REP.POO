/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica24_5;

/**
 *
 * @author josep
 */
public class Practica24_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int generados=0;
        int[] nums=new int [6];
        int n;
        do{
            n=(int)(Math.random()*49+1);
            if(!repetido(n,nums, generados)){
                nums[generados]=n;
                generados++;
            }
            
        }while(generados<6);
        ordenar(nums);
        mostrar(nums);
        // TODO code application logic here
    }

    private static boolean repetido(int n, int[] nums, int generados) {
       boolean res  = false;
       for(int i=0; i<generados; i++){
           
            if(n==nums[i]){
            res=true;
            break;
            }
        }
        return res;
    }

    private static void ordenar(int[] nums) {
        int aux;
        for(int i=0;i<nums.length;i++)
        for(int k=i;k<nums.length;k++){
            aux=nums[i];
            nums[i]=nums[k];
            nums[k]=aux;
        }

    }

    private static void mostrar(int[] nums) {
         for(int num:nums)
             
            System.out.print(num+",");
        }
    }
