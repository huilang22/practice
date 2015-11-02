/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapFindRequest.java
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
 * Class used to create a ComponentPolicyMapFindRequest Udt Request
 *
 */

public class ComponentPolicyMapFindRequest extends ComponentPolicyMapRequest {
/**
 *
 * Constructor to create a  ComponentPolicyMapFindRequest
 * @param id Unique request name
 * @param cmpFindIn ComponentPolicyMapObjectFilter for ComponentPolicyMapFindRequest
 *
 */
@JsonCreator
  public ComponentPolicyMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentPolicyMap")ComponentPolicyMapObjectFilter cmpFindIn) {
    super(id, "ComponentPolicyMapFind");
    if (cmpFindIn != null) {
      Integer index =  cmpFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(cmpFindIn, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }

/**
 *
 * Retrieves the ComponentPolicyMapObjectDataList that results from the ComponentPolicyMapFindRequest call
 * @return ComponentPolicyMapObjectDataList resulting from udt call
 *
 */

  public ComponentPolicyMapObjectDataList getOutput() {
    return ComponentPolicyMapObjectHelper.fromMapList(outputMap, "ComponentPolicyMapList");
  }
}
