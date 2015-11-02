/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapGetNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a ComponentPolicyMapGetNoOpRequest Udt Request/Response
 *
 */
public class ComponentPolicyMapGetNoOpRequest extends ComponentPolicyMapSubRequestParent {
/**
 *
 * Constructor to create a   ComponentPolicyMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentPolicyMapGetNoOpRequest(String id, ComponentPolicyMapObjectData noOpIn) {
    super(id, "ComponentPolicyMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(noOpIn, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }
/**
 *
 * Retrieves the ComponentPolicyMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentPolicyMapObjectData getOutput() {
    return ComponentPolicyMapObjectHelper.fromMap(outputMap, "ComponentPolicyMap");
  }
}
