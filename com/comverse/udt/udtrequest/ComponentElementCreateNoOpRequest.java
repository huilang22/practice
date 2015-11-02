/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementCreateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a ComponentElementCreateNoOpRequest Udt Request/Response
 *
 */
public class ComponentElementCreateNoOpRequest extends ComponentElementSubRequestParent {
/**
 *
 * Constructor to create a   ComponentElementCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentElementCreateNoOpRequest(String id, ComponentElementObjectData noOpIn) {
    super(id, "ComponentElementCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(noOpIn, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }
/**
 *
 * Retrieves the ComponentElementObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentElementObjectData getOutput() {
    return ComponentElementObjectHelper.fromMap(outputMap, "ComponentElement");
  }
}
