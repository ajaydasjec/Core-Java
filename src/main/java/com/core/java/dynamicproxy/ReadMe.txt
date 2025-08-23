* A dynamic proxy class is a class that implements a list of interfaces specified at runtime when the class is created
* A proxy interface is an interface that is implemented by a proxy class
* A proxy instance is an instance of a proxy class
* Each proxy instance has an associated invocation handler object, which implements the interface InvocationHandler
* A method invocation on a proxy instance through one of its proxy interfaces will be dispatched to the invoke() method of the
  instance's invocation handler
*  Proxy classes are created using the new java.lang.reflect.Proxy class
* Proxy classes are public, final, non-abstract subclasses of java.lang.reflect.Proxy
*

