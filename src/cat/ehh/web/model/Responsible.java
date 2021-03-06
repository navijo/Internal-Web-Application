package cat.ehh.web.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the responsible database table.
 * 
 */
@Entity
@NamedQuery(name="Responsible.findAll", query="SELECT r FROM Responsible r")
public class Responsible implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ResponsibleID_GENERATOR", sequenceName="SEQ_RESP",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ResponsibleID_GENERATOR")
	@Column(name="responsibleId")
	private long responsibleId;

	@Column(name="userId")
	private java.math.BigDecimal userId;

	//bi-directional many-to-one association to PatientResponsible
	@OneToMany(mappedBy="responsible")
	private List<PatientResponsible> patientResponsibles;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumns({@JoinColumn(name="userId",insertable=false,updatable=false)
		})
	private UserEHH user;

	public Responsible() {
	}

	public long getResponsibleId() {
		return this.responsibleId;
	}

	public void setResponsibleId(long responsibleId) {
		this.responsibleId = responsibleId;
	}

	public java.math.BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(java.math.BigDecimal userId) {
		this.userId = userId;
	}

	public List<PatientResponsible> getPatientResponsibles() {
		return this.patientResponsibles;
	}

	public void setPatientResponsibles(List<PatientResponsible> patientResponsibles) {
		this.patientResponsibles = patientResponsibles;
	}

	public PatientResponsible addPatientResponsible(PatientResponsible patientResponsible) {
		getPatientResponsibles().add(patientResponsible);
		patientResponsible.setResponsible(this);

		return patientResponsible;
	}

	public PatientResponsible removePatientResponsible(PatientResponsible patientResponsible) {
		getPatientResponsibles().remove(patientResponsible);
		patientResponsible.setResponsible(null);

		return patientResponsible;
	}

	public UserEHH getUser() {
		return this.user;
	}

	public void setUser(UserEHH user) {
		this.user = user;
	}

}