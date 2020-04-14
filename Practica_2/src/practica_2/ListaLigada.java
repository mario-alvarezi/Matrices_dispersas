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
public class ListaLigada {
     private NodoDoble cabeza;    

    public ListaLigada(Tripleta t) {
        this.cabeza=new NodoDoble(t);
    }

    public NodoDoble retornaCabeza() {
        return cabeza;
    }

    public void asignaCabeza(NodoDoble cabeza) {
        this.cabeza = cabeza;
    }    
    public void agregaPorDato(NodoDoble x){
       NodoDoble p=cabeza;       
       do{           
           p=p.retornaLigaDato();
        }while(p.retornaLigaDato()!=cabeza);
        x.asignaLigaDato(cabeza);
        p.asignaLigaDato(x);           
        do{           
           p=p.retornaLigaDato();
        }while(p!=cabeza);
        this.asignaCabeza(p);        
    }
    public void agregaPorDerecha(NodoDoble x){ 
        NodoDoble p=cabeza;       
       do{           
           p=p.retornaLigaDer();
        }while(p.retornaLigaDer()!=cabeza);
        x.asignaLigaDer(cabeza);
        p.asignaLigaDer(x);           
        do{           
           p=p.retornaLigaDer();
        }while(p!=cabeza);
        this.asignaCabeza(p);   
    
    }
    public void agregaPorIzquierda(NodoDoble x){
           NodoDoble p=cabeza;       
       do{           
           p=p.retornaLigaIzq();
        }while(p.retornaLigaIzq()!=cabeza);
        x.asignaLigaIzq(cabeza);
        p.asignaLigaIzq(x);           
        do{           
           p=p.retornaLigaIzq();
        }while(p!=cabeza);
        this.asignaCabeza(p);  
    
    }
    public void mostrarLiDato(){        
         NodoDoble p=cabeza;
         do{
             System.out.println(p.retornaFilaTripleta()+""+p.retornaColumnaTripleta()+""+p.retornaDatoEntero());
             p=p.retornaLigaDato();
         }while(p!=cabeza);
    }
    public void mostrarLiIzq(){        
         NodoDoble p=cabeza;
         do{
             System.out.println(p.retornaFilaTripleta()+""+p.retornaColumnaTripleta()+""+p.retornaDatoEntero());
             p=p.retornaLigaIzq();
         }while(p!=cabeza);
    }
    public void mostrarLigaDer(){        
         NodoDoble p=cabeza;
         do{
            System.out.println(p.retornaFilaTripleta()+""+p.retornaColumnaTripleta()+""+p.retornaDatoEntero());
            p=p.retornaLigaDer();
         }while(p!=cabeza);
    }    
}
