package com.pafnat.tutorial.patterns._26_.Visitor;

class Liquor implements Visitable {

    private double price;

    Liquor(double item) {
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
