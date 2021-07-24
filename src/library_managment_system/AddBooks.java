/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_managment_system;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "add_books", catalog = "home", schema = "")
@NamedQueries({
    @NamedQuery(name = "AddBooks.findAll", query = "SELECT a FROM AddBooks a")
    , @NamedQuery(name = "AddBooks.findById", query = "SELECT a FROM AddBooks a WHERE a.id = :id")
    , @NamedQuery(name = "AddBooks.findByCallno", query = "SELECT a FROM AddBooks a WHERE a.callno = :callno")
    , @NamedQuery(name = "AddBooks.findByName", query = "SELECT a FROM AddBooks a WHERE a.name = :name")
    , @NamedQuery(name = "AddBooks.findByAuthor", query = "SELECT a FROM AddBooks a WHERE a.author = :author")
    , @NamedQuery(name = "AddBooks.findByPublisher", query = "SELECT a FROM AddBooks a WHERE a.publisher = :publisher")
    , @NamedQuery(name = "AddBooks.findByQuantity", query = "SELECT a FROM AddBooks a WHERE a.quantity = :quantity")
    , @NamedQuery(name = "AddBooks.findByIssued", query = "SELECT a FROM AddBooks a WHERE a.issued = :issued")
    , @NamedQuery(name = "AddBooks.findByAddedDate", query = "SELECT a FROM AddBooks a WHERE a.addedDate = :addedDate")})
public class AddBooks implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "callno")
    private String callno;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @Basic(optional = false)
    @Column(name = "publisher")
    private String publisher;
    @Basic(optional = false)
    @Column(name = "quantity")
    private String quantity;
    @Column(name = "issued")
    private Integer issued;
    @Basic(optional = false)
    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    public AddBooks() {
    }

    public AddBooks(Integer id) {
        this.id = id;
    }

    public AddBooks(Integer id, String callno, String name, String publisher, String quantity, Date addedDate) {
        this.id = id;
        this.callno = callno;
        this.name = name;
        this.publisher = publisher;
        this.quantity = quantity;
        this.addedDate = addedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCallno() {
        return callno;
    }

    public void setCallno(String callno) {
        String oldCallno = this.callno;
        this.callno = callno;
        changeSupport.firePropertyChange("callno", oldCallno, callno);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        String oldAuthor = this.author;
        this.author = author;
        changeSupport.firePropertyChange("author", oldAuthor, author);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        String oldPublisher = this.publisher;
        this.publisher = publisher;
        changeSupport.firePropertyChange("publisher", oldPublisher, publisher);
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        String oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    public Integer getIssued() {
        return issued;
    }

    public void setIssued(Integer issued) {
        Integer oldIssued = this.issued;
        this.issued = issued;
        changeSupport.firePropertyChange("issued", oldIssued, issued);
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        Date oldAddedDate = this.addedDate;
        this.addedDate = addedDate;
        changeSupport.firePropertyChange("addedDate", oldAddedDate, addedDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddBooks)) {
            return false;
        }
        AddBooks other = (AddBooks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "library_managment_system.AddBooks[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
