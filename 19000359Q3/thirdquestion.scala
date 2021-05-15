object thirdquestion{
    def main(args: Array[String]) {
        var pricefor60books =24.95*0.6*60;
        var shippingcostfor60copies =3+(0.75*(60-50));
        var wholesalecost=pricefor60books+shippingcostfor60copies;
        print("The wholesale cost is "+wholesalecost);
    }
}
