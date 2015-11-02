/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyFindRequest.java
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
 * Class used to create a PolicyFindRequest Udt Request
 *
 */

public class PolicyFindRequest extends PolicyRequest {
/**
 *
 * Constructor to create a  PolicyFindRequest
 * @param id Unique request name
 * @param PolicyFindIn PolicyObjectFilter for PolicyFindRequest
 *
 */
@JsonCreator
  public PolicyFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Policy")PolicyObjectFilter PolicyFindIn) {
    super(id, "PolicyFind");
    if (PolicyFindIn != null) {
      Integer index =  PolicyFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Policy", PolicyObjectHelper.toMap(PolicyFindIn, new HashMap(), "Policy").get("Policy"));
    }
  }

/**
 *
 * Retrieves the PolicyObjectDataList that results from the PolicyFindRequest call
 * @return PolicyObjectDataList resulting from udt call
 *
 */

  public PolicyObjectDataList getOutput() {
    return PolicyObjectHelper.fromMapList(outputMap, "PolicyList");
  }
}
