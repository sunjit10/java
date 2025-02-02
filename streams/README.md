## Streams

Stream is a sequence of elements which can be created out of a collection such as List or Arrays or any kind of I/O resources.

- Introduced in Java 8
- Good for doing parallel operations, much simpler code without having those verbose creation of threads
- Good for working with `Collections`, `Arrays` and general `IO`

## Intermediate and Terminal Operation

```
	    <Some List>
	    .stream()
	    .filter(grade)
	    .filter(gpa)
	    .collect(Collectors.toMap(Student::getName, Student::getActivities));
```
In the above example, the filter is the intermediate operation and collect is the Terminal operation.

Important: If I comment out the Terminal Operation, then nothing happens, the intermediate operations don't get executed.


## Collections vs Streams

- Collections are `eagerly constructed` where as Streams are `lazily constructed`
- Collections: Can access any value (somewhere in between). Ex: list.get(2) where as in Streams it is sequential
- Collections can easily add or modify items where as streams treats data set as fixed, only can access them.
- Collections can be traversed any number of times where as streams can be traversed only once
- In Collections, you perform external iteration to iterate through the elements where as in streams does internal iteration.
