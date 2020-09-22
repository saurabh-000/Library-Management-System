/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

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
 * @author hp
 */
@Entity
@Table(name = "issuedetail", catalog = "newlibpro", schema = "")
@NamedQueries({
    @NamedQuery(name = "Issuedetail.findAll", query = "SELECT i FROM Issuedetail i")
    , @NamedQuery(name = "Issuedetail.findById", query = "SELECT i FROM Issuedetail i WHERE i.id = :id")
    , @NamedQuery(name = "Issuedetail.findByStudentname", query = "SELECT i FROM Issuedetail i WHERE i.studentname = :studentname")
    , @NamedQuery(name = "Issuedetail.findByFathername", query = "SELECT i FROM Issuedetail i WHERE i.fathername = :fathername")
    , @NamedQuery(name = "Issuedetail.findByDob", query = "SELECT i FROM Issuedetail i WHERE i.dob = :dob")
    , @NamedQuery(name = "Issuedetail.findByCourse", query = "SELECT i FROM Issuedetail i WHERE i.course = :course")
    , @NamedQuery(name = "Issuedetail.findByBookid", query = "SELECT i FROM Issuedetail i WHERE i.bookid = :bookid")
    , @NamedQuery(name = "Issuedetail.findByDateofissue", query = "SELECT i FROM Issuedetail i WHERE i.dateofissue = :dateofissue")})
public class Issuedetail implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Student_name")
    private String studentname;
    @Basic(optional = false)
    @Column(name = "Father_name")
    private String fathername;
    @Basic(optional = false)
    @Column(name = "Dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @Column(name = "Course")
    private String course;
    @Basic(optional = false)
    @Column(name = "Book_id")
    private String bookid;
    @Basic(optional = false)
    @Column(name = "Date_of_issue")
    @Temporal(TemporalType.DATE)
    private Date dateofissue;

    public Issuedetail() {
    }

    public Issuedetail(Integer id) {
        this.id = id;
    }

    public Issuedetail(Integer id, String studentname, String fathername, Date dob, String course, String bookid, Date dateofissue) {
        this.id = id;
        this.studentname = studentname;
        this.fathername = fathername;
        this.dob = dob;
        this.course = course;
        this.bookid = bookid;
        this.dateofissue = dateofissue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        String oldStudentname = this.studentname;
        this.studentname = studentname;
        changeSupport.firePropertyChange("studentname", oldStudentname, studentname);
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        String oldFathername = this.fathername;
        this.fathername = fathername;
        changeSupport.firePropertyChange("fathername", oldFathername, fathername);
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        Date oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        String oldBookid = this.bookid;
        this.bookid = bookid;
        changeSupport.firePropertyChange("bookid", oldBookid, bookid);
    }

    public Date getDateofissue() {
        return dateofissue;
    }

    public void setDateofissue(Date dateofissue) {
        Date oldDateofissue = this.dateofissue;
        this.dateofissue = dateofissue;
        changeSupport.firePropertyChange("dateofissue", oldDateofissue, dateofissue);
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
        if (!(object instanceof Issuedetail)) {
            return false;
        }
        Issuedetail other = (Issuedetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "library.Issuedetail[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
