/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementRateRequest.java
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
 * Class used to create a ProductElementRateRequest Udt Request
 *
 */

public class ProductElementRateRequest extends ProductElementSubRequestParent {
/**
 *
 * Constructor to create a  ProductElementRateRequest
 * @param id Unique request name
 * @param ElementId Integer for ProductElementRateRequest
 * @param RateClass Integer for ProductElementRateRequest
 * @param CurrencyCode Integer for ProductElementRateRequest
 * @param ExrateClass Integer for ProductElementRateRequest
 * @param EquipType Integer for ProductElementRateRequest
 * @param EquipClass Integer for ProductElementRateRequest
 * @param EquipCos Integer for ProductElementRateRequest
 * @param ComponentId Integer for ProductElementRateRequest
 * @param BillingFrequency Integer for ProductElementRateRequest
 * @param BillPeriod String for ProductElementRateRequest
 * @param PopUnits Integer for ProductElementRateRequest
 * @param Units Integer for ProductElementRateRequest
 * @param UnitsType Integer for ProductElementRateRequest
 * @param Jurisdiction Integer for ProductElementRateRequest
 * @param EffectiveDate Date for ProductElementRateRequest
 *
 */
@JsonCreator
  public ProductElementRateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ElementId")Integer ElementId, @JsonProperty("RateClass")Integer RateClass, @JsonProperty("CurrencyCode")Integer CurrencyCode, @JsonProperty("ExrateClass")Integer ExrateClass, @JsonProperty("EquipType")Integer EquipType, @JsonProperty("EquipClass")Integer EquipClass, @JsonProperty("EquipCos")Integer EquipCos, @JsonProperty("ComponentId")Integer ComponentId, @JsonProperty("BillingFrequency")Integer BillingFrequency, @JsonProperty("BillPeriod")String BillPeriod, @JsonProperty("PopUnits")Integer PopUnits, @JsonProperty("Units")Integer Units, @JsonProperty("UnitsType")Integer UnitsType, @JsonProperty("Jurisdiction")Integer Jurisdiction, @JsonProperty("EffectiveDate")Date EffectiveDate) {
    super(id, "ProductElementRate");
    if (ElementId != null) {
      addInput("ElementId", ElementId);
    }
    if (RateClass != null) {
      addInput("RateClass", RateClass);
    }
    if (CurrencyCode != null) {
      addInput("CurrencyCode", CurrencyCode);
    }
    if (ExrateClass != null) {
      addInput("ExrateClass", ExrateClass);
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
    if (ComponentId != null) {
      addInput("ComponentId", ComponentId);
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
 * Retrieves the ProductElementRateOutputData that results from the ProductElementRateRequest call
 * @return ProductElementRateOutputData resulting from udt call
 *
 */

  public ProductElementRateOutputData getOutput() {
    return ProductElementRateOutputHelper.fromMap(outputMap);
  }
}
