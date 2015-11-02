/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusGetRequest.java
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
 * Class used to create a JeopardyStatusGetRequest Udt Request
 *
 */

public class JeopardyStatusGetRequest extends JeopardyStatusSubRequestParent {
/**
 *
 * Constructor to create a  JeopardyStatusGetRequest
 * @param id Unique request name
 * @param JeopardyStatusGetIn JeopardyStatusObjectKeyData for JeopardyStatusGetRequest
 *
 */
@JsonCreator
  public JeopardyStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("JeopardyStatus")JeopardyStatusObjectKeyData JeopardyStatusGetIn) {
    super(id, "JeopardyStatusGet");
    if (JeopardyStatusGetIn != null) {
      addInput("JeopardyStatus", JeopardyStatusObjectKeyHelper.toMap(JeopardyStatusGetIn, new HashMap(), "JeopardyStatusObjectKeyData").get("JeopardyStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the JeopardyStatusObjectData that results from the JeopardyStatusGetRequest call
 * @return JeopardyStatusObjectData resulting from udt call
 *
 */

  public JeopardyStatusObjectData getOutput() {
    return JeopardyStatusObjectHelper.fromMap(outputMap, "JeopardyStatus");
  }
}
