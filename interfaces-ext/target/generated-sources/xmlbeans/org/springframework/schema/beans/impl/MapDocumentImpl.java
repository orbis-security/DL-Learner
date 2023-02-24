/*
 * An XML document type.
 * Localname: map
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.MapDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one map(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class MapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.MapDocument
{
    private static final long serialVersionUID = 1L;
    
    public MapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAP$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "map");
    
    
    /**
     * Gets the "map" element
     */
    public org.springframework.schema.beans.MapDocument.Map getMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MapDocument.Map target = null;
            target = (org.springframework.schema.beans.MapDocument.Map)get_store().find_element_user(MAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map" element
     */
    public void setMap(org.springframework.schema.beans.MapDocument.Map map)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MapDocument.Map target = null;
            target = (org.springframework.schema.beans.MapDocument.Map)get_store().find_element_user(MAP$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.MapDocument.Map)get_store().add_element_user(MAP$0);
            }
            target.set(map);
        }
    }
    
    /**
     * Appends and returns a new empty "map" element
     */
    public org.springframework.schema.beans.MapDocument.Map addNewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MapDocument.Map target = null;
            target = (org.springframework.schema.beans.MapDocument.Map)get_store().add_element_user(MAP$0);
            return target;
        }
    }
    /**
     * An XML map(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class MapImpl extends org.springframework.schema.beans.impl.MapTypeImpl implements org.springframework.schema.beans.MapDocument.Map
    {
        private static final long serialVersionUID = 1L;
        
        public MapImpl(org.apache.xmlbeans.SchemaType sType)
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
