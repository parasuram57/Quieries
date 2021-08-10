package com.queries.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@NamedQueries({
    @NamedQuery(name="Country",
                query="SELECT c FROM sathisDetailsEntity c ")
    
}) 
@Table(name = "SATHISH_DTL")
public class sathisDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SATH_ID")
	private Integer sathishId;
	
	private String name;
	
	private String lname;
	
}
