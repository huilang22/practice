/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementSwapRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvElementSwapRequest Udt Request
 *
 */

public class InvElementSwapRequest extends InvElementSubRequestParent {
/**
 *
 * Constructor to create a  InvElementSwapRequest
 * @param id Unique request name
 * @param SwapStartDate Date for InvElementSwapRequest
 * @param ViewIdSwapOut String for InvElementSwapRequest
 * @param ViewIdSwapIn String for InvElementSwapRequest
 * @param SwapParamA Integer for InvElementSwapRequest
 * @param SwapParamB Integer for InvElementSwapRequest
 * @param SwapDiscReason Integer for InvElementSwapRequest
 *
 */
@JsonCreator
  public InvElementSwapRequest(@JsonProperty("RequestId") String id, @JsonProperty("SwapStartDate")Date SwapStartDate, @JsonProperty("ViewIdSwapOut")String ViewIdSwapOut, @JsonProperty("ViewIdSwapIn")String ViewIdSwapIn, @JsonProperty("SwapParamA")Integer SwapParamA, @JsonProperty("SwapParamB")Integer SwapParamB, @JsonProperty("SwapDiscReason")Integer SwapDiscReason) {
    super(id, "InvElementSwap");
    if (SwapStartDate != null) {
      addInput("SwapStartDate", SwapStartDate);
    }
    if (ViewIdSwapOut != null) {
      addInput("ViewIdSwapOut", ViewIdSwapOut);
    }
    if (ViewIdSwapIn != null) {
      addInput("ViewIdSwapIn", ViewIdSwapIn);
    }
    if (SwapParamA != null) {
      addInput("SwapParamA", SwapParamA);
    }
    if (SwapParamB != null) {
      addInput("SwapParamB", SwapParamB);
    }
    if (SwapDiscReason != null) {
      addInput("SwapDiscReason", SwapDiscReason);
    }
  }

/**
 *
 * Retrieves the InvElementSwapOutputData that results from the InvElementSwapRequest call
 * @return InvElementSwapOutputData resulting from udt call
 *
 */

  public InvElementSwapOutputData getOutput() {
    return InvElementSwapOutputHelper.fromMap(outputMap);
  }
}
