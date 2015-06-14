The idea is to use the xsd (under main/resources) to generate java pojos that can be organised in such a way, as to produce two use cases:

1) A String representation of the file :
test/resources/createCustomisedOfferComplex.xml

2) A String representation of the file :
   test/resources/createCustomisedOfferPOST.xml


The reason is that I have to http POST these 2 xml Strings (as separate POSTS ) to a server.

 - You may use whatever libraries you need.
 - You do not have to depend on JAXB, you may remove this if you wish, as the test/resources files dont care about it.
 - You dont have to care about newline characters, they are only present for readability. One long line of xml is fine

I am interested in the most elegant (simple) possible solution.

If there are namespace clashes, try to fix them.

Write a unit test for each case to prove it works.