java.util.Map =>
Map<--implements--HashMap <---Extends-- LinkedHashMap
Map<--implements---SortedMap<--Extends---TreeMap

1. Map is an Interface that represent a collection of key-value pair where
    -key are unique
    -each key maps to a exactly one value
    -values can be duplicates
    -it allows one null key and allows multiple null values
    -Most of the Map implementation are not thread safe. For alternative thread safe use ConcurrentHashMap
    and also wrap an existing map using Collections.synchronizedMap() for synchronization access.
2. The Map data structure is implemented by two interfaces
    -Map Interface
    -SortedMap Interface
   The three primary class that implement these interface are:
   -HashMap
   -TreeMap
   -LinkedHashMap

 3. Internal Working of HashMap:
    HashMap contains an array Nodes Objects. Each Node represents a key-value mapping
    class Node{
        int hash;
        K Key;
        V Value;
        Node next;
    }
    hash-> hash code of the key.
    key-> the key object.
    value-> The associated value
    next -> Reference to the next node in case of collision