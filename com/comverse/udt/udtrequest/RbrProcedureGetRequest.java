/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureGetRequest.java
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
 * Class used to create a RbrProcedureGetRequest Udt Request
 *
 */

public class RbrProcedureGetRequest extends RbrProcedureSubRequestParent {
/**
 *
 * Constructor to create a  RbrProcedureGetRequest
 * @param id Unique request name
 * @param RbrProcGetIn RbrProcObjectKeyData for RbrProcedureGetRequest
 *
 */
@JsonCreator
  public RbrProcedureGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrProcedure")RbrProcObjectKeyData RbrProcGetIn) {
    super(id, "RbrProcedureGet");
    if (RbrProcGetIn != null) {
      addInput("RbrProcedure", RbrProcObjectKeyHelper.toMap(RbrProcGetIn, new HashMap(), "RbrProcObjectKeyData").get("RbrProcObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrProcObjectData that results from the RbrProcedureGetRequest call
 * @return RbrProcObjectData resulting from udt call
 *
 */

  public RbrProcObjectData getOutput() {
    return RbrProcObjectHelper.fromMap(outputMap, "RbrProcedure");
  }
}
