package com.dummyproject.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class User {
	@Column(name="user_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer userId;
	@Column(name="user_name")
	String userName;

}
