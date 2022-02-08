package ejercicio8objetos;

public class Cadena {
    
   //atributos
   String frase;
   int longitud;

   //Getters y Setters
    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
    
    //Método mostrar vocales
    public int mostrarVocales(){
       int vocal=0;
        for (int i = 0; i<frase.length();i++){
            char pruebaVocal=frase.toUpperCase().charAt(i);
          if (pruebaVocal=='A'||pruebaVocal=='E'||pruebaVocal=='I'||pruebaVocal=='O'||pruebaVocal=='U'){
              vocal++;
          }
        }
        return vocal;
    }
    
    //Método invertir frase
    public void invertirFrase(){
        String fraseInvertida="";
        for (int i=frase.length()-1;i>=0;i--){
            fraseInvertida=fraseInvertida.concat(frase.substring(i,i+1));
        }
        System.out.println("La frase es: "+frase);
        System.out.println("La frase invertida es: "+fraseInvertida);
    }
    //Método veces repetido
    public int vecesRepetido(String caracterIngresado){
        int cantVecesCaracter=0;
        for (int i=0;i<frase.length();i++){
          if (caracterIngresado.equals(frase.substring(i,i+1))){
            cantVecesCaracter++;
        }  
        }
        return cantVecesCaracter;
    }
    //Método comparar longitud
    public void compararLongitud(String nuevaFrase){
       
        if( nuevaFrase.length()==frase.length()){
            System.out.println("Ambas frases tienen la misma longitud: "+frase.length()+" caracteres" );
        }else{
            System.out.println("La longitud de la frase anterior es: "+frase.length());
            System.out.println("La longitud de la nueva frase es: "+nuevaFrase.length());
        }
    }
    //Método unir frase
    public void unirFrase(String nuevaFrase){
        System.out.println(frase.concat(nuevaFrase));
    }
    //Método reemplazar
    public void reemplazar(String caracterAreemplazar){
        String nuevaFrase=frase.replace("a",caracterAreemplazar);
        System.out.println(nuevaFrase);
    }
    //Método contiene
    public boolean contiene(String letra){
        return frase.contains(letra);
    }
    
}
