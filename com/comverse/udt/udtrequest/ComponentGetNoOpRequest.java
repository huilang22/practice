/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentGetNoOpRequest.java
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
 * NoOp class used to simulate a ComponentGetNoOpRequest Udt Request/Response
 *
 */
public class ComponentGetNoOpRequest extends ComponentSubRequestParent {
/**
 *
 * Constructor to create a   ComponentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentGetNoOpRequest(String id, ComponentObjectBaseData noOpIn) {
    super(id, "ComponentGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Component", ComponentObjectBaseHelper.toMap(noOpIn, new HashMap(), "Component").get("Component"));
    }
  }
/**
 *
 * Retrieves the ComponentObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentObjectBaseData getOutput() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
}
