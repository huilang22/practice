/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RtPaymentResponseFindRequest.java
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
 * Class used to create a RtPaymentResponseFindRequest Udt Request
 *
 */

public class RtPaymentResponseFindRequest extends RtPaymentResponseRequest {
/**
 *
 * Constructor to create a  RtPaymentResponseFindRequest
 * @param id Unique request name
 * @param RPRFindIn RtPaymentResponseObjectFilter for RtPaymentResponseFindRequest
 *
 */
@JsonCreator
  public RtPaymentResponseFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RtPaymentResponse")RtPaymentResponseObjectFilter RPRFindIn) {
    super(id, "RtPaymentResponseFind");
    if (RPRFindIn != null) {
      Integer index =  RPRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RtPaymentResponse", RtPaymentResponseObjectHelper.toMap(RPRFindIn, new HashMap(), "RtPaymentResponse").get("RtPaymentResponse"));
    }
  }

/**
 *
 * Retrieves the RtPaymentResponseObjectDataList that results from the RtPaymentResponseFindRequest call
 * @return RtPaymentResponseObjectDataList resulting from udt call
 *
 */

  public RtPaymentResponseObjectDataList getOutput() {
    return RtPaymentResponseObjectHelper.fromMapList(outputMap, "RtPaymentResponseList");
  }
}
