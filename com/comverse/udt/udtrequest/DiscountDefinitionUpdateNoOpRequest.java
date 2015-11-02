/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a DiscountDefinitionUpdateNoOpRequest Udt Request/Response
 *
 */
public class DiscountDefinitionUpdateNoOpRequest extends DiscountDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   DiscountDefinitionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountDefinitionUpdateNoOpRequest(String id, DiscountDefinitionObjectData noOpIn) {
    super(id, "DiscountDefinitionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }
/**
 *
 * Retrieves the DiscountDefinitionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DiscountDefinitionObjectData getOutput() {
    return DiscountDefinitionObjectHelper.fromMap(outputMap, "DiscountDefinition");
  }
}
