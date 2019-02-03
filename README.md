# Gilded Rose Refactoring Kata

This Kata was originally created by Terry Hughes (http://twitter.com/TerryHughes). It is already on GitHub [here](https://github.com/NotMyself/GildedRose). See also [Bobby Johnson's description of the kata](http://iamnotmyself.com/2011/02/13/refactor-this-the-gilded-rose-kata/).

## Motivation

After reading [Refactoring Improving the Design of Existing Code by Martin Fowler(with Kent Beck)](https://martinfowler.com/books/refactoring.html) I felt a need to put the learnings to practice. Book is also available through monthly subscription [here](https://www.oreilly.com/library/view/refactoring-improving-the/9780134757681/)

## Refactoring in Java

I found the Kata really helfulpful. It not only made me apply the various refactoring techniques in the book, but also pushed me to come up with few steps of my own(which I am sure is already part of the refactoring [catalog](https://www.safaribooksonline.com/library/view/refactoring-improving-the/9780134757681/ch05.xhtml#ch05)). 

## Refactoring and TDD

Whenver we refactor we do not add/remove any new functionality hence we seldom add new test cases while refactoring(we must add them before starting the refactoring if not present), whereas when we add new feature we add new failing tests first then add minimum code to make the test run, then refactor the code. In both cases, we take small steps iteratively, and do code changes backed by tests. Refactoring and testing are inseparable in the TDD loop **test->code->refactor**

This approach is explained beautifully in [TDD by example by Kent Beck](https://www.oreilly.com/library/view/test-driven-development/0321146530/) and [Refactoring Improving the Design of Existing Code by Martin Fowler](https://www.oreilly.com/library/view/refactoring-improving-the/9780134757681/). *TDD by example* focuses on the testing and *Refactoring* emphasises on refactoring. IMO, these books perfectly complement each other.  
 
 ## Validating the behavior with Tests
 
 First thing I found myself doing was confirm the existing behavior through tests(see the test package). By doing this, I was not just confirming the existing behavior(finding bugs if any), but also creating a safetly net, paving a way to safe refactoring. I found this immensly helpful in later stages

## Identifying the targets for refactoring

As you know [design patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/) help us to identify targets for refactoring. We should identify and isolate the code that changes for same reason. I found this perticularly challenging in this example. The code changing for one reason(code for one product) is so tightly coupled with the rest, it makes the refactoring really challenging. I found the test coverage(which I added before refactoring).

## Small steps

While refactoring I found myself taking a very short steps. At times I added duplicate if conditions in the code, ran the tests to confirm the behavior, deleted the older conditions and re-ran the tests. This left me with the code which was one step closer to being well seperated for the further iterative refactoring.

## Adding new behavior

 As soon as I was confident that the code was extensible enough for the new requirements, I was done with the refactoring, for now. And it was time to change the [hat](http://wiki.c2.com/?OnlyWearOneOfFourHats). Before adding the new functionality, we add a failing test first. A test that documents one perticular expectation from the code. We make our code satisfy the expecation, check by running the test and move on to the next behavior. Life is good with TDD..
 
 ## Future improvements
 
 I will try to think of a new requirement, which makes the current design obsolete. Putting the theory of improving the current design to further test.
 
 
