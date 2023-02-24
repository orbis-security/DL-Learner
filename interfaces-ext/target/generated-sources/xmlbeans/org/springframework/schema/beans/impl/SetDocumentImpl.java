/*
 * An XML document type.
 * Localname: set
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.SetDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one set(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class SetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.SetDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SET$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "set");
    
    
    /**
     * Gets the "set" element
     */
    public org.springframework.schema.beans.SetDocument.Set getSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.SetDocument.Set target = null;
            target = (org.springframework.schema.beans.SetDocument.Set)get_store().find_element_user(SET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "set" element
     */
    public void setSet(org.springframework.schema.beans.SetDocument.Set set)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.SetDocument.Set target = null;
            target = (org.springframework.schema.beans.SetDocument.Set)get_store().find_element_user(SET$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.SetDocument.Set)get_store().add_element_user(SET$0);
            }
            target.set(set);
        }
    }
    
    /**
     * Appends and returns a new empty "set" element
     */
    public org.springframework.schema.beans.SetDocument.Set addNewSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.SetDocument.Set target = null;
            target = (org.springframework.schema.beans.SetDocument.Set)get_store().add_element_user(SET$0);
            return target;
        }
    }
    /**
     * An XML set(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class SetImpl extends org.springframework.schema.beans.impl.ListOrSetTypeImpl implements org.springframework.schema.beans.SetDocument.Set
    {
        private static final long serialVersionUID = 1L;
        
        public SetImpl(org.apache.xmlbeans.SchemaType sType)
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
