package PriorityQueue;

public class PriorityQueue {
    static class Student implements Comparable<Student>{
        String name ;
        int rank;

        public Student(String name , int rank)
        {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2)
        {
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new student("A",4));
        pq.add(new student("B",5));
        pq.add(new student("C",1));
     

    }
    
}
