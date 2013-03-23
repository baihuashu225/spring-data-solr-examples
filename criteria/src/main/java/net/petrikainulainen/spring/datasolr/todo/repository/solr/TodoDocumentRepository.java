package net.petrikainulainen.spring.datasolr.todo.repository.solr;

import net.petrikainulainen.spring.datasolr.todo.document.TodoDocument;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

/**
 * @author Petri Kainulainen
 */
public interface TodoDocumentRepository extends CustomTodoDocumentRepository, SolrCrudRepository<TodoDocument, String> {

}
