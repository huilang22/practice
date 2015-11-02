/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a UnitCrDefinitionUpdateNoOpRequest Udt Request/Response
 *
 */
public class UnitCrDefinitionUpdateNoOpRequest extends UnitCrDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   UnitCrDefinitionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrDefinitionUpdateNoOpRequest(String id, UnitCrDefinitionObjectData noOpIn) {
    super(id, "UnitCrDefinitionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }
/**
 *
 * Retrieves the UnitCrDefinitionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrDefinitionObjectData getOutput() {
    return UnitCrDefinitionObjectHelper.fromMap(outputMap, "UnitCrDefinition");
  }
}
