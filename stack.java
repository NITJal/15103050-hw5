import java.util.*;
public class Stack {
	public ArrayList<Integer> alist ;
	public void push(int a)
	{
		alist.add(a);
	}

	public int pop()
	{
		int a = alist.get(alist.size()-1);
		alist.remove(alist.size()-1);
		return a;
	}
	public void display()
	{
		int l = alist.size();
		System.out.print("Elements in Stack are ");
		for(int i=0; i<l; i++)
		{
			System.out.print(alist.get(i)+"  ");
		}
		System.out.println();
	}
	public Stack(){
		alist = new ArrayList<Integer>();
	}
	public static void main(String arg[])
	{
	Stack s=new Stack();
	Scanner sc=new Scanner(System.in);
	System.out.println("Choices: 1 for Push\n 2 for pop\n3 for display\n4 for exit");
	while(true)
	{


	int number=sc.nextInt();

	switch(number)
	{
	case 1:
    System.out.println("Enter Number");
    int a=sc.nextInt();
    s.push(a);
    break;

    case 2:
    s.pop();
    break;

    case 3:
    s.display();
    break;
    case 4:
    System.exit(0);

    default:System.out.println("Enter either 1 or 2 or 3 or 4");
	}
	}
    }
}
