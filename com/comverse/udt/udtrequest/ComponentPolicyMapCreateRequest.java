/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapCreateRequest.java
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
 * Class used to create a ComponentPolicyMapCreateRequest Udt Request
 *
 */

public class ComponentPolicyMapCreateRequest extends ComponentPolicyMapSubRequestParent {
/**
 *
 * Constructor to create a  ComponentPolicyMapCreateRequest
 * @param id Unique request name
 * @param cmpCreateIn ComponentPolicyMapObjectData for ComponentPolicyMapCreateRequest
 *
 */
@JsonCreator
  public ComponentPolicyMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentPolicyMap")ComponentPolicyMapObjectData cmpCreateIn) {
    super(id, "ComponentPolicyMapCreate");
    if (cmpCreateIn != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(cmpCreateIn, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }

/**
 *
 * Retrieves the ComponentPolicyMapObjectData that results from the ComponentPolicyMapCreateRequest call
 * @return ComponentPolicyMapObjectData resulting from udt call
 *
 */

  public ComponentPolicyMapObjectData getOutput() {
    return ComponentPolicyMapObjectHelper.fromMap(outputMap, "ComponentPolicyMap");
  }
}
