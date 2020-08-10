package com.mystorage.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mystorage.api.model.Produto;
import com.mystorage.api.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

	
	@Autowired
	public ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> buscarProdutos(){
		
		
		List<Produto> produtos = produtoRepository.findAll();
		
		
		return ResponseEntity.ok(produtos);
	}
	
	@GetMapping("/idProduto")
	public ResponseEntity<Optional<Produto>> buscarProdutoById(@PathVariable Long idProduto){
		
		Optional<Produto> produto = produtoRepository.findById(idProduto);
		
		return produto.isEmpty() ? ResponseEntity.noContent().build() :  ResponseEntity.ok(produto);
	}
	
	
	
	
	
	@PostMapping
	public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto){
	
		
		if(StringUtils.isEmpty(produto)) {
			ResponseEntity.ok();
		}
		
		Produto produtoInclusao = produtoRepository.save(produto);
		
		return ResponseEntity.ok(produtoInclusao);
		
	}
	
	@PutMapping("/{idProduto}")
	public ResponseEntity<Produto> atualizarProduto(@RequestBody Produto produto, @PathVariable Long idProduto){
		
		Produto produtoAlteravel = produto;
		
		produtoAlteravel.setId(idProduto);
		produtoRepository.save(produtoAlteravel);
		
		return ResponseEntity.ok(produtoAlteravel);
	}
	
	
	
	
	
	
//	@GetMapping
//	public void buscarProdutos(){
//		
//		Produto produto = new Produto();
//		
//		
//		TimeZone zone =  TimeZone.getTimeZone("GMT-03:00");
//		
//		
//		produto.setNomeProduto("Vinho");
//		produto.setTipo("Bebida alcoolica");
//		produto.setValor(150.00);
//		produto.setDataInclusao(Calendar.getInstance(zone));
//		produto.setDataFabricacao(LocalDateTime.now());
//		produto.setDataValidade(LocalDateTime.now());
//		
//		produtoRepository.save(produto);
//		
//		
//	}
	
	
	
	
}
