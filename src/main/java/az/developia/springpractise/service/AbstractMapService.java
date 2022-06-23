package az.developia.springpractise.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Scope;

public abstract class AbstractMapService<T , Id> {
	 	
protected Map<Id,T> map=new HashMap<>();
Set<T> findALl(){
	return new HashSet<>(map.values());
}
T findById(Id id) {
	return map.get(id);
}
T save(Id id,T object) {
	map.put(id, object);
	return object;
}
void deleteById(Id id) {
	map.remove(id);
}

}