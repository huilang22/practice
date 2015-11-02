/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusCreateRequest.java
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
 * Class used to create a JeopardyStatusCreateRequest Udt Request
 *
 */

public class JeopardyStatusCreateRequest extends JeopardyStatusSubRequestParent {
/**
 *
 * Constructor to create a  JeopardyStatusCreateRequest
 * @param id Unique request name
 * @param JeopardyStatusCreateIn JeopardyStatusObjectData for JeopardyStatusCreateRequest
 *
 */
@JsonCreator
  public JeopardyStatusCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("JeopardyStatus")JeopardyStatusObjectData JeopardyStatusCreateIn) {
    super(id, "JeopardyStatusCreate");
    if (JeopardyStatusCreateIn != null) {
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(JeopardyStatusCreateIn, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }

/**
 *
 * Retrieves the JeopardyStatusObjectData that results from the JeopardyStatusCreateRequest call
 * @return JeopardyStatusObjectData resulting from udt call
 *
 */

  public JeopardyStatusObjectData getOutput() {
    return JeopardyStatusObjectHelper.fromMap(outputMap, "JeopardyStatus");
  }
}
