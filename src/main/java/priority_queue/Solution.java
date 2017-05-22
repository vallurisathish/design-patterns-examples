package priority_queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student{
    private int token;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>(totalEvents, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.getCgpa() < s2.getCgpa())
                    return 100;
                else if (s1.getCgpa() > s2.getCgpa())
                    return -100;
                else {
                    // same cgpa
                    if (!s1.getFname().equals(s2.getFname()))
                        return s1.getFname().compareTo(s2.getFname());
                    else {
                        // same name
                        return s1.getToken() - s2.getToken();
                    }
                }
            }
        });
        while(totalEvents>0){
            String event = in.nextLine();
            String[] inps = event.split(" ");
            if(inps[0].equals("ENTER")) {
                Student student = new Student(Integer.parseInt(inps[3].trim()),inps[1],Double.parseDouble(inps[2].trim
                        ()));
                priorityQueue.add(student);
            }
            else {
                priorityQueue.poll();
            }

            totalEvents--;
        }
        Iterator<Student> it = priorityQueue.iterator();
        while(it.hasNext()) {
            Student st = it.next();
            System.out.println(st.getFname());
        }
    }
}
