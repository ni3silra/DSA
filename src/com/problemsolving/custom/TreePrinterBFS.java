package com.problemsolving.custom;

import java.util.*;

public class TreePrinterBFS {

    public static void main(String[] args) {
        List<Relation> input = new ArrayList<>();
        input.add(new Relation("animal", "mammal"));
        input.add(new Relation("animal", "bird"));
        input.add(new Relation("lifeForm", "animal"));
        input.add(new Relation("animal", "fish"));
        input.add(new Relation("mammal", "cat"));
        input.add(new Relation("cat", "lion"));
        Map<String, Set<String>> relationList = getAdList(input);
        String parent = findParent(relationList);
        System.out.println(parent);
        printTree(relationList, parent, 1);
    }

    public static String findParent(Map<String, Set<String>> relationList) {
//        Set<String> set = new CopyOnWriteArraySet<>(relationList.keySet());
//        for (String parent : set) {
//            for (String key : relationList.keySet()) {
//                if (relationList.get(parent).contains(key)) {
//                    set.remove(key);
//                }
//            }
//        }
//        return set.iterator().next();

        Set<String> childSet = new HashSet<>();
        Set<String> parentSet = new HashSet<>();
        for (String parent : relationList.keySet()){
            parentSet.add(parent);
            childSet.addAll(relationList.get(parent));
        }

        parentSet.removeAll(childSet);

        return parentSet.iterator().next();
    }

    public static Map<String, Set<String>> getAdList(List<Relation> input) {
        Map<String, Set<String>> map = new HashMap<>();
        for (Relation r : input) {
            String parent = r.parent;
            String child = r.child;
            Set<String> childList = new HashSet<>();
            if (map.get(parent) != null) {
                childList = map.get(parent);
                childList.add(r.child);
            } else {
                childList.add(child);
            }
            map.put(parent, childList);
            // check parent root
        }
        return map;
    }

    public static void printTree(Map<String, Set<String>> map, String parent, int spaces) {
        Set<String> childList = map.get(parent);
        if (childList == null || childList.size() == 0) {
            return;
        }
        for (String child : childList) {
            System.out.println(getSpaces(spaces + 5) + child);
            printTree(map, child, spaces + 5);
        }
    }

    public static String getSpaces(int numOfSpaces) {
        StringBuilder buffer = new StringBuilder();
        while (numOfSpaces-- > 0) {
            buffer.append(" ");
        }
        return buffer.toString();
    }

    static class Relation {
        String parent;
        String child;
        public Relation(String parent, String child) {
            this.parent = parent;
            this.child = child;
        }
    }

}
