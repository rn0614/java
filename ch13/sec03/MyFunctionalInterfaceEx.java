package ch13.sec03;

import ch13.sec03.MyFunctionalInterface;

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		fi=(x,y)->{
			int result = x+y;
			return ;
		};
		fi.method(2, 5);
		
	}
	
	public static int sum(int x, int y){
		return (x+y); 
	};

}
