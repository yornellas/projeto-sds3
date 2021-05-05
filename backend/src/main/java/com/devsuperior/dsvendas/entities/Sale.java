package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")  //indica o nome da tabela correspondente no bando de dados
public class Sale {
	
	@Id        //esse @Id indica ao banco de dados qual é a chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //chave auto-incrementável do banco relacional
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	@ManyToOne //muitas sales para um seller
	@JoinColumn(name = "seller_id") //adiciona essa coluna ao banco de dados. (chave estrangeira)
	private Seller seller; //uma sale deve ter um seller
	
	public Sale() {
	}

	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmounts() {
		return amount;
	}

	public void setAmounts(Double amounts) {
		this.amount = amounts;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
