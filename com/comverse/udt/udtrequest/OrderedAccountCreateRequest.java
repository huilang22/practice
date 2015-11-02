/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountCreateRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderedAccountCreateRequest Udt Request
 *
 */

public class OrderedAccountCreateRequest extends OrderedAccountSubRequestParent {
/**
 *
 * Constructor to create a  OrderedAccountCreateRequest
 * @param id Unique request name
 * @param oacAccountIn AccountXIDObjectData for OrderedAccountCreateRequest
 * @param _PaymentProfile PaymentProfileObjectData for OrderedAccountCreateRequest
 * @param oacOrderIn OrderObjectData for OrderedAccountCreateRequest
 * @param oacVerboseResponse Boolean for OrderedAccountCreateRequest
 * @param billingSC Integer for OrderedAccountCreateRequest
 * @param remitSC Integer for OrderedAccountCreateRequest
 * @param inquirySC Integer for OrderedAccountCreateRequest
 * @param collectionSC Integer for OrderedAccountCreateRequest
 * @param printSC Integer for OrderedAccountCreateRequest
 *
 */
@JsonCreator
  public OrderedAccountCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountXIDObjectData oacAccountIn, @JsonProperty("PaymentProfile")PaymentProfileObjectData _PaymentProfile, @JsonProperty("Order")OrderObjectData oacOrderIn, @JsonProperty("VerboseResponse")Boolean oacVerboseResponse, @JsonProperty("BillingServiceCenterId")Integer billingSC, @JsonProperty("RemitServiceCenterId")Integer remitSC, @JsonProperty("InquiryServiceCenterId")Integer inquirySC, @JsonProperty("CollectionServiceCenterId")Integer collectionSC, @JsonProperty("PrintServiceCenterId")Integer printSC) {
    super(id, "OrderedAccountCreate");
    if (oacAccountIn != null) {
      addInput("Account", AccountXIDObjectHelper.toMap(oacAccountIn, new HashMap(), "OrderedAccountCreateOutputData").get("OrderedAccountCreateOutputData"));
    }
    if (_PaymentProfile != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(_PaymentProfile, new HashMap(), "OrderedAccountCreateOutputData").get("OrderedAccountCreateOutputData"));
    }
    if (oacOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oacOrderIn, new HashMap(), "OrderedAccountCreateOutputData").get("OrderedAccountCreateOutputData"));
    }
    if (oacVerboseResponse != null) {
      addInput("VerboseResponse", oacVerboseResponse);
    }
    if (billingSC != null) {
      addInput("BillingServiceCenterId", billingSC);
    }
    if (remitSC != null) {
      addInput("RemitServiceCenterId", remitSC);
    }
    if (inquirySC != null) {
      addInput("InquiryServiceCenterId", inquirySC);
    }
    if (collectionSC != null) {
      addInput("CollectionServiceCenterId", collectionSC);
    }
    if (printSC != null) {
      addInput("PrintServiceCenterId", printSC);
    }
  }

/**
 *
 * Retrieves the OrderedAccountCreateOutputData that results from the OrderedAccountCreateRequest call
 * @return OrderedAccountCreateOutputData resulting from udt call
 *
 */

  public OrderedAccountCreateOutputData getOutput() {
    return OrderedAccountCreateOutputHelper.fromMap(outputMap);
  }
}
