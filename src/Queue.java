
import java.util.Arrays;
import java.util.Comparator;

class Queue {
    Person[] people;
    int size;

    public Queue(int capacity) {
        people = new Person[capacity];
        size = 0;
    }

    public void enqueue(Person person) {
        if (size < people.length) {
            people[size++] = person;
        } else {
            throw new IllegalStateException("THe queue is full");
        }
    }

    public void quickSortLastNameDesc() {
        quickSort(0, size - 1, (p1, p2) -> p2.lastName.compareTo(p1.lastName));
    }

    public void quickSortAgeDesc() {
        quickSort(0, size - 1, (p1, p2) -> Integer.compare(p2.age, p1.age));
    }

    private void quickSort(int low, int high, Comparator<Person> comparator) {
        if (low < high) {
            int pi = partition(low, high, comparator);
            quickSort(low, pi - 1, comparator);
            quickSort(pi + 1, high, comparator);
        }
    }

    private int partition(int low, int high, Comparator<Person> comparator) {
        Person pivot = people[high];
        int i = low - 1; 

        for (int j = low; j < high; j++) {
            if (comparator.compare(people[j], pivot) > 0) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Person temp = people[i];
        people[i] = people[j];
        people[j] = temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(people);
    }
}
