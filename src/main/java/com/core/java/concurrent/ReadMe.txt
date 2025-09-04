java.util.concurrent package, introduced in java 5, provides a set of comprehensive set of utility classes and interface
design to simplify and enhance concurrent programming
it offers more robust and efficient alternative to traditional synchronized mechanism like
synchronized, wait and notify

Features
=========
Executors: provides interface and classes for managing thread pool, allowing efficient execution of task
and decoupling task submission from the thread management

Executor(I) - A simple interface for executing task. An object that executes submitted Runnable tasks.
ExecutorService - An Executor that provides methods to manage termination and methods that can produce a Future for tracking progress of one or more asynchronous tasks.

ThreadPoolExecutor -
ScheduleExecutorService -

Thread Pool - It is a collection of threads(worker), which is available to perform the submitted task.
            - Once the task is completed, worker threads gets back to Thread Pool and wait for new task to assign.
            - That means thread can be reuse
Advantage of thread pool:
    - The thread creation time can be saved. when thread is created, space is allocated to it (stack
    ,heap, program counter etc) and this takes time.
    - Overhead of managing thread lifecycle can be removed
    - Increase the performance

