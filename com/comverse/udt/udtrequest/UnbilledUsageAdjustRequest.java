/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageAdjustRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a UnbilledUsageAdjustRequest Udt Request
 *
 */

public class UnbilledUsageAdjustRequest extends UnbilledUsageSubRequestParent {
/**
 *
 * Constructor to create a  UnbilledUsageAdjustRequest
 * @param id Unique request name
 * @param UnbilledUsageAdjustIn UnbilledUsageObjectData for UnbilledUsageAdjustRequest
 * @param TransCode Integer for UnbilledUsageAdjustRequest
 * @param AdjReasonCode Integer for UnbilledUsageAdjustRequest
 * @param RequestStatus Integer for UnbilledUsageAdjustRequest
 * @param FraudIndicator Integer for UnbilledUsageAdjustRequest
 * @param Annotation String for UnbilledUsageAdjustRequest
 * @param PrimaryUnitsType Integer for UnbilledUsageAdjustRequest
 * @param PrimaryUnits BigInteger for UnbilledUsageAdjustRequest
 * @param Amount BigInteger for UnbilledUsageAdjustRequest
 * @param BillOrderNumber String for UnbilledUsageAdjustRequest
 *
 */
@JsonCreator
  public UnbilledUsageAdjustRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageObjectData UnbilledUsageAdjustIn, @JsonProperty("TransCode")Integer TransCode, @JsonProperty("AdjReasonCode")Integer AdjReasonCode, @JsonProperty("RequestStatus")Integer RequestStatus, @JsonProperty("FraudIndicator")Integer FraudIndicator, @JsonProperty("Annotation")String Annotation, @JsonProperty("PrimaryUnitsType")Integer PrimaryUnitsType, @JsonProperty("PrimaryUnits")BigInteger PrimaryUnits, @JsonProperty("Amount")BigInteger Amount, @JsonProperty("BillOrderNumber")String BillOrderNumber) {
    super(id, "UnbilledUsageAdjust");
    if (UnbilledUsageAdjustIn != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsageAdjustIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
    if (TransCode != null) {
      addInput("TransCode", TransCode);
    }
    if (AdjReasonCode != null) {
      addInput("AdjReasonCode", AdjReasonCode);
    }
    if (RequestStatus != null) {
      addInput("RequestStatus", RequestStatus);
    }
    if (FraudIndicator != null) {
      addInput("FraudIndicator", FraudIndicator);
    }
    if (Annotation != null) {
      addInput("Annotation", Annotation);
    }
    if (PrimaryUnitsType != null) {
      addInput("PrimaryUnitsType", PrimaryUnitsType);
    }
    if (PrimaryUnits != null) {
      addInput("PrimaryUnits", PrimaryUnits);
    }
    if (Amount != null) {
      addInput("Amount", Amount);
    }
    if (BillOrderNumber != null) {
      addInput("BillOrderNumber", BillOrderNumber);
    }
  }

/**
 *
 * Retrieves the AdjustmentObjectData that results from the UnbilledUsageAdjustRequest call
 * @return AdjustmentObjectData resulting from udt call
 *
 */

  public AdjustmentObjectData getOutput() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
}
