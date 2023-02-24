/*
 * XML Type:  propertyType
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.PropertyType
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * An XML propertyType(@http://www.springframework.org/schema/beans).
 *
 * This is a complex type.
 */
public class PropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.PropertyType
{
    private static final long serialVersionUID = 1L;
    
    public PropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "description");
    private static final javax.xml.namespace.QName META$2 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "meta");
    private static final javax.xml.namespace.QName BEAN$4 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "bean");
    private static final javax.xml.namespace.QName REF$6 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "ref");
    private static final javax.xml.namespace.QName IDREF$8 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "idref");
    private static final javax.xml.namespace.QName VALUE$10 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "value");
    private static final javax.xml.namespace.QName NULL$12 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "null");
    private static final javax.xml.namespace.QName ARRAY$14 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "array");
    private static final javax.xml.namespace.QName LIST$16 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "list");
    private static final javax.xml.namespace.QName SET$18 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "set");
    private static final javax.xml.namespace.QName MAP$20 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "map");
    private static final javax.xml.namespace.QName PROPS$22 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "props");
    private static final javax.xml.namespace.QName NAME$24 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName REF2$26 = 
        new javax.xml.namespace.QName("", "ref");
    private static final javax.xml.namespace.QName VALUE2$28 = 
        new javax.xml.namespace.QName("", "value");
    
    
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
     * Gets the "meta" element
     */
    public org.springframework.schema.beans.MetaType getMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MetaType target = null;
            target = (org.springframework.schema.beans.MetaType)get_store().find_element_user(META$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "meta" element
     */
    public boolean isSetMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(META$2) != 0;
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
            target = (org.springframework.schema.beans.MetaType)get_store().find_element_user(META$2, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.MetaType)get_store().add_element_user(META$2);
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
            target = (org.springframework.schema.beans.MetaType)get_store().add_element_user(META$2);
            return target;
        }
    }
    
    /**
     * Unsets the "meta" element
     */
    public void unsetMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(META$2, 0);
        }
    }
    
    /**
     * Gets the "bean" element
     */
    public org.springframework.schema.beans.BeanDocument.Bean getBean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeanDocument.Bean target = null;
            target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().find_element_user(BEAN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bean" element
     */
    public boolean isSetBean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEAN$4) != 0;
        }
    }
    
    /**
     * Sets the "bean" element
     */
    public void setBean(org.springframework.schema.beans.BeanDocument.Bean bean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeanDocument.Bean target = null;
            target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().find_element_user(BEAN$4, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().add_element_user(BEAN$4);
            }
            target.set(bean);
        }
    }
    
    /**
     * Appends and returns a new empty "bean" element
     */
    public org.springframework.schema.beans.BeanDocument.Bean addNewBean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeanDocument.Bean target = null;
            target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().add_element_user(BEAN$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bean" element
     */
    public void unsetBean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEAN$4, 0);
        }
    }
    
    /**
     * Gets the "ref" element
     */
    public org.springframework.schema.beans.RefDocument.Ref getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.RefDocument.Ref target = null;
            target = (org.springframework.schema.beans.RefDocument.Ref)get_store().find_element_user(REF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ref" element
     */
    public boolean isSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REF$6) != 0;
        }
    }
    
    /**
     * Sets the "ref" element
     */
    public void setRef(org.springframework.schema.beans.RefDocument.Ref ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.RefDocument.Ref target = null;
            target = (org.springframework.schema.beans.RefDocument.Ref)get_store().find_element_user(REF$6, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.RefDocument.Ref)get_store().add_element_user(REF$6);
            }
            target.set(ref);
        }
    }
    
    /**
     * Appends and returns a new empty "ref" element
     */
    public org.springframework.schema.beans.RefDocument.Ref addNewRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.RefDocument.Ref target = null;
            target = (org.springframework.schema.beans.RefDocument.Ref)get_store().add_element_user(REF$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ref" element
     */
    public void unsetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REF$6, 0);
        }
    }
    
    /**
     * Gets the "idref" element
     */
    public org.springframework.schema.beans.IdrefDocument.Idref getIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.IdrefDocument.Idref target = null;
            target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().find_element_user(IDREF$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "idref" element
     */
    public boolean isSetIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDREF$8) != 0;
        }
    }
    
    /**
     * Sets the "idref" element
     */
    public void setIdref(org.springframework.schema.beans.IdrefDocument.Idref idref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.IdrefDocument.Idref target = null;
            target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().find_element_user(IDREF$8, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().add_element_user(IDREF$8);
            }
            target.set(idref);
        }
    }
    
    /**
     * Appends and returns a new empty "idref" element
     */
    public org.springframework.schema.beans.IdrefDocument.Idref addNewIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.IdrefDocument.Idref target = null;
            target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().add_element_user(IDREF$8);
            return target;
        }
    }
    
    /**
     * Unsets the "idref" element
     */
    public void unsetIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDREF$8, 0);
        }
    }
    
    /**
     * Gets the "value" element
     */
    public org.springframework.schema.beans.ValueDocument.Value getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ValueDocument.Value target = null;
            target = (org.springframework.schema.beans.ValueDocument.Value)get_store().find_element_user(VALUE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$10) != 0;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.springframework.schema.beans.ValueDocument.Value value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ValueDocument.Value target = null;
            target = (org.springframework.schema.beans.ValueDocument.Value)get_store().find_element_user(VALUE$10, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.ValueDocument.Value)get_store().add_element_user(VALUE$10);
            }
            target.set(value);
        }
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.springframework.schema.beans.ValueDocument.Value addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ValueDocument.Value target = null;
            target = (org.springframework.schema.beans.ValueDocument.Value)get_store().add_element_user(VALUE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$10, 0);
        }
    }
    
    /**
     * Gets the "null" element
     */
    public org.springframework.schema.beans.NullDocument.Null getNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.NullDocument.Null target = null;
            target = (org.springframework.schema.beans.NullDocument.Null)get_store().find_element_user(NULL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "null" element
     */
    public boolean isSetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NULL$12) != 0;
        }
    }
    
    /**
     * Sets the "null" element
     */
    public void setNull(org.springframework.schema.beans.NullDocument.Null xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.NullDocument.Null target = null;
            target = (org.springframework.schema.beans.NullDocument.Null)get_store().find_element_user(NULL$12, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.NullDocument.Null)get_store().add_element_user(NULL$12);
            }
            target.set(xnull);
        }
    }
    
    /**
     * Appends and returns a new empty "null" element
     */
    public org.springframework.schema.beans.NullDocument.Null addNewNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.NullDocument.Null target = null;
            target = (org.springframework.schema.beans.NullDocument.Null)get_store().add_element_user(NULL$12);
            return target;
        }
    }
    
    /**
     * Unsets the "null" element
     */
    public void unsetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NULL$12, 0);
        }
    }
    
    /**
     * Gets the "array" element
     */
    public org.springframework.schema.beans.ArrayDocument.Array getArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ArrayDocument.Array target = null;
            target = (org.springframework.schema.beans.ArrayDocument.Array)get_store().find_element_user(ARRAY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "array" element
     */
    public boolean isSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAY$14) != 0;
        }
    }
    
    /**
     * Sets the "array" element
     */
    public void setArray(org.springframework.schema.beans.ArrayDocument.Array array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ArrayDocument.Array target = null;
            target = (org.springframework.schema.beans.ArrayDocument.Array)get_store().find_element_user(ARRAY$14, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.ArrayDocument.Array)get_store().add_element_user(ARRAY$14);
            }
            target.set(array);
        }
    }
    
    /**
     * Appends and returns a new empty "array" element
     */
    public org.springframework.schema.beans.ArrayDocument.Array addNewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ArrayDocument.Array target = null;
            target = (org.springframework.schema.beans.ArrayDocument.Array)get_store().add_element_user(ARRAY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "array" element
     */
    public void unsetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAY$14, 0);
        }
    }
    
    /**
     * Gets the "list" element
     */
    public org.springframework.schema.beans.ListDocument.List getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ListDocument.List target = null;
            target = (org.springframework.schema.beans.ListDocument.List)get_store().find_element_user(LIST$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "list" element
     */
    public boolean isSetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIST$16) != 0;
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
            target = (org.springframework.schema.beans.ListDocument.List)get_store().find_element_user(LIST$16, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.ListDocument.List)get_store().add_element_user(LIST$16);
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
            target = (org.springframework.schema.beans.ListDocument.List)get_store().add_element_user(LIST$16);
            return target;
        }
    }
    
    /**
     * Unsets the "list" element
     */
    public void unsetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIST$16, 0);
        }
    }
    
    /**
     * Gets the "set" element
     */
    public org.springframework.schema.beans.SetDocument.Set getSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.SetDocument.Set target = null;
            target = (org.springframework.schema.beans.SetDocument.Set)get_store().find_element_user(SET$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "set" element
     */
    public boolean isSetSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SET$18) != 0;
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
            target = (org.springframework.schema.beans.SetDocument.Set)get_store().find_element_user(SET$18, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.SetDocument.Set)get_store().add_element_user(SET$18);
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
            target = (org.springframework.schema.beans.SetDocument.Set)get_store().add_element_user(SET$18);
            return target;
        }
    }
    
    /**
     * Unsets the "set" element
     */
    public void unsetSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SET$18, 0);
        }
    }
    
    /**
     * Gets the "map" element
     */
    public org.springframework.schema.beans.MapDocument.Map getMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MapDocument.Map target = null;
            target = (org.springframework.schema.beans.MapDocument.Map)get_store().find_element_user(MAP$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "map" element
     */
    public boolean isSetMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAP$20) != 0;
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
            target = (org.springframework.schema.beans.MapDocument.Map)get_store().find_element_user(MAP$20, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.MapDocument.Map)get_store().add_element_user(MAP$20);
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
            target = (org.springframework.schema.beans.MapDocument.Map)get_store().add_element_user(MAP$20);
            return target;
        }
    }
    
    /**
     * Unsets the "map" element
     */
    public void unsetMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAP$20, 0);
        }
    }
    
    /**
     * Gets the "props" element
     */
    public org.springframework.schema.beans.PropsDocument.Props getProps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropsDocument.Props target = null;
            target = (org.springframework.schema.beans.PropsDocument.Props)get_store().find_element_user(PROPS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "props" element
     */
    public boolean isSetProps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPS$22) != 0;
        }
    }
    
    /**
     * Sets the "props" element
     */
    public void setProps(org.springframework.schema.beans.PropsDocument.Props props)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropsDocument.Props target = null;
            target = (org.springframework.schema.beans.PropsDocument.Props)get_store().find_element_user(PROPS$22, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.PropsDocument.Props)get_store().add_element_user(PROPS$22);
            }
            target.set(props);
        }
    }
    
    /**
     * Appends and returns a new empty "props" element
     */
    public org.springframework.schema.beans.PropsDocument.Props addNewProps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropsDocument.Props target = null;
            target = (org.springframework.schema.beans.PropsDocument.Props)get_store().add_element_user(PROPS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "props" element
     */
    public void unsetProps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPS$22, 0);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$24);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "ref" attribute
     */
    public java.lang.String getRef2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF2$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRef2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF2$26);
            return target;
        }
    }
    
    /**
     * True if has "ref" attribute
     */
    public boolean isSetRef2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REF2$26) != null;
        }
    }
    
    /**
     * Sets the "ref" attribute
     */
    public void setRef2(java.lang.String ref2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF2$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF2$26);
            }
            target.setStringValue(ref2);
        }
    }
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    public void xsetRef2(org.apache.xmlbeans.XmlString ref2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF2$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF2$26);
            }
            target.set(ref2);
        }
    }
    
    /**
     * Unsets the "ref" attribute
     */
    public void unsetRef2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REF2$26);
        }
    }
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.String getValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE2$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE2$28);
            return target;
        }
    }
    
    /**
     * True if has "value" attribute
     */
    public boolean isSetValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUE2$28) != null;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue2(java.lang.String value2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE2$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE2$28);
            }
            target.setStringValue(value2);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue2(org.apache.xmlbeans.XmlString value2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE2$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE2$28);
            }
            target.set(value2);
        }
    }
    
    /**
     * Unsets the "value" attribute
     */
    public void unsetValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUE2$28);
        }
    }
}
