



public class MainClass
{
	
		public static void main(String [] args)

		{

			

			Mammal[] mammalList = new Mammal[6]	;
			//double aWeight, double aHeight, String aColor, String aSize
			for (int i = 0; i < 5; i++)
			{
				
				

				if(i % 2 == 0)
				{
					Monkey monkey = new Monkey(80.0, 3.0, "Brown " + i, "Small");
					mammalList[i] = monkey;
					System.out.println(monkey.toString());
				}
				else
				{
					Cat cat = new Cat(8.0, 1.0, "White " + i, true);
					mammalList[i] = cat;
					System.out.println(cat.toString());
				}


			}


			//System.out.println(Animal.animalCount);
			System.out.println(Cat.catCounter);
			

			


		}








}