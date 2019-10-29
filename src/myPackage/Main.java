package myPackage;

/**
 * Created by Robert Burek
 */
public class Main {

    public static void main(String[] args) {

//        KOLEKCJE (list, set, map) oraz (equels, hashcode)

////        1) LIST (ArrayList, LinkedList)
//        List<String> listWithNames = new ArrayList<>();
//        listWithNames.add("Michal");
//        listWithNames.add("Marek");
//        listWithNames.add("Robert");
//
//        List<String> secondListWithNames = new LinkedList<>();
//        secondListWithNames.add("Michal");
//        secondListWithNames.addAll(listWithNames);
//        secondListWithNames.add("Ala");
//
//        System.out.println(secondListWithNames.contains("Monika"));
//        System.out.println(secondListWithNames.get(0));
//        System.out.println(secondListWithNames.isEmpty());
//        System.out.println(secondListWithNames.indexOf("Michal"));
//        System.out.println(secondListWithNames.lastIndexOf("Michal"));
//        int i = 0;
//        for (String name : secondListWithNames) {
//            System.out.println(i+") name = " + name);
//            i++;
//        }

////        2) SET (HashSet)
//        Set<String> mySet = new HashSet<>();
//        mySet.add("Michal");
//        mySet.add("Ala");
//        mySet.add("Marcin");
//        System.out.println("Przed:");
//        for(String name : mySet) {
//            System.out.println("name = " + name);
//        }
//        mySet.add("Michal");
//        System.out.println("Po:");
//        for(String name : mySet) {
//            System.out.println("name = " + name);
//        }
//
//        System.out.println(mySet.isEmpty());
//        System.out.println(mySet.size());
//        System.out.println(mySet.contains("Marcin"));
//        System.out.println(mySet.remove("Janusz"));

////        3) MAP (HashMap)
//        Map<String, Integer> mapOfNamesAndAge = new HashMap<>();
//        mapOfNamesAndAge.put("Michal", 33);
//        mapOfNamesAndAge.put("Agnieszka", 31);
//        mapOfNamesAndAge.put("Zosia", 6);
//        mapOfNamesAndAge.put("Stas", 6);
//        mapOfNamesAndAge.put("Zosia", 8);
//
//        System.out.println(mapOfNamesAndAge.get("Michal"));
//        System.out.println(mapOfNamesAndAge.remove("Stas"));
//        System.out.println(mapOfNamesAndAge.size());
//        System.out.println(mapOfNamesAndAge.isEmpty());
//        System.out.println(mapOfNamesAndAge.containsKey("Adam"));
//        System.out.println(mapOfNamesAndAge.containsValue(31));
//        for (String key : mapOfNamesAndAge.keySet()) {
//            Integer value = mapOfNamesAndAge.get(key);
//            System.out.println(key + ": " + value);
//        }

//        4) Equels i HashCode
//        SampleClass sampleClass = new SampleClass("Robert","Nowak",35);
//        SampleClassTwo sampleClassTwo = new SampleClassTwo("Robert","Nowak",35);
//        System.out.println("sampleClass hashCode = " + sampleClass.hashCode());
//        System.out.println("sampleClassTwo hashCode = " + sampleClassTwo.hashCode());
//        System.out.println("różnica hashcodów = " + (sampleClassTwo.hashCode()-sampleClass.hashCode()));
//        System.out.println("czy równe klasy = " + sampleClass.equals(sampleClassTwo));
//        System.out.println("czy równe obiekty= " + ((Object)sampleClass).equals((Object)sampleClassTwo));

        SampleOther sampleOther1 = new SampleOther("Robert","Nowak",35);
        SampleOther sampleOther2 = new SampleOther("Robert","Nowak",20);
        System.out.println("sampleOther1 hashCode = " + sampleOther1.hashCode());
        System.out.println("sampleOther2 hashCode = " + sampleOther2.hashCode());
        System.out.println("różnica hashcodów = " + (sampleOther1.hashCode()- sampleOther2.hashCode()));
        System.out.println("czy równe klasy = " + sampleOther1.equals(sampleOther2));
        System.out.println("czy równe obiekty= " + ((Object) sampleOther1).equals((Object) sampleOther2));
        System.out.println("-----------------------------------------------------");
        System.out.println("sampleOther1 myhashCode = " + sampleOther1.myhashCode());
        System.out.println("sampleOther2 myhashCode = " + sampleOther2.myhashCode());
        System.out.println("różnica myhashcodów = " + (sampleOther1.myhashCode()- sampleOther2.myhashCode()));

    }
}