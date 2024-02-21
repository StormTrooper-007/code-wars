package org.example;

public record Touch(Name touch) {
    public static void main(String[] args) {
        Name name = new Name("apple");
        Touch touch1 = new Touch(name);
        System.out.println(touch1);

    }
}
