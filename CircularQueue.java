package com.jspider;

import java.util.Scanner;

class Queue{
	int queue[];
	int n;
	int front,rear;
	Queue(int n){
		queue=new  int[n];
		this.n=n;
		rear=-1;
		front=-1;
		
	}
	public boolean isEmpty() {
		return (front==-1 || rear==-1);
	}
	public boolean isFull() {
		return ((rear+1)%n==front);
	}
	public void enqueue(int data) {
		if(isFull())
			System.out.println("Queue is Overflow");
		else {
			if(isEmpty()) {
				rear=0;
				front=0;
				queue[rear]=data;
				System.out.println(data+" inserted Successfully");
			}
			else {
				rear=(rear+1)%n;
				queue[rear]=data;
				System.out.println(data+" is inserted successfully");
				
			}
		}
	}
	public void dequeue() {
		if(isEmpty())
			System.out.println("Queue is Underflow");
		else {
			if(rear==front) {
				System.out.println(queue[front]+" Deleted Succesfully");
				front=-1;
				rear=-1;
			}
			else {
				
				System.out.println(queue[front]+"Deleted Successfully");
				front=(front+1)%n;
			}
		}
	}
	
}

public class CircularQueue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Queue: ");
		int n=sc.nextInt();
		Queue q=new Queue(n);
		boolean b=true;
		while(b) {
			System.out.println("===================");
			System.out.println("Enter the Choice \n1.Empty\n2.Full\n3.Enqueue\n4.Dequeue\n5.Exit");
			int choice=sc.nextInt();
			System.out.println("===================");
			if(choice==1) {
				System.out.println(q.isEmpty());
				
			}
			if(choice==2) {
				System.out.println(q.isFull());
				
			}
			if(choice==3) {
				System.out.print("Enter the Data: ");
				int data=sc.nextInt();
				q.enqueue(data);
				
			}
			if(choice==4) {
				q.dequeue();
				
			}
			
		}
		

	}

}
