package com.akhm.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="USER_TYPE_TL")
@Data
public class UserTypeEntity {
	@Id
	@GeneratedValue
	@Column
	private Integer userTypeId;
	@Column
	private String userType;
	@Column
	private String userTypeStatus;

}
