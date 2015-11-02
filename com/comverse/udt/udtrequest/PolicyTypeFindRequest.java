/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyTypeFindRequest.java
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
 * Class used to create a PolicyTypeFindRequest Udt Request
 *
 */

public class PolicyTypeFindRequest extends ComponentPolicyMapRequest {
/**
 *
 * Constructor to create a  PolicyTypeFindRequest
 * @param id Unique request name
 * @param cmpPofindIn ComponentPolicyMapObjectFilter for PolicyTypeFindRequest
 *
 */
@JsonCreator
  public PolicyTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentPolicyMap")ComponentPolicyMapObjectFilter cmpPofindIn) {
    super(id, "PolicyTypeFind");
    if (cmpPofindIn != null) {
      Integer index =  cmpPofindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(cmpPofindIn, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }

/**
 *
 * Retrieves the ComponentPolicyMapObjectDataList that results from the PolicyTypeFindRequest call
 * @return ComponentPolicyMapObjectDataList resulting from udt call
 *
 */

  public ComponentPolicyMapObjectDataList getOutput() {
    return ComponentPolicyMapObjectHelper.fromMapList(outputMap, "ComponentPolicyMapList");
  }
}
