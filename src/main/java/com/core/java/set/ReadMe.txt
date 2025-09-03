java.util.Set => Set is an interface, represents collection that does not permit duplicate
element. It extends the Collection interface. Following are the implementation of the set interface

HashSet => It stores element in a hash table, offering excellent performance(constant time for most
operation like add, remove, contains) but provides no guarantee regarding order of the iteration.
it allows for one null element

LinkedHashSet => This implementation extends HasSet but maintain the insertion order of the element.
It uses a hashTable with a link list running through it, providing predictable iteration order
while still offering performance close to HashSet

TreeSet => This implementation stores the element in a sorted manner either based on natural ordering
if they implement Comparable or by a custom Comparator provided at time of creation

