package entity;


public class JlSupEquipmentCheckTbl {

  private Long id;
  private Long equipmentCheckId;
  private Long equipmentMonthPlanInfoId;
  private Long supActualNum;
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getEquipmentCheckId() {
    return equipmentCheckId;
  }

  public void setEquipmentCheckId(Long equipmentCheckId) {
    this.equipmentCheckId = equipmentCheckId;
  }


  public Long getEquipmentMonthPlanInfoId() {
    return equipmentMonthPlanInfoId;
  }

  public void setEquipmentMonthPlanInfoId(Long equipmentMonthPlanInfoId) {
    this.equipmentMonthPlanInfoId = equipmentMonthPlanInfoId;
  }


  public Long getSupActualNum() {
    return supActualNum;
  }

  public void setSupActualNum(Long supActualNum) {
    this.supActualNum = supActualNum;
  }

}
