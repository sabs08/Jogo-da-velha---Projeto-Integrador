
package com.mycompany.curto;

import java.util.Scanner;

public class new_velha {
    static String idioma = "POR";
    
    public static int menu(){
        Scanner scan = new Scanner (System.in);
        int i;
        if(idioma.equals( "POR")){
            System.out.println("(1) instruçoes");
            System.out.println("(2) jogar");
            System.out.println("(3) creditos");
            System.out.println("(4) idioma");
            System.out.println("(5) sair");
        }else if(idioma .equals( "ING")){
            System.out.println("(1) instructions");
            System.out.println("(2) play");
            System.out.println("(3) credits");
            System.out.println("(4) language");
            System.out.println("(5) leave");
        }else{
            System.out.println("(1) instrucciones");
            System.out.println("(2) jugar");
            System.out.println("(3) créditos");
            System.out.println("(4) idioma");
            System.out.println("(5) dejar");
        }            
            i = scan.nextInt();           
        return i;
    }
    
    public static void controlador(int i){ 
        switch(i){
            case 1:instruçoes();
            break;
            case 2:jogar();
            break;
            case 3:creditos();
            break;
            case 4:idioma();
            break;
            case 5:{
                if(idioma .equals( "POR")){
                    System.out.println("obrigado por jogar!");
                }else if(idioma .equals( "ING")){
                    System.out.println("thanks for playing!");
                }else{
                    System.out.println("¡gracias por jugar!");
                }
            }
            break;
            default:{
                if(idioma .equals( "POR")){
                    System.out.println("opçao inexistente, tente novamente");
                }else if(idioma .equals( "ING")){
                    System.out.println("option does not exist, try again");
                }else{
                    System.out.println("la opción no existe, inténtalo de nuevo");
                }
            }
        }       
    }

    public static void instruçoes() {
        if(idioma .equals( "POR")){
            System.out.println("escolha a posiçao em que deseja jogar escolhendo o numero da posiçao");
        }else if(idioma .equals( "ING")){
            System.out.println("choose the position you want to play in by choosing the position number");
        }else{
            System.out.println("elige la posición en la que quieres jugar eligiendo el número de posición");
        }
        String exemplo[][] = {
                {"1","2","3"},
                {"4","5","6"},
                {"7","8","9"}};
        PrintVelha(exemplo);
    }
    
    public static void creditos(){
        if(idioma .equals( "POR")){
            System.out.println("desenvolvido por:"); 
            System.out.println("GUILHERME CURT0 NEMETI");
            System.out.println("ALMIR ATIE DIAS");
            System.out.println("SABRINA COSTA E SILVA");
            System.out.println("LETICIA MOREIRA");
        }else if(idioma .equals( "ING")){
            System.out.println("developed by:"); 
            System.out.println("GUILHERME CURT0 NEMETI");
            System.out.println("ALMIR ATIE DIAS");
            System.out.println("SABRINA COSTA E SILVA"); 
            System.out.println("LETICIA MOREIRA");
        }else{
            System.out.println("desarrollado por:"); 
            System.out.println("GUILHERME CURT0 NEMETI");
            System.out.println("ALMIR ATIE DIAS");
            System.out.println("SABRINA COSTA E SILVA"); 
            System.out.println("LETICIA MOREIRA");
        }       
    }
    
    public static void idioma(){
        int opcao;
        Scanner scan = new Scanner (System.in);
        do{
            if(idioma .equals( "POR")){
                System.out.println("escolha o idioma:");
                System.out.println("(1) Portugues");
                System.out.println("(2) Ingles");
                System.out.println("(3) Espanhol");
                System.out.println("(4) Voltar");
            }else if(idioma .equals( "ING")){
                System.out.println("choose language:");
                System.out.println("(1) Portuguese");
                System.out.println("(2) English");
                System.out.println("(3) Spanish");
                System.out.println("(4) back");
            }else{
                System.out.println("elige lengua:");
                System.out.println("(1) portugués");
                System.out.println("(2) inglés");
                System.out.println("(3) Español");
                System.out.println("(4) volver");
            }
            
            opcao = scan.nextInt();
            switch (opcao) {
                case 1 : idioma = "POR"; 
                break;
                case 2 : idioma = "ING"; 
                break;
                case 3 : idioma = "ESP";
                break;
                case 4 : System.out.println("");
                break;
                default :{
                    if(idioma .equals( "POR")){
                        System.out.println("opçao invalida");
                    }else if(idioma .equals( "ING")){
                        System.out.println("invalid option");
                    }else{
                        System.out.println("opción inválida");
                    }
                }
            }   
        }while(opcao<1 || opcao>4);
    }
    
    public static int posiçao(String jogador){
        Scanner scan = new Scanner (System.in);
        if(idioma .equals( "POR")){
            System.out.println(jogador+" sua vez, escolha a posiçao:");
        }else if(idioma .equals( "ING")){
            System.out.println(jogador+" It's your turn, choose the position:");
        }else{
            System.out.println(jogador+" Es tu turno, elige la posición:");
        }
            return scan.nextInt();
    }
    public static boolean check_posiçao(int posiçao, String velha[][]){
        boolean livre = true;
        switch(posiçao){
                case 1:
                    if(velha[0][0] .equals( "X") || velha[0][0] .equals( "O")){
                        livre = false;
                    }
                    break;
                case 2:
                    if(velha[0][1] .equals( "X") || velha[0][1] .equals( "O")){
                        livre = false;
                    }
                    break;
                case 3:
                    if(velha[0][2] .equals( "X") || velha[0][2] .equals( "O")){
                        livre = false;
                    }
                    break;
                case 4:
                    if(velha[1][0] .equals( "X") || velha[1][0] .equals( "O")){
                        livre = false;
                    }
                    break;
                case 5:
                    if(velha[1][1] .equals( "X") || velha[1][1] .equals( "O")){
                        livre = false;
                    }
                    break;
                case 6:
                    if(velha[1][2] .equals ("X") || velha[1][2] .equals ("O")){
                        livre = false;
                    }
                    break;
                case 7:
                    if(velha[2][0] .equals ("X") || velha[2][0] .equals ("O")){
                        livre = false;
                    }
                    break;
                case 8:
                    if(velha[2][1] .equals ("X") || velha[2][1] .equals ("O")){
                        livre = false;
                    }
                    break;
                case 9:
                    if(velha[2][2] .equals ("X") || velha[2][2] .equals ("O")){
                        livre = false;
                    }
                    break;
            }
        return livre;
    }
    public static void jogar(){
        boolean livre;
        int posicao;
        Scanner scan = new Scanner (System.in);
        if(idioma .equals ("POR")){
            System.out.println("primeiro jogador: ");
        }else if(idioma .equals ("ING")){
            System.out.println("first player: ");
        }else{
            System.out.println("primer jugador: ");
        }
        String P1 = scan.next();
        if(idioma .equals ("POR")){
            System.out.println("segundo jogador: ");
        }else if(idioma .equals ("ING")){
            System.out.println("second player: ");
        }else{
            System.out.println("segundo jugador: ");
        }
        String P2 = scan.next();
        int jogada;
        int njogadas=0;
        boolean vitoria=false;
        String velha[][] = {
                        {" "," "," "},
                        {" "," "," "},
                        {" "," "," "}};
        do{
            PrintVelha(velha);           
            do{
                posicao = posiçao(P1);
                livre=check_posiçao(posicao, velha);                            
                if(livre == false){
                    if(idioma .equals ("POR")){
                        System.out.println("posiçao já ocupada, tente outra ");
                    }else if(idioma .equals ("ING")){
                        System.out.println("position already occupied, try another ");
                    }else{
                        System.out.println("posición ya ocupada, pruebe con otra ");
                    }           
                }
            }while(livre == false);
            switch(posicao){
                case 1:velha[0][0]= "X";
                break;
                case 2:velha[0][1]= "X";
                break;
                case 3:velha[0][2]= "X";
                break;
                case 4:velha[1][0]= "X";
                break;
                case 5:velha[1][1]= "X";
                break;
                case 6:velha[1][2]= "X";
                break;
                case 7:velha[2][0]= "X";
                break;
                case 8:velha[2][1]= "X";
                break;
                case 9:velha[2][2]= "X";
            }
            if(velha[0][0].equals("X")&&velha[0][1].equals("X")&&velha[0][2].equals("X")||velha[1][0].equals("X")&&velha[1][1].equals("X")&&velha[1][2].equals("X")||velha[02][0].equals("X")&&velha[2][1].equals("X")&&velha[2][2].equals("X")||velha[0][0].equals("X")&&velha[1][0].equals("X")&&velha[2][0].equals("X")||velha[0][1].equals("X")&&velha[1][1].equals("X")&&velha[2][1].equals("X")||velha[0][2].equals("X")&&velha[1][2].equals("X")&&velha[2][2].equals("X")||velha[0][0].equals("X")&&velha[1][1].equals("X")&&velha[2][2].equals("X")||velha[2][0].equals("X")&&velha[1][1].equals("X")&&velha[0][2].equals("X")){
                vitoria=true;
                PrintVelha(velha);
                if(idioma .equals ("POR")){
                    System.out.println("PARABENS! "+P1+" vc é o vencedor");
                }else if(idioma .equals ("ING")){
                    System.out.println("CONGRATULATIONS! "+P1+" you are the winner");
                }else{
                    System.out.println("EN HORA BUENA! "+P1+" eres el ganador");
                }              
                System.out.println("\n");
            }else{       
                PrintVelha(velha);
            }                
            if(njogadas<4&&!vitoria){
                do{
                    posicao = posiçao(P2);
                    livre=check_posiçao(posicao, velha);                            
                    if(livre == false){
                        if(idioma .equals ("POR")){
                            System.out.println("posiçao já ocupada, tente outra ");
                        }else if(idioma .equals ("ING")){
                            System.out.println("position already occupied, try another ");
                        }else{
                            System.out.println("posición ya ocupada, pruebe con otra ");
                        }           
                    }
                }while(livre == false);
                switch(posicao){
                    case 1:velha[0][0]= "O";
                    break;
                    case 2:velha[0][1]= "O";
                    break;
                    case 3:velha[0][2]= "O";
                    break;
                    case 4:velha[1][0]= "O";
                    break;
                    case 5:velha[1][1]= "O";
                    break;
                    case 6:velha[1][2]= "O";
                    break;
                    case 7:velha[2][0]= "O";
                    break;
                    case 8:velha[2][1]= "O";
                    break;
                    case 9:velha[2][2]= "O";
                }
                if(velha[0][0].equals("O")&&velha[0][1].equals("O")&&velha[0][2].equals("O")||velha[1][0].equals("O")&&velha[1][1].equals("O")&&velha[1][2].equals("O")||velha[02][0].equals("O")&&velha[2][1].equals("O")&&velha[2][2].equals("O")||velha[0][0].equals("O")&&velha[1][0].equals("O")&&velha[2][0].equals("O")||velha[0][1].equals("O")&&velha[1][1].equals("O")&&velha[2][1].equals("O")||velha[0][2].equals("O")&&velha[1][2].equals("O")&&velha[2][2].equals("O")||velha[0][0].equals("O")&&velha[1][1].equals("O")&&velha[2][2].equals("O")||velha[2][0].equals("O")&&velha[1][1].equals("O")&&velha[0][2].equals("O")){
                    vitoria=true;
                    PrintVelha(velha);
                    if(idioma .equals ("POR")){
                        System.out.println("PARABENS! "+P2+" vc é o vencedor");
                    }else if(idioma .equals ("ING")){
                        System.out.println("CONGRATULATIONS! "+P2+" you are the winner");
                    }else{
                        System.out.println("EN HORA BUENA! "+P2+" eres el ganador");
                    }
                }
            }
            njogadas++;
        }while(njogadas<5&&!vitoria);
    }
    public static void PrintVelha(String velha[][]){
        for(int i=0; i<3; i++){
            for(int f=0; f<3; f++){
                if(f>0){
                    System.out.printf(" | "+velha[i][f]);
                }else{
                    System.out.printf(velha[i][f]);
                }
            }
            if(i<2){
                System.out.println("\n--|---|--");
            }
        }
        System.out.println("\n");
    }
            
    public static void main(String[] args) {
       int i;
        do{
            i = menu();
            controlador(i);
        }while(i!= 5);        
    } 
}