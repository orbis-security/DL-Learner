/*
 * XML Type:  propertyType
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.PropertyType
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans;


/**
 * An XML propertyType(@http://www.springframework.org/schema/beans).
 *
 * This is a complex type.
 */
public interface PropertyType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PropertyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s64573255CCD5DEC1A1EC4BE6858B9539").resolveHandle("propertytype49betype");
    
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
     * Gets the "meta" element
     */
    org.springframework.schema.beans.MetaType getMeta();
    
    /**
     * True if has "meta" element
     */
    boolean isSetMeta();
    
    /**
     * Sets the "meta" element
     */
    void setMeta(org.springframework.schema.beans.MetaType meta);
    
    /**
     * Appends and returns a new empty "meta" element
     */
    org.springframework.schema.beans.MetaType addNewMeta();
    
    /**
     * Unsets the "meta" element
     */
    void unsetMeta();
    
    /**
     * Gets the "bean" element
     */
    org.springframework.schema.beans.BeanDocument.Bean getBean();
    
    /**
     * True if has "bean" element
     */
    boolean isSetBean();
    
    /**
     * Sets the "bean" element
     */
    void setBean(org.springframework.schema.beans.BeanDocument.Bean bean);
    
    /**
     * Appends and returns a new empty "bean" element
     */
    org.springframework.schema.beans.BeanDocument.Bean addNewBean();
    
    /**
     * Unsets the "bean" element
     */
    void unsetBean();
    
    /**
     * Gets the "ref" element
     */
    org.springframework.schema.beans.RefDocument.Ref getRef();
    
    /**
     * True if has "ref" element
     */
    boolean isSetRef();
    
    /**
     * Sets the "ref" element
     */
    void setRef(org.springframework.schema.beans.RefDocument.Ref ref);
    
    /**
     * Appends and returns a new empty "ref" element
     */
    org.springframework.schema.beans.RefDocument.Ref addNewRef();
    
    /**
     * Unsets the "ref" element
     */
    void unsetRef();
    
    /**
     * Gets the "idref" element
     */
    org.springframework.schema.beans.IdrefDocument.Idref getIdref();
    
    /**
     * True if has "idref" element
     */
    boolean isSetIdref();
    
    /**
     * Sets the "idref" element
     */
    void setIdref(org.springframework.schema.beans.IdrefDocument.Idref idref);
    
    /**
     * Appends and returns a new empty "idref" element
     */
    org.springframework.schema.beans.IdrefDocument.Idref addNewIdref();
    
    /**
     * Unsets the "idref" element
     */
    void unsetIdref();
    
    /**
     * Gets the "value" element
     */
    org.springframework.schema.beans.ValueDocument.Value getValue();
    
    /**
     * True if has "value" element
     */
    boolean isSetValue();
    
    /**
     * Sets the "value" element
     */
    void setValue(org.springframework.schema.beans.ValueDocument.Value value);
    
    /**
     * Appends and returns a new empty "value" element
     */
    org.springframework.schema.beans.ValueDocument.Value addNewValue();
    
    /**
     * Unsets the "value" element
     */
    void unsetValue();
    
    /**
     * Gets the "null" element
     */
    org.springframework.schema.beans.NullDocument.Null getNull();
    
    /**
     * True if has "null" element
     */
    boolean isSetNull();
    
    /**
     * Sets the "null" element
     */
    void setNull(org.springframework.schema.beans.NullDocument.Null xnull);
    
    /**
     * Appends and returns a new empty "null" element
     */
    org.springframework.schema.beans.NullDocument.Null addNewNull();
    
    /**
     * Unsets the "null" element
     */
    void unsetNull();
    
    /**
     * Gets the "array" element
     */
    org.springframework.schema.beans.ArrayDocument.Array getArray();
    
    /**
     * True if has "array" element
     */
    boolean isSetArray();
    
    /**
     * Sets the "array" element
     */
    void setArray(org.springframework.schema.beans.ArrayDocument.Array array);
    
    /**
     * Appends and returns a new empty "array" element
     */
    org.springframework.schema.beans.ArrayDocument.Array addNewArray();
    
    /**
     * Unsets the "array" element
     */
    void unsetArray();
    
    /**
     * Gets the "list" element
     */
    org.springframework.schema.beans.ListDocument.List getList();
    
    /**
     * True if has "list" element
     */
    boolean isSetList();
    
    /**
     * Sets the "list" element
     */
    void setList(org.springframework.schema.beans.ListDocument.List list);
    
    /**
     * Appends and returns a new empty "list" element
     */
    org.springframework.schema.beans.ListDocument.List addNewList();
    
    /**
     * Unsets the "list" element
     */
    void unsetList();
    
    /**
     * Gets the "set" element
     */
    org.springframework.schema.beans.SetDocument.Set getSet();
    
    /**
     * True if has "set" element
     */
    boolean isSetSet();
    
    /**
     * Sets the "set" element
     */
    void setSet(org.springframework.schema.beans.SetDocument.Set set);
    
    /**
     * Appends and returns a new empty "set" element
     */
    org.springframework.schema.beans.SetDocument.Set addNewSet();
    
    /**
     * Unsets the "set" element
     */
    void unsetSet();
    
    /**
     * Gets the "map" element
     */
    org.springframework.schema.beans.MapDocument.Map getMap();
    
    /**
     * True if has "map" element
     */
    boolean isSetMap();
    
    /**
     * Sets the "map" element
     */
    void setMap(org.springframework.schema.beans.MapDocument.Map map);
    
    /**
     * Appends and returns a new empty "map" element
     */
    org.springframework.schema.beans.MapDocument.Map addNewMap();
    
    /**
     * Unsets the "map" element
     */
    void unsetMap();
    
    /**
     * Gets the "props" element
     */
    org.springframework.schema.beans.PropsDocument.Props getProps();
    
    /**
     * True if has "props" element
     */
    boolean isSetProps();
    
    /**
     * Sets the "props" element
     */
    void setProps(org.springframework.schema.beans.PropsDocument.Props props);
    
    /**
     * Appends and returns a new empty "props" element
     */
    org.springframework.schema.beans.PropsDocument.Props addNewProps();
    
    /**
     * Unsets the "props" element
     */
    void unsetProps();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "ref" attribute
     */
    java.lang.String getRef2();
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    org.apache.xmlbeans.XmlString xgetRef2();
    
    /**
     * True if has "ref" attribute
     */
    boolean isSetRef2();
    
    /**
     * Sets the "ref" attribute
     */
    void setRef2(java.lang.String ref2);
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef2(org.apache.xmlbeans.XmlString ref2);
    
    /**
     * Unsets the "ref" attribute
     */
    void unsetRef2();
    
    /**
     * Gets the "value" attribute
     */
    java.lang.String getValue2();
    
    /**
     * Gets (as xml) the "value" attribute
     */
    org.apache.xmlbeans.XmlString xgetValue2();
    
    /**
     * True if has "value" attribute
     */
    boolean isSetValue2();
    
    /**
     * Sets the "value" attribute
     */
    void setValue2(java.lang.String value2);
    
    /**
     * Sets (as xml) the "value" attribute
     */
    void xsetValue2(org.apache.xmlbeans.XmlString value2);
    
    /**
     * Unsets the "value" attribute
     */
    void unsetValue2();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.springframework.schema.beans.PropertyType newInstance() {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.springframework.schema.beans.PropertyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.springframework.schema.beans.PropertyType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.springframework.schema.beans.PropertyType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.springframework.schema.beans.PropertyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.springframework.schema.beans.PropertyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.springframework.schema.beans.PropertyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.springframework.schema.beans.PropertyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.springframework.schema.beans.PropertyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.springframework.schema.beans.PropertyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.springframework.schema.beans.PropertyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.springframework.schema.beans.PropertyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.springframework.schema.beans.PropertyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.springframework.schema.beans.PropertyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.springframework.schema.beans.PropertyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.springframework.schema.beans.PropertyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.springframework.schema.beans.PropertyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.springframework.schema.beans.PropertyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.springframework.schema.beans.PropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
