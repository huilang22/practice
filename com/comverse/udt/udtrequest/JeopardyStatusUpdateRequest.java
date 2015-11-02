/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusUpdateRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a JeopardyStatusUpdateRequest Udt Request
 *
 */

public class JeopardyStatusUpdateRequest extends JeopardyStatusSubRequestParent {
/**
 *
 * Constructor to create a  JeopardyStatusUpdateRequest
 * @param id Unique request name
 * @param JeopardyStatusUpdateIn JeopardyStatusObjectData for JeopardyStatusUpdateRequest
 *
 */
@JsonCreator
  public JeopardyStatusUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("JeopardyStatus")JeopardyStatusObjectData JeopardyStatusUpdateIn) {
    super(id, "JeopardyStatusUpdate");
    if (JeopardyStatusUpdateIn != null) {
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(JeopardyStatusUpdateIn, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }

/**
 *
 * Retrieves the JeopardyStatusObjectData that results from the JeopardyStatusUpdateRequest call
 * @return JeopardyStatusObjectData resulting from udt call
 *
 */

  public JeopardyStatusObjectData getOutput() {
    return JeopardyStatusObjectHelper.fromMap(outputMap, "JeopardyStatus");
  }
}
