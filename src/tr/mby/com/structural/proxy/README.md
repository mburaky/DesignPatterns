# Proxy Design Pattern
## Definition
Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy 
controls access to the original object, allowing you to perform something either before or after the request gets 
through to the original object.

Ex: A credit card is a proxy for a bank account, which is a proxy for a bundle of cash.


## Applicability
- Use the Proxy pattern when we want a simplified version of a complex or heavy object. 
- Use the Proxy pattern when the original object is present in different address space, and we want to represent it 
locally.
- Use the Proxy pattern when we want to add a layer of security to the original underlying object to provide controlled 
access based on access rights of the client

