package pruebas;

import java.util.List;

import daos.RolDao;
import daos.RolDaoImpl;
import model.Rol;

public class prueba06 {

	public static void main(String[] args) {

		RolDao dao = new RolDaoImpl();						
								
		dao.delete(6);
		
		List<Rol> rolList = dao.findAll();
		
		for(Rol r: rolList) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolName());
			System.out.println(r.getRolStatus());

		}

	}

}
