/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeRateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a InvsTypeRateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeRateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer InventoryTypeId;
  protected Integer RateClass;
  protected Integer CurrencyCode;
  protected Integer ComponentId;
  protected Integer EquipType;
  protected Integer EquipClass;
  protected Integer EquipCos;
  protected Integer BillingFrequency;
  protected String BillPeriod;
  protected Integer PopUnits;
  protected Integer Units;
  protected Integer UnitsType;
  protected Integer Jurisdiction;
  protected Date EffectiveDate;
/**
 *
 * Constructor to create a  InvsTypeRateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeRateBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer InventoryTypeIdIn, Integer RateClassIn, Integer CurrencyCodeIn, Integer ComponentIdIn, Integer EquipTypeIn, Integer EquipClassIn, Integer EquipCosIn, Integer BillingFrequencyIn, String BillPeriodIn, Integer PopUnitsIn, Integer UnitsIn, Integer UnitsTypeIn, Integer JurisdictionIn, Date EffectiveDateIn) {
    super(id, context, "InvsTypeRate");
    InventoryTypeId = InventoryTypeIdIn;
    RateClass = RateClassIn;
    CurrencyCode = CurrencyCodeIn;
    ComponentId = ComponentIdIn;
    EquipType = EquipTypeIn;
    EquipClass = EquipClassIn;
    EquipCos = EquipCosIn;
    BillingFrequency = BillingFrequencyIn;
    BillPeriod = BillPeriodIn;
    PopUnits = PopUnitsIn;
    Units = UnitsIn;
    UnitsType = UnitsTypeIn;
    Jurisdiction = JurisdictionIn;
    EffectiveDate = EffectiveDateIn;
  }

  public void translateToMap() {
    if (InventoryTypeId != null) {
      addInput("InventoryTypeId", InventoryTypeId);
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
    if (EquipType != null) {
      addInput("EquipType", EquipType);
    }
    if (EquipClass != null) {
      addInput("EquipClass", EquipClass);
    }
    if (EquipCos != null) {
      addInput("EquipCos", EquipCos);
    }
    if (BillingFrequency != null) {
      addInput("BillingFrequency", BillingFrequency);
    }
    if (BillPeriod != null) {
      addInput("BillPeriod", BillPeriod);
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
    if (Jurisdiction != null) {
      addInput("Jurisdiction", Jurisdiction);
    }
    if (EffectiveDate != null) {
      addInput("EffectiveDate", EffectiveDate);
    }
  }


/**
 *
 * Sets the InventoryTypeId
 * @param InventoryTypeIdIn Value of the InventoryTypeId
 *
 */

  public void setInventoryTypeId(Integer InventoryTypeIdIn) {
    InventoryTypeId = InventoryTypeIdIn;
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
 * Sets the EquipType
 * @param EquipTypeIn Value of the EquipType
 *
 */

  public void setEquipType(Integer EquipTypeIn) {
    EquipType = EquipTypeIn;
  }

/**
 *
 * Sets the EquipClass
 * @param EquipClassIn Value of the EquipClass
 *
 */

  public void setEquipClass(Integer EquipClassIn) {
    EquipClass = EquipClassIn;
  }

/**
 *
 * Sets the EquipCos
 * @param EquipCosIn Value of the EquipCos
 *
 */

  public void setEquipCos(Integer EquipCosIn) {
    EquipCos = EquipCosIn;
  }

/**
 *
 * Sets the BillingFrequency
 * @param BillingFrequencyIn Value of the BillingFrequency
 *
 */

  public void setBillingFrequency(Integer BillingFrequencyIn) {
    BillingFrequency = BillingFrequencyIn;
  }

/**
 *
 * Sets the BillPeriod
 * @param BillPeriodIn Value of the BillPeriod
 *
 */

  public void setBillPeriod(String BillPeriodIn) {
    BillPeriod = BillPeriodIn;
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
 * Sets the Jurisdiction
 * @param JurisdictionIn Value of the Jurisdiction
 *
 */

  public void setJurisdiction(Integer JurisdictionIn) {
    Jurisdiction = JurisdictionIn;
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

  public void translateFromMap() {
    InventoryTypeId = (Integer)inputMap.get("InventoryTypeId");
    RateClass = (Integer)inputMap.get("RateClass");
    CurrencyCode = (Integer)inputMap.get("CurrencyCode");
    ComponentId = (Integer)inputMap.get("ComponentId");
    EquipType = (Integer)inputMap.get("EquipType");
    EquipClass = (Integer)inputMap.get("EquipClass");
    EquipCos = (Integer)inputMap.get("EquipCos");
    BillingFrequency = (Integer)inputMap.get("BillingFrequency");
    BillPeriod = (String)inputMap.get("BillPeriod");
    PopUnits = (Integer)inputMap.get("PopUnits");
    Units = (Integer)inputMap.get("Units");
    UnitsType = (Integer)inputMap.get("UnitsType");
    Jurisdiction = (Integer)inputMap.get("Jurisdiction");
    EffectiveDate = (Date)inputMap.get("EffectiveDate");
  }

/**
 *
 * Gets the InventoryTypeId
 * @return Value of the InventoryTypeId
 *
 */

  public Integer getInventoryTypeId( ) {
    return InventoryTypeId;
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
 * Gets the EquipType
 * @return Value of the EquipType
 *
 */

  public Integer getEquipType( ) {
    return EquipType;
  }

/**
 *
 * Gets the EquipClass
 * @return Value of the EquipClass
 *
 */

  public Integer getEquipClass( ) {
    return EquipClass;
  }

/**
 *
 * Gets the EquipCos
 * @return Value of the EquipCos
 *
 */

  public Integer getEquipCos( ) {
    return EquipCos;
  }

/**
 *
 * Gets the BillingFrequency
 * @return Value of the BillingFrequency
 *
 */

  public Integer getBillingFrequency( ) {
    return BillingFrequency;
  }

/**
 *
 * Gets the BillPeriod
 * @return Value of the BillPeriod
 *
 */

  public String getBillPeriod( ) {
    return BillPeriod;
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
 * Gets the Jurisdiction
 * @return Value of the Jurisdiction
 *
 */

  public Integer getJurisdiction( ) {
    return Jurisdiction;
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

}
