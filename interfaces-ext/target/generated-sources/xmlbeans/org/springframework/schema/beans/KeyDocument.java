/*
 * An XML document type.
 * Localname: key
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.KeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans;


/**
 * A document containing one key(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public interface KeyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s64573255CCD5DEC1A1EC4BE6858B9539").resolveHandle("keyf06cdoctype");
    
    /**
     * Gets the "key" element
     */
    org.springframework.schema.beans.KeyDocument.Key getKey();
    
    /**
     * Sets the "key" element
     */
    void setKey(org.springframework.schema.beans.KeyDocument.Key key);
    
    /**
     * Appends and returns a new empty "key" element
     */
    org.springframework.schema.beans.KeyDocument.Key addNewKey();
    
    /**
     * An XML key(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public interface Key extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Key.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s64573255CCD5DEC1A1EC4BE6858B9539").resolveHandle("keyb677elemtype");
        
        /**
         * Gets the "description" element
         */
        org.springframework.schema.beans.DescriptionDocument.Description getDescription();
        
        /**
         * True if has "description" element
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(org.springframework.schema.beans.DescriptionDocument.Description description);
        
        /**
         * Appends and returns a new empty "description" element
         */
        org.springframework.schema.beans.DescriptionDocument.Description addNewDescription();
        
        /**
         * Unsets the "description" element
         */
        void unsetDescription();
        
        /**
         * Gets array of all "bean" elements
         */
        org.springframework.schema.beans.BeanDocument.Bean[] getBeanArray();
        
        /**
         * Gets ith "bean" element
         */
        org.springframework.schema.beans.BeanDocument.Bean getBeanArray(int i);
        
        /**
         * Returns number of "bean" element
         */
        int sizeOfBeanArray();
        
        /**
         * Sets array of all "bean" element
         */
        void setBeanArray(org.springframework.schema.beans.BeanDocument.Bean[] beanArray);
        
        /**
         * Sets ith "bean" element
         */
        void setBeanArray(int i, org.springframework.schema.beans.BeanDocument.Bean bean);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "bean" element
         */
        org.springframework.schema.beans.BeanDocument.Bean insertNewBean(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "bean" element
         */
        org.springframework.schema.beans.BeanDocument.Bean addNewBean();
        
        /**
         * Removes the ith "bean" element
         */
        void removeBean(int i);
        
        /**
         * Gets array of all "ref" elements
         */
        org.springframework.schema.beans.RefDocument.Ref[] getRefArray();
        
        /**
         * Gets ith "ref" element
         */
        org.springframework.schema.beans.RefDocument.Ref getRefArray(int i);
        
        /**
         * Returns number of "ref" element
         */
        int sizeOfRefArray();
        
        /**
         * Sets array of all "ref" element
         */
        void setRefArray(org.springframework.schema.beans.RefDocument.Ref[] refArray);
        
        /**
         * Sets ith "ref" element
         */
        void setRefArray(int i, org.springframework.schema.beans.RefDocument.Ref ref);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ref" element
         */
        org.springframework.schema.beans.RefDocument.Ref insertNewRef(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ref" element
         */
        org.springframework.schema.beans.RefDocument.Ref addNewRef();
        
        /**
         * Removes the ith "ref" element
         */
        void removeRef(int i);
        
        /**
         * Gets array of all "idref" elements
         */
        org.springframework.schema.beans.IdrefDocument.Idref[] getIdrefArray();
        
        /**
         * Gets ith "idref" element
         */
        org.springframework.schema.beans.IdrefDocument.Idref getIdrefArray(int i);
        
        /**
         * Returns number of "idref" element
         */
        int sizeOfIdrefArray();
        
        /**
         * Sets array of all "idref" element
         */
        void setIdrefArray(org.springframework.schema.beans.IdrefDocument.Idref[] idrefArray);
        
        /**
         * Sets ith "idref" element
         */
        void setIdrefArray(int i, org.springframework.schema.beans.IdrefDocument.Idref idref);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "idref" element
         */
        org.springframework.schema.beans.IdrefDocument.Idref insertNewIdref(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "idref" element
         */
        org.springframework.schema.beans.IdrefDocument.Idref addNewIdref();
        
        /**
         * Removes the ith "idref" element
         */
        void removeIdref(int i);
        
        /**
         * Gets array of all "value" elements
         */
        org.springframework.schema.beans.ValueDocument.Value[] getValueArray();
        
        /**
         * Gets ith "value" element
         */
        org.springframework.schema.beans.ValueDocument.Value getValueArray(int i);
        
        /**
         * Returns number of "value" element
         */
        int sizeOfValueArray();
        
        /**
         * Sets array of all "value" element
         */
        void setValueArray(org.springframework.schema.beans.ValueDocument.Value[] valueArray);
        
        /**
         * Sets ith "value" element
         */
        void setValueArray(int i, org.springframework.schema.beans.ValueDocument.Value value);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "value" element
         */
        org.springframework.schema.beans.ValueDocument.Value insertNewValue(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "value" element
         */
        org.springframework.schema.beans.ValueDocument.Value addNewValue();
        
        /**
         * Removes the ith "value" element
         */
        void removeValue(int i);
        
        /**
         * Gets array of all "null" elements
         */
        org.springframework.schema.beans.NullDocument.Null[] getNullArray();
        
        /**
         * Gets ith "null" element
         */
        org.springframework.schema.beans.NullDocument.Null getNullArray(int i);
        
        /**
         * Returns number of "null" element
         */
        int sizeOfNullArray();
        
        /**
         * Sets array of all "null" element
         */
        void setNullArray(org.springframework.schema.beans.NullDocument.Null[] xnullArray);
        
        /**
         * Sets ith "null" element
         */
        void setNullArray(int i, org.springframework.schema.beans.NullDocument.Null xnull);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "null" element
         */
        org.springframework.schema.beans.NullDocument.Null insertNewNull(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "null" element
         */
        org.springframework.schema.beans.NullDocument.Null addNewNull();
        
        /**
         * Removes the ith "null" element
         */
        void removeNull(int i);
        
        /**
         * Gets array of all "array" elements
         */
        org.springframework.schema.beans.ArrayDocument.Array[] getArrayArray();
        
        /**
         * Gets ith "array" element
         */
        org.springframework.schema.beans.ArrayDocument.Array getArrayArray(int i);
        
        /**
         * Returns number of "array" element
         */
        int sizeOfArrayArray();
        
        /**
         * Sets array of all "array" element
         */
        void setArrayArray(org.springframework.schema.beans.ArrayDocument.Array[] arrayArray);
        
        /**
         * Sets ith "array" element
         */
        void setArrayArray(int i, org.springframework.schema.beans.ArrayDocument.Array array);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "array" element
         */
        org.springframework.schema.beans.ArrayDocument.Array insertNewArray(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "array" element
         */
        org.springframework.schema.beans.ArrayDocument.Array addNewArray();
        
        /**
         * Removes the ith "array" element
         */
        void removeArray(int i);
        
        /**
         * Gets array of all "list" elements
         */
        org.springframework.schema.beans.ListDocument.List[] getListArray();
        
        /**
         * Gets ith "list" element
         */
        org.springframework.schema.beans.ListDocument.List getListArray(int i);
        
        /**
         * Returns number of "list" element
         */
        int sizeOfListArray();
        
        /**
         * Sets array of all "list" element
         */
        void setListArray(org.springframework.schema.beans.ListDocument.List[] listArray);
        
        /**
         * Sets ith "list" element
         */
        void setListArray(int i, org.springframework.schema.beans.ListDocument.List list);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "list" element
         */
        org.springframework.schema.beans.ListDocument.List insertNewList(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "list" element
         */
        org.springframework.schema.beans.ListDocument.List addNewList();
        
        /**
         * Removes the ith "list" element
         */
        void removeList(int i);
        
        /**
         * Gets array of all "set" elements
         */
        org.springframework.schema.beans.SetDocument.Set[] getSetArray();
        
        /**
         * Gets ith "set" element
         */
        org.springframework.schema.beans.SetDocument.Set getSetArray(int i);
        
        /**
         * Returns number of "set" element
         */
        int sizeOfSetArray();
        
        /**
         * Sets array of all "set" element
         */
        void setSetArray(org.springframework.schema.beans.SetDocument.Set[] setArray);
        
        /**
         * Sets ith "set" element
         */
        void setSetArray(int i, org.springframework.schema.beans.SetDocument.Set set);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "set" element
         */
        org.springframework.schema.beans.SetDocument.Set insertNewSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "set" element
         */
        org.springframework.schema.beans.SetDocument.Set addNewSet();
        
        /**
         * Removes the ith "set" element
         */
        void removeSet(int i);
        
        /**
         * Gets array of all "map" elements
         */
        org.springframework.schema.beans.MapDocument.Map[] getMapArray();
        
        /**
         * Gets ith "map" element
         */
        org.springframework.schema.beans.MapDocument.Map getMapArray(int i);
        
        /**
         * Returns number of "map" element
         */
        int sizeOfMapArray();
        
        /**
         * Sets array of all "map" element
         */
        void setMapArray(org.springframework.schema.beans.MapDocument.Map[] mapArray);
        
        /**
         * Sets ith "map" element
         */
        void setMapArray(int i, org.springframework.schema.beans.MapDocument.Map map);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "map" element
         */
        org.springframework.schema.beans.MapDocument.Map insertNewMap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "map" element
         */
        org.springframework.schema.beans.MapDocument.Map addNewMap();
        
        /**
         * Removes the ith "map" element
         */
        void removeMap(int i);
        
        /**
         * Gets array of all "props" elements
         */
        org.springframework.schema.beans.PropsDocument.Props[] getPropsArray();
        
        /**
         * Gets ith "props" element
         */
        org.springframework.schema.beans.PropsDocument.Props getPropsArray(int i);
        
        /**
         * Returns number of "props" element
         */
        int sizeOfPropsArray();
        
        /**
         * Sets array of all "props" element
         */
        void setPropsArray(org.springframework.schema.beans.PropsDocument.Props[] propsArray);
        
        /**
         * Sets ith "props" element
         */
        void setPropsArray(int i, org.springframework.schema.beans.PropsDocument.Props props);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "props" element
         */
        org.springframework.schema.beans.PropsDocument.Props insertNewProps(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "props" element
         */
        org.springframework.schema.beans.PropsDocument.Props addNewProps();
        
        /**
         * Removes the ith "props" element
         */
        void removeProps(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.springframework.schema.beans.KeyDocument.Key newInstance() {
              return (org.springframework.schema.beans.KeyDocument.Key) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.springframework.schema.beans.KeyDocument.Key newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.springframework.schema.beans.KeyDocument.Key) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.springframework.schema.beans.KeyDocument newInstance() {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.springframework.schema.beans.KeyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.springframework.schema.beans.KeyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.springframework.schema.beans.KeyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.springframework.schema.beans.KeyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.springframework.schema.beans.KeyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.springframework.schema.beans.KeyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.springframework.schema.beans.KeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
