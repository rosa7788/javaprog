package dc.unifacef.memoria.Service;

import dc.unifacef.memoria.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    // cria o ArrayList
    private List<Produto> produtos = new ArrayList<Produto>();
    private Long id = 1L;

    //consulta os produtos na lista
    public List<Produto> consulta(){
        return this.produtos;
    }

    // insere produto na lista
    public Produto cria(Produto produto){
        produto.setId(id);
        id++;
        this.produtos.add(produto);
        return produto;
    }

    // remove produto com id
    public boolean remove(Long id){
        //função removeIf realiza o for
        //para cada produto p, verifica se o id no vetor é igual ao id do usuário
        return this.produtos.removeIf(p -> p.getId().equals(id));
    }

    //atualiza um produto por id
    public Produto atualiza(Long id, Produto novo){
        novo.setId(id);
        //percorre para atualizar o produto
        for(int i = 0; i<this.produtos.size(); i++){
            if(this.produtos.get(i).getId().equals(id)){
                //encontrado
                this.produtos.set(i, novo); // atualiza
                return novo;
            }
        }
        return null; // produto não encontraod para atualizar
    }
}