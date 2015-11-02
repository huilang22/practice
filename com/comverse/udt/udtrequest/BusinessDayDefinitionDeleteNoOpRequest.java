/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BusinessDayDefinitionDeleteNoOpRequest Udt Request/Response
 *
 */
public class BusinessDayDefinitionDeleteNoOpRequest extends BusinessDayDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   BusinessDayDefinitionDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BusinessDayDefinitionDeleteNoOpRequest(String id, BusinessDayDefinitionObjectData noOpIn) {
    super(id, "BusinessDayDefinitionDeleteNoOpRequest");
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
