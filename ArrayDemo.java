public class ArrayDemo{
	
	public static void main(String ar[])
	{
		int[] anArray={100,200,300,400,500};
		System.out.println("2nd element "+anArray[2]);
		System.out.println(anArray.length);

		System.out.println();
		System.out.println("multi dimensional array");
		int[][] ages;
		ages=new int[4][5];

		ages[0][0]=00;
		ages[0][1]=01;
		ages[0][2]=02;
		ages[0][3]=03;
		ages[0][4]=04;

		ages[1][0]=10;
		ages[1][1]=11;
		ages[1][2]=12;
		ages[1][3]=13;
		ages[1][4]=14;

		ages[2][0]=20;
		ages[2][1]=21;
		ages[2][2]=22;
		ages[2][3]=23;
		ages[2][4]=24;

		ages[3][0]=30;
		ages[3][1]=31;
		ages[3][2]=32;
		ages[3][3]=33;
		ages[3][4]=34;
		
		ages[4][0]=30;
		ages[4][1]=31;
		ages[4][2]=32;
		ages[4][3]=33;
		ages[4][4]=34;


		System.out.print(ages[0][0]+"	");
		System.out.print(ages[0][1]+"	");
		System.out.print(ages[0][2]+"	");
		System.out.print(ages[0][3]+"	");
		System.out.println(ages[0][4]+"	");

		System.out.print(ages[1][0]+"	");
		System.out.print(ages[1][1]+"	");
		System.out.print(ages[1][2]+"	");
		System.out.print(ages[1][3]+"	");
		System.out.println(ages[1][4]+"	");

		System.out.print(ages[2][0]+"	");
		System.out.print(ages[2][1]+"	");
		System.out.print(ages[2][2]+"	");
		System.out.print(ages[2][3]+"	");
		System.out.println(ages[2][4]+"	");

		System.out.print(ages[3][0]+"	");
		System.out.print(ages[3][1]+"	");
		System.out.print(ages[3][2]+"	");
		System.out.print(ages[3][3]+"	");
		System.out.println(ages[3][4]+"	");
		
		System.out.print(ages[4][0]+"	");
		System.out.print(ages[4][1]+"	");
		System.out.print(ages[4][2]+"	");
		System.out.print(ages[4][3]+"	");
		System.out.println(ages[4][4]+"	");
	}
}
