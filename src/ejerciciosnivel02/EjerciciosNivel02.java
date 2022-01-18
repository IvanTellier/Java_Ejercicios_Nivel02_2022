/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosnivel02;

/**
 *
 * @author Ivan Tellier
 */
public class EjerciciosNivel02 {

    
    public boolean esEscaleraPalabras(char [][] listaPalabras){
        
        for (int i = 0; i < listaPalabras.length - 1; i++){
            int contador = 0;
            for(int j = 0; j < listaPalabras[0].length; j++){
                if(listaPalabras[i][j] != listaPalabras[i + 1][j]){
                contador++;
                }
            }
            if(contador != 1){ //si contador es distinto de 1es porque se diferencian en más de un caracter
            return false;}
        }
        return true;
    }
    
    public boolean esEscaleraPalabras2(char [][] lista){
        for(int j = 0; j<lista.length - 1; j ++){
            int contador = 0;
                for(int i=0; i<lista[0].length; i++){
                    if(lista [j][i] != lista[j+1][i]){
                        contador++;
                    }
                }
                if(contador!= 1){
                return false;
                }
            }
        return true;
    }
    
    private int costeErroresADN (String uno, String dos) {
        int contador = 0;
        
        for(int i = 0; i < uno.length(); i++){
            if (uno.charAt(i) == '-' || dos.charAt(i) == '-'){contador +=2;} //otra opcion contador = contador+2
            else{
                if(uno.charAt(i) == 'C' && dos.charAt(i) != 'G'){contador ++;}
                if(uno.charAt(i) == 'G' && dos.charAt(i) != 'C'){contador ++;}
                if(uno.charAt(i) == 'A' && dos.charAt(i) != 'T'){contador ++;}
                if(uno.charAt(i) == 'T' && dos.charAt(i) != 'A'){contador ++;}
                
            } 
        }
    return contador;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char [][] listaPalabras = { 
            {'P', 'A', 'T', 'A'}, 
            {'P', 'A', 'T', 'O'}, 
            {'R', 'A', 'T', 'O'}, 
            {'R', 'A', 'M', 'O'}, 
            {'G', 'A', 'M', 'O'}, 
            {'G', 'A', 'T', 'O'}, 
            {'M', 'A', 'T', 'O'}
        };
       
       EjerciciosNivel02 e = new EjerciciosNivel02();
       System.out.println(e.esEscaleraPalabras(listaPalabras));
       System.out.println(e.esEscaleraPalabras2(listaPalabras));
       System.out.println(e.costeErroresADN("ACGT", "TGCA"));
       System.out.println(e.costeErroresADN("A-C-G-T-ACGT", "TTGGCCAATGCA"));
       System.out.println(e.costeErroresADN("AAAAAAAA", "TTTATTTT"));
       System.out.println(e.costeErroresADN("GATTACA", "CTATT-T"));
       System.out.println(e.costeErroresADN("GGGA-GAATCTCTGGACT", "CCCTACTTA-AGACCGGT"));
    }
    
}
