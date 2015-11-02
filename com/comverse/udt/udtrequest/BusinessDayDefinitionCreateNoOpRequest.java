/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionCreateNoOpRequest.java
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
 * NoOp class used to simulate a BusinessDayDefinitionCreateNoOpRequest Udt Request/Response
 *
 */
public class BusinessDayDefinitionCreateNoOpRequest extends BusinessDayDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   BusinessDayDefinitionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BusinessDayDefinitionCreateNoOpRequest(String id, BusinessDayDefinitionObjectData noOpIn) {
    super(id, "BusinessDayDefinitionCreateNoOpRequest");
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
