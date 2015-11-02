/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureUpdateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a RbrProcedureUpdateRequest Udt Request
 *
 */

public class RbrProcedureUpdateRequest extends RbrProcedureSubRequestParent {
/**
 *
 * Constructor to create a  RbrProcedureUpdateRequest
 * @param id Unique request name
 * @param RbrProcUpdateIn RbrProcObjectData for RbrProcedureUpdateRequest
 *
 */
@JsonCreator
  public RbrProcedureUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrProcedure")RbrProcObjectData RbrProcUpdateIn) {
    super(id, "RbrProcedureUpdate");
    if (RbrProcUpdateIn != null) {
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(RbrProcUpdateIn, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }

/**
 *
 * Retrieves the RbrProcObjectData that results from the RbrProcedureUpdateRequest call
 * @return RbrProcObjectData resulting from udt call
 *
 */

  public RbrProcObjectData getOutput() {
    return RbrProcObjectHelper.fromMap(outputMap, "RbrProcedure");
  }
}
