package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.CUserInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * CUserInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.CUserInfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class CUserInfoDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CUserInfoDAO.class);
	// property constants
	public static final String OPERNAME = "opername";
	public static final String OPERPASS = "operpass";
	public static final String ROLEID = "roleid";
	public static final String ZWID = "zwid";

	public void save(CUserInfo transientInstance) {
		log.debug("saving CUserInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CUserInfo persistentInstance) {
		log.debug("deleting CUserInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CUserInfo findById(java.math.BigDecimal id) {
		log.debug("getting CUserInfo instance with id: " + id);
		try {
			CUserInfo instance = (CUserInfo) getSession().get(
					"ppms.domain.CUserInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CUserInfo instance) {
		log.debug("finding CUserInfo instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.CUserInfo")
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
		log.debug("finding CUserInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CUserInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOpername(Object opername) {
		return findByProperty(OPERNAME, opername);
	}

	public List findByOperpass(Object operpass) {
		return findByProperty(OPERPASS, operpass);
	}

	public List findByRoleid(Object roleid) {
		return findByProperty(ROLEID, roleid);
	}

	public List findByZwid(Object zwid) {
		return findByProperty(ZWID, zwid);
	}

	public List findAll() {
		log.debug("finding all CUserInfo instances");
		try {
			String queryString = "from CUserInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CUserInfo merge(CUserInfo detachedInstance) {
		log.debug("merging CUserInfo instance");
		try {
			CUserInfo result = (CUserInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CUserInfo instance) {
		log.debug("attaching dirty CUserInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CUserInfo instance) {
		log.debug("attaching clean CUserInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}