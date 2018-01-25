# java-credit-card-validator

> A java library for validating credit card numbers.


## Usage Examples

```java
CreditCard card = new CreditCard("4024007138518286");
card.isValid(); // returns true

CreditCard card = new CreditCard("241103781415443");
card.isValid(); // returns false

CreditCard card = new CreditCard("402-400-713-851-8286");
card.isValid(); // returns true

CreditCard card = new CreditCard("");
card.toString(); 
// returns 
// [{Card Number: []} {Invalid Card} {Type: INVALID}]

CreditCard card = new CreditCard("341103781415443");
card.getCardType(); // returns CardType.AMERICAN_EXPRESS

CreditCard card = new CreditCard("4556426121468059");
card.toString();
// returns 
// [{Card Number: [4, 5, 5, 6, 4, 2, 6, 1, 2, 1, 4, 6, 8, 0, 5, 9]} {Valid Card} {Type: VISA}]
```


## Supported Card Types

-  American Express
-  Discover
-  Visa
-  MasterCard

## TODO
- More credit card types
- Major Industry Identifiers

## Resources
[Luhn Algorithm](https://en.wikipedia.org/wiki/Luhn_algorithm)

[Issuer Identification Numbers](https://en.wikipedia.org/wiki/Payment_card_number#Issuer_identification_number_(IIN))

[Generating Test Credit Card Data](http://www.getcreditcardnumbers.com/)

## Built With
- Java 8
- [Maven](https://maven.apache.org/)


## License
This project is licensed under the MIT License.
