import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class lotto {
	public void start()
	{
		System.out.println("Program do symulacji lotto");
		System.out.println("Wpisz 3 liczby od 1 do 6");
	}
	public int[] wpisz()
	{
		Scanner input = new Scanner(System.in);
		int[] liczby = new int[3];
		for (int i=0; i< liczby.length; i++)
		{
			liczby[i]=input.nextInt();
		}
		while(liczby[0] == liczby[1] || liczby[1] == liczby[2] || liczby [0] == liczby[2]){
		if (liczby[0]==liczby[1]){
			System.out.println("Podaj ró¿ne liczby! Wpisz jeszcze raz liczbe: ");
			liczby[1] = input.nextInt();
		}
		if (liczby[1]==liczby[2]){
			System.out.println("Podaj ró¿ne liczby! Wpisz jeszcze raz liczbe: ");
			liczby[2] = input.nextInt();
		}
		if (liczby[0]==liczby[2]){
			System.out.println("Podaj ró¿ne liczby! Wpisz jeszcze raz liczbe: ");
			liczby[0] = input.nextInt();
		}
		}
		return liczby;
	}
	public int[] losowanie()
	{
		Random generator = new Random();
		int[] x = new int[3];
		x[0]=0;
		x[1]=0;
		x[2]=0;
		while (x[0] == x[1] || x[1] == x[2] || x[2]==x[0])
		{
		for(int i=0;i<3;i++)
		{
			x[i]= generator.nextInt(6)+1;
		}
		}
		return x;
	}
	public void porownanie(){
		int wpisane[]= wpisz();
		int wylosowane[] = losowanie();
		System.out.println("Wylosowane liczby: ");
		for (int i=0; i<wpisane.length;i++){
			System.out.print(wylosowane[i]+"\t");
		}
		int suma=0;
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (wpisane[i]==wylosowane[j])
				{
					suma++;
					break;
				}
			}
			
		}
		System.out.println("Liczba trafionych cyfr " + suma + " Gratuluje!" );
	}
}
