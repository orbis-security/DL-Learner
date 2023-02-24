/*
 * An XML document type.
 * Localname: meta
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.MetaDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one meta(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class MetaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.MetaDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName META$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "meta");
    
    
    /**
     * Gets the "meta" element
     */
    public org.springframework.schema.beans.MetaType getMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MetaType target = null;
            target = (org.springframework.schema.beans.MetaType)get_store().find_element_user(META$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "meta" element
     */
    public void setMeta(org.springframework.schema.beans.MetaType meta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MetaType target = null;
            target = (org.springframework.schema.beans.MetaType)get_store().find_element_user(META$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.MetaType)get_store().add_element_user(META$0);
            }
            target.set(meta);
        }
    }
    
    /**
     * Appends and returns a new empty "meta" element
     */
    public org.springframework.schema.beans.MetaType addNewMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MetaType target = null;
            target = (org.springframework.schema.beans.MetaType)get_store().add_element_user(META$0);
            return target;
        }
    }
}
