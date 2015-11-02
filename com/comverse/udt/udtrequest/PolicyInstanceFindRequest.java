/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PolicyInstanceFindRequest Udt Request
 *
 */

public class PolicyInstanceFindRequest extends PolicyInstanceRequest {
/**
 *
 * Constructor to create a  PolicyInstanceFindRequest
 * @param id Unique request name
 * @param piFindIn PolicyInstanceObjectFilter for PolicyInstanceFindRequest
 *
 */
@JsonCreator
  public PolicyInstanceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PolicyInstance")PolicyInstanceObjectFilter piFindIn) {
    super(id, "PolicyInstanceFind");
    if (piFindIn != null) {
      Integer index =  piFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(piFindIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }

/**
 *
 * Retrieves the PolicyInstanceObjectDataList that results from the PolicyInstanceFindRequest call
 * @return PolicyInstanceObjectDataList resulting from udt call
 *
 */

  public PolicyInstanceObjectDataList getOutput() {
    return PolicyInstanceObjectHelper.fromMapList(outputMap, "PolicyInstanceList");
  }
}
