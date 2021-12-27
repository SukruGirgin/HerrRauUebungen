package Workspace.Uebungen.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class uebungen
{
  public static int readInt(String text)
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print(text+": ");
    try
    {
      return Integer.parseInt(in.readLine());
    }
 
    //Fehlerbehandlung
    catch(IOException e)
    {
      System.out.println("IO error");
      return 1;
    }
    catch(NumberFormatException e)
    {
      System.out.println("NumberFormat error");
      return 1;
    }
  }
  
  
  public static void main(String[] args)
    {
      int sum=0;


    int monat=readInt("Monat  ");
    int day=1;

    switch(monat) {
    case 1: sum=0;
    break;

    case 2: sum=31;
    break;

    case 3: sum=59;
    break;

    case 4: sum=90;
    break;
    case 5: sum=120;
    break;

    case 6: sum=151;
    break;

    case 7: sum=181;
    break;

    case 8: sum=212;
    break;

    case 9: sum=243;
    break;

    case 10: sum=273;
    break;

    case 11: sum=304;
    break;

    case 12: sum=334;
    break;

    }

    sum=sum+day;

    if(sum%7==3)

    //wenn 01.01.2021  freitag (1%7=1) ist, dann 03.01.2021 sonntag  (3%7=3)
 
    
    System.out.println("01.0"+ monat+ " ist Sonntag");



    }



}