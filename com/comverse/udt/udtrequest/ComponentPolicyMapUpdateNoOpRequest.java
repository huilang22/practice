/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ComponentPolicyMapUpdateNoOpRequest Udt Request/Response
 *
 */
public class ComponentPolicyMapUpdateNoOpRequest extends ComponentPolicyMapSubRequestParent {
/**
 *
 * Constructor to create a   ComponentPolicyMapUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentPolicyMapUpdateNoOpRequest(String id, ComponentPolicyMapObjectData noOpIn) {
    super(id, "ComponentPolicyMapUpdateNoOpRequest");
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
