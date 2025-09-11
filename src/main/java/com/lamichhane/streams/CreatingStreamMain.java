package com.lamichhane.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class CreatingStreamMain {

    public static void main(String args[]){

        // Creating streams with array
        Double[] numbers = {1.1,2.2,3.3};
        Stream<Double> stream1 = Arrays.stream(numbers);
        long n = stream1.count();
        System.out.println("Number of elements: "+n);

        // Creating streams with collections
        List<String> animalList = Arrays.asList("cat","dog","sheep");
        Stream<String> streamAnimals = animalList.stream();
        System.out.println("Number of elements: "+streamAnimals.count());

        // Creating streams with map
        Map<String,Integer> namesToAges = new HashMap<>();
        namesToAges.put("Mike",22);
        namesToAges.put("Mary",24);
        namesToAges.put("Alice",31);
        System.out.println("Number of entries: "+namesToAges.entrySet().stream().count());

        // Creating a Stream with Stream.of()
        Stream<Integer> streamI = Stream.of(1,2,3);
        System.out.println(streamI.count());

        // Creating a Stream with a file
//        List<Cat> cats = loadCats("Cats.txt");
//        cats.forEach(System.out::println);

        // Infinite Streams
//        Stream<Integer> infStream = Stream.generate(() -> {
//            return (int) (Math.random() * 10);
//        });
//        infStream.forEach(System.out::println);


        // Terminal operaitons count(),min(),max
        long count = Stream.of("dog","cat").count();
        System.out.println(count);

        Optional<String> min = Stream.of("deer","horse","pig")
                .min((s1,s2) -> s1.length() - s2.length());
       min.ifPresent(System.out::println);

       Optional<Integer> max = Stream.of(4,6,2,12,9)
               .max((i1,i2) -> i1-i2);
       max.ifPresent(System.out::println);

       // Terminal operations findAny(), findFirst()
        Optional<String> any = Stream.of("John","Paul")
                .findAny();
        any.ifPresent(System.out::println);

        Optional<String> first = Stream.of("John","Paul")
                .findFirst();
        first.ifPresent(System.out::println);

        // Terminal Operations anyMatch(),allMatch(),noneMatch()
        List<String> names = Arrays.asList("Alan","Brian","Colin");
        Predicate<String> pred = name -> name.startsWith("A");
        System.out.println(names.stream().anyMatch(pred));
        System.out.println(names.stream().allMatch(pred));
        System.out.println(names.stream().noneMatch(pred));

        // Terminal Operations forEach()
        Stream<String> namess = Stream.of("Cathy","Pauline","Zoe");
        namess.forEach(System.out::println);

        // Terminal Operations reduce()
        String name = Stream.of("s","e","a","n")
//                .filter(s -> s.length() > 2)
                .reduce("",(s,c) -> s+c);
        System.out.println(name);

        Integer product = Stream.of(2,3,4)
                .reduce(1,(a,b) -> a * b);
        System.out.println(product);

        // Terminal Operation Collect
        StringBuilder word = Stream.of("ad","jud","i","cate")
                .collect(() -> new StringBuilder(),
                        (sb,str) -> sb.append(str),
                        (sb1,sb2) -> sb1.append(sb2));
        System.out.println(word);

        String s = Stream.of("cake","biscuits","apple tart")
                .collect(Collectors.joining(","));
        System.out.println(s);

        Double  avg = Stream.of("cake","biscuits","apple tart")
                .collect(Collectors.averagingInt(ss -> ss.length()));
        System.out.println(avg);

        Map<String,Integer> map = Stream.of("cake","biscuits","apple tart")
                .collect(
                        Collectors.toMap(st -> st, st -> st.length())
                );
        System.out.println(map);

        Stream<String> peopleName = Stream.of("Joe","Tom","Tom","Alan","Peter");
        Map<Integer,List<String>> peopleMap = peopleName.collect(
                Collectors.groupingBy(String::length)
        );
        System.out.println(peopleMap);

        Stream<String> partitionNames = Stream.of("Thomas","Teresa","Mike","Alan","Peter");
        Map<Boolean,List<String>> partitionMap = partitionNames.collect(
                Collectors.partitioningBy(sp -> sp.startsWith("T"))
        );
        System.out.println(partitionMap);


        // Intermediate operations filter
        Stream.of("galway","mayo","roscommon")
                .filter(countryName -> countryName.length() > 5)
                .forEach(System.out::println);

        // Intermediate operations distinct
        Stream.of("eagle","eagle","EAGLE")
                .distinct()
                .forEach(st -> System.out.println(st));

        // Intermediate operations limit
        Stream.of(11,22,33,44,55,66,77,88,99)
                .filter(lim -> lim > 40)
                .limit(2)
                .forEach(lim -> System.out.println(lim));

        // Intermediate operaitons map
        Stream.of("book","pen","ruler")
                .map(smap -> smap.length())
                .forEach(System.out::println);

        // Intermediate operations flatMap
        List<String> list1 = Arrays.asList("sean","desmond");
        List<String> list2 = Arrays.asList("mary","ann");
        Stream<List<String>> streamsOfList = Stream.of(list1,list2);
//
//        streamsOfList.flatMap(listt -> listt.stream())
//                .forEach(System.out::print);
        List<String> list3 = streamsOfList
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("new list="+list3);

        // Intermediate Operations sorted
        Person john = new Person("John",23);
        Person mary = new Person("mary",25);
        Stream.of(mary,john)
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);

        Stream.of("Tim","Jim","Peter","Ann","Mary")
                .filter(namee -> namee.length() == 3)
                .sorted()
                .limit(2)
                .forEach(namee -> System.out.print(namee));



        // Primitive Streams
        int[] ia = {1,2,3};
        IntStream intStream = Arrays.stream(ia);
        System.out.println("sum="+intStream.sum());

        double[] da = {1.1,2.2,3.3};
        DoubleStream doubleStream = Arrays.stream(da);
        System.out.println("count for double="+doubleStream.count());

        long[] la = {1l,2l,3l};
        LongStream longStream = Arrays.stream(la);
        System.out.println("count for long stream="+longStream.count());

        OptionalInt maxx = IntStream.of(10,20,30)
                .max();
        System.out.println(maxx.getAsInt());

        int sum = IntStream.of(10,21).sum();
        System.out.println(sum);

        // mapping objects
        DoubleStream dblStream = Stream.of("ash","beech","sycamore")
                .mapToDouble(tree -> tree.length());
        dblStream.forEach(System.out::println);

        IntStream intStreamm = Stream.of("ash","beech","sycamore")
                .mapToInt(tree -> tree.length());
        intStreamm.forEach(System.out::println);

        LongStream longStream1 = Stream.of("ash","beech","sycamore")
                .mapToLong(tree -> tree.length());
        longStream1.forEach(System.out::println);

        Stream<String> streamAges = IntStream.of(1,2,3)
                .mapToObj( nn -> "Number:"+nn);
        streamAges.forEach(System.out::println);


        // Handling optional
        Optional<Double> optAvg = calcAverage(50,60,70);
        if(optAvg.isPresent()){
            System.out.println(optAvg.get());
        }
        optAvg = Optional.empty();

        System.out.println(optAvg.orElse(Double.NaN));
        System.out.println(optAvg.orElse(10.22));
//        System.out.println(optAvg.orElseThrow(() -> new RuntimeException()));

        Optional<String> optSK = Optional.ofNullable("SK");
        optSK.ifPresent(System.out::println);

        Optional<String> optSK2 = Optional.ofNullable(null);
        System.out.println(
            optSK2.orElseGet(
                    () -> "Empty optional"));


        // Parallel Streams
        int summ = Stream.of(10,20,30,40,50,60)
                .parallel()
                .mapToInt(nn -> nn)
                .sum();
        System.out.println("Sum="+summ);













    }










    public static List<Cat> loadCats(String filename){
        List<Cat> cats = new ArrayList<>();
        try(Stream<String> stream = Files.lines(Paths.get(filename))){
            stream.forEach(line -> {
                String[] catsArray = line.split("/");
                cats.add(new Cat(catsArray[0],catsArray[1]));
            });
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
        return cats;
    }


    public static Optional<Double> calcAverage(int... scores){
        if(scores.length == 0){
            return Optional.empty();
        }
        int sum = 0;
        for(int score: scores){
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }
}
