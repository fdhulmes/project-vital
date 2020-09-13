package com.vital.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REP_ID")
    Long reportId;

    @Column(name = "PAT_ID")
    Long patientId;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REP_DATE")
    Date timestamp;

    @Column(name = "PAT_TEMP")
    Double temp;

    @Column(name = "PAT_HR")
    Integer heartRate;

    @Column(name = "PAT_RESP")
    Double respRate;

    @Column(name = "PAT_BPS")
    Integer bpSystolic;

    @Column(name = "PAT_BPD")
    Integer bpDiastolic;

    @Column(name = "CRIT_NOTES")
    String criticalNotes;

    public Long getReportId() {
        return reportId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Double getRespRate() {
        return respRate;
    }

    public void setRespRate(Double respRate) {
        this.respRate = respRate;
    }

    public Integer getBpSystolic() {
        return bpSystolic;
    }

    public void setBpSystolic(Integer bpSystolic) {
        this.bpSystolic = bpSystolic;
    }

    public Integer getBpDiastolic() {
        return bpDiastolic;
    }

    public void setBpDiastolic(Integer bpDiastolic) {
        this.bpDiastolic = bpDiastolic;
    }

    public String getCriticalNotes() {
        return criticalNotes;
    }

    public void setCriticalNotes(String criticalNotes) {
        this.criticalNotes = criticalNotes;
    }
}
