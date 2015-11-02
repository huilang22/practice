/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionGetNoOpRequest.java
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
 * NoOp class used to simulate a BusinessDayDefinitionGetNoOpRequest Udt Request/Response
 *
 */
public class BusinessDayDefinitionGetNoOpRequest extends BusinessDayDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   BusinessDayDefinitionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BusinessDayDefinitionGetNoOpRequest(String id, BusinessDayDefinitionObjectData noOpIn) {
    super(id, "BusinessDayDefinitionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }
/**
 *
 * Retrieves the BusinessDayDefinitionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BusinessDayDefinitionObjectData getOutput() {
    return BusinessDayDefinitionObjectHelper.fromMap(outputMap, "BusinessDayDefinition");
  }
}
