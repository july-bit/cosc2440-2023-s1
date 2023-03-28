package edu.vn.rmit.example;

// empty interface
public interface Interface {
  
}

// empty parent class
class Parent {
}

// Child1 "is a" Parent
class Child1 extends Parent {

}

// Child2 "is a" Parent, Child2 "is a" Interface
class Child2 extends Parent implements Interface {

}