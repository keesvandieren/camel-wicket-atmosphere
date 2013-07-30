camel-wicket-atmosphere
=======================

Small test with two wars, to be deployed in onecontainer, using in-vm communication. Changes pushed to frontend using
 Wicket Atmosphere.


Final goal:
* Exchange messages between two wars with publish-subscribe ability as lightweight as possible.
* Provide realtime UI updates with Atmosphere, by showing those Camel messages.

Current status:
* When requesting the page, Camel messages are produced.
* Messages are received by all consumers, of either war-one or war-two, but never by both.

Steps:
* run mvn install
* Download Jetty 7.6 from http://download.eclipse.org/jetty/stable-7/dist/
* Copy the following jars from maven repo to jetty-distribution-7.6.12.v20130726/lib/ext
** camel-core-2.11.1.jar
** log4j-1.2.17.jar
** slf4j-api-1.7.5.jar
** slf4j-log4j12-1.7.5.jar
* deploy both wars in Jetty (I am currently using IntelliJ IDEA for that).
* Refresh the page.
* Now look in the console to see which war received it.


