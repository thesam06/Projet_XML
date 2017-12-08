package net.dotmyself.bartering.service;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import net.dotmyself.file.source.13.model.Member;

import com.sun.jersey.api.NotFoundException;


@Path("/members")
public class MemberResource {

	@GET
	@Path("{id : \\d+}")
	@Produces("application/xml")
	public Member getMember(@PathParam("id") int id) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory(Member.PERSISTENCE_UNIT);
		Member m = emf.createEntityManager().find(Member.class, id);
		if (null == m) {
			emf.close();
			throw new NotFoundException("member with memberId=" + id
					+ " does not exist!");
		}
		emf.close();
		return m;
	}

	@Path("{id : \\d+}/services")
	public ServiceResource getResources(@PathParam("id") int id) {
		return new ServiceResource(id);
	}
}