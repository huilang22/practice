/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrQuoteRequest.java
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
 * Class used to create a NrcTransDescrQuoteRequest Udt Request
 *
 */

public class NrcTransDescrQuoteRequest extends NrcTransDescrSubRequestParent {
/**
 *
 * Constructor to create a  NrcTransDescrQuoteRequest
 * @param id Unique request name
 * @param TypeIdNrc Integer for NrcTransDescrQuoteRequest
 * @param RateClass Integer for NrcTransDescrQuoteRequest
 * @param CurrencyCode Integer for NrcTransDescrQuoteRequest
 * @param ComponentId Integer for NrcTransDescrQuoteRequest
 * @param ElementId Integer for NrcTransDescrQuoteRequest
 * @param EquipTypeCode Integer for NrcTransDescrQuoteRequest
 * @param EquipClassCode Integer for NrcTransDescrQuoteRequest
 * @param ClassOfServiceCode Integer for NrcTransDescrQuoteRequest
 * @param GeoAreaId Integer for NrcTransDescrQuoteRequest
 * @param EffectiveDate Date for NrcTransDescrQuoteRequest
 * @param PopUnits Integer for NrcTransDescrQuoteRequest
 * @param Units Integer for NrcTransDescrQuoteRequest
 * @param UnitsType Integer for NrcTransDescrQuoteRequest
 * @param IsUnitType Boolean for NrcTransDescrQuoteRequest
 *
 */
@JsonCreator
  public NrcTransDescrQuoteRequest(@JsonProperty("RequestId") String id, @JsonProperty("TypeIdNrc")Integer TypeIdNrc, @JsonProperty("RateClass")Integer RateClass, @JsonProperty("CurrencyCode")Integer CurrencyCode, @JsonProperty("ComponentId")Integer ComponentId, @JsonProperty("ElementId")Integer ElementId, @JsonProperty("EquipTypeCode")Integer EquipTypeCode, @JsonProperty("EquipClassCode")Integer EquipClassCode, @JsonProperty("ClassOfServiceCode")Integer ClassOfServiceCode, @JsonProperty("GeoAreaId")Integer GeoAreaId, @JsonProperty("EffectiveDate")Date EffectiveDate, @JsonProperty("PopUnits")Integer PopUnits, @JsonProperty("Units")Integer Units, @JsonProperty("UnitsType")Integer UnitsType, @JsonProperty("IsUnitType")Boolean IsUnitType) {
    super(id, "NrcTransDescrQuote");
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
 * Retrieves the NrcTransDescrQuoteOutputData that results from the NrcTransDescrQuoteRequest call
 * @return NrcTransDescrQuoteOutputData resulting from udt call
 *
 */

  public NrcTransDescrQuoteOutputData getOutput() {
    return NrcTransDescrQuoteOutputHelper.fromMap(outputMap);
  }
}
