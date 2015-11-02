/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeRateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsTypeRateRequest Udt Request
 *
 */

public class InvsTypeRateRequest extends InvsTypeRequest {
/**
 *
 * Constructor to create a  InvsTypeRateRequest
 * @param id Unique request name
 * @param InventoryTypeId Integer for InvsTypeRateRequest
 * @param RateClass Integer for InvsTypeRateRequest
 * @param CurrencyCode Integer for InvsTypeRateRequest
 * @param ComponentId Integer for InvsTypeRateRequest
 * @param EquipType Integer for InvsTypeRateRequest
 * @param EquipClass Integer for InvsTypeRateRequest
 * @param EquipCos Integer for InvsTypeRateRequest
 * @param BillingFrequency Integer for InvsTypeRateRequest
 * @param BillPeriod String for InvsTypeRateRequest
 * @param PopUnits Integer for InvsTypeRateRequest
 * @param Units Integer for InvsTypeRateRequest
 * @param UnitsType Integer for InvsTypeRateRequest
 * @param Jurisdiction Integer for InvsTypeRateRequest
 * @param EffectiveDate Date for InvsTypeRateRequest
 *
 */
@JsonCreator
  public InvsTypeRateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InventoryTypeId")Integer InventoryTypeId, @JsonProperty("RateClass")Integer RateClass, @JsonProperty("CurrencyCode")Integer CurrencyCode, @JsonProperty("ComponentId")Integer ComponentId, @JsonProperty("EquipType")Integer EquipType, @JsonProperty("EquipClass")Integer EquipClass, @JsonProperty("EquipCos")Integer EquipCos, @JsonProperty("BillingFrequency")Integer BillingFrequency, @JsonProperty("BillPeriod")String BillPeriod, @JsonProperty("PopUnits")Integer PopUnits, @JsonProperty("Units")Integer Units, @JsonProperty("UnitsType")Integer UnitsType, @JsonProperty("Jurisdiction")Integer Jurisdiction, @JsonProperty("EffectiveDate")Date EffectiveDate) {
    super(id, "InvsTypeRate");
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
 * Retrieves the BigInteger that results from the InvsTypeRateRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("Rate");
  }
}
