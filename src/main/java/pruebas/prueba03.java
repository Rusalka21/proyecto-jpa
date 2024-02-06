package pruebas;

import java.util.List;

import model.Rol;
import daos.RolDao;
import daos.RolDaoImpl;

public class prueba03 {

	public static void main(String[] args) {

		RolDao dao = new RolDaoImpl();
		List<Rol> rolList = dao.findAll();
		
		for(Rol r: rolList) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolName());
			System.out.println(r.getRolStatus());

		}
	}
}
