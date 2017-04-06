package by.htp.string.launch;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s = "First String";
		System.out.println("s: " + s.hashCode());
		
		String s2 = "Second String";
		System.out.println("s2: " + s2.hashCode());
		
		
		
		String s3 = "First String";
		System.out.println("s3: " + s3.hashCode());
		
		System.out.println(s == s3);
		System.out.println(s.equals(s3));
		
		String s4 = s3;
		System.out.println("s4: " + s4.hashCode());
		
		String s5 = new String("Second String");
		System.out.println("s5: " + s5.hashCode());
		
		System.out.println(s2 == s5);
		System.out.println(s2.equals(s5));
		
		String s6 = new String();
		System.out.println("s6: " + s6.hashCode());
		
		String s7 = new String("");
		System.out.println("s7: " + s7.hashCode());
		
		
		String s8 = s5.intern();
		System.out.println(s2 == s8);
		System.out.println(s2.equals(s8));
		
		if (s5.isEmpty()) {
			
		}
		
		char[] data = new char[10];
		data[0] = 'a';
		data[1] = 'b';
		data[9] = 'c';
		String s9 = String.copyValueOf(data);
		System.out.println(s9);
		
		s9.length();
		System.out.println(s6.length());
		*/
		
		//1. В каждом слове текста k-ю букву заменить заданным символом. Если k
		//больше длины слова, корректировку не выполнять.
		int num = 7;
		String text = "I expect that the level of abstraction of our languages will continue to increase.";
		StringBuilder strB = new StringBuilder(text);
		String[] words = text.split("[,;:.!?\\s]+");
		
		for ( int i = 0; i < words.length; i++ ) {
			System.out.println(words[i]);
			if ( words[i].length() > num ) {
				StringBuilder s = new StringBuilder(words[i]);
				s.insert(num, '+');
				int ind = text.indexOf(words[i]);
				strB.replace(ind, ind + words[i].length(), s.toString());
			}
		}
		System.out.println(text);
		System.out.println(strB);
		
		//Удалить из текста его часть, заключенную между двумя символами,
		//которые вводятся (например, между скобками «(» и «)» или между звездочками «*» и т. п.).
		String text1 = "I expect that the level (of abstraction) of our languages will continue to increase.";

		System.out.println(text1);
		String textNew1 = text1.replaceAll("\\([^)]+\\)", "");

		System.out.println(textNew1);
		
	}

}
