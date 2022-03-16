package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="address_tab")
public class Address {
	
	@Id
	@Column(name="addr_primary_key_col")
	private Long addId;

	@Column(name="addr_line1_col")
	private String line1;
}
