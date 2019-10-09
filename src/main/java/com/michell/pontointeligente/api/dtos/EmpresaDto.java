package com.michell.pontointeligente.api.dtos;

public class EmpresaDto {
	
	private Long id;	
	private String razaoSocial;	
	private String cnpj;
	
	public EmpresaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpresaDto(Long id, String razaoSocial, String cnpj) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "EmpresaTdo [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
	}	
}
