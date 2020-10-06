/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ApplicationScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author GOLDY0
 */
@ManagedBean(name ="sectionBean2")
@ApplicationScoped
public class sectionBean2 {
    private String surveyTitle=null;
    private String clickedID;
    private int sectionIndex=0;
    private int itemIndex=8;
    private String name; // label of the field
    private String key; // some key to identify the field
    private String value; // the value of field
    private String type; // can be input,radio,selectbox etc
//    private List<sectionBean2> items= new ArrayList<>();
//    private List<List<sectionBean2>> sections=new ArrayList<>();
    private List<sectionBean2>[] sections = new ArrayList[itemIndex];

    public String getSurveyTitle() {
        return surveyTitle;
    }

    public void setSurveyTitle(String SurveyTitle) {
        this.surveyTitle = surveyTitle;
    }
    public String getClickedID() {
        return clickedID;
    }

    public void setClickedID(String clickedID) {
        this.clickedID = clickedID;
    }
    
    public int getSectionIndex() {
        return sectionIndex;
    }
    public sectionBean2(){
    }
    public sectionBean2(String name,String key,String value,String type) {
        this.name=name;
        this.key=key;
        this.value=value;
        this.type=type;
    }
    public void setSectionIndex(int sectionIndex) {
        this.sectionIndex = sectionIndex;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getItemIndex() {
        return itemIndex;
    }
    public void setItemIndex(int itemIndex) {
        this.itemIndex = itemIndex;
    }
    public List<sectionBean2>[] getSections() {
        return sections;
    }

    public void setSections(List<sectionBean2>[] sections) {
        this.sections = sections;
    }
    
    public void display() {
		System.out.println("name: "+ this.name);
		System.out.println("key: "+ this.key);
		System.out.println("type: "+ this.type);
                System.out.println("value: "+ this.value);
	}
    public String addItemList(){
        return null;
    }
    public String addItem(){
//        display();
        sectionBean2 item=new sectionBean2(name,key,value,type);
        sections[sectionIndex-1].add(item);
        
        for(int i= 0; i<itemIndex ; i++) { 
            System.out.println(sections[i]);
        } 
        return "index.xhtml?faces-redirect=true";
        }
    
    public String addSection(){
        if(sectionIndex==0){
        for(int i= 0; i<itemIndex ; i++) { 
            sections[i] = new ArrayList<sectionBean2>(); 
        } }
        
        sectionBean2 sectionItem=new sectionBean2(name,key,value,type);
        sections[sectionIndex].add(sectionItem);
        sectionIndex=sectionIndex+1;
        
        int size=sections.length;
        System.out.print(size);
        for(int i= 0; i<itemIndex ; i++) { 
            System.out.println(sections[i]);
        } 
        return "index.xhtml?faces-redirect=true";
    }
    public String addTitle(){
        System.out.print(surveyTitle);
        return "index.xhtml?faces-redirect=true";
    }
    public String selectSectionIndex(){
            String id=clickedID;
            String[] parts=id.split(":");
            int a=Integer.parseInt(parts[2]);
            System.out.println(a);
            sectionIndex=a;
            return "index.xhtml?faces-redirect=true";
    }
    
    
}
