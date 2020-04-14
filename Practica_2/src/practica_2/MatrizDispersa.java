/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2;

/**
 *
 * @author Mario
 */
public class MatrizDispersa {
          
    private ListaLigada mat;
    private int dimension;
    

    public MatrizDispersa(int dimension) {
        Tripleta t =new Tripleta(0,0,0);
        mat=new ListaLigada(t);
        this.dimension=dimension;                
    }
    public void retornaCabeza(){
        mat.retornaCabeza();        
    }
    public void construye( int[][]ma){
        int [][]m= ma;
        ListaLigada l;
        Tripleta t ;
        
        for(int i =1;i<=this.dimension;i++){
            t=new Tripleta(i,i,0);
            l=new ListaLigada(t);
            for(int j=1;j<=this.dimension;j++){
                if((m[i-1][j-1])!=0){
                    t=new Tripleta(i,j,m[i-1][j-1]);
                    l.agregaPorDerecha(t);
                   
                }else{
                    if(m[j-1][i-1]!=0){
                        t=new Tripleta(j,i,m[j-1][i-1]);
                        l.agregaPorIzquierda(t);
                    }                
                }                                        
            }
            mat.agregaPorDato(l.retornaCabeza());
        }
    }
    public void mostrarMatrizDispersa(){
       NodoDoble p=mat.retornaCabeza();
       NodoDoble aux;
       p=p.retornaLigaDato();
       
       while(p!=mat.retornaCabeza()){
           if(p.retornaLigaDer()!=p){
               aux=p;
                while(p.retornaLigaDer()!=aux){
                    System.out.print(p);
                    System.out.print(" ");
                    p=p.retornaLigaDer();
                }           
            }
            System.out.println(" ");   
            p=p.retornaLigaDato();
        }                                 
    }      
}
