/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ComponentElementUpdateNoOpRequest Udt Request/Response
 *
 */
public class ComponentElementUpdateNoOpRequest extends ComponentElementSubRequestParent {
/**
 *
 * Constructor to create a   ComponentElementUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentElementUpdateNoOpRequest(String id, ComponentElementObjectData noOpIn) {
    super(id, "ComponentElementUpdateNoOpRequest");
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
