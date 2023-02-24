/*
 * XML Type:  mapType
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.MapType
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * An XML mapType(@http://www.springframework.org/schema/beans).
 *
 * This is a complex type.
 */
public class MapTypeImpl extends org.springframework.schema.beans.impl.CollectionTypeImpl implements org.springframework.schema.beans.MapType
{
    private static final long serialVersionUID = 1L;
    
    public MapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "description");
    private static final javax.xml.namespace.QName ENTRY$2 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "entry");
    private static final javax.xml.namespace.QName KEYTYPE$4 = 
        new javax.xml.namespace.QName("", "key-type");
    
    
    /**
     * Gets the "description" element
     */
    public org.springframework.schema.beans.DescriptionDocument.Description getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.DescriptionDocument.Description target = null;
            target = (org.springframework.schema.beans.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.springframework.schema.beans.DescriptionDocument.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.DescriptionDocument.Description target = null;
            target = (org.springframework.schema.beans.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.springframework.schema.beans.DescriptionDocument.Description addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.DescriptionDocument.Description target = null;
            target = (org.springframework.schema.beans.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets array of all "entry" elements
     */
    public org.springframework.schema.beans.EntryType[] getEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTRY$2, targetList);
            org.springframework.schema.beans.EntryType[] result = new org.springframework.schema.beans.EntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entry" element
     */
    public org.springframework.schema.beans.EntryType getEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.EntryType target = null;
            target = (org.springframework.schema.beans.EntryType)get_store().find_element_user(ENTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entry" element
     */
    public int sizeOfEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRY$2);
        }
    }
    
    /**
     * Sets array of all "entry" element
     */
    public void setEntryArray(org.springframework.schema.beans.EntryType[] entryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entryArray, ENTRY$2);
        }
    }
    
    /**
     * Sets ith "entry" element
     */
    public void setEntryArray(int i, org.springframework.schema.beans.EntryType entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.EntryType target = null;
            target = (org.springframework.schema.beans.EntryType)get_store().find_element_user(ENTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    public org.springframework.schema.beans.EntryType insertNewEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.EntryType target = null;
            target = (org.springframework.schema.beans.EntryType)get_store().insert_element_user(ENTRY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    public org.springframework.schema.beans.EntryType addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.EntryType target = null;
            target = (org.springframework.schema.beans.EntryType)get_store().add_element_user(ENTRY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "entry" element
     */
    public void removeEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRY$2, i);
        }
    }
    
    /**
     * Gets the "key-type" attribute
     */
    public java.lang.String getKeyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYTYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "key-type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetKeyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYTYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "key-type" attribute
     */
    public boolean isSetKeyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KEYTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "key-type" attribute
     */
    public void setKeyType(java.lang.String keyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEYTYPE$4);
            }
            target.setStringValue(keyType);
        }
    }
    
    /**
     * Sets (as xml) the "key-type" attribute
     */
    public void xsetKeyType(org.apache.xmlbeans.XmlString keyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEYTYPE$4);
            }
            target.set(keyType);
        }
    }
    
    /**
     * Unsets the "key-type" attribute
     */
    public void unsetKeyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KEYTYPE$4);
        }
    }
}
