package grp15;

import java.util.Scanner;

public class TreeClient {

	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		t.display();
		Scanner sc = new Scanner(System.in);
		//int x = sc.nextInt();
		//System.out.println(t.find(x));
		System.out.println(t.max());
		System.out.println(t.height());
	}

}
