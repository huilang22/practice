/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountSuspendServicesRequest.java
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
 * Class used to create a OrderedAccountSuspendServicesRequest Udt Request
 *
 */

public class OrderedAccountSuspendServicesRequest extends OrderedAccountSubRequestParent {
/**
 *
 * Constructor to create a  OrderedAccountSuspendServicesRequest
 * @param id Unique request name
 * @param oasAccountIn AccountObjectData for OrderedAccountSuspendServicesRequest
 * @param oasOrderIn OrderObjectData for OrderedAccountSuspendServicesRequest
 * @param EffectiveDt Date for OrderedAccountSuspendServicesRequest
 * @param ResumeDt Date for OrderedAccountSuspendServicesRequest
 * @param oasAnnotation String for OrderedAccountSuspendServicesRequest
 * @param oasVerboseResponse Boolean for OrderedAccountSuspendServicesRequest
 * @param oasAutoCommitOrder Boolean for OrderedAccountSuspendServicesRequest
 * @param oasGenerateWorkflow Boolean for OrderedAccountSuspendServicesRequest
 * @param oasJobId String for OrderedAccountSuspendServicesRequest
 *
 */
@JsonCreator
  public OrderedAccountSuspendServicesRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectData oasAccountIn, @JsonProperty("Order")OrderObjectData oasOrderIn, @JsonProperty("EffectiveDt")Date EffectiveDt, @JsonProperty("ResumeDt")Date ResumeDt, @JsonProperty("Annotation")String oasAnnotation, @JsonProperty("VerboseResponse")Boolean oasVerboseResponse, @JsonProperty("AutoCommitOrder")Boolean oasAutoCommitOrder, @JsonProperty("GenerateWorkflow")Boolean oasGenerateWorkflow, @JsonProperty("JobId")String oasJobId) {
    super(id, "OrderedAccountSuspendServices");
    if (oasAccountIn != null) {
      addInput("Account", AccountObjectHelper.toMap(oasAccountIn, new HashMap(), "OrderedAccountSuspendServicesOutputData").get("OrderedAccountSuspendServicesOutputData"));
    }
    if (oasOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oasOrderIn, new HashMap(), "OrderedAccountSuspendServicesOutputData").get("OrderedAccountSuspendServicesOutputData"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
    if (ResumeDt != null) {
      addInput("ResumeDt", ResumeDt);
    }
    if (oasAnnotation != null) {
      addInput("Annotation", oasAnnotation);
    }
    if (oasVerboseResponse != null) {
      addInput("VerboseResponse", oasVerboseResponse);
    }
    if (oasAutoCommitOrder != null) {
      addInput("AutoCommitOrder", oasAutoCommitOrder);
    }
    if (oasGenerateWorkflow != null) {
      addInput("GenerateWorkflow", oasGenerateWorkflow);
    }
    if (oasJobId != null) {
      addInput("JobId", oasJobId);
    }
  }

/**
 *
 * Retrieves the OrderedAccountSuspendServicesOutputData that results from the OrderedAccountSuspendServicesRequest call
 * @return OrderedAccountSuspendServicesOutputData resulting from udt call
 *
 */

  public OrderedAccountSuspendServicesOutputData getOutput() {
    return OrderedAccountSuspendServicesOutputHelper.fromMap(outputMap);
  }
}
