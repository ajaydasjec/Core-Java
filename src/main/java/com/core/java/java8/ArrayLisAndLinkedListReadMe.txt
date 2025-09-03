ArrayList => Internally uses dynamic array to store the elements. When capacity is exceeded
a larger array is created and elements are occupied from old array to the new one.

LinkedList => Uses doubly linked list where each element (node) stores its data and references
to the previous and next nodes in the sequences.

Random access (Retrieval):
Arraylist provides O(1) random access due to the direct indexing of elements in the underlying array.
LinkedList slower for random access, requiring traversal of nodes from beginning to the end of
list until the desired element is found, resulting in O(n) complexity in the worst case.

Insertion and deletion (In middle):

ArrayList: Inefficient for insertion and deletion in the middle as it requires shifting subsequent
element in the array, leading to O(n) complexity

LinkedList: Efficient for insertion and deletion at any position (Including the middle) with O(1)
complexity after finding the insertion/deletion point, as it only involves adjusting pointer.

Insertion and deletion (at end):

Arraylist: adding and deletion at the end can be efficient (Amortized O(1)) if there is sufficient
capacity, but resizing can lead to O(n). Adding/Removing at the beginning is O(n)

LinkedList: Efficient for adding and removing elements at the beginning and end O(n)

Memory Usage :
Arraylist : May have less memory usage overhead per element compare to LinkedList, But can waste
memory if allocated array is much larger than the actual number of the elements.

LinkedList: May have higher memory overhead per element due to the storage of references to the next
and previous nodes.

