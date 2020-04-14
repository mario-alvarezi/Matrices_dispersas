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
    private int  m[][];
    public MatrizDispersa(int matriz[][]) {     
        //crear el nodo cabez de los nodo cabez 
        Tripleta t=new Tripleta(0,0,0);        
        mat=new ListaLigada(t);
        this.dimension=matriz.length;   
        this.m=matriz;
    }
    public void crearMat(){
        ListaLigada p;
        NodoDoble n;
        Tripleta t;
        for(int i=1;i<=this.dimension;i++){
            t= new Tripleta (i,i,0);
            p=new ListaLigada(t);  
            for(int j=0;j<this.dimension;j++){
                t= new  Tripleta(i,j,this.m[i][j]);     
                
            }                    
        }
    
    }

  
    public void CrearNodosCabeza(){
        //enlazar los nodos cabeza  con la li 
        Tripleta t;
        NodoDoble p;        
        for(int i=1;i<this.dimension;i++){  
            t=new Tripleta(i,i,0);
            p=new NodoDoble(t);
            mat.agregaPorDato(p);                        
        }         
    }

            
    public void mostrar(){
        NodoDoble nodo=new NodoDoble();
        nodo=mat;    
    do{    
        System.out.println(nodo.retornaDatoTripleta());
        nodo=nodo.retornaLigaDato();
    }while(nodo!=mat);
        
    }
   
    public void agregarNodopoFila(Tripleta t){        
        NodoDoble p=new NodoDoble(t);         
        NodoDoble aux= new NodoDoble();
        NodoDoble siguiente=new NodoDoble();
        NodoDoble nodo=new NodoDoble();
        
        aux=mat;
        while(aux.retornaFilaTripleta()!=p.retornaFilaTripleta()){
            aux=aux.retornaLigaDato();
        }
        nodo=aux;
        if(aux.retornaLigaDer()==aux){
            aux.asignaLigaDer(p);
            p.asignaLigaDer(aux);
        }else{
            siguiente =aux;
            while(!(aux.retornaColumnaTripleta()<p.retornaColumnaTripleta() && p.retornaColumnaTripleta()<siguiente.retornaColumnaTripleta())){
                aux=aux.retornaLigaDer();
                siguiente=aux.retornaLigaDer();                
            }
            p.asignaLigaDer(siguiente);
            aux.asignaLigaDer(p);
            siguiente.asignaLigaDer(aux);
        }
        aux=mat;
        do{    
        System.out.println(aux.retornaDatoTripleta());
        aux=aux.retornaLigaDato();
        }while(aux!=nodo);
        
        System.out.println(p);
        System.out.println("he");
        System.out.println(siguiente);
        do{
            System.out.println(aux.retornaLigaDer());
            aux=aux.retornaLigaDer();
        }while(aux!=nodo);
        
                
    }

    
    
}
