package Controller;

import dc.unifacef.loja.model.Cliente;
import dc.unifacef.loja.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> consulta(){
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<Cliente> cria(@RequestBody Cliente cliente){
        Cliente c = service.cria(cliente);
        URI uri = URI.create("/clientes/"+c.getId());
        return ResponseEntity.created(uri).body(c);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id){
        if (service.remove(id)) {
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("{id}")
    public ResponseEntity<Cliente> atualiza(@PathVariable Long id, @RequestBody Cliente cliente){
        Cliente c = service.atualiza(id, cliente);
        if(c != null){
            return ResponseEntity.ok(c);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}