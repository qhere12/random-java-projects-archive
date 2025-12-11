public class Item {



// 3 properties name, stock, money

String name;

int stock;

double price;





public Item(String name, int stock, double price) {

this.name = name;

this.stock = stock;

this.price = price;



//System.out.println("An item is created. Name: " + this.name  +" Stock: " + this.stock + " price: $" + this.price);

}





public String toText() {

return " Name: " + this.name  +" Stock: " + this.stock + " price: $" + this.price;

}
}


