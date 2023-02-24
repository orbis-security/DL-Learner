/*
 * An XML document type.
 * Localname: entry
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.EntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one entry(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class EntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.EntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRY$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "entry");
    
    
    /**
     * Gets the "entry" element
     */
    public org.springframework.schema.beans.EntryType getEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.EntryType target = null;
            target = (org.springframework.schema.beans.EntryType)get_store().find_element_user(ENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entry" element
     */
    public void setEntry(org.springframework.schema.beans.EntryType entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.EntryType target = null;
            target = (org.springframework.schema.beans.EntryType)get_store().find_element_user(ENTRY$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.EntryType)get_store().add_element_user(ENTRY$0);
            }
            target.set(entry);
        }
    }
    
    /**
     * Appends and returns a new empty "entry" element
     */
    public org.springframework.schema.beans.EntryType addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.EntryType target = null;
            target = (org.springframework.schema.beans.EntryType)get_store().add_element_user(ENTRY$0);
            return target;
        }
    }
}
