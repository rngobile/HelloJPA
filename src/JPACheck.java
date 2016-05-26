import javax.persistence.EntityManager;

import customTools.DBUtil;

public class JPACheck {

	public static void main(String[] args) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			customTools.Employee cust = em.find(customTools.Employee.class, (long)200);
			System.out.println(cust.getFirstName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			System.out.println("finished!");
		}
	}

}
