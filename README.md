# LabAssignment3
CSL222-18 Lab Assignment 3

Develop a payment application that allows users to place orders for items, define the quantity, unit price, and choose a payment method (GCash, Maya, ShopeePay). The application should calculate the total amount based on the order details and any applicable discounts offered by the chosen payment method, storing the result in the totalAmount attribute of the Order class.

Specific requirements:
- PaymentApp class: This class serves as the entry point for the application. It demonstrates how to create an Order object, set its properties (item, quantity, unit price, and payment method), and calculate the total amount based on the chosen payment method.
- The application should have an Order class that stores information about the ordered item, quantity, unit price, chosen payment method, and the calculated total amount (totalAmount).
- The application should implement a PaymentMode interface that defines a method for calculating the discount offered by the payment method.
- The application should have concrete implementations of PaymentMode for GCash, Maya, ShopeePay:
  > GCash: Does not offer any discount (discount rate = 0.0)
  
  > Maya: Offers a 5% discount (discount rate = 0.05)
  
  > ShopeePay: Offers a 10% discount
- The application should allow users to set the payment method for an order and calculate the total amount, storing it in the totalAmount attribute.