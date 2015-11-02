/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RtPaymentResponseGetRequest.java
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
 * Class used to create a RtPaymentResponseGetRequest Udt Request
 *
 */

public class RtPaymentResponseGetRequest extends RtPaymentResponseSubRequestParent {
/**
 *
 * Constructor to create a  RtPaymentResponseGetRequest
 * @param id Unique request name
 * @param RPRGetIn RtPaymentResponseObjectData for RtPaymentResponseGetRequest
 *
 */
@JsonCreator
  public RtPaymentResponseGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RtPaymentResponse")RtPaymentResponseObjectData RPRGetIn) {
    super(id, "RtPaymentResponseGet");
    if (RPRGetIn != null) {
      addInput("RtPaymentResponse", RtPaymentResponseObjectHelper.toMap(RPRGetIn, new HashMap(), "RtPaymentResponse").get("RtPaymentResponse"));
    }
  }

/**
 *
 * Retrieves the RtPaymentResponseObjectData that results from the RtPaymentResponseGetRequest call
 * @return RtPaymentResponseObjectData resulting from udt call
 *
 */

  public RtPaymentResponseObjectData getOutput() {
    return RtPaymentResponseObjectHelper.fromMap(outputMap, "RtPaymentResponse");
  }
}
