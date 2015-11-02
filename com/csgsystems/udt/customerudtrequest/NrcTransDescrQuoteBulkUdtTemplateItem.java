/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTransDescrQuoteBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a NrcTransDescrQuoteBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTransDescrQuoteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer TypeIdNrc;
  protected Integer RateClass;
  protected Integer CurrencyCode;
  protected Integer ComponentId;
  protected Integer ElementId;
  protected Integer EquipTypeCode;
  protected Integer EquipClassCode;
  protected Integer ClassOfServiceCode;
  protected Integer GeoAreaId;
  protected Date EffectiveDate;
  protected Integer PopUnits;
  protected Integer Units;
  protected Integer UnitsType;
  protected Boolean IsUnitType;
/**
 *
 * Constructor to create a  NrcTransDescrQuoteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTransDescrQuoteBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer TypeIdNrcIn, Integer RateClassIn, Integer CurrencyCodeIn, Integer ComponentIdIn, Integer ElementIdIn, Integer EquipTypeCodeIn, Integer EquipClassCodeIn, Integer ClassOfServiceCodeIn, Integer GeoAreaIdIn, Date EffectiveDateIn, Integer PopUnitsIn, Integer UnitsIn, Integer UnitsTypeIn, Boolean IsUnitTypeIn) {
    super(id, context, "NrcTransDescrQuote");
    TypeIdNrc = TypeIdNrcIn;
    RateClass = RateClassIn;
    CurrencyCode = CurrencyCodeIn;
    ComponentId = ComponentIdIn;
    ElementId = ElementIdIn;
    EquipTypeCode = EquipTypeCodeIn;
    EquipClassCode = EquipClassCodeIn;
    ClassOfServiceCode = ClassOfServiceCodeIn;
    GeoAreaId = GeoAreaIdIn;
    EffectiveDate = EffectiveDateIn;
    PopUnits = PopUnitsIn;
    Units = UnitsIn;
    UnitsType = UnitsTypeIn;
    IsUnitType = IsUnitTypeIn;
  }

  public void translateToMap() {
    if (TypeIdNrc != null) {
      addInput("TypeIdNrc", TypeIdNrc);
    }
    if (RateClass != null) {
      addInput("RateClass", RateClass);
    }
    if (CurrencyCode != null) {
      addInput("CurrencyCode", CurrencyCode);
    }
    if (ComponentId != null) {
      addInput("ComponentId", ComponentId);
    }
    if (ElementId != null) {
      addInput("ElementId", ElementId);
    }
    if (EquipTypeCode != null) {
      addInput("EquipTypeCode", EquipTypeCode);
    }
    if (EquipClassCode != null) {
      addInput("EquipClassCode", EquipClassCode);
    }
    if (ClassOfServiceCode != null) {
      addInput("ClassOfServiceCode", ClassOfServiceCode);
    }
    if (GeoAreaId != null) {
      addInput("GeoAreaId", GeoAreaId);
    }
    if (EffectiveDate != null) {
      addInput("EffectiveDate", EffectiveDate);
    }
    if (PopUnits != null) {
      addInput("PopUnits", PopUnits);
    }
    if (Units != null) {
      addInput("Units", Units);
    }
    if (UnitsType != null) {
      addInput("UnitsType", UnitsType);
    }
    if (IsUnitType != null) {
      addInput("IsUnitType", IsUnitType);
    }
  }


/**
 *
 * Sets the TypeIdNrc
 * @param TypeIdNrcIn Value of the TypeIdNrc
 *
 */

  public void setTypeIdNrc(Integer TypeIdNrcIn) {
    TypeIdNrc = TypeIdNrcIn;
  }

/**
 *
 * Sets the RateClass
 * @param RateClassIn Value of the RateClass
 *
 */

  public void setRateClass(Integer RateClassIn) {
    RateClass = RateClassIn;
  }

/**
 *
 * Sets the CurrencyCode
 * @param CurrencyCodeIn Value of the CurrencyCode
 *
 */

  public void setCurrencyCode(Integer CurrencyCodeIn) {
    CurrencyCode = CurrencyCodeIn;
  }

/**
 *
 * Sets the ComponentId
 * @param ComponentIdIn Value of the ComponentId
 *
 */

  public void setComponentId(Integer ComponentIdIn) {
    ComponentId = ComponentIdIn;
  }

/**
 *
 * Sets the ElementId
 * @param ElementIdIn Value of the ElementId
 *
 */

  public void setElementId(Integer ElementIdIn) {
    ElementId = ElementIdIn;
  }

/**
 *
 * Sets the EquipTypeCode
 * @param EquipTypeCodeIn Value of the EquipTypeCode
 *
 */

  public void setEquipTypeCode(Integer EquipTypeCodeIn) {
    EquipTypeCode = EquipTypeCodeIn;
  }

/**
 *
 * Sets the EquipClassCode
 * @param EquipClassCodeIn Value of the EquipClassCode
 *
 */

  public void setEquipClassCode(Integer EquipClassCodeIn) {
    EquipClassCode = EquipClassCodeIn;
  }

/**
 *
 * Sets the ClassOfServiceCode
 * @param ClassOfServiceCodeIn Value of the ClassOfServiceCode
 *
 */

  public void setClassOfServiceCode(Integer ClassOfServiceCodeIn) {
    ClassOfServiceCode = ClassOfServiceCodeIn;
  }

/**
 *
 * Sets the GeoAreaId
 * @param GeoAreaIdIn Value of the GeoAreaId
 *
 */

  public void setGeoAreaId(Integer GeoAreaIdIn) {
    GeoAreaId = GeoAreaIdIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param EffectiveDateIn Value of the EffectiveDate
 *
 */

  public void setEffectiveDate(Date EffectiveDateIn) {
    EffectiveDate = EffectiveDateIn;
  }

/**
 *
 * Sets the PopUnits
 * @param PopUnitsIn Value of the PopUnits
 *
 */

  public void setPopUnits(Integer PopUnitsIn) {
    PopUnits = PopUnitsIn;
  }

/**
 *
 * Sets the Units
 * @param UnitsIn Value of the Units
 *
 */

  public void setUnits(Integer UnitsIn) {
    Units = UnitsIn;
  }

/**
 *
 * Sets the UnitsType
 * @param UnitsTypeIn Value of the UnitsType
 *
 */

  public void setUnitsType(Integer UnitsTypeIn) {
    UnitsType = UnitsTypeIn;
  }

/**
 *
 * Sets the IsUnitType
 * @param IsUnitTypeIn Value of the IsUnitType
 *
 */

  public void setIsUnitType(Boolean IsUnitTypeIn) {
    IsUnitType = IsUnitTypeIn;
  }

  public void translateFromMap() {
    TypeIdNrc = (Integer)inputMap.get("TypeIdNrc");
    RateClass = (Integer)inputMap.get("RateClass");
    CurrencyCode = (Integer)inputMap.get("CurrencyCode");
    ComponentId = (Integer)inputMap.get("ComponentId");
    ElementId = (Integer)inputMap.get("ElementId");
    EquipTypeCode = (Integer)inputMap.get("EquipTypeCode");
    EquipClassCode = (Integer)inputMap.get("EquipClassCode");
    ClassOfServiceCode = (Integer)inputMap.get("ClassOfServiceCode");
    GeoAreaId = (Integer)inputMap.get("GeoAreaId");
    EffectiveDate = (Date)inputMap.get("EffectiveDate");
    PopUnits = (Integer)inputMap.get("PopUnits");
    Units = (Integer)inputMap.get("Units");
    UnitsType = (Integer)inputMap.get("UnitsType");
    IsUnitType = (Boolean)inputMap.get("IsUnitType");
  }

/**
 *
 * Gets the TypeIdNrc
 * @return Value of the TypeIdNrc
 *
 */

  public Integer getTypeIdNrc( ) {
    return TypeIdNrc;
  }

/**
 *
 * Gets the RateClass
 * @return Value of the RateClass
 *
 */

  public Integer getRateClass( ) {
    return RateClass;
  }

/**
 *
 * Gets the CurrencyCode
 * @return Value of the CurrencyCode
 *
 */

  public Integer getCurrencyCode( ) {
    return CurrencyCode;
  }

/**
 *
 * Gets the ComponentId
 * @return Value of the ComponentId
 *
 */

  public Integer getComponentId( ) {
    return ComponentId;
  }

/**
 *
 * Gets the ElementId
 * @return Value of the ElementId
 *
 */

  public Integer getElementId( ) {
    return ElementId;
  }

/**
 *
 * Gets the EquipTypeCode
 * @return Value of the EquipTypeCode
 *
 */

  public Integer getEquipTypeCode( ) {
    return EquipTypeCode;
  }

/**
 *
 * Gets the EquipClassCode
 * @return Value of the EquipClassCode
 *
 */

  public Integer getEquipClassCode( ) {
    return EquipClassCode;
  }

/**
 *
 * Gets the ClassOfServiceCode
 * @return Value of the ClassOfServiceCode
 *
 */

  public Integer getClassOfServiceCode( ) {
    return ClassOfServiceCode;
  }

/**
 *
 * Gets the GeoAreaId
 * @return Value of the GeoAreaId
 *
 */

  public Integer getGeoAreaId( ) {
    return GeoAreaId;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return EffectiveDate;
  }

/**
 *
 * Gets the PopUnits
 * @return Value of the PopUnits
 *
 */

  public Integer getPopUnits( ) {
    return PopUnits;
  }

/**
 *
 * Gets the Units
 * @return Value of the Units
 *
 */

  public Integer getUnits( ) {
    return Units;
  }

/**
 *
 * Gets the UnitsType
 * @return Value of the UnitsType
 *
 */

  public Integer getUnitsType( ) {
    return UnitsType;
  }

/**
 *
 * Gets the IsUnitType
 * @return Value of the IsUnitType
 *
 */

  public Boolean getIsUnitType( ) {
    return IsUnitType;
  }

}
