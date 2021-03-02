## Experiment Note
Java Architecture for XML Binding
https://docs.oracle.com/javase/tutorial/jaxb/TOC.html


```java
JAXBContext jaxbContext = JAXBContext.newInstance(CallbackRespond.class);
Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
StringWriter sw = new StringWriter();
jaxbMarshaller.marshal(respond, sw);
String xmlContent = sw.toString();
System.out.println(xmlContent);
```

```cmd
javax.xml.bind.MarshalException
 - with linked exception:
[com.sun.istack.internal.SAXException2: unable to marshal type "com.quest.qsi.fason.framework.oracle.installer.callbacks.xml.CallbackRespond" as an element because it is missing an @XmlRootElement annotation]
	at com.sun.xml.internal.bind.v2.runtime.MarshallerImpl.write(MarshallerImpl.java:311)
	at com.sun.xml.internal.bind.v2.runtime.MarshallerImpl.marshal(MarshallerImpl.java:236)
	at javax.xml.bind.helpers.AbstractMarshallerImpl.marshal(AbstractMarshallerImpl.java:116)
	at org.example.fdbrmiclient.FDBRMIClient.main(FDBRMIClient.java:73)
Caused by: com.sun.istack.internal.SAXException2: unable to marshal type "com.quest.qsi.fason.framework.oracle.installer.callbacks.xml.CallbackRespond" as an element because it is missing an @XmlRootElement annotation
	at com.sun.xml.internal.bind.v2.runtime.XMLSerializer.reportError(XMLSerializer.java:234)
	at com.sun.xml.internal.bind.v2.runtime.ClassBeanInfoImpl.serializeRoot(ClassBeanInfoImpl.java:323)
	at com.sun.xml.internal.bind.v2.runtime.XMLSerializer.childAsRoot(XMLSerializer.java:479)
	at com.sun.xml.internal.bind.v2.runtime.MarshallerImpl.write(MarshallerImpl.java:308)
	... 3 more
```