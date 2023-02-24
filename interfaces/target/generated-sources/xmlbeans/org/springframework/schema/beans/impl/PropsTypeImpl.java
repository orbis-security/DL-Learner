/*
 * XML Type:  propsType
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.PropsType
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * An XML propsType(@http://www.springframework.org/schema/beans).
 *
 * This is a complex type.
 */
public class PropsTypeImpl extends org.springframework.schema.beans.impl.CollectionTypeImpl implements org.springframework.schema.beans.PropsType
{
    private static final long serialVersionUID = 1L;
    
    public PropsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROP$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "prop");
    
    
    /**
     * Gets array of all "prop" elements
     */
    public org.springframework.schema.beans.PropDocument.Prop[] getPropArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROP$0, targetList);
            org.springframework.schema.beans.PropDocument.Prop[] result = new org.springframework.schema.beans.PropDocument.Prop[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "prop" element
     */
    public org.springframework.schema.beans.PropDocument.Prop getPropArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropDocument.Prop target = null;
            target = (org.springframework.schema.beans.PropDocument.Prop)get_store().find_element_user(PROP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "prop" element
     */
    public int sizeOfPropArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROP$0);
        }
    }
    
    /**
     * Sets array of all "prop" element
     */
    public void setPropArray(org.springframework.schema.beans.PropDocument.Prop[] propArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propArray, PROP$0);
        }
    }
    
    /**
     * Sets ith "prop" element
     */
    public void setPropArray(int i, org.springframework.schema.beans.PropDocument.Prop prop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropDocument.Prop target = null;
            target = (org.springframework.schema.beans.PropDocument.Prop)get_store().find_element_user(PROP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(prop);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prop" element
     */
    public org.springframework.schema.beans.PropDocument.Prop insertNewProp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropDocument.Prop target = null;
            target = (org.springframework.schema.beans.PropDocument.Prop)get_store().insert_element_user(PROP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prop" element
     */
    public org.springframework.schema.beans.PropDocument.Prop addNewProp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropDocument.Prop target = null;
            target = (org.springframework.schema.beans.PropDocument.Prop)get_store().add_element_user(PROP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "prop" element
     */
    public void removeProp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROP$0, i);
        }
    }
}
