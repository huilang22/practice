/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountResumeServicesRequest.java
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
 * Class used to create a OrderedAccountResumeServicesRequest Udt Request
 *
 */

public class OrderedAccountResumeServicesRequest extends OrderedAccountSubRequestParent {
/**
 *
 * Constructor to create a  OrderedAccountResumeServicesRequest
 * @param id Unique request name
 * @param oarAccountIn AccountObjectData for OrderedAccountResumeServicesRequest
 * @param oarOrderIn OrderObjectData for OrderedAccountResumeServicesRequest
 * @param oarResumeDt Date for OrderedAccountResumeServicesRequest
 * @param oarAnnotation String for OrderedAccountResumeServicesRequest
 * @param oarVerboseResponse Boolean for OrderedAccountResumeServicesRequest
 * @param oarAutoCommitOrder Boolean for OrderedAccountResumeServicesRequest
 * @param oarGenerateWorkflow Boolean for OrderedAccountResumeServicesRequest
 * @param oarJobId String for OrderedAccountResumeServicesRequest
 *
 */
@JsonCreator
  public OrderedAccountResumeServicesRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectData oarAccountIn, @JsonProperty("Order")OrderObjectData oarOrderIn, @JsonProperty("ResumeDt")Date oarResumeDt, @JsonProperty("Annotation")String oarAnnotation, @JsonProperty("VerboseResponse")Boolean oarVerboseResponse, @JsonProperty("AutoCommitOrder")Boolean oarAutoCommitOrder, @JsonProperty("GenerateWorkflow")Boolean oarGenerateWorkflow, @JsonProperty("JobId")String oarJobId) {
    super(id, "OrderedAccountResumeServices");
    if (oarAccountIn != null) {
      addInput("Account", AccountObjectHelper.toMap(oarAccountIn, new HashMap(), "OrderedAccountResumeServicesOutputData").get("OrderedAccountResumeServicesOutputData"));
    }
    if (oarOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oarOrderIn, new HashMap(), "OrderedAccountResumeServicesOutputData").get("OrderedAccountResumeServicesOutputData"));
    }
    if (oarResumeDt != null) {
      addInput("ResumeDt", oarResumeDt);
    }
    if (oarAnnotation != null) {
      addInput("Annotation", oarAnnotation);
    }
    if (oarVerboseResponse != null) {
      addInput("VerboseResponse", oarVerboseResponse);
    }
    if (oarAutoCommitOrder != null) {
      addInput("AutoCommitOrder", oarAutoCommitOrder);
    }
    if (oarGenerateWorkflow != null) {
      addInput("GenerateWorkflow", oarGenerateWorkflow);
    }
    if (oarJobId != null) {
      addInput("JobId", oarJobId);
    }
  }

/**
 *
 * Retrieves the OrderedAccountResumeServicesOutputData that results from the OrderedAccountResumeServicesRequest call
 * @return OrderedAccountResumeServicesOutputData resulting from udt call
 *
 */

  public OrderedAccountResumeServicesOutputData getOutput() {
    return OrderedAccountResumeServicesOutputHelper.fromMap(outputMap);
  }
}
