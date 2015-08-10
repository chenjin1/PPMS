package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbAreaorgrelation;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbAreaorgrelation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbAreaorgrelation
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbAreaorgrelationDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(TbAreaorgrelationDAO.class);
	// property constants
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbAreaorgrelation transientInstance) {
		log.debug("saving TbAreaorgrelation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbAreaorgrelation persistentInstance) {
		log.debug("deleting TbAreaorgrelation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbAreaorgrelation findById(java.lang.Integer id) {
		log.debug("getting TbAreaorgrelation instance with id: " + id);
		try {
			TbAreaorgrelation instance = (TbAreaorgrelation) getSession().get(
					"ppms.domain.TbAreaorgrelation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbAreaorgrelation instance) {
		log.debug("finding TbAreaorgrelation instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbAreaorgrelation")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TbAreaorgrelation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbAreaorgrelation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbAreaorgrelation instances");
		try {
			String queryString = "from TbAreaorgrelation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbAreaorgrelation merge(TbAreaorgrelation detachedInstance) {
		log.debug("merging TbAreaorgrelation instance");
		try {
			TbAreaorgrelation result = (TbAreaorgrelation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbAreaorgrelation instance) {
		log.debug("attaching dirty TbAreaorgrelation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbAreaorgrelation instance) {
		log.debug("attaching clean TbAreaorgrelation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}