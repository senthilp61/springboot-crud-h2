package com.or.learning.cruddemoh2.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="USER_INFO")
@Data
public class UserInfoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID", columnDefinition = "INT NOT NULL PRIMARY KEY")
	private Integer id;
	
	@Column(name="NAME", columnDefinition = "VARCHAR(255) NOT NULL")
	private String name;
	
	@Column(name="DEPARTMENT", columnDefinition = "VARCHAR(50) NOT NULL")
	private String department;
	
	@Column(name="CREATED_DATE", columnDefinition = "DATE NOT NULL")
	private Date createdDate;
	
	@Column(name="LAST_MODIFIED_DATE", columnDefinition = "DATE NOT NULL")
	private Date lastModifiedDate;
	
}
