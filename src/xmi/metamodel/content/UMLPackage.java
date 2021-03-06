package xmi.metamodel.content;

import xmi.metamodel.interfaces.XMINamespaceOwner;
import xmi.metamodel.interfaces.XMISerializable;


public class UMLPackage implements XMINamespaceOwner, XMISerializable {

    private String id;
    private String name;
    private boolean isSpecification;
    private boolean isRoot;
    private boolean isLeaf;
    private boolean isAbstract;
    
    private UMLNamespaceOwnedElement ownedElement;
    

    public UMLPackage(String id, String name, boolean isSpecification, boolean isRoot, boolean isLeaf, boolean isAbstract) {
        this.id = id;
        this.name = name;
        this.isSpecification = isSpecification;
        this.isRoot = isRoot;
        this.isLeaf = isLeaf;
        this.isAbstract = isAbstract;
        ownedElement = new UMLNamespaceOwnedElement();
    }
    
    public UMLPackage() {
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsSpecification() {
        return isSpecification;
    }

    public void setIsSpecification(boolean isSpecification) {
        this.isSpecification = isSpecification;
    }

    public boolean isIsRoot() {
        return isRoot;
    }

    public void setIsRoot(boolean isRoot) {
        this.isRoot = isRoot;
    }

    public boolean isIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    public boolean isIsAbstract() {
        return isAbstract;
    }

    public void setIsAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }
    
    @Override
    public UMLNamespaceOwnedElement getNamespaceOwnedElement() {
        return ownedElement;
    }

    @Override
    public void setNamespaceOwnedElement(UMLNamespaceOwnedElement namespaceOwnedElement) {
        this.ownedElement = namespaceOwnedElement;
    }
    
    @Override
    public String toXmi() {
        StringBuilder sb = new StringBuilder();
        sb.append("<UML:Package xmi.id = '").append(id).append("'  name = '").append(name)
                .append("' isSpecification = '").append(isSpecification).append("' isRoot = '").append(isRoot)
                .append("' isLeaf = '").append(isLeaf).append("' isAbstract = '").append(isAbstract).append("'>\n");
        sb.append(ownedElement.toXmi());
        sb.append("</UML:Package>\n");
        return sb.toString();
    }
    
    @Override
    public String toEcore() {
        return "";
    }
    
}