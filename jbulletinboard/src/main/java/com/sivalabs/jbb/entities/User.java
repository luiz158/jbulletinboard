/**
 * 
 */
package com.sivalabs.jbb.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Siva
 *
 */
@Entity
@Table(name = "users")
@XmlRootElement
public class User implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;
    
    @Column(name = "username", nullable=false, unique=true)
    private String userName;
    
    @XmlTransient
    @Column(name = "password", nullable=false, updatable=false)
    private String password;
    
    @Column(name = "name", nullable=false)
    private String name;
    
    @Column(name = "email", nullable=false, unique=true)
    private String email;
    
    @Column(name = "created_on")
    private Date createdOn;
    
    @Column(name = "updated_on")
    private Date updatedOn;
    
    @OneToMany(mappedBy="user", fetch=FetchType.EAGER)
    private Set<Role> roles = new HashSet<Role>();
    
    @OneToMany(mappedBy="createdBy")
    private Set<Topic> topics = new HashSet<Topic>();
    
    
    @OneToMany(mappedBy="createdBy")
    private Set<Post> posts = new HashSet<Post>();
    
    public User() {
    }


	public Integer getUserId()
	{
		return userId;
	}


	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}


	public String getUserName()
	{
		return userName;
	}


	public void setUserName(String userName)
	{
		this.userName = userName;
	}


	public String getPassword()
	{
		return password;
	}


	public void setPassword(String password)
	{
		this.password = password;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public String getEmail()
	{
		return email;
	}


	public void setEmail(String email)
	{
		this.email = email;
	}


	public Date getCreatedOn()
	{
		return createdOn;
	}


	public void setCreatedOn(Date createdOn)
	{
		this.createdOn = createdOn;
	}


	public Date getUpdatedOn()
	{
		return updatedOn;
	}


	public void setUpdatedOn(Date updatedOn)
	{
		this.updatedOn = updatedOn;
	}
	public Set<Topic> getTopics()
	{
		return topics;
	}

	public void setTopics(Set<Topic> topics)
	{
		this.topics = topics;
	}
	public Set<Post> getPosts()
	{
		return posts;
	}

	public void setPosts(Set<Post> posts)
	{
		this.posts = posts;
	}
	public Set<Role> getRoles()
	{
		return roles;
	}

	public void setRoles(Set<Role> roles)
	{
		this.roles = roles;
	}

}
