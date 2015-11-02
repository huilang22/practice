/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailAdjustRequest.java
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
 * Class used to create a InvoiceDetailAdjustRequest Udt Request
 *
 */

public class InvoiceDetailAdjustRequest extends InvoiceDetailSubRequestParent {
/**
 *
 * Constructor to create a  InvoiceDetailAdjustRequest
 * @param id Unique request name
 * @param InvoiceDetailAdjustIn InvoiceDetailObjectData for InvoiceDetailAdjustRequest
 * @param TransCode Integer for InvoiceDetailAdjustRequest
 * @param AdjReasonCode Integer for InvoiceDetailAdjustRequest
 * @param RequestStatus Integer for InvoiceDetailAdjustRequest
 * @param FraudIndicator Integer for InvoiceDetailAdjustRequest
 * @param Annotation String for InvoiceDetailAdjustRequest
 * @param PrimaryUnitsType Integer for InvoiceDetailAdjustRequest
 * @param PrimaryUnits BigInteger for InvoiceDetailAdjustRequest
 * @param Amount BigInteger for InvoiceDetailAdjustRequest
 * @param BillOrderNumber String for InvoiceDetailAdjustRequest
 * @param EffectiveDate Date for InvoiceDetailAdjustRequest
 *
 */
@JsonCreator
  public InvoiceDetailAdjustRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvoiceDetail")InvoiceDetailObjectData InvoiceDetailAdjustIn, @JsonProperty("TransCode")Integer TransCode, @JsonProperty("AdjReasonCode")Integer AdjReasonCode, @JsonProperty("RequestStatus")Integer RequestStatus, @JsonProperty("FraudIndicator")Integer FraudIndicator, @JsonProperty("Annotation")String Annotation, @JsonProperty("PrimaryUnitsType")Integer PrimaryUnitsType, @JsonProperty("PrimaryUnits")BigInteger PrimaryUnits, @JsonProperty("Amount")BigInteger Amount, @JsonProperty("BillOrderNumber")String BillOrderNumber, @JsonProperty("EffectiveDate")Date EffectiveDate) {
    super(id, "InvoiceDetailAdjust");
    if (InvoiceDetailAdjustIn != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(InvoiceDetailAdjustIn, new HashMap(), "Adjustment").get("Adjustment"));
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
    if (EffectiveDate != null) {
      addInput("EffectiveDate", EffectiveDate);
    }
  }

/**
 *
 * Retrieves the AdjustmentObjectData that results from the InvoiceDetailAdjustRequest call
 * @return AdjustmentObjectData resulting from udt call
 *
 */

  public AdjustmentObjectData getOutput() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
}
