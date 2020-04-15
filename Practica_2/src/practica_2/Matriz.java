/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;


/**
 *
 * @author laura.tascon
 */
public class Matriz extends DefaultTableCellRenderer { 
private  int n;

   private  int  matriz[][];
   
   public Matriz(){}
   
   
    public Matriz(int n) {
       
        this.n = n;

        //n= Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño de la matriz (debe de ser entre 6 y 16)")); 
        if(n>=6 && 16>=n){              
            matriz = new int[n][n];

        }else{
            JOptionPane.showMessageDialog(null,"El tamaño esta fuera del rango permitido\n por favor ingrese 6>n>16");
        }
        
    }
    
        
    public void llenar() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 1000 + 1);
            }
        } 
        
        }

    public int[][] getMatriz(){
        return matriz;
    }
    
    public void SumarDatos(){
        int aux=0;
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                aux=aux+matriz[i][j];                                
            }            
        }   
         JOptionPane.showMessageDialog(null,"suma de todos los datos "+aux);
    }
    
    /**
     *
     * @param j
     * @return
     */
    public void pintaMayor(JTextField[][] h) {
        int aux = 0;
        Integer r=0;
        Integer z=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (aux < matriz[i][j]) {
                    aux = matriz[i][j];
                    r=i;
                    z=j;
                }
            }
        }
        h[r][z].setBackground(Color.decode("#F88C20"));

    }
    public void pintaMenor(JTextField[][] h){
     int aux=matriz[0][0];     
           Integer r=0;
        Integer z=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
             if(aux>matriz[i][j]){
                 aux=matriz[i][j]; 
                 r=i;
                 z=j;
                } 
            }   
        }
        h[r][z].setBackground(Color.decode("#D5B7FE"));
    }
    
    
    public void pintaMayorFila(JTextField[][] h){
     int aux=0;       
     Integer r=0;
     Integer z=0;
        for(int i=0; i<matriz.length; i++){
            aux=matriz[i][0];
            for(int j=0; j<matriz[0].length; j++){                
             if(aux<matriz[i][j]){
                 aux=matriz[i][j];
                 r=i;
                 z=j;
                } 
            }
            h[r][z].setBackground(Color.decode("#3CF4F6"));

        } 
        System.out.println(" "); 
    }
    public void pintaMenorfila(JTextField[][] h){
     int aux=0;    
     Integer r=0;
     Integer z=0;
        for(int i=0; i<matriz.length; i++){
            aux=matriz[i][0];
            for(int j=0; j<matriz[0].length; j++){                
             if(aux<matriz[i][j]){
                 aux=matriz[i][j]; 
                 r=i;
                 z=j;
                } 
            }
            h[r][z].setBackground(Color.decode("#D5B7FE"));
        }
        System.out.println(" ");
    }
        public void pintaMayorColumna(JTextField[][] h){
        int aux=0; 
        int a=0;
        int p=0;
        for(int i=0; i<matriz.length; i++){
            aux=matriz[0][i];
            for(int j=0; j<matriz[0].length; j++){                
             if(aux<matriz[j][i]){
                 aux=matriz[j][i];
                 a=i;
                 p=j;
                } 
               
            }
            h[a][p].setBackground(Color.decode("#D4FF86"));
            System.out.println("El Mayor numero de la columna ["+(i+1)+"] es "+aux);
        }
        System.out.println(" ");        
    }
        public void pintaDatoConMayorSumaDigitosPorFila(JTextField[][] h){
        int aux=0,sum=0,numero=0,indice=0;  
        int w=0;
        int d=0;
        for(int i =0 ;i<matriz.length;i++){
            for(int j =0 ;j<matriz.length;j++){
                numero=matriz[i][j];       
                while(numero > 0) {                    
                sum =  sum + (numero % 10);
                numero = numero/10;                
                }                
                if(sum>aux){
                aux=sum;
                indice=matriz[i][j];
                w=i;
                d=j;
                }                
                sum=0;
            }       
            h[w][d].setBackground(Color.decode("#D4FF86"));
          aux=0;
        }      
    }    
    
        public void pintaDatosconSumaDigitos_6_o_15(JTextField[][] h){
         int aux=0,sum=0,numero=0,indice=0;  
         int w=0;
        int d=0;
        for(int i =0 ;i<matriz.length;i++){
            for(int j =0 ;j<matriz.length;j++){
                numero=matriz[i][j];       
                while(numero > 0) {                    
                sum =  sum + (numero % 10);
                numero = numero/10;                
                }                
                if(sum==15 || sum==6){
                    h[w][d].setBackground(Color.decode("#FFED86"));     
                }                
                sum=0;
            }   
        }
    }
    
    public int [][] ordenaCadaFilaDescendentemente(){
        int aux=0;
        int matriz1[][]=matriz;
        for(int  i=0; i < matriz1.length; i++){
           for(int  j=0;j< matriz1.length; j++){
              for(int x = 0; x < matriz1.length; x++){                  
                        if(matriz1[i][j] > matriz1[i][x]){
                          aux = matriz1[i][j];
                          matriz1[i][j] = matriz1[i][x];
                          matriz1[i][x] = aux;
                          
                        }                     
                }
            }
        }
        return matriz1;
    }
    public void pintaElMarco(){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(i==0 || i==matriz.length ){
                    System.out.print(matriz[i][j]+" ");                
                }
                if(j==matriz.length || j==0){                    
                    System.out.print(matriz[i][j]+" ");   
                }
            }                   
        }                                  
    }
    public void promedioDiagonalPrincipal(){
        int sum=0,promedio=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(i==j){
                sum= sum+matriz[i][j];                
                }
            }                   
        }
        promedio=sum/n;       
        System.out.println( promedio);
    }
    public void numeroVecesCadaDato(){
        int sum=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                for(int k=0;k<matriz.length;k++){
                    if(matriz[i][j]==matriz[j][k]){
                        sum++;
                    }                
                }               
                sum=0;
            }                               
        }        
    }
    
    public int getN(){
        return n;
    }
    public void limpiar(JTextField[][] h){
            for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                h[i][j].setBackground(Color.decode("#FFFFFF"));;
            
            }
    }
}
}
    
    
    /*

pintaDatosconSumaDigitos 6 o 15
ordenaCadaFilaDescendentemente()
pintaElMarco() // Es decir, primera y última fila, y primera y última columna
promedioDiagonalPrincipal()
numeroVecesCadaDato()
pintaTridiagonalPrincipal()
ordenarDescendentementePorFilas()
intercambiarDatosParesDeFilas(i, j)
pintaDatosQuePertenezcanALaSerieFibonacci()
pintaComoTableroDeAjedrez()
ordenaDigitosDeCadaDatoDeLaTridiagonalSecundariaAscendentemente()
pintaDatosQueSeaNumeroPrimo()
    */
 
