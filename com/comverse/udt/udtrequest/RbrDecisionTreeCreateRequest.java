/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeCreateRequest.java
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
 * Class used to create a RbrDecisionTreeCreateRequest Udt Request
 *
 */

public class RbrDecisionTreeCreateRequest extends RbrDecisionTreeSubRequestParent {
/**
 *
 * Constructor to create a  RbrDecisionTreeCreateRequest
 * @param id Unique request name
 * @param RbrDecTreeCreateIn RbrDecTreeObjectData for RbrDecisionTreeCreateRequest
 *
 */
@JsonCreator
  public RbrDecisionTreeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrDecisionTree")RbrDecTreeObjectData RbrDecTreeCreateIn) {
    super(id, "RbrDecisionTreeCreate");
    if (RbrDecTreeCreateIn != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(RbrDecTreeCreateIn, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }

/**
 *
 * Retrieves the RbrDecTreeObjectData that results from the RbrDecisionTreeCreateRequest call
 * @return RbrDecTreeObjectData resulting from udt call
 *
 */

  public RbrDecTreeObjectData getOutput() {
    return RbrDecTreeObjectHelper.fromMap(outputMap, "RbrDecisionTree");
  }
}
