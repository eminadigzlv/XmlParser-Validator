package Parser.xml;

import Parser.xml.Plant;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxParserHandler extends DefaultHandler {
    List<Plant> plants = new ArrayList<>();
    Plant tempPlants;
    private  boolean isplants=false;
    private  boolean isId=false;
    private  boolean isName=false;
    private  boolean isCode=false;
    private  boolean isHibridName=false;
    private  boolean isPatentNumber=false;
    private  boolean isPatentOwner=false;
    private  boolean isStartDte =false;
    private  boolean isEndDte=false;
    private  boolean isRegisterDte=false;

    public List<Plant> getPlants() {
        return plants;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start Document!");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("SEED")){
            isplants=true;
            tempPlants = new Plant();
        }else if(qName.equals("ID")){
            isId=true;
        }else if(qName.equals("NAME")){
            isName=true;
        }else if(qName.equals("CODE")){
            isCode=true;
        }else if(qName.equals("HIBRID_NAME")){
            isHibridName=true;
        }else if(qName.equals("PATENT_NUMBER")){
            isPatentNumber=true;
        }else if(qName.equals("START_DATE")){
            isStartDte=true;
        }else if(qName.equals("PATENT_OWNER")){
            isPatentOwner=true;
        }else if(qName.equals("END_DATE")){
            isEndDte=true;
        }else if(qName.equals("START_REGISTER_DATE")){
            isRegisterDte=true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String data= new String(ch,start,length);
        if(isId)
        {
            tempPlants.setId(Long.parseLong(data));
        }else if(isName)
        {
            tempPlants.setName(data);
        }else if(isCode){
            tempPlants.setCode(Long.parseLong(data));
        }else  if(isHibridName)
        {
            tempPlants.setHibrid_name(data);
        }else if(isPatentNumber){
            tempPlants.setPatent_number(data);
        }else if(isStartDte){
            tempPlants.setStart_date(data);
        }else if (isPatentOwner){
            tempPlants.setPatent_owner(data);
        }else  if(isEndDte){
            tempPlants.setEnd_date(data);
        }else if(isRegisterDte){
            tempPlants.setStr_register_date(Long.parseLong(data));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("SEED")){
            isplants=false;
            plants.add(tempPlants);
            tempPlants=null;
        }else if(qName.equals("ID")){
            isId=false;
        }else if(qName.equals("NAME")){
            isName=false;
        }else if(qName.equals("CODE")){
            isCode=false;
        }else if(qName.equals("HIBRID_NAME")){
            isHibridName=false;
        }else if(qName.equals("PATENT_NUMBER")){
            isPatentNumber=false;
        }else if(qName.equals("START_DATE")){
            isStartDte=false;
        }else if(qName.equals("PATENT_OWNER")){
            isPatentOwner=false;
        }else if(qName.equals("END_DATE")){
            isEndDte=false;
        }else if(qName.equals("START_REGISTER_DATE")){
            isRegisterDte=false;
        }
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End Document!");

    }
}
