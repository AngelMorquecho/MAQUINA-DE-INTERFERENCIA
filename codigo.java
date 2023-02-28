mport java.util.Scanner;


public class Adivina_animal {
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
          int ac,terr,semi,ave,ins,h,d,f,l,dep,dom,p,pan,ex,map,jir,tor,insec,mos;
          int opcion,pin,pin1;
          String le;
        
          System.out.println("1.Es Acuatico?");
        
          System.out.println("2.es terrestre");
       
          System.out.println("3.es semiacuatico");
         
          System.out.println("4.es ave o volador");
         
          System.out.println("5.es insecto");
          
          
          System.out.println("cual es tu opcion");
          opcion=leer.nextInt();
          
          switch(opcion){
              
              case 1:
                 
                  System.out.println("es un depredador?");
                  ac=leer.nextInt();
                  
                  if(ac==1){
                      System.out.println("es un tiburon");
                  }else{
                      System.out.println("tiene huesos?");
                      h=leer.nextInt();
                      if(h==1){
                          System.out.println("es un animal cosidero el mas inteligente");
                          d=leer.nextInt();
                          
                          if(d==1){
                              System.out.println("es delfin");
                          }else{
                              System.out.println("es una vaquita marina");
                          }
                          
                      }else{
                          System.out.println("es una medusa");
                      }
                  }
                  break;
              case 2:
                  
                  System.out.println("el animal es domestico?");
                  dom=leer.nextInt();
                  
                  if(dom==1){
                      System.out.println("ladra?");
                      l=leer.nextInt();
                      
                      if(l==1){
                          System.out.println("es un perro");
                      }else{
                          System.out.println("es felino?");
                          f=leer.nextInt();
                          if(f==1){
                              System.out.println("es un gato");
                              
                          }else{
                              
                              System.out.println("es un conejo ");
                          }
                      }
                  }else{
                      
                      System.out.println("es un depredador");
                      dep=leer.nextInt();
                      if(dep==1){
                          
                          System.out.println("con cual letra empieza");
                          le=leer.next();
                          
                          if(le.equals("o")){
                              System.out.println("es un oso");
                          }else  if(le.equals("t")){
                              System.out.println("es un trigre");
                          }else  if(le.equals("l")){
                              System.out.println("tiene pelaje grande y robusto ");
                              p=leer.nextInt();
                              
                              if(p==1){
                                  System.out.println("es leon");
                              }else{
                                  System.out.println("es leopardo");
                              }
                          }else  if(le.equals("p")){
                              System.out.println("su segunad letra es a");
                              pan=leer.nextInt();
                              
                              if(pan==1){
                                  System.out.println("es una pantera");
                              }else{
                                  System.out.println("es un puma");
                              }
                          }
                      }else{
                          System.out.println("esta extinto?");
                          ex=leer.nextInt();
                          
                          if(ex==1){
                              System.out.println("es un mamut");
                              
                          }else{
                              System.out.println("tiene el cuello largo");
                              jir=leer.nextInt();
                              
                              if(jir==1){
                                  System.out.println("es una jirafa");
                                  
                              }else{
                                  System.out.println("alrededor de sus ojos tiene negro");
                                  map=leer.nextInt();
                                  
                                  if(map==1){
                                      
                                      System.out.println("es un mapache");
                                      
                                  }else{
                                      System.out.println("es una ardilla ");
                                  }
                                  
                              }
                          }
                      }
                      
                     
                  }
                  break;
                  
              case 3:
                  System.out.println("tiene caparazon");
                  tor=leer.nextInt();
                  
                  if(tor==1){
                      System.out.println("es una tortuga");
                  }else {
                      System.out.println("su color es blanco con negro?");
                      pin=leer.nextInt();
                      if(pin==1){
                          System.out.println("es un pinguino");
                      }else{
                          System.out.println("es una foca ");
                      }
                  }
                  
                  break;
              case 4:
                   System.out.println("es un insecto o pequeño?");
                  insec=leer.nextInt();
                  
                  if(insec==1){
                      System.out.println("le gusta estar en la caca");
                      mos=leer.nextInt();
                      if(mos==1){
                          System.out.println("es una mosca");
                      }else{
                          System.out.println("es una mariposa");
                      }
                  }else{
                       System.out.println("se encuantra en el hielo normalmente?");
                  pin1=leer.nextInt();
                  
                  if(pin1==1){
                      System.out.println("es un pinguino");
                  }else{
                      System.out.println("es un gallo");
                  }
                 
                  }
                break;  
                 
          }
          
         
        
          
        
         
      }
}
