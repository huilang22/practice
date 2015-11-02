/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionCreateNoOpRequest.java
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
 * NoOp class used to simulate a ComponentDefinitionCreateNoOpRequest Udt Request/Response
 *
 */
public class ComponentDefinitionCreateNoOpRequest extends ComponentDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   ComponentDefinitionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentDefinitionCreateNoOpRequest(String id, CDObjectData noOpIn) {
    super(id, "ComponentDefinitionCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ComponentDefinition", CDObjectHelper.toMap(noOpIn, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }
/**
 *
 * Retrieves the CDObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CDObjectData getOutput() {
    return CDObjectHelper.fromMap(outputMap, "ComponentDefinition");
  }
}
