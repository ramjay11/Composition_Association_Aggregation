package compositionjournaldev;
/*Notice that above test program for composition in java is not affected by any change in
the Job object. If you are looking for code reuse and the relationship between two classes
is has-a then you should use composition rather than inheritance.*/
public class TestPerson {
	public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        System.out.println(salary);
    }
}
