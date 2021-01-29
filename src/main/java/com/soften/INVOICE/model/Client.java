package com.soften.INVOICE.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Client implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "ClienteTipoDocumento", nullable = false)
    private int ClienteTipoDocumento;

    @Column(name = "ClienteNumeroDocumento", nullable = false)
    private String ClienteNumeroDocumento;

    @Column(name = "ClienteRazaoNome", nullable = false)
    private String ClienteRazaoNome;
    
    @Column(name = "ClienteLogradouro")
    private String ClienteLogradouro;

    @Column(name = "ClienteBairro")
    private String ClienteBairro;

    @Column(name = "ClienteEstado")
    private String ClienteEstado;

    @Column(name = "ClienteCidade")
    private String ClienteCidade;

    @Column(name = "ClienteCodigoPostal")
    private int ClienteCodigoPostal;

    @Column(name = "ClientePais")
    private int ClientePais;

    @Column(name = "ClienteLogradouroReceptor")
    private String ClienteLogradouroReceptor;

    @Column(name = "ClienteLocalEntrega")
    private String ClienteLocalEntrega;

    @Column(name = "ClienteInformacaoAdicional")
	private String ClienteInformacaoAdicional;
	
	@Column(name = "ClienteStatus")
	private boolean ClienteStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

	public int getClienteTipoDocumento() {
		return this.ClienteTipoDocumento;
	}

	public void setClienteTipoDocumento(int ClienteTipoDocumento) {
		this.ClienteTipoDocumento = ClienteTipoDocumento;
	}

	public String getClienteNumeroDocumento() {
		return this.ClienteNumeroDocumento;
	}

	public void setClienteNumeroDocumento(String ClienteNumeroDocumento) {
		this.ClienteNumeroDocumento = ClienteNumeroDocumento;
	}

	public String getClienteRazaoNome() {
		return this.ClienteRazaoNome;
	}

	public void setClienteRazaoNome(String ClienteRazaoNome) {
		this.ClienteRazaoNome = ClienteRazaoNome;
	}

	public String getClienteLogradouro() {
		return this.ClienteLogradouro;
	}

	public void setClienteLogradouro(String ClienteLogradouro) {
		this.ClienteLogradouro = ClienteLogradouro;
	}

	public String getClienteBairro() {
		return this.ClienteBairro;
	}

	public void setClienteBairro(String ClienteBairro) {
		this.ClienteBairro = ClienteBairro;
	}

	public String getClienteCidade() {
		return this.ClienteCidade;
	}

	public void setClienteCidade(String ClienteCidade) {
		this.ClienteCidade = ClienteCidade;
    }
    
    public String getClienteEstado() {
		return this.ClienteEstado;
	}

	public void setClienteEstado(String ClienteEstado) {
		this.ClienteEstado = ClienteEstado;
	}

	public int getClienteCodigoPostal() {
		return this.ClienteCodigoPostal;
	}

	public void setClienteCodigoPostal(int ClienteCodigoPostal) {
		this.ClienteCodigoPostal = ClienteCodigoPostal;
	}

	public int getClientePais() {
		return this.ClientePais;
	}

	public void setClientePais(int ClientePais) {
		this.ClientePais = ClientePais;
	}

	public String getClienteLogradouroReceptor() {
		return this.ClienteLogradouroReceptor;
	}

	public void setClienteLogradouroReceptor(String ClienteLogradouroReceptor) {
		this.ClienteLogradouroReceptor = ClienteLogradouroReceptor;
	}

	public String getClienteLocalEntrega() {
		return this.ClienteLocalEntrega;
	}

	public void setClienteLocalEntrega(String ClienteLocalEntrega) {
		this.ClienteLocalEntrega = ClienteLocalEntrega;
	}

	public String getClienteInformacaoAdicional() {
		return this.ClienteInformacaoAdicional;
	}

	public void setClienteInformacaoAdicional(String ClienteInformacaoAdicional) {
		this.ClienteInformacaoAdicional = ClienteInformacaoAdicional;
	}

	public boolean isClienteStatus() {
		return this.ClienteStatus;
	}

	public void setClienteStatus(boolean ClienteStatus) {
		this.ClienteStatus = ClienteStatus;
	}


    public Client() {
        super();
    }

    public Client(int id, int tipodoc, String nrodoc, String raznome, String logradouro, String bairro, String departamento, String cidade, int codpostal, int pais, String logreceptor, String locentrega, String infadc) {
        super();
        this.id = id;
        this.ClienteTipoDocumento = tipodoc;
        this.ClienteNumeroDocumento = nrodoc;
        this.ClienteRazaoNome = raznome;
        this.ClienteLogradouro = logradouro;
        this.ClienteBairro = bairro;
        this.ClienteCidade = cidade;
        this.ClienteEstado = departamento;
        this.ClienteCodigoPostal = codpostal;
        this.ClientePais = pais;
        this.ClienteLogradouroReceptor = logreceptor;
        this.ClienteLocalEntrega = locentrega;
		this.ClienteInformacaoAdicional = infadc;
		this.ClienteStatus = false;
    }

   
}