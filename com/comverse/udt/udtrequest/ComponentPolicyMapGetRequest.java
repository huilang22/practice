/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapGetRequest.java
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
 * Class used to create a ComponentPolicyMapGetRequest Udt Request
 *
 */

public class ComponentPolicyMapGetRequest extends ComponentPolicyMapSubRequestParent {
/**
 *
 * Constructor to create a  ComponentPolicyMapGetRequest
 * @param id Unique request name
 * @param cmpGetIn ComponentPolicyMapObjectKeyData for ComponentPolicyMapGetRequest
 *
 */
@JsonCreator
  public ComponentPolicyMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentPolicyMap")ComponentPolicyMapObjectKeyData cmpGetIn) {
    super(id, "ComponentPolicyMapGet");
    if (cmpGetIn != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectKeyHelper.toMap(cmpGetIn, new HashMap(), "ComponentPolicyMapObjectKeyData").get("ComponentPolicyMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ComponentPolicyMapObjectData that results from the ComponentPolicyMapGetRequest call
 * @return ComponentPolicyMapObjectData resulting from udt call
 *
 */

  public ComponentPolicyMapObjectData getOutput() {
    return ComponentPolicyMapObjectHelper.fromMap(outputMap, "ComponentPolicyMap");
  }
}
