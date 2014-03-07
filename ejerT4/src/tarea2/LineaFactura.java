package tarea2;

public class LineaFactura {
		
	public String id_producto; 		// identificador (codigo) del producto
	public String nombre_producto; 	// nombre del producto
	
	public float precio; 			//precio por una unidad del producto
	public float cantidad; 			//cantidad de unidades compradas
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
	
	/**
	  * Constructor de la clase Lineafactura con parametros.
	  * inicia idProducto, nombreProducto, precio, cantidad y descuento con los parametros pasados
	  * @param idProducto Codigo del procducto.
	  * @param nombreProducto nombre del producto
	  * @param precio precio del producto
	  * @param cantidad cantidad del producto
	  * @param descuento descuento aplicado al producto
	  */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	/**
	 * Sobreescribe el metodo toString
	 */
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Devuelve el precio total de una linea. El precio de la unidad por la cantidad de productos 
	 * pedidos de esa uniad 
	 * @return total devuelve el total de la linea.
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
