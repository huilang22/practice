/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapUpdateRequest.java
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
 * Class used to create a ComponentPolicyMapUpdateRequest Udt Request
 *
 */

public class ComponentPolicyMapUpdateRequest extends ComponentPolicyMapSubRequestParent {
/**
 *
 * Constructor to create a  ComponentPolicyMapUpdateRequest
 * @param id Unique request name
 * @param cmpUpdateIn ComponentPolicyMapObjectData for ComponentPolicyMapUpdateRequest
 *
 */
@JsonCreator
  public ComponentPolicyMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentPolicyMap")ComponentPolicyMapObjectData cmpUpdateIn) {
    super(id, "ComponentPolicyMapUpdate");
    if (cmpUpdateIn != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(cmpUpdateIn, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }

/**
 *
 * Retrieves the ComponentPolicyMapObjectData that results from the ComponentPolicyMapUpdateRequest call
 * @return ComponentPolicyMapObjectData resulting from udt call
 *
 */

  public ComponentPolicyMapObjectData getOutput() {
    return ComponentPolicyMapObjectHelper.fromMap(outputMap, "ComponentPolicyMap");
  }
}
