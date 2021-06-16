package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	List<Goods> gList = new ArrayList<Goods>();
    	boolean flag = true;
    	int sum = 0;
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	while(flag) {
    		String goodsInfo = sc.nextLine();
    		
    		if(goodsInfo.equals("q")) {
    			flag = false;
    		} else {
    			String[] gArray = goodsInfo.split(",");
    			
    			String name = gArray[0];
    			int price = Integer.parseInt(gArray[1]);
    			int count = Integer.parseInt(gArray[2]);
    			Goods g = new Goods(name, price, count);
    			gList.add(g);
    		}
    		
    	}
    	System.out.println("[입력완료]");
    	System.out.println("========================");
    	
    	for( Goods gi : gList ) {
    		gi.showInfo();
    		sum = sum + gi.getCount();
    	}
    	System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
    	
    	sc.close();

       
    }

}
