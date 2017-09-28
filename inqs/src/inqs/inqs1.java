package inqs;

public class inqs1 {
		int id;
		String name;
		inqs1(int i,String n)
		{
			id=i;
			name=n;
		}
		inqs1(inqs1 s)
		{
			id=s.id;
			name=s.name;
		}
		void display()
		{
			System.out.println(id+""+name);
		}
		public static void main(String args[])
		{
			inqs1 s1=new inqs1(110,"P");
			inqs1 s2=new inqs1(s1);
			s1.display();
			s2.display();
		}

}
