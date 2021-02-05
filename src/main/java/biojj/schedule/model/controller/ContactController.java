package biojj.schedule.model.controller;

import biojj.schedule.model.entity.Contacts;
import biojj.schedule.model.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/contacts")
@CrossOrigin("*")
public class ContactController {
    private  final ContactRepository repository;

    @Autowired
    public ContactController(ContactRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Contacts> listar(){
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contacts salvar(@RequestBody Contacts contact){
        return  repository.save(contact);
    }

    @GetMapping("{id}")
    public Contacts BuscarId( @PathVariable Integer id ){
        return repository
                .findById(id)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Contato não encontrado") );

    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar( @PathVariable Integer id ){
        repository
                .findById(id)
                .map( contacts -> {
                    repository.delete(contacts);
                    return Void.TYPE;
                })
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Contato não encontrado") );
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar( @PathVariable Integer id,
                           @RequestBody @Validated Contacts contactAtualizado ) {
        repository
                .findById(id)
                .map( contact -> {
                    contact.setName(contactAtualizado.getName());
                    contact.setSex(contactAtualizado.getSex());
                    contact.setTelephone(contactAtualizado.getTelephone());
                    contact.setEmail(contactAtualizado.getEmail());
                    return repository.save(contact);
                })
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Contato não encontrado") );
    }
}
