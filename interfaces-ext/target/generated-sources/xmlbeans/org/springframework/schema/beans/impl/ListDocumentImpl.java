/*
 * An XML document type.
 * Localname: list
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.ListDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one list(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class ListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.ListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIST$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "list");
    
    
    /**
     * Gets the "list" element
     */
    public org.springframework.schema.beans.ListDocument.List getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ListDocument.List target = null;
            target = (org.springframework.schema.beans.ListDocument.List)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "list" element
     */
    public void setList(org.springframework.schema.beans.ListDocument.List list)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ListDocument.List target = null;
            target = (org.springframework.schema.beans.ListDocument.List)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.ListDocument.List)get_store().add_element_user(LIST$0);
            }
            target.set(list);
        }
    }
    
    /**
     * Appends and returns a new empty "list" element
     */
    public org.springframework.schema.beans.ListDocument.List addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ListDocument.List target = null;
            target = (org.springframework.schema.beans.ListDocument.List)get_store().add_element_user(LIST$0);
            return target;
        }
    }
    /**
     * An XML list(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class ListImpl extends org.springframework.schema.beans.impl.ListOrSetTypeImpl implements org.springframework.schema.beans.ListDocument.List
    {
        private static final long serialVersionUID = 1L;
        
        public ListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MERGE$0 = 
            new javax.xml.namespace.QName("", "merge");
        
        
        /**
         * Gets the "merge" attribute
         */
        public org.springframework.schema.beans.DefaultableBoolean.Enum getMerge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERGE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MERGE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.springframework.schema.beans.DefaultableBoolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "merge" attribute
         */
        public org.springframework.schema.beans.DefaultableBoolean xgetMerge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.DefaultableBoolean target = null;
                target = (org.springframework.schema.beans.DefaultableBoolean)get_store().find_attribute_user(MERGE$0);
                if (target == null)
                {
                    target = (org.springframework.schema.beans.DefaultableBoolean)get_default_attribute_value(MERGE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "merge" attribute
         */
        public boolean isSetMerge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MERGE$0) != null;
            }
        }
        
        /**
         * Sets the "merge" attribute
         */
        public void setMerge(org.springframework.schema.beans.DefaultableBoolean.Enum merge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERGE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MERGE$0);
                }
                target.setEnumValue(merge);
            }
        }
        
        /**
         * Sets (as xml) the "merge" attribute
         */
        public void xsetMerge(org.springframework.schema.beans.DefaultableBoolean merge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.DefaultableBoolean target = null;
                target = (org.springframework.schema.beans.DefaultableBoolean)get_store().find_attribute_user(MERGE$0);
                if (target == null)
                {
                    target = (org.springframework.schema.beans.DefaultableBoolean)get_store().add_attribute_user(MERGE$0);
                }
                target.set(merge);
            }
        }
        
        /**
         * Unsets the "merge" attribute
         */
        public void unsetMerge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MERGE$0);
            }
        }
    }
}
