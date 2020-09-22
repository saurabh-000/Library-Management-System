/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "book_detail", catalog = "newlibpro", schema = "")
@NamedQueries({
    @NamedQuery(name = "BookDetail.findAll", query = "SELECT b FROM BookDetail b")
    , @NamedQuery(name = "BookDetail.findById", query = "SELECT b FROM BookDetail b WHERE b.id = :id")
    , @NamedQuery(name = "BookDetail.findByBookname", query = "SELECT b FROM BookDetail b WHERE b.bookname = :bookname")
    , @NamedQuery(name = "BookDetail.findByAuthorname", query = "SELECT b FROM BookDetail b WHERE b.authorname = :authorname")
    , @NamedQuery(name = "BookDetail.findByPublisher", query = "SELECT b FROM BookDetail b WHERE b.publisher = :publisher")
    , @NamedQuery(name = "BookDetail.findByQuantity", query = "SELECT b FROM BookDetail b WHERE b.quantity = :quantity")})
public class BookDetail implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Book_name")
    private String bookname;
    @Basic(optional = false)
    @Column(name = "Author_name")
    private String authorname;
    @Basic(optional = false)
    @Column(name = "Publisher")
    private String publisher;
    @Basic(optional = false)
    @Column(name = "Quantity")
    private int quantity;

    public BookDetail() {
    }

    public BookDetail(Integer id) {
        this.id = id;
    }

    public BookDetail(Integer id, String bookname, String authorname, String publisher, int quantity) {
        this.id = id;
        this.bookname = bookname;
        this.authorname = authorname;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        String oldBookname = this.bookname;
        this.bookname = bookname;
        changeSupport.firePropertyChange("bookname", oldBookname, bookname);
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        String oldAuthorname = this.authorname;
        this.authorname = authorname;
        changeSupport.firePropertyChange("authorname", oldAuthorname, authorname);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        String oldPublisher = this.publisher;
        this.publisher = publisher;
        changeSupport.firePropertyChange("publisher", oldPublisher, publisher);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        int oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
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
        if (!(object instanceof BookDetail)) {
            return false;
        }
        BookDetail other = (BookDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "library.BookDetail[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
