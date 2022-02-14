package mx.fmre.contable.control.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BancoDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8593773721187935008L;
	private int id;
	private String descripcion;
}
