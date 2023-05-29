package assign;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
private String name ;
private int phone ;


List<Account>accountlist=new ArrayList<>();
List<Client>clientlist=new ArrayList<>();


public Bank(){}
public void setter(int x,String name) {
	this.name=name;
	this.phone=x;
}
public void display() {
	for (int count=0;count<accountlist.size();count++) {
	System.out.println( accountlist.get(count)+"\n");
	}
	
	for (int count=0;count<clientlist.size();count++) {
     System.out.println(clientlist.get(count)+"\n");
     }

}
public void addclient(Client x) {
		
	
	clientlist.add(x);
	accountlist.add(x.getAccount());
	
}
}

