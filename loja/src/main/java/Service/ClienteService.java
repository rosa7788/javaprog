package Service;

import dc.unifacef.loja.model.Cliente;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();
    private Long id = 1L;

    public List<Cliente> listar(){
        return this.clientes;
    }

    public Cliente cria(Cliente c){
        c.setId(id);
        id++;
        this.clientes.add(c);
        return c;
    }

    @GetMapping("/{id}")
    public Cliente buscaPorId(Long id,Cliente buscado){
        buscado.setId(id);
        for(int i= 0; i<this.clientes.size(); i++){
            if(this.clientes.get(i).getId().equals(id)){
                return this.clientes.get(i);
            }
        }
        return null;
    }

    public boolean remove(long id){
        return this.clientes.removeIf( p-> p.getId().equals(id));
    }

    public Cliente atualiza(Long id, Cliente atualizado){
        atualizado.setId(id);
        for(int i= 0; i<this.clientes.size(); i++){
            if(this.clientes.get(i).getId().equals(id)){
                this.clientes.set(i,atualizado);
                return this.clientes.get(i);
            }
        }
        return null;
    }


}