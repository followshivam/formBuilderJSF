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
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author GOLDY0
 */
@ManagedBean(name ="sectionBean")
@SessionScoped
public class sectionBean {
    private int sectionIndex;
    private String name; // label of the field
    private String key; // some key to identify the field
    private String value; // the value of field
    private String type; // can be input,radio,selectbox etc
    private List<sectionBean> items= new ArrayList<>();
    
    
    public sectionBean(){
    }
    public sectionBean(String name,String key,String value,String type) {
//      items= new ArrayList<>();
        this.name=name;
        this.key=key;
        this.value=value;
        this.type=type;
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

    public List<sectionBean> getItems() {
        return items;
    }

    public void setItems(List<sectionBean> items) {
        this.items = items;
    }
    public void display() {
		System.out.println("name: "+ this.name);
		System.out.println("key: "+ this.key);
		System.out.println("type: "+ this.type);
                System.out.println("value: "+ this.value);
	}
    
    public String addSection(){
        display();
        sectionBean item=new sectionBean(name,key,value,type);
        items.add(item);
        System.out.println(items);
        return "index.xhtml?faces-redirect=true";
    }
    public String removeSection(){
        items.remove(name);
        return "index.xhtml?faces-redirect=true";
    }
    
}
