/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeGetRequest.java
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
 * Class used to create a RbrDecisionTreeGetRequest Udt Request
 *
 */

public class RbrDecisionTreeGetRequest extends RbrDecisionTreeSubRequestParent {
/**
 *
 * Constructor to create a  RbrDecisionTreeGetRequest
 * @param id Unique request name
 * @param RbrDecTreeGetIn RbrDecTreeObjectKeyData for RbrDecisionTreeGetRequest
 *
 */
@JsonCreator
  public RbrDecisionTreeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrDecisionTree")RbrDecTreeObjectKeyData RbrDecTreeGetIn) {
    super(id, "RbrDecisionTreeGet");
    if (RbrDecTreeGetIn != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectKeyHelper.toMap(RbrDecTreeGetIn, new HashMap(), "RbrDecTreeObjectKeyData").get("RbrDecTreeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrDecTreeObjectData that results from the RbrDecisionTreeGetRequest call
 * @return RbrDecTreeObjectData resulting from udt call
 *
 */

  public RbrDecTreeObjectData getOutput() {
    return RbrDecTreeObjectHelper.fromMap(outputMap, "RbrDecisionTree");
  }
}
