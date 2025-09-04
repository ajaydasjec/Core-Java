-In Java, a BlockingQueue is an interface within the java.util.concurrent package that
 extends the Queue interface
 - It provides thread-safe operations for adding and removing elements,
   with the key feature being its "blocking" behavior.
 - This means that if a thread attempts to add an element to a full queue or remove an element from an empty queue, the operation will block until space becomes available or an element is present, respectively
 Common Implementations of BlockingQueue:
 ArrayBlockingQueue:
 A bounded blocking queue backed by an array. It has a fixed capacity that cannot be changed after creation
 LinkedBlockingQueue:
 An optionally bounded blocking queue backed by linked nodes. It can be initialized with a capacity or be unbounded.
 PriorityBlockingQueue:
 An unbounded blocking queue that orders elements according to their natural ordering or by a
 Comparator provided at construction time. It does not enforce any specific ordering for elements with equal priority.
 SynchronousQueue:
 A blocking queue in which each insert operation must wait for a corresponding remove operation by another thread, and vice versa. It does not store any elements internally;
 it acts as a direct handoff mechanism between a producer and a consumer.

 DelayQueue:
 An unbounded blocking queue of Delayed elements. Elements can only be taken from the queue when their delay has expired.