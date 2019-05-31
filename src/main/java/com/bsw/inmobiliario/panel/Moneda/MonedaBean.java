import java.io.Serializable;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MonedaBean implements Serializable{
	
	//@Size(min=1, max=20, message="{MonedaBean.codigo.InvalidSizeCodigo}")
	//@Pattern(regexp="[0-9]+", message="{MonedaBean.codigo.InvalidPatternCodigo}")
	private int codigo;
	
	@Size(min=1, max=4000, message="{MonedaBean.descripcion.InvalidSizeDescripcion}")
	@Pattern(regexp= "[a-zA-Z0-9-]+", message="{MonedaBean.descripcion.InvalidPatternDescripcion}")
	private String descripcion;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}