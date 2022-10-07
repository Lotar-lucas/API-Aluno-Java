package servico.qi.API_student;

import java.util.ArrayList;

import servico.qi.API_student.Aluno;


import jakarta.ws.rs.GET;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("aluno")
public class Myservice {
	
	ArrayList<Aluno> listaAlunos;
	
	public  Myservice () {
		listaAlunos = new ArrayList<Aluno>();
		
		
		listaAlunos.add(new Aluno(1, "Joao", "joao@joao.com",3));
		listaAlunos.add(new Aluno(2, "Maria", "maria@maria.com",1));
		listaAlunos.add(new Aluno(3, "Jose", "jose@mariajoao.com",2));
		listaAlunos.add(new Aluno(4, "Pedro", "pedro@email.com",3));
		
	}
	
	
	
	@GET
    @Path("getall")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Aluno> getAlunos() {
		return listaAlunos;
	}
	
	
	
    @GET
    @Path("getbyId/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Aluno getId(@PathParam("id") int id) {
    	
    	for (Aluno aluno : listaAlunos) {
			if(aluno.getId() == id) {
				return aluno;
			}
		}
    	return null;
    	
    }
    
    
    
    
    
}
