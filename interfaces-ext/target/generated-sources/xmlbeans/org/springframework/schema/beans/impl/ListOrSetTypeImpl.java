/*
 * XML Type:  listOrSetType
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.ListOrSetType
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * An XML listOrSetType(@http://www.springframework.org/schema/beans).
 *
 * This is a complex type.
 */
public class ListOrSetTypeImpl extends org.springframework.schema.beans.impl.CollectionTypeImpl implements org.springframework.schema.beans.ListOrSetType
{
    private static final long serialVersionUID = 1L;
    
    public ListOrSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "description");
    private static final javax.xml.namespace.QName BEAN$2 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "bean");
    private static final javax.xml.namespace.QName REF$4 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "ref");
    private static final javax.xml.namespace.QName IDREF$6 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "idref");
    private static final javax.xml.namespace.QName VALUE$8 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "value");
    private static final javax.xml.namespace.QName NULL$10 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "null");
    private static final javax.xml.namespace.QName ARRAY$12 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "array");
    private static final javax.xml.namespace.QName LIST$14 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "list");
    private static final javax.xml.namespace.QName SET$16 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "set");
    private static final javax.xml.namespace.QName MAP$18 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "map");
    private static final javax.xml.namespace.QName PROPS$20 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "props");
    
    
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
     * Gets array of all "bean" elements
     */
    public org.springframework.schema.beans.BeanDocument.Bean[] getBeanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BEAN$2, targetList);
            org.springframework.schema.beans.BeanDocument.Bean[] result = new org.springframework.schema.beans.BeanDocument.Bean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bean" element
     */
    public org.springframework.schema.beans.BeanDocument.Bean getBeanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeanDocument.Bean target = null;
            target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().find_element_user(BEAN$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bean" element
     */
    public int sizeOfBeanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEAN$2);
        }
    }
    
    /**
     * Sets array of all "bean" element
     */
    public void setBeanArray(org.springframework.schema.beans.BeanDocument.Bean[] beanArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(beanArray, BEAN$2);
        }
    }
    
    /**
     * Sets ith "bean" element
     */
    public void setBeanArray(int i, org.springframework.schema.beans.BeanDocument.Bean bean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeanDocument.Bean target = null;
            target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().find_element_user(BEAN$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bean);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bean" element
     */
    public org.springframework.schema.beans.BeanDocument.Bean insertNewBean(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeanDocument.Bean target = null;
            target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().insert_element_user(BEAN$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bean" element
     */
    public org.springframework.schema.beans.BeanDocument.Bean addNewBean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeanDocument.Bean target = null;
            target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().add_element_user(BEAN$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "bean" element
     */
    public void removeBean(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEAN$2, i);
        }
    }
    
    /**
     * Gets array of all "ref" elements
     */
    public org.springframework.schema.beans.RefDocument.Ref[] getRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REF$4, targetList);
            org.springframework.schema.beans.RefDocument.Ref[] result = new org.springframework.schema.beans.RefDocument.Ref[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ref" element
     */
    public org.springframework.schema.beans.RefDocument.Ref getRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.RefDocument.Ref target = null;
            target = (org.springframework.schema.beans.RefDocument.Ref)get_store().find_element_user(REF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ref" element
     */
    public int sizeOfRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REF$4);
        }
    }
    
    /**
     * Sets array of all "ref" element
     */
    public void setRefArray(org.springframework.schema.beans.RefDocument.Ref[] refArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(refArray, REF$4);
        }
    }
    
    /**
     * Sets ith "ref" element
     */
    public void setRefArray(int i, org.springframework.schema.beans.RefDocument.Ref ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.RefDocument.Ref target = null;
            target = (org.springframework.schema.beans.RefDocument.Ref)get_store().find_element_user(REF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ref);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ref" element
     */
    public org.springframework.schema.beans.RefDocument.Ref insertNewRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.RefDocument.Ref target = null;
            target = (org.springframework.schema.beans.RefDocument.Ref)get_store().insert_element_user(REF$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ref" element
     */
    public org.springframework.schema.beans.RefDocument.Ref addNewRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.RefDocument.Ref target = null;
            target = (org.springframework.schema.beans.RefDocument.Ref)get_store().add_element_user(REF$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ref" element
     */
    public void removeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REF$4, i);
        }
    }
    
    /**
     * Gets array of all "idref" elements
     */
    public org.springframework.schema.beans.IdrefDocument.Idref[] getIdrefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDREF$6, targetList);
            org.springframework.schema.beans.IdrefDocument.Idref[] result = new org.springframework.schema.beans.IdrefDocument.Idref[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "idref" element
     */
    public org.springframework.schema.beans.IdrefDocument.Idref getIdrefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.IdrefDocument.Idref target = null;
            target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().find_element_user(IDREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "idref" element
     */
    public int sizeOfIdrefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDREF$6);
        }
    }
    
    /**
     * Sets array of all "idref" element
     */
    public void setIdrefArray(org.springframework.schema.beans.IdrefDocument.Idref[] idrefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idrefArray, IDREF$6);
        }
    }
    
    /**
     * Sets ith "idref" element
     */
    public void setIdrefArray(int i, org.springframework.schema.beans.IdrefDocument.Idref idref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.IdrefDocument.Idref target = null;
            target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().find_element_user(IDREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(idref);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "idref" element
     */
    public org.springframework.schema.beans.IdrefDocument.Idref insertNewIdref(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.IdrefDocument.Idref target = null;
            target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().insert_element_user(IDREF$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "idref" element
     */
    public org.springframework.schema.beans.IdrefDocument.Idref addNewIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.IdrefDocument.Idref target = null;
            target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().add_element_user(IDREF$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "idref" element
     */
    public void removeIdref(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDREF$6, i);
        }
    }
    
    /**
     * Gets array of all "value" elements
     */
    public org.springframework.schema.beans.ValueDocument.Value[] getValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$8, targetList);
            org.springframework.schema.beans.ValueDocument.Value[] result = new org.springframework.schema.beans.ValueDocument.Value[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "value" element
     */
    public org.springframework.schema.beans.ValueDocument.Value getValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ValueDocument.Value target = null;
            target = (org.springframework.schema.beans.ValueDocument.Value)get_store().find_element_user(VALUE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "value" element
     */
    public int sizeOfValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$8);
        }
    }
    
    /**
     * Sets array of all "value" element
     */
    public void setValueArray(org.springframework.schema.beans.ValueDocument.Value[] valueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueArray, VALUE$8);
        }
    }
    
    /**
     * Sets ith "value" element
     */
    public void setValueArray(int i, org.springframework.schema.beans.ValueDocument.Value value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ValueDocument.Value target = null;
            target = (org.springframework.schema.beans.ValueDocument.Value)get_store().find_element_user(VALUE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(value);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "value" element
     */
    public org.springframework.schema.beans.ValueDocument.Value insertNewValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ValueDocument.Value target = null;
            target = (org.springframework.schema.beans.ValueDocument.Value)get_store().insert_element_user(VALUE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "value" element
     */
    public org.springframework.schema.beans.ValueDocument.Value addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ValueDocument.Value target = null;
            target = (org.springframework.schema.beans.ValueDocument.Value)get_store().add_element_user(VALUE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "value" element
     */
    public void removeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$8, i);
        }
    }
    
    /**
     * Gets array of all "null" elements
     */
    public org.springframework.schema.beans.NullDocument.Null[] getNullArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NULL$10, targetList);
            org.springframework.schema.beans.NullDocument.Null[] result = new org.springframework.schema.beans.NullDocument.Null[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "null" element
     */
    public org.springframework.schema.beans.NullDocument.Null getNullArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.NullDocument.Null target = null;
            target = (org.springframework.schema.beans.NullDocument.Null)get_store().find_element_user(NULL$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "null" element
     */
    public int sizeOfNullArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NULL$10);
        }
    }
    
    /**
     * Sets array of all "null" element
     */
    public void setNullArray(org.springframework.schema.beans.NullDocument.Null[] xnullArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xnullArray, NULL$10);
        }
    }
    
    /**
     * Sets ith "null" element
     */
    public void setNullArray(int i, org.springframework.schema.beans.NullDocument.Null xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.NullDocument.Null target = null;
            target = (org.springframework.schema.beans.NullDocument.Null)get_store().find_element_user(NULL$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xnull);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "null" element
     */
    public org.springframework.schema.beans.NullDocument.Null insertNewNull(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.NullDocument.Null target = null;
            target = (org.springframework.schema.beans.NullDocument.Null)get_store().insert_element_user(NULL$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "null" element
     */
    public org.springframework.schema.beans.NullDocument.Null addNewNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.NullDocument.Null target = null;
            target = (org.springframework.schema.beans.NullDocument.Null)get_store().add_element_user(NULL$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "null" element
     */
    public void removeNull(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NULL$10, i);
        }
    }
    
    /**
     * Gets array of all "array" elements
     */
    public org.springframework.schema.beans.ArrayDocument.Array[] getArrayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAY$12, targetList);
            org.springframework.schema.beans.ArrayDocument.Array[] result = new org.springframework.schema.beans.ArrayDocument.Array[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "array" element
     */
    public org.springframework.schema.beans.ArrayDocument.Array getArrayArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ArrayDocument.Array target = null;
            target = (org.springframework.schema.beans.ArrayDocument.Array)get_store().find_element_user(ARRAY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "array" element
     */
    public int sizeOfArrayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAY$12);
        }
    }
    
    /**
     * Sets array of all "array" element
     */
    public void setArrayArray(org.springframework.schema.beans.ArrayDocument.Array[] arrayArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arrayArray, ARRAY$12);
        }
    }
    
    /**
     * Sets ith "array" element
     */
    public void setArrayArray(int i, org.springframework.schema.beans.ArrayDocument.Array array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ArrayDocument.Array target = null;
            target = (org.springframework.schema.beans.ArrayDocument.Array)get_store().find_element_user(ARRAY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(array);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "array" element
     */
    public org.springframework.schema.beans.ArrayDocument.Array insertNewArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ArrayDocument.Array target = null;
            target = (org.springframework.schema.beans.ArrayDocument.Array)get_store().insert_element_user(ARRAY$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "array" element
     */
    public org.springframework.schema.beans.ArrayDocument.Array addNewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ArrayDocument.Array target = null;
            target = (org.springframework.schema.beans.ArrayDocument.Array)get_store().add_element_user(ARRAY$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "array" element
     */
    public void removeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAY$12, i);
        }
    }
    
    /**
     * Gets array of all "list" elements
     */
    public org.springframework.schema.beans.ListDocument.List[] getListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LIST$14, targetList);
            org.springframework.schema.beans.ListDocument.List[] result = new org.springframework.schema.beans.ListDocument.List[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "list" element
     */
    public org.springframework.schema.beans.ListDocument.List getListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ListDocument.List target = null;
            target = (org.springframework.schema.beans.ListDocument.List)get_store().find_element_user(LIST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "list" element
     */
    public int sizeOfListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIST$14);
        }
    }
    
    /**
     * Sets array of all "list" element
     */
    public void setListArray(org.springframework.schema.beans.ListDocument.List[] listArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listArray, LIST$14);
        }
    }
    
    /**
     * Sets ith "list" element
     */
    public void setListArray(int i, org.springframework.schema.beans.ListDocument.List list)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ListDocument.List target = null;
            target = (org.springframework.schema.beans.ListDocument.List)get_store().find_element_user(LIST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(list);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "list" element
     */
    public org.springframework.schema.beans.ListDocument.List insertNewList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ListDocument.List target = null;
            target = (org.springframework.schema.beans.ListDocument.List)get_store().insert_element_user(LIST$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "list" element
     */
    public org.springframework.schema.beans.ListDocument.List addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ListDocument.List target = null;
            target = (org.springframework.schema.beans.ListDocument.List)get_store().add_element_user(LIST$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "list" element
     */
    public void removeList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIST$14, i);
        }
    }
    
    /**
     * Gets array of all "set" elements
     */
    public org.springframework.schema.beans.SetDocument.Set[] getSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SET$16, targetList);
            org.springframework.schema.beans.SetDocument.Set[] result = new org.springframework.schema.beans.SetDocument.Set[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "set" element
     */
    public org.springframework.schema.beans.SetDocument.Set getSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.SetDocument.Set target = null;
            target = (org.springframework.schema.beans.SetDocument.Set)get_store().find_element_user(SET$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "set" element
     */
    public int sizeOfSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SET$16);
        }
    }
    
    /**
     * Sets array of all "set" element
     */
    public void setSetArray(org.springframework.schema.beans.SetDocument.Set[] setArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(setArray, SET$16);
        }
    }
    
    /**
     * Sets ith "set" element
     */
    public void setSetArray(int i, org.springframework.schema.beans.SetDocument.Set set)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.SetDocument.Set target = null;
            target = (org.springframework.schema.beans.SetDocument.Set)get_store().find_element_user(SET$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(set);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "set" element
     */
    public org.springframework.schema.beans.SetDocument.Set insertNewSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.SetDocument.Set target = null;
            target = (org.springframework.schema.beans.SetDocument.Set)get_store().insert_element_user(SET$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "set" element
     */
    public org.springframework.schema.beans.SetDocument.Set addNewSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.SetDocument.Set target = null;
            target = (org.springframework.schema.beans.SetDocument.Set)get_store().add_element_user(SET$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "set" element
     */
    public void removeSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SET$16, i);
        }
    }
    
    /**
     * Gets array of all "map" elements
     */
    public org.springframework.schema.beans.MapDocument.Map[] getMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAP$18, targetList);
            org.springframework.schema.beans.MapDocument.Map[] result = new org.springframework.schema.beans.MapDocument.Map[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "map" element
     */
    public org.springframework.schema.beans.MapDocument.Map getMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MapDocument.Map target = null;
            target = (org.springframework.schema.beans.MapDocument.Map)get_store().find_element_user(MAP$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "map" element
     */
    public int sizeOfMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAP$18);
        }
    }
    
    /**
     * Sets array of all "map" element
     */
    public void setMapArray(org.springframework.schema.beans.MapDocument.Map[] mapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mapArray, MAP$18);
        }
    }
    
    /**
     * Sets ith "map" element
     */
    public void setMapArray(int i, org.springframework.schema.beans.MapDocument.Map map)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MapDocument.Map target = null;
            target = (org.springframework.schema.beans.MapDocument.Map)get_store().find_element_user(MAP$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(map);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map" element
     */
    public org.springframework.schema.beans.MapDocument.Map insertNewMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MapDocument.Map target = null;
            target = (org.springframework.schema.beans.MapDocument.Map)get_store().insert_element_user(MAP$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map" element
     */
    public org.springframework.schema.beans.MapDocument.Map addNewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MapDocument.Map target = null;
            target = (org.springframework.schema.beans.MapDocument.Map)get_store().add_element_user(MAP$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "map" element
     */
    public void removeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAP$18, i);
        }
    }
    
    /**
     * Gets array of all "props" elements
     */
    public org.springframework.schema.beans.PropsDocument.Props[] getPropsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPS$20, targetList);
            org.springframework.schema.beans.PropsDocument.Props[] result = new org.springframework.schema.beans.PropsDocument.Props[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "props" element
     */
    public org.springframework.schema.beans.PropsDocument.Props getPropsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropsDocument.Props target = null;
            target = (org.springframework.schema.beans.PropsDocument.Props)get_store().find_element_user(PROPS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "props" element
     */
    public int sizeOfPropsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPS$20);
        }
    }
    
    /**
     * Sets array of all "props" element
     */
    public void setPropsArray(org.springframework.schema.beans.PropsDocument.Props[] propsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propsArray, PROPS$20);
        }
    }
    
    /**
     * Sets ith "props" element
     */
    public void setPropsArray(int i, org.springframework.schema.beans.PropsDocument.Props props)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropsDocument.Props target = null;
            target = (org.springframework.schema.beans.PropsDocument.Props)get_store().find_element_user(PROPS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(props);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "props" element
     */
    public org.springframework.schema.beans.PropsDocument.Props insertNewProps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropsDocument.Props target = null;
            target = (org.springframework.schema.beans.PropsDocument.Props)get_store().insert_element_user(PROPS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "props" element
     */
    public org.springframework.schema.beans.PropsDocument.Props addNewProps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropsDocument.Props target = null;
            target = (org.springframework.schema.beans.PropsDocument.Props)get_store().add_element_user(PROPS$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "props" element
     */
    public void removeProps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPS$20, i);
        }
    }
}
