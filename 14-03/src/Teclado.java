import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//--------------------------------------------------------
public class Teclado {

  protected static Scanner scan = new Scanner(System.in);

  //--------------------------------------------------------
  public Teclado(){
  }
  
  //--------------------------------------------------------  
  public static String leString(){
    return scan.nextLine();
  }

  //--------------------------------------------------------  
  public static char leChar(){
    return leString().charAt(0);
  }

  //--------------------------------------------------------  
  public static int leInteiro(){
    String aux;
    int i=0;
    aux = leString();
    try {
      i = Integer.parseInt(aux);
    }
    catch (Exception e) {
      throw new RuntimeException("Erro: Numero inteiro invalido!");    	
    }
    return i; 
  }

  //--------------------------------------------------------  
  public static float leFloat(){
    String aux;
    float f=0.0f;
    aux = leString();
    try {
      //f = Float.valueOf(aux).floatValue(); //usa o ponto como separador.
      //f = Float.parseFloat(aux);           //usa o ponto como separador.
      f = NumberFormat.getInstance().parse(aux).floatValue(); //usa o caracter do sistema do usu�rio como separador (ponto, virgula, etc...).
    }
    catch (Exception e) {
      //System.out.println("Erro: Numero inteiro invalido!");
      throw new RuntimeException("Erro: Numero float invalido!");
    }    
    return f; 
  }

  //--------------------------------------------------------  
  public static Date leData(){
    Date d=null;
    String aux=null;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    try {
        aux = leString();
        d   = sdf.parse(aux);
    }
    catch (ParseException e) {
        throw new RuntimeException("Erro: Data invalida!");
    }      
    return d;
  }//leData()

  //--------------------------------------------------------
  public static void pressioneEnter(){
    System.out.println("Pressione ENTER para continuar...");
    scan.nextLine();
  }//pressioneEnter()
  
}//Teclado.