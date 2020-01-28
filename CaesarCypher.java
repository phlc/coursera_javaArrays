public class CaesarCypher{

  //main method
  public static void main(String[] args){
    String s = encrypt("First Legion", 23, 17);
    System.out.println(s+"\n");
    decrypt(s);

  }//fim main

  //encrypt
  public static String encrypt(String s, int k, int l){

    //declaracoes
    String result = "";
    char c = '.';

    //loop cada letra
    for (int i=0; i<s.length(); i++){
      c = s.charAt(i);

      //definir chave a ser usada
      if (i%2==0){
        c = charCypher(c, k);
        result = result+c;
      }
      else{
        c = charCypher(c,l);
        result = result+c;
      }//fim else chave
    }

    return result;

  }//fim encrypt

  //charCypher
  public static char charCypher (char c, int k){

    //verificar minuscula ou maiuscula ou nao letra
    if ('A'<= c && c<='Z'){
      c = (char)(((((int)c - 65) + k%26)%26)+65);
    }//fim maiuscula
    else if ('a'<=c && c<='z'){
      c = (char)(((((int)c - 97) + k%26)%26)+97);
    }//fim minuscula

    //retorno
    return c;

  }//fim oneKeyCypher

  //decrypt
  public static void decrypt (String s){
    String r = "";

    for (int i=1; i<26; i++){
      for (int j=1; j<26; j++){
        r = encrypt(s, i, j);
        System.out.println(r);
      }
    }


  }//fim decrypt
}
