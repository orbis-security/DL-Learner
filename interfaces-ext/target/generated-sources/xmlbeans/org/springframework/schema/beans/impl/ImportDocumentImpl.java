/*
 * An XML document type.
 * Localname: import
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.ImportDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one import(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class ImportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.ImportDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "import");
    
    
    /**
     * Gets the "import" element
     */
    public org.springframework.schema.beans.ImportDocument.Import getImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ImportDocument.Import target = null;
            target = (org.springframework.schema.beans.ImportDocument.Import)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "import" element
     */
    public void setImport(org.springframework.schema.beans.ImportDocument.Import ximport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ImportDocument.Import target = null;
            target = (org.springframework.schema.beans.ImportDocument.Import)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.ImportDocument.Import)get_store().add_element_user(IMPORT$0);
            }
            target.set(ximport);
        }
    }
    
    /**
     * Appends and returns a new empty "import" element
     */
    public org.springframework.schema.beans.ImportDocument.Import addNewImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ImportDocument.Import target = null;
            target = (org.springframework.schema.beans.ImportDocument.Import)get_store().add_element_user(IMPORT$0);
            return target;
        }
    }
    /**
     * An XML import(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class ImportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.ImportDocument.Import
    {
        private static final long serialVersionUID = 1L;
        
        public ImportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCE$0 = 
            new javax.xml.namespace.QName("", "resource");
        
        
        /**
         * Gets the "resource" attribute
         */
        public java.lang.String getResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "resource" attribute
         */
        public org.apache.xmlbeans.XmlString xgetResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCE$0);
                return target;
            }
        }
        
        /**
         * Sets the "resource" attribute
         */
        public void setResource(java.lang.String resource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOURCE$0);
                }
                target.setStringValue(resource);
            }
        }
        
        /**
         * Sets (as xml) the "resource" attribute
         */
        public void xsetResource(org.apache.xmlbeans.XmlString resource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESOURCE$0);
                }
                target.set(resource);
            }
        }
    }
}
