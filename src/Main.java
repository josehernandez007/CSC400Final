public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(new Person("Jose", "Hernandez", 25));
        queue.enqueue(new Person("Izzy", "Hill", 30));
        queue.enqueue(new Person("Aniken", "Rodriguez", 20));
        queue.enqueue(new Person("Crystal", "Salinas", 35));
        queue.enqueue(new Person("Desiree", "Brookhaven", 28));

        System.out.println("Queue contents:");
        System.out.println(queue);

        System.out.println("\nSorting in descending order by last name:");
        queue.quickSortLastNameDesc();
        System.out.println(queue);

        System.out.println("\nSorting in descending order by age:");
        queue.quickSortAgeDesc();
        System.out.println(queue);
    }
}