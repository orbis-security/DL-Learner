/*
 * An XML document type.
 * Localname: set
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.SetDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans;


/**
 * A document containing one set(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public interface SetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s64573255CCD5DEC1A1EC4BE6858B9539").resolveHandle("set55efdoctype");
    
    /**
     * Gets the "set" element
     */
    org.springframework.schema.beans.SetDocument.Set getSet();
    
    /**
     * Sets the "set" element
     */
    void setSet(org.springframework.schema.beans.SetDocument.Set set);
    
    /**
     * Appends and returns a new empty "set" element
     */
    org.springframework.schema.beans.SetDocument.Set addNewSet();
    
    /**
     * An XML set(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public interface Set extends org.springframework.schema.beans.ListOrSetType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Set.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s64573255CCD5DEC1A1EC4BE6858B9539").resolveHandle("set133delemtype");
        
        /**
         * Gets the "merge" attribute
         */
        org.springframework.schema.beans.DefaultableBoolean.Enum getMerge();
        
        /**
         * Gets (as xml) the "merge" attribute
         */
        org.springframework.schema.beans.DefaultableBoolean xgetMerge();
        
        /**
         * True if has "merge" attribute
         */
        boolean isSetMerge();
        
        /**
         * Sets the "merge" attribute
         */
        void setMerge(org.springframework.schema.beans.DefaultableBoolean.Enum merge);
        
        /**
         * Sets (as xml) the "merge" attribute
         */
        void xsetMerge(org.springframework.schema.beans.DefaultableBoolean merge);
        
        /**
         * Unsets the "merge" attribute
         */
        void unsetMerge();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.springframework.schema.beans.SetDocument.Set newInstance() {
              return (org.springframework.schema.beans.SetDocument.Set) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.springframework.schema.beans.SetDocument.Set newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.springframework.schema.beans.SetDocument.Set) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.springframework.schema.beans.SetDocument newInstance() {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.springframework.schema.beans.SetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.springframework.schema.beans.SetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.springframework.schema.beans.SetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.springframework.schema.beans.SetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.springframework.schema.beans.SetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.springframework.schema.beans.SetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.springframework.schema.beans.SetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.springframework.schema.beans.SetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.springframework.schema.beans.SetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.springframework.schema.beans.SetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.springframework.schema.beans.SetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.springframework.schema.beans.SetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.springframework.schema.beans.SetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.springframework.schema.beans.SetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.springframework.schema.beans.SetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.springframework.schema.beans.SetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.springframework.schema.beans.SetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.springframework.schema.beans.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
