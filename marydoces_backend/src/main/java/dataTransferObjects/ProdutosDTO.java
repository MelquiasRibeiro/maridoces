package dataTransferObjects;

import java.io.Serializable;

public class ProdutosDTO implements Serializable {
    private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private float preço;
	private String descrição;
	private String ingredientes;
	
	

	public ProdutosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProdutosDTO(String nome, float preço, String descrição, String ingredientes) {
		super();
		this.nome = nome;
		this.preço = preço;
		this.descrição = descrição;
		this.ingredientes = ingredientes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
