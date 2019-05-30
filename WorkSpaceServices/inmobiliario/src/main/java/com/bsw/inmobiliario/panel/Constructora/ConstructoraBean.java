
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

public class ConstructoraBean implements Serializable{

	
	@NotNull(message="{ConstructorasBean.descripcion.InvalidNotNullDescripcion}")
        @Size(min=1, max=1, message="{ConstructorasBean.descripcion.InvalidSizeDescripcion}")
	private String descripcion;

	private byte imagencontructora;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public byte getImagencontructora() {
		return imagencontructora;
	}

	public void setImagencontructora(byte imagencontructora) {
		this.imagencontructora = imagencontructora;
	}
}
