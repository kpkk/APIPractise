package entity;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class XMLtoJAVA {

    @Test
    public void test() throws IOException {
        XmlMapper mapper=new XmlMapper();
        Envelope createTicketOutput = mapper.readValue(new File("./src/test/resources/CreateTicketResponse.xml"), Envelope.class);
        System.out.println(createTicketOutput.getBody().getCreateTicketResponse().getCreateTicketOutput().getTicketNum());

        createTicketOutput.getBody().getCreateTicketResponse().getCreateTicketOutput().setTicketNum("CS0011742");



        createTicketOutput ticketOutput=new createTicketOutput();
        ticketOutput.setTicketNum("");
        ticketOutput.setFunctionalArea("");
        ticketOutput.setRequestId("");
        createTicketResponse createTicketResponse=new createTicketResponse();
        createTicketResponse.setCreateTicketOutput(ticketOutput);
      //  createTicketResponse.getWSResponseHeader();
        Envelope env=new Envelope();
      //  env.setBody();
        mapper.writeValue(new File("./getXML.xml"),new Envelope());

        String ticket = setBody("CS0011743");
        System.out.println(ticket);


    }

    public String setBody(String ticketNum){
        return "<?xml version='1.0' encoding='utf-8'?>\n" +
                "<soap-env:Envelope xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <soap-env:Header>\n" +
                "        <wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">\n" +
                "            <wsse:UsernameToken>\n" +
                "                <wsse:Username>expresst</wsse:Username>\n" +
                "                <wsse:Password\n" +
                "                        Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">\n" +
                "                    etkt0813\n" +
                "                </wsse:Password>\n" +
                "            </wsse:UsernameToken>\n" +
                "        </wsse:Security>\n" +
                "    </soap-env:Header>\n" +
                "    <soap-env:Body>\n" +
                "        <ns0:getTicketRequest xmlns:ns0=\"http://aots.att.com/ticket/v1\">\n" +
                "            <ns1:WSHeader xmlns:ns1=\"http://cio.att.com/commonheader/v3\">\n" +
                "                <ns1:WSContext>\n" +
                "                    <ns1:FromAppId>ETT_aotsGetTicket</ns1:FromAppId>\n" +
                "                    <ns1:SourceIPAddress>express-ticketing-84d5594bc7-wvckz</ns1:SourceIPAddress>\n" +
                "                </ns1:WSContext>\n" +
                "            </ns1:WSHeader>\n" +
                "            <ns0:getTicketInput>\n" +
                "                <ns2:FieldsList xmlns:ns2=\"http://tktsvc.aots.att.com/ticket\">\n" +
                "                    <ns2:String>NBIPVPNIndicator</ns2:String>\n" +
                "                    <ns2:String>ReptSvcLineDescText</ns2:String>\n" +
                "                    <ns2:String>FunctionalArea</ns2:String>\n" +
                "                    <ns2:String>TicketOpened</ns2:String>\n" +
                "                    <ns2:String>TicketState</ns2:String>\n" +
                "                    <ns2:String>TicketRole</ns2:String>\n" +
                "                    <ns2:String>LocationStateProvince</ns2:String>\n" +
                "                    <ns2:String>AssetLocationState</ns2:String>\n" +
                "                    <ns2:String>BvoipStateProvince</ns2:String>\n" +
                "                    <ns2:String>AssetLocationCountry</ns2:String>\n" +
                "                    <ns2:String>BvoipCountryCode</ns2:String>\n" +
                "                    <ns2:String>ISOCountryCode</ns2:String>\n" +
                "                    <ns2:String>LocationCountry</ns2:String>\n" +
                "                    <ns2:String>TelephoneCountryCode</ns2:String>\n" +
                "                    <ns2:String>ProviderTicketNum</ns2:String>\n" +
                "                    <ns2:String>ResolutionSetDescription</ns2:String>\n" +
                "                    <ns2:String>CurrentStatus</ns2:String>\n" +
                "                    <ns2:String>OrgGroup</ns2:String>\n" +
                "                    <ns2:String>MCN</ns2:String>\n" +
                "                    <ns2:String>AssetType</ns2:String>\n" +
                "                    <ns2:String>ActiveOrg</ns2:String>\n" +
                "                    <ns2:String>ClientTicketNum</ns2:String>\n" +
                "                    <ns2:String>TestSummary</ns2:String>\n" +
                "                    <ns2:String>DispatchAuthorized</ns2:String>\n" +
                "                    <ns2:String>AuthTest</ns2:String>\n" +
                "                </ns2:FieldsList>\n" +
                "                <ns3:TicketNum xmlns:ns3=\"http://tktsvc.aots.att.com/ticket\">"+ticketNum+"</ns3:TicketNum>\n" +
                "                <ns4:TicketClass xmlns:ns4=\"http://tktsvc.aots.att.com/ticket\">TT</ns4:TicketClass>\n" +
                "                <ns5:LogQualifier xmlns:ns5=\"http://tktsvc.aots.att.com/ticket\">3</ns5:LogQualifier>\n" +
                "                <ns6:GetLocationInfo xmlns:ns6=\"http://tktsvc.aots.att.com/ticket\">true</ns6:GetLocationInfo>\n" +
                "                <ns7:GetPVCDetailsInfo xmlns:ns7=\"http://tktsvc.aots.att.com/ticket\">true</ns7:GetPVCDetailsInfo>\n" +
                "                <ns8:GetLocationDetailsInfo xmlns:ns8=\"http://tktsvc.aots.att.com/ticket\">true\n" +
                "                </ns8:GetLocationDetailsInfo>\n" +
                "                <ns9:GetEventTotalDowntimeInfo xmlns:ns9=\"http://tktsvc.aots.att.com/ticket\">true\n" +
                "                </ns9:GetEventTotalDowntimeInfo>\n" +
                "                <ns10:GetBvoipLocationInfo xmlns:ns10=\"http://tktsvc.aots.att.com/ticket\">true\n" +
                "                </ns10:GetBvoipLocationInfo>\n" +
                "                <ns11:GetMTTRInfo xmlns:ns11=\"http://tktsvc.aots.att.com/ticket\">true</ns11:GetMTTRInfo>\n" +
                "                <ns12:GetMTTRChangeHistoryInfo xmlns:ns12=\"http://tktsvc.aots.att.com/ticket\">true\n" +
                "                </ns12:GetMTTRChangeHistoryInfo>\n" +
                "                <ns14:GetAccountContractDetailsInfo xmlns:ns14=\"http://tktsvc.aots.att.com/ticket\">true\n" +
                "                </ns14:GetAccountContractDetailsInfo>\n" +
                "                <ns15:GetUniqueLogID xmlns:ns15=\"http://tktsvc.aots.att.com/ticket\">true</ns15:GetUniqueLogID>\n" +
                "                <ns16:GetIVRNotificationEventsInfo xmlns:ns16=\"http://tktsvc.aots.att.com/ticket\">true\n" +
                "                </ns16:GetIVRNotificationEventsInfo>\n" +
                "                <ns17:GetLCONDetailsInfo xmlns:ns17=\"http://tktsvc.aots.att.com/ticket\">true</ns17:GetLCONDetailsInfo>\n" +
                "                <ns18:GetRelatedTicketInfo xmlns:ns18=\"http://tktsvc.aots.att.com/ticket\">true\n" +
                "                </ns18:GetRelatedTicketInfo>\n" +
                "            </ns0:getTicketInput>\n" +
                "        </ns0:getTicketRequest>\n" +
                "    </soap-env:Body>\n" +
                "</soap-env:Envelope>\n";

    }
}
