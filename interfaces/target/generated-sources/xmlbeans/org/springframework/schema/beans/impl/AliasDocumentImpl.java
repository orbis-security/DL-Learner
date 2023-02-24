/*
 * An XML document type.
 * Localname: alias
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.AliasDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one alias(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class AliasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.AliasDocument
{
    private static final long serialVersionUID = 1L;
    
    public AliasDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIAS$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "alias");
    
    
    /**
     * Gets the "alias" element
     */
    public org.springframework.schema.beans.AliasDocument.Alias getAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.AliasDocument.Alias target = null;
            target = (org.springframework.schema.beans.AliasDocument.Alias)get_store().find_element_user(ALIAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "alias" element
     */
    public void setAlias(org.springframework.schema.beans.AliasDocument.Alias alias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.AliasDocument.Alias target = null;
            target = (org.springframework.schema.beans.AliasDocument.Alias)get_store().find_element_user(ALIAS$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.AliasDocument.Alias)get_store().add_element_user(ALIAS$0);
            }
            target.set(alias);
        }
    }
    
    /**
     * Appends and returns a new empty "alias" element
     */
    public org.springframework.schema.beans.AliasDocument.Alias addNewAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.AliasDocument.Alias target = null;
            target = (org.springframework.schema.beans.AliasDocument.Alias)get_store().add_element_user(ALIAS$0);
            return target;
        }
    }
    /**
     * An XML alias(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class AliasImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.AliasDocument.Alias
    {
        private static final long serialVersionUID = 1L;
        
        public AliasImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName ALIAS$2 = 
            new javax.xml.namespace.QName("", "alias");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "alias" attribute
         */
        public java.lang.String getAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIAS$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "alias" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALIAS$2);
                return target;
            }
        }
        
        /**
         * Sets the "alias" attribute
         */
        public void setAlias(java.lang.String alias)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIAS$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIAS$2);
                }
                target.setStringValue(alias);
            }
        }
        
        /**
         * Sets (as xml) the "alias" attribute
         */
        public void xsetAlias(org.apache.xmlbeans.XmlString alias)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALIAS$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALIAS$2);
                }
                target.set(alias);
            }
        }
    }
}
