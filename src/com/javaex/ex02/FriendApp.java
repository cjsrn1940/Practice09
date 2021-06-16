package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	List<Friend> fList = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	for(int i=0; i<3; i++) {
    		String info = sc.nextLine();
    		String[] iArray = info.split(" ");
    		Friend f = new Friend(iArray[0],iArray[1],iArray[2]);
    		fList.add(f);
    	}
    	
    	for(Friend frd : fList) {
    		frd.showInfo();
    	}
    		
    	
    	sc.close();
    	
    	
    }

}
