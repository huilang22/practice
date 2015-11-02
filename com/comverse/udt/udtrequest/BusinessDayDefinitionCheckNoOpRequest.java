/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionCheckNoOpRequest.java
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
 * NoOp class used to simulate a BusinessDayDefinitionCheckNoOpRequest Udt Request/Response
 *
 */
public class BusinessDayDefinitionCheckNoOpRequest extends BusinessDayDefinitionRequest {
/**
 *
 * Constructor to create a   BusinessDayDefinitionCheckNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BusinessDayDefinitionCheckNoOpRequest(String id, String noOpIn) {
    super(id, "BusinessDayDefinitionCheckNoOpRequest");
    if (noOpIn != null) {
      addInput("BDDcheckOut", noOpIn);
    }
  }
/**
 *
 * Retrieves the String passed into the constructor
 * @return Simulated response
 *
 */
  public String getOutput() {
    return  (String)outputMap.get("BDDcheckOut");
  }
}
