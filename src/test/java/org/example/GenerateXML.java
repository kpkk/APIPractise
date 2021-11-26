package org.example;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

public class GenerateXML {


    public static void main(String[] args) {


        try {
// Create a SOAPConnection
            SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();

            SOAPConnection connection = factory.createConnection();

// Create a SOAPMessage
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage message = messageFactory.createMessage();
            SOAPPart soapPart = message.getSOAPPart();
            SOAPEnvelope envelope = soapPart.getEnvelope();
            SOAPHeader soapHeader = envelope.getHeader();
            SOAPBody body = envelope.getBody();

//soapHeader.detachNode();
            envelope.getNamespacePrefixes();

// Create a SOAPHeaderElement
            SOAPHeaderElement headerElement = soapHeader.addHeaderElement(envelope.createName("Header","soap-env","http://schemas.xmlsoap.org/soap/envelope/"));

            SOAPElement header1 = headerElement.addChildElement(envelope.createName("security","wsse","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"));
          //  header1.addAttribute()

            SOAPElement usernameToken = header1.addChildElement(envelope.createName("userTokenName"));
            header1.setPrefix("wsse");
            SOAPElement username = usernameToken.addChildElement("Username");
            username.addTextNode("expresst");
            SOAPElement password = usernameToken.addChildElement("password");
            password.addAttribute(new QName("Type"),"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
            password.addTextNode("etkt0813");
            Name name = envelope.createName("getTicketRequest", "ns0", "http://aots.att.com/ticket/v");
            SOAPBodyElement soapBodyElement = body.addBodyElement(name);
            SOAPElement soapElement = soapBodyElement.addChildElement(envelope.createName("WSHeader", "ns1", "http://cio.att.com/commonheader/v3"));
            SOAPElement wsContext = soapElement.addChildElement(envelope.createName("WSContext"));
            SOAPElement fromAppId = wsContext.addChildElement(envelope.createName("FromAppId"));
            fromAppId.addTextNode("ETT_aotsGetTicket");
            SOAPElement sourceIPAddress = wsContext.addChildElement(envelope.createName("SourceIPAddress"));
            sourceIPAddress.addTextNode("express-ticketing-84d5594bc7-wvckz");
            SOAPElement getTicketInput = soapBodyElement.addChildElement(envelope.createName("getTicketInput"));
            SOAPElement soapElement1 = getTicketInput.addChildElement(envelope.createName("FieldsList", "ns2", "http://tktsvc.aots.att.com/ticket"));
            SOAPElement string = soapElement1.addChildElement(envelope.createName("String"));
            string.addTextNode("NBIPVPNIndicator");
            SOAPElement string1 = soapElement1.addChildElement(envelope.createName("String"));
            string1.addTextNode("ReptSvcLineDescText");
            SOAPElement string2 = soapElement1.addChildElement(envelope.createName("String"));
            string2.addTextNode("FunctionalArea");
            SOAPElement string3 = soapElement1.addChildElement(envelope.createName("String"));
            string3.addTextNode("TicketOpened");
            SOAPElement string4 = soapElement1.addChildElement(envelope.createName("String"));
            string4.addTextNode("TicketState");
            SOAPElement string5 = soapElement1.addChildElement(envelope.createName("String"));
            string5.addTextNode("TicketRole");
            SOAPElement string6 = soapElement1.addChildElement(envelope.createName("String"));
            string6.addTextNode("LocationStateProvince");
            SOAPElement string7 = soapElement1.addChildElement(envelope.createName("String"));
            string7.addTextNode("AssetLocationState");
            SOAPElement string8 = soapElement1.addChildElement(envelope.createName("String"));
            string8.addTextNode("BvoipStateProvince");
            SOAPElement string9 = soapElement1.addChildElement(envelope.createName("String"));
            string9.addTextNode("AssetLocationCountry");
            SOAPElement string10 = soapElement1.addChildElement(envelope.createName("String"));
            string10.addTextNode("BvoipCountryCode");
            SOAPElement string11 = soapElement1.addChildElement(envelope.createName("String"));
            string11.addTextNode("ISOCountryCode");
            SOAPElement string12 = soapElement1.addChildElement(envelope.createName("String"));
            string12.addTextNode("LocationCountry");
            SOAPElement string13 = soapElement1.addChildElement(envelope.createName("String"));
            string13.addTextNode("TelephoneCountryCode");
            SOAPElement string14 = soapElement1.addChildElement(envelope.createName("String"));
            string14.addTextNode("ProviderTicketNum");
            SOAPElement string15 = soapElement1.addChildElement(envelope.createName("String"));
            string15.addTextNode("ResolutionSetDescription");
            SOAPElement string16 = soapElement1.addChildElement(envelope.createName("String"));
            string16.addTextNode("CurrentStatus");
            SOAPElement string17 = soapElement1.addChildElement(envelope.createName("String"));
            string17.addTextNode("OrgGroup");
            SOAPElement string18 = soapElement1.addChildElement(envelope.createName("String"));
            string18.addTextNode("MCN");
            SOAPElement string19 = soapElement1.addChildElement(envelope.createName("String"));
            string19.addTextNode("AssetType");
            SOAPElement string20 = soapElement1.addChildElement(envelope.createName("String"));
            string20.addTextNode("ActiveOrg");
            SOAPElement string21 = soapElement1.addChildElement(envelope.createName("String"));
            string21.addTextNode("ClientTicketNum");
            SOAPElement string22 = soapElement1.addChildElement(envelope.createName("String"));
            string22.addTextNode("TestSummary");
            SOAPElement string23 = soapElement1.addChildElement(envelope.createName("String"));
            string23.addTextNode("DispatchAuthorized");
            SOAPElement string24 = soapElement1.addChildElement(envelope.createName("String"));
            string24.addTextNode("AuthTest");
            SOAPElement soapElement2 = getTicketInput.addChildElement(envelope.createName("TicketNum", "ns3", "http://tktsvc.aots.att.com/ticket"));
            soapElement2.addTextNode("CS0011891");
            SOAPElement soapElement3 = getTicketInput.addChildElement(envelope.createName("TicketClass", "ns4", "http://tktsvc.aots.att.com/ticket"));
            soapElement3.addTextNode("TT");
            SOAPElement soapElement4 = getTicketInput.addChildElement(envelope.createName("LogQualifier", "ns5", "http://tktsvc.aots.att.com/ticket"));
            soapElement4.addTextNode("5");
            SOAPElement soapElement5 = getTicketInput.addChildElement(envelope.createName("GetLocationInfo", "ns6", "http://tktsvc.aots.att.com/ticket"));
            soapElement5.addTextNode("true");
            SOAPElement soapElement6 = getTicketInput.addChildElement(envelope.createName("GetPVCDetailsInfo", "ns7", "http://tktsvc.aots.att.com/ticket"));
            soapElement6.addTextNode("true");
            SOAPElement soapElement7 = getTicketInput.addChildElement(envelope.createName("GetLocationDetailsInfo", "ns8", "http://tktsvc.aots.att.com/ticket"));
            soapElement7.addTextNode("true");
            SOAPElement soapElement8 = getTicketInput.addChildElement(envelope.createName("GetEventTotalDowntimeInfo", "ns9", "http://tktsvc.aots.att.com/ticket"));
            soapElement8.addTextNode("true");
            SOAPElement soapElement9 = getTicketInput.addChildElement(envelope.createName("GetBvoipLocationInfo", "ns10", "http://tktsvc.aots.att.com/ticket"));
            soapElement9.addTextNode("true");
            SOAPElement soapElement10 = getTicketInput.addChildElement(envelope.createName("GetMTTRInfo", "ns11", "http://tktsvc.aots.att.com/ticket"));
            soapElement10.addTextNode("true");
            SOAPElement soapElement11 = getTicketInput.addChildElement(envelope.createName("GetMTTRChangeHistoryInfo", "ns12", "http://tktsvc.aots.att.com/ticket"));
            soapElement11.addTextNode("true");
            SOAPElement soapElement16 = getTicketInput.addChildElement(envelope.createName("GetAccountContractDetailsInfo", "ns14", "http://tktsvc.aots.att.com/ticket"));
            soapElement16.addTextNode("true");
            SOAPElement soapElement12 = getTicketInput.addChildElement(envelope.createName("GetUniqueLogID", "ns15", "http://tktsvc.aots.att.com/ticket"));
            soapElement12.addTextNode("true");
            SOAPElement soapElement13 = getTicketInput.addChildElement(envelope.createName("GetIVRNotificationEventsInfo", "ns16", "http://tktsvc.aots.att.com/ticket"));
            soapElement13.addTextNode("true");
            SOAPElement soapElement14 = getTicketInput.addChildElement(envelope.createName("GetLCONDetailsInfo", "ns17", "http://tktsvc.aots.att.com/ticket"));
            soapElement14.addTextNode("true");
            SOAPElement soapElement15 = getTicketInput.addChildElement(envelope.createName("GetRelatedTicketInfo", "ns18", "http://tktsvc.aots.att.com/ticket"));
            soapElement15.addTextNode("true");













/*

            SOAPElement headerChild1 = header1.addChildElement(envelope.createName("user"));
            SOAPElement headerGrantChild1 = headerChild1.addChildElement("substitute");
            Name p1=envelope.createName("property");
            headerGrantChild1.addAttribute(p1, "username");

            SOAPElement headerChild2 = header1.addChildElement(envelope.createName("password"));
            SOAPElement headerGrantChild2 = headerChild2.addChildElement("substitute");
            Name p2=envelope.createName("property");
            headerGrantChild2.addAttribute(p2, "password");

            SOAPElement header2 = headerElement.addChildElement(envelope.createName("requestID"));
            SOAPElement header2Child = header2.addChildElement("substitute");
            Name p3=envelope.createName("property");
            header2Child.addAttribute(p3, "requestId");

// Create a SOAPBodyElement
            Name bodyName = envelope.createName("netw.Network", "", "xmlapi_1.0");
            SOAPBodyElement bodyElement = body.addBodyElement(bodyName);

// Insert Content
            Name name = envelope.createName("instanceFullName");
            SOAPElement symbol = bodyElement.addChildElement(name);
            symbol.addTextNode("network:");

            Name prop = envelope.createName("substitute");
            SOAPElement prop1 = symbol.addChildElement(prop);
            Name property=envelope.createName("property");
            prop1.addAttribute(property, "ipAddress");


            Name name1 = envelope.createName("command");
            SOAPElement symbol1= bodyElement.addChildElement(name1);
            symbol1.addTextNode("command name");


            Name prop2 = envelope.createName("substitute");
            SOAPElement prop3 = symbol1.addChildElement(prop2);
            Name property1=envelope.createName("property");
            prop3.addAttribute(property1, "Id1");

            symbol1.addTextNode("text goes here");

            Name prop4= envelope.createName("substitute");
            SOAPElement prop5 = symbol1.addChildElement(prop4);
            Name property2=envelope.createName("property");
            prop5.addAttribute(property2, "id2");
*/


// Create an endpint point which is either URL or String type
            URL endpoint = new URL("http://localhost:8080/CreateSoap");

// Check the input
            System.out.println("\nSOAP REQUEST:\n");
            message.writeTo(System.out);
            System.out.println();

// Send a SOAPMessage (request) and then wait for SOAPMessage (response)
//SOAPMessage response = connection.call(message, endpoint);


// Close the SOAPConnection
            connection.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}



