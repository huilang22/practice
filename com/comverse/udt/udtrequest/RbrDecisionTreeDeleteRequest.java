/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeDeleteRequest.java
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
 * Class used to create a RbrDecisionTreeDeleteRequest Udt Request
 *
 */

public class RbrDecisionTreeDeleteRequest extends RbrDecisionTreeSubRequestParent {
/**
 *
 * Constructor to create a  RbrDecisionTreeDeleteRequest
 * @param id Unique request name
 * @param RbrDecTreeDeleteIn RbrDecTreeObjectKeyData for RbrDecisionTreeDeleteRequest
 *
 */
@JsonCreator
  public RbrDecisionTreeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrDecisionTree")RbrDecTreeObjectKeyData RbrDecTreeDeleteIn) {
    super(id, "RbrDecisionTreeDelete");
    if (RbrDecTreeDeleteIn != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectKeyHelper.toMap(RbrDecTreeDeleteIn, new HashMap(), "RbrDecTreeObjectKeyData").get("RbrDecTreeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrDecTreeObjectData that results from the RbrDecisionTreeDeleteRequest call
 * @return RbrDecTreeObjectData resulting from udt call
 *
 */

  public RbrDecTreeObjectData getOutput() {
    return RbrDecTreeObjectHelper.fromMap(outputMap, "RbrDecisionTree");
  }
}
