package com.tecsup.jsfprime.bean;

import com.tecsup.jsfprime.model.Categoria;
import com.tecsup.jsfprime.model.Producto;
import com.tecsup.jsfprime.service.GestionProducto;
import java.util.List;
import javafx.scene.control.TableColumn.CellEditEvent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.component.datatable.DataTable;

@ManagedBean
@RequestScoped
public class CategoriaBean {
    
    private List<Categoria> categorias;
    private List<Producto> productos;
    
    public CategoriaBean() {
        GestionProducto gestion = new GestionProducto();
        this.categorias = gestion.listar();
        
        System.out.println("TOTAL CATEGORIA  " + this.categorias.size());
    }
    
    
    public void cargarProductos(Long categoria) {
        GestionProducto gestion = new GestionProducto();
        this.productos = gestion.listarPorCategoria(categoria);
        
        System.out.println("TOTAL PRODUCTOS  " + this.productos.size());
    }
    
    public void onCellEdit(CellEditEvent event){
        
        Object newValue = event.getNewValue();
        Object oldValue = event.getOldValue();
        
        DataTable o = (DataTable) event.getSource();
        Categoria objeto = (Categoria) o.getRowData();
        System.out.println(objeto.getId());
        
        if(newValue != null && !newValue.equals(oldValue)){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
            "Actualizado","Antes: " + oldValue + ", Después: " + newValue);
            
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        
    }
    
    public List<Categoria> getCategorias() {
        return categorias;
    }
    
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }
    
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
}
