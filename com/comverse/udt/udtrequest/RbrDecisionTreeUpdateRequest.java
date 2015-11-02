/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeUpdateRequest.java
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
 * Class used to create a RbrDecisionTreeUpdateRequest Udt Request
 *
 */

public class RbrDecisionTreeUpdateRequest extends RbrDecisionTreeSubRequestParent {
/**
 *
 * Constructor to create a  RbrDecisionTreeUpdateRequest
 * @param id Unique request name
 * @param RbrDecTreeUpdateIn RbrDecTreeObjectData for RbrDecisionTreeUpdateRequest
 *
 */
@JsonCreator
  public RbrDecisionTreeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrDecisionTree")RbrDecTreeObjectData RbrDecTreeUpdateIn) {
    super(id, "RbrDecisionTreeUpdate");
    if (RbrDecTreeUpdateIn != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(RbrDecTreeUpdateIn, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }

/**
 *
 * Retrieves the RbrDecTreeObjectData that results from the RbrDecisionTreeUpdateRequest call
 * @return RbrDecTreeObjectData resulting from udt call
 *
 */

  public RbrDecTreeObjectData getOutput() {
    return RbrDecTreeObjectHelper.fromMap(outputMap, "RbrDecisionTree");
  }
}
