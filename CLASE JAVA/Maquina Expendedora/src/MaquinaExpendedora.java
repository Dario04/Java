import java.util.Scanner;

public class MaquinaExpendedora {

	public static void main(String[] args) {
	}
		public static void ImprimirMenu (){
	        Scanner sc = new Scanner (System.in);
	        int cant, nuevoP, Opciones;
	        do{
	            System.out.println ("1. Usuario");
	            System.out.println ("2. Administrador");
	            System.out.println ("3. Finalizar\n");
	            Producto Producto=new Producto();
	            Opciones = sc.nextInt();
	            switch (Opciones) {
	                case 1:{
	                    do{
	                        System.out.println("1. Beldent");
	                        System.out.println("2. Alfajor");
	                        System.out.println("3. Pepas");
	                        System.out.println("4. Doritos");
	                        System.out.println("5. Regresar");
	                        System.out.println("¿Que producto quiere Señor Stark?");
	                        Opciones=sc.nextInt();
	                        switch(Opciones){
	                            case 1:{
	                                System.out.println("Hay " + Producto.cantidadBel + " Beldents");
	                                System.out.println("Precio: "+Producto.precioBel);
	                                System.out.println("¿Cuantos productos desea comprar?");
	                                cant = sc.nextInt();
	                                Producto.vendidoBel=Producto.vendidoBel+cant;
	                                Producto.cantidadBel=Producto.cantidadBel-cant;
	                                Producto.totalBel=Producto.precioBel*cant;
	                                Producto.gananciaBel=Producto.gananciaBel+Producto.totalBel;
	                                System.out.println("Compra exitosa: "+cant+" Beldents");
	                                System.out.println("Total: "+Producto.totalBel);
	                                System.out.println("¿Quiere comprar otro producto? SI/NO");
	                                Opciones = sc.nextInt ();
	                                break;
	                            }
	                            case 2:{
	                                System.out.println("Hay "+Producto.cantidadAlf+" Alfajor");
	                                System.out.println("Precio: "+Producto.precioAlf);
	                                System.out.println("¿Cuantos productos desea comprar?");
	                                cant = sc.nextInt();
	                                Producto.vendidoAlf=Producto.vendidoAlf+cant;
	                                Producto.cantidadAlf=Producto.cantidadAlf-cant;
	                                Producto.totalAlf=Producto.precioAlf*cant;
	                                Producto.gananciaAlf=Producto.gananciaAlf+Producto.totalAlf;
	                                System.out.println("Compra exitosa: "+cant+" Alfajores");
	                                System.out.println("Total: "+Producto.totalAlf);
	                                System.out.println("¿Quiere comprar otro producto? SI/NO");
	                                Opciones = sc.nextInt ();
	                                break;
	                            }
	                            case 3:{
	                                System.out.println("Hay "+Producto.cantidadPe+" Pepas");
	                                System.out.println("Precio: "+Producto.precioPe);
	                                System.out.println("¿Cuantos productos desea comprar?");
	                                cant = sc.nextInt();
	                                Producto.vendidoPe=Producto.vendidoPe+cant;
	                                Producto.cantidadPe=Producto.cantidadPe-cant;
	                                Producto.totalPe=Producto.precioPe*cant;
	                                Producto.gananciaPe=Producto.gananciaPe+Producto.totalPe;
	                                System.out.println("Compra exitosa: "+cant+" Pepas");
	                                System.out.println("Total: "+Producto.totalPe);
	                                System.out.println("¿Quiere comprar otro producto? SI/NO");
	                                Opciones = sc.nextInt ();
	                                break;
	                            }
	                            case 4:{
	                                System.out.println("Hay "+Producto.cantidadDor+" Doritos");
	                                System.out.println("Precio: "+Producto.precioDor);
	                                System.out.println("¿Cuantos productos desea comprar?");
	                                cant = sc.nextInt();
	                                Producto.vendidoDor=Producto.vendidoDor+cant;
	                                Producto.cantidadDor=Producto.cantidadDor-cant;
	                                Producto.totalDor=Producto.precioDor*cant;
	                                Producto.gananciaDor=Producto.gananciaDor+Producto.totalDor;
	                                System.out.println("Compra exitosa: "+cant+" Doritos");
	                                System.out.println("Total: "+Producto.totalDor);
	                                System.out.println("¿Quiere comprar otro producto? SI/NO");
	                                Opciones = sc.nextInt ();
	                                break;
	                            }
	                            case 5:{
	                                Opciones=2;
	                                System.out.println("\n");
	                                break;
	                            }
	                            default: {
	                                System.out.println("Pon una opcion valida");
	                            }
	                        }
	                    }while(Opciones!=2);
	                    break;
	                }
	                case 2:{
	                    do{
	                      System.out.println ("1. Agregar cantidad"); 
	                      System.out.println ("2. Cambiar precio");
	                      System.out.println ("3. Cantidad de ventas y ganancia");
	                      System.out.println ("¿Que opcion desea señor Stark?");
	                      Opciones = sc.nextInt();
	                      switch (Opciones){
	                          case 1:{
	                              do {
	                              System.out.println("1. Beldents");
	                              System.out.println("2. Alfajor");
	                              System.out.println("3. Pepas");
	                              System.out.println("4. Doritos");
	                              System.out.println("5. Regresar");
	                              System.out.println ("¿Que opcion desea señor Stark?");
	                              Opciones = sc.nextInt();
	                              switch(Opciones){
	                                  case 1:{
	                                      System.out.println("Hay "+Producto.cantidadBel+" Beldents");
	                                      System.out.println("Agregar: ");
	                                      cant = sc.nextInt();
	                                      Producto.cantidadBelT=Producto.cantidadBel+cant;
	                                      Producto.cantidadBel=Producto.cantidadBel+cant;
	                                      System.out.println("¿Agregar cantidad para otro producto? SI/NO");
	                                      Opciones = sc.nextInt();
	                                      break;
	                                  }
	                                  case 2:{
	                                      System.out.println("Hay "+Producto.cantidadAlf+" Alfajores");
	                                      System.out.println("Agregar: ");
	                                      cant = sc.nextInt();
	                                      Producto.cantidadAlfT=Producto.cantidadAlf+cant;
	                                      Producto.cantidadAlf=Producto.cantidadAlf+cant;
	                                      System.out.println("¿Agregar cantidad para otro producto? SI/NO");
	                                      Opciones = sc.nextInt();
	                                      break;
	                                  }
	                                  case 3:{
	                                      System.out.println("Hay "+Producto.cantidadPe+" Pepas");
	                                      System.out.println("Agregar: ");
	                                      cant = sc.nextInt();
	                                      Producto.cantidadPeT=Producto.cantidadPe+cant;
	                                      Producto.cantidadPe=Producto.cantidadPe+cant;
	                                      System.out.println("¿Agregar cantidad para otro producto? SI/NO");
	                                      Opciones = sc.nextInt();
	                                      break;
	                                  }
	                                  case 4:{
	                                      System.out.println("Hay "+Producto.cantidadDor+" Doritos");
	                                      System.out.println("Agregar: ");
	                                      cant = sc.nextInt();
	                                      Producto.cantidadDorT=Producto.cantidadDor+cant;
	                                      Producto.cantidadDor=Producto.cantidadDor+cant;
	                                      System.out.println("¿Agregar cantidad para otro producto? SI/NO");
	                                      Opciones = sc.nextInt();
	                                      break;
	                                  }
	                                  case 5:{
	  	                                Opciones=2;
	  	                                System.out.println("\n");
	  	                                break;
	  	                            }
	  	                            default: {
	  	                            	System.out.println("Pon una opcion valida");
	  	                            }
	  	                        }
	  	                    }while(Opciones!=2);
	  	                    break;
	                          }
	                          case 2:{
	                              do{
	                                 System.out.println("1. Beldents");
	                                 System.out.println("2. Alfajor");
	                                 System.out.println("3. Pepas");
	                                 System.out.println("4. Doritos");
	                                 System.out.println("5. Regresar");
	                                 System.out.println ("¿Que opcion desea señor Stark?");
	                                 Opciones = sc.nextInt();
	                                 switch(Opciones){
	                                     case 1:{
	                                         System.out.println("Precio actual: "+Producto.precioBel);
	                                         System.out.println("Cambiar: ");
	                                         nuevoP = sc.nextInt();
	                                         Producto.precioBel=nuevoP;
	                                         System.out.println("¿Cambiar precio de otro producto? SI/NO");
	                                         Opciones = sc.nextInt();
	                                         break;  
	                                     }
	                                     case 2:{
	                                         System.out.println("Precio actual: "+Producto.precioAlf);
	                                         System.out.println("Cambiar: ");
	                                         nuevoP = sc.nextInt();
	                                         Producto.precioAlf=nuevoP;
	                                         System.out.println("¿Cambiar precio de otro producto? SI/NO");
	                                         Opciones = sc.nextInt();
	                                         break;
	                                     }
	                                     case 3:{
	                                         System.out.println("Precio actual: "+Producto.precioPe);
	                                         System.out.println("Cambiar: ");
	                                         nuevoP = sc.nextInt();
	                                         Producto.precioPe=nuevoP;
	                                         System.out.println("¿Cambiar precio de otro producto? SI/NO");
	                                         Opciones = sc.nextInt();
	                                         break;
	                                     }
	                                     case 4:{
	                                         System.out.println("Precio actual: "+Producto.precioDor);
	                                         System.out.println("Cambiar: ");
	                                         nuevoP = sc.nextInt();
	                                         Producto.precioDor=nuevoP;
	                                         System.out.println("¿Cambiar precio de otro producto? SI/NO");
	                                         Opciones = sc.nextInt();
	                                         break;
	                                     }
	                                     case 5:{
	 	  	                                Opciones=2;
	 	  	                                System.out.println("\n");
	 	  	                                break;
	 	  	                            }
	 	  	                            default: {
	 	  	                            	System.out.println("Pon una opcion valida");
	 	  	                            }
	 	  	                        }
	 	  	                    }while(Opciones!=2);
	 	  	                    break;
	                          }
	                          case 3:{
	                              do{
	                              Producto.porcentajeBel=(Producto.vendidoBel*100)/Producto.cantidadBelT;
	                              Producto.porcentajeAlf=(Producto.vendidoAlf*100)/Producto.cantidadAlf;
	                              Producto.porcentajePe=(Producto.vendidoPe*100)/Producto.cantidadPe;
	                              Producto.porcentajeDor=(Producto.vendidoDor*100)/Producto.cantidadDor;
	                              System.out.println("Cantidad y porcentaje de ventas:");
	                              System.out.println("Beldents: "+Producto.vendidoBel+" "+Producto.porcentajeBel);
	                              System.out.println("Alfajor: "+Producto.vendidoAlf+" "+Producto.porcentajeAlf);
	                              System.out.println("Pepas: "+Producto.vendidoPe+" "+Producto.porcentajePe);
	                              System.out.println("Doritos: "+Producto.vendidoDor+" "+Producto.porcentajeDor);
	                              System.out.println("Ganancias:");
	                              System.out.println("Beldents: "+Producto.gananciaBel);
	                              System.out.println("Alfajor: "+Producto.gananciaAlf);
	                              System.out.println("Pepas: "+Producto.gananciaPe);
	                              System.out.println("Doritos: "+Producto.gananciaDor);
	                              System.out.println("¿Desea regresar? SI/NO");
	                              Opciones=sc.nextInt();
	                              }while(Opciones!=1);
	                              break;
	                          }
	                          default:{
	                        	  System.out.println("Pon una opcion valida");
	                          }
	                      }
	                    }while (Opciones!=2);
	                    
	                    break;
	                }
	                case 3:{
	                    System.out.println("Gracias por su compra");
	                    break;
	                }
	                default:{
	                    System.out.println("Digite una opcion valida\n");
	                }
	            }
	        }while(Opciones!=3);
	    }
	}