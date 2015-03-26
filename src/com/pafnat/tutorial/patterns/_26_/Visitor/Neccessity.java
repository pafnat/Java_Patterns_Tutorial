package com.pafnat.tutorial.patterns._26_.Visitor;

class Neccessity implements Visitable {

    private double price;

    Neccessity(double item) {
        price = item;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}
