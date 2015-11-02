/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillPollHotRequest.java
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
 * Class used to create a InterimBillPollHotRequest Udt Request
 *
 */

public class InterimBillPollHotRequest extends InterimBillSubRequestParent {
/**
 *
 * Constructor to create a  InterimBillPollHotRequest
 * @param id Unique request name
 * @param intBillPollIn InterimBillObjectData for InterimBillPollHotRequest
 *
 */
@JsonCreator
  public InterimBillPollHotRequest(@JsonProperty("RequestId") String id, @JsonProperty("InterimBill")InterimBillObjectData intBillPollIn) {
    super(id, "InterimBillPollHot");
    if (intBillPollIn != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(intBillPollIn, new HashMap(), "InterimBillPollHotOutputData").get("InterimBillPollHotOutputData"));
    }
  }

/**
 *
 * Retrieves the InterimBillPollHotOutputData that results from the InterimBillPollHotRequest call
 * @return InterimBillPollHotOutputData resulting from udt call
 *
 */

  public InterimBillPollHotOutputData getOutput() {
    return InterimBillPollHotOutputHelper.fromMap(outputMap);
  }
}
