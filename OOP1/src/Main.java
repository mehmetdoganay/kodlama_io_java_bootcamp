public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi kahve makinesi");
        product1.setUnitPrice(5999);
        product1.setDiscount(3);
        product1.setUnitsInStock(17);
        product1.setImageUrl("herhangibirsite.com");

        Product product2 = new Product();
        product2.setName("Smeg kahve makinesi");
        product2.setUnitPrice(9500);
        product2.setDiscount(5);
        product2.setUnitsInStock(16);
        product2.setImageUrl("herhangibirsite.com");

        Product product3 = new Product();
        product3.setName("Miele kahve makinesi");
        product3.setUnitPrice(5000);
        product3.setDiscount(6);
        product3.setUnitsInStock(11);
        product3.setImageUrl("herhangibirsite.com");


        Product[] products = {product1,product2,product3};

        for (Product product : products) {
            System.out.println();
            System.out.println(product.getName());
            System.out.println(product.getUnitPrice());
            System.out.println(product.getDiscount());
            System.out.println(product.getImageUrl());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("2");
        individualCustomer.setPhoneNumber("055555555");
        individualCustomer.setFirstName("Mehmet");
        individualCustomer.setLastName("Doğanay");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCompanyName("Bereket");
        corporateCustomer.setTaxNumber("3254234");
        corporateCustomer.setId(2);
        corporateCustomer.setPhoneNumber("055534324");
        corporateCustomer.setCustomerNumber("1");


        Customer[] customers = {individualCustomer,corporateCustomer};

        for (Customer customer : customers)
        {
            System.out.println(customer.getId());
            System.out.println(customer.getCustomerNumber());
            System.out.println(customer.getPhoneNumber());
        }


    }
}
