/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageAdjustRequest.java
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
 * Class used to create a BilledUsageAdjustRequest Udt Request
 *
 */

public class BilledUsageAdjustRequest extends BilledUsageSubRequestParent {
/**
 *
 * Constructor to create a  BilledUsageAdjustRequest
 * @param id Unique request name
 * @param BilledUsageAdjustIn BilledUsageObjectData for BilledUsageAdjustRequest
 * @param TransCode Integer for BilledUsageAdjustRequest
 * @param AdjReasonCode Integer for BilledUsageAdjustRequest
 * @param RequestStatus Integer for BilledUsageAdjustRequest
 * @param FraudIndicator Integer for BilledUsageAdjustRequest
 * @param Annotation String for BilledUsageAdjustRequest
 * @param PrimaryUnitsType Integer for BilledUsageAdjustRequest
 * @param PrimaryUnits BigInteger for BilledUsageAdjustRequest
 * @param Amount BigInteger for BilledUsageAdjustRequest
 * @param BillOrderNumber String for BilledUsageAdjustRequest
 *
 */
@JsonCreator
  public BilledUsageAdjustRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageObjectData BilledUsageAdjustIn, @JsonProperty("TransCode")Integer TransCode, @JsonProperty("AdjReasonCode")Integer AdjReasonCode, @JsonProperty("RequestStatus")Integer RequestStatus, @JsonProperty("FraudIndicator")Integer FraudIndicator, @JsonProperty("Annotation")String Annotation, @JsonProperty("PrimaryUnitsType")Integer PrimaryUnitsType, @JsonProperty("PrimaryUnits")BigInteger PrimaryUnits, @JsonProperty("Amount")BigInteger Amount, @JsonProperty("BillOrderNumber")String BillOrderNumber) {
    super(id, "BilledUsageAdjust");
    if (BilledUsageAdjustIn != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsageAdjustIn, new HashMap(), "Adjustment").get("Adjustment"));
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
 * Retrieves the AdjustmentObjectData that results from the BilledUsageAdjustRequest call
 * @return AdjustmentObjectData resulting from udt call
 *
 */

  public AdjustmentObjectData getOutput() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
}
