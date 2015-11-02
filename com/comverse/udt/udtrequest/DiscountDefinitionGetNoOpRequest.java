/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionGetNoOpRequest.java
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
 * NoOp class used to simulate a DiscountDefinitionGetNoOpRequest Udt Request/Response
 *
 */
public class DiscountDefinitionGetNoOpRequest extends DiscountDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   DiscountDefinitionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountDefinitionGetNoOpRequest(String id, DiscountDefinitionObjectData noOpIn) {
    super(id, "DiscountDefinitionGetNoOpRequest");
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
