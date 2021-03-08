package br.alves.spring02.dto;

import java.util.List;

import br.alves.spring02.model.Compra;
import br.alves.spring02.model.Usuario;

public class UsuarioDTO2 {
    private List<Compra> compras;

    public UsuarioDTO2(Usuario usuario){
        this.compras = usuario.getCompra();
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }


}
