/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceTransferRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderedServiceTransferRequest Udt Request
 *
 */

public class OrderedServiceTransferRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a  OrderedServiceTransferRequest
 * @param id Unique request name
 * @param osTransferServiceIn ServiceObjectData for OrderedServiceTransferRequest
 * @param osTransferOrderIn OrderObjectData for OrderedServiceTransferRequest
 * @param osTransferStatusReasonId Integer for OrderedServiceTransferRequest
 * @param TransferDt Date for OrderedServiceTransferRequest
 * @param TransferToAccountInternalId Integer for OrderedServiceTransferRequest
 * @param osTransferAnnotation String for OrderedServiceTransferRequest
 * @param NewPostpaidAccountInternalId Integer for OrderedServiceTransferRequest
 * @param NewBalanceAccountInternalId Integer for OrderedServiceTransferRequest
 * @param WaiveInstallmentNrcs Integer for OrderedServiceTransferRequest
 * @param WaiveUnbilledNrcs Integer for OrderedServiceTransferRequest
 * @param WaiveRefinanceNrcs Integer for OrderedServiceTransferRequest
 * @param NewOpenItemId Integer for OrderedServiceTransferRequest
 * @param osTVerboseResponse Boolean for OrderedServiceTransferRequest
 *
 */
@JsonCreator
  public OrderedServiceTransferRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectData osTransferServiceIn, @JsonProperty("Order")OrderObjectData osTransferOrderIn, @JsonProperty("StatusReasonId")Integer osTransferStatusReasonId, @JsonProperty("TransferDt")Date TransferDt, @JsonProperty("TransferToAccountInternalId")Integer TransferToAccountInternalId, @JsonProperty("Annotation")String osTransferAnnotation, @JsonProperty("NewPostpaidAccountInternalId")Integer NewPostpaidAccountInternalId, @JsonProperty("NewBalanceAccountInternalId")Integer NewBalanceAccountInternalId, @JsonProperty("WaiveInstallmentNrcs")Integer WaiveInstallmentNrcs, @JsonProperty("WaiveUnbilledNrcs")Integer WaiveUnbilledNrcs, @JsonProperty("WaiveRefinanceNrcs")Integer WaiveRefinanceNrcs, @JsonProperty("NewOpenItemId")Integer NewOpenItemId, @JsonProperty("VerboseResponse")Boolean osTVerboseResponse) {
    super(id, "OrderedServiceTransfer");
    if (osTransferServiceIn != null) {
      addInput("Service", ServiceObjectHelper.toMap(osTransferServiceIn, new HashMap(), "OrderedServiceTransferOutputData").get("OrderedServiceTransferOutputData"));
    }
    if (osTransferOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(osTransferOrderIn, new HashMap(), "OrderedServiceTransferOutputData").get("OrderedServiceTransferOutputData"));
    }
    if (osTransferStatusReasonId != null) {
      addInput("StatusReasonId", osTransferStatusReasonId);
    }
    if (TransferDt != null) {
      addInput("TransferDt", TransferDt);
    }
    if (TransferToAccountInternalId != null) {
      addInput("TransferToAccountInternalId", TransferToAccountInternalId);
    }
    if (osTransferAnnotation != null) {
      addInput("Annotation", osTransferAnnotation);
    }
    if (NewPostpaidAccountInternalId != null) {
      addInput("NewPostpaidAccountInternalId", NewPostpaidAccountInternalId);
    }
    if (NewBalanceAccountInternalId != null) {
      addInput("NewBalanceAccountInternalId", NewBalanceAccountInternalId);
    }
    if (WaiveInstallmentNrcs != null) {
      addInput("WaiveInstallmentNrcs", WaiveInstallmentNrcs);
    }
    if (WaiveUnbilledNrcs != null) {
      addInput("WaiveUnbilledNrcs", WaiveUnbilledNrcs);
    }
    if (WaiveRefinanceNrcs != null) {
      addInput("WaiveRefinanceNrcs", WaiveRefinanceNrcs);
    }
    if (NewOpenItemId != null) {
      addInput("NewOpenItemId", NewOpenItemId);
    }
    if (osTVerboseResponse != null) {
      addInput("VerboseResponse", osTVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedServiceTransferOutputData that results from the OrderedServiceTransferRequest call
 * @return OrderedServiceTransferOutputData resulting from udt call
 *
 */

  public OrderedServiceTransferOutputData getOutput() {
    return OrderedServiceTransferOutputHelper.fromMap(outputMap);
  }
}
