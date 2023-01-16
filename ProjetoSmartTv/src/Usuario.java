public class Usuario {
    public static void main(String[] args) throws Exception {

        ProjetoSmart projetoSmart = new ProjetoSmart();
        projetoSmart.ligar ();
        System.out.println("Novo Status -> Tv ligada? " + projetoSmart.ligada);


        projetoSmart.desligar ();
        System.out.println("Novo Status -> Tv ligada? " + projetoSmart.ligada);

        System.out.println("Tv esta ligada? " + projetoSmart.ligada);
        
        projetoSmart.diminuirVolume();
        projetoSmart.diminuirVolume();
        projetoSmart.diminuirVolume();
        projetoSmart.aumentarVolume();
        System.out.println("Qual o volume atual? " + projetoSmart.volume);

        System.out.println("Qual o canal? " + projetoSmart.canal);
        projetoSmart.mudarCanal(15);
        System.out.println("Qual o canal? " + projetoSmart.canal);

        projetoSmart.aumentarCanal();
        System.out.println("aumentou o canal " + projetoSmart.canal);

        projetoSmart.diminuirCanal();
        System.out.println("diminiu o canal " + projetoSmart.canal); 

        
        
      


      
      
      
      
      


    
    }
        

}

