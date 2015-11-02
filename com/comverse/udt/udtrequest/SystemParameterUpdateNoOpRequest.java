/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterUpdateNoOpRequest.java
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
 * NoOp class used to simulate a SystemParameterUpdateNoOpRequest Udt Request/Response
 *
 */
public class SystemParameterUpdateNoOpRequest extends SystemParameterSubRequestParent {
/**
 *
 * Constructor to create a   SystemParameterUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SystemParameterUpdateNoOpRequest(String id, SPObjectData noOpIn) {
    super(id, "SystemParameterUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("SystemParameter", SPObjectHelper.toMap(noOpIn, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }
/**
 *
 * Retrieves the SPObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SPObjectData getOutput() {
    return SPObjectHelper.fromMap(outputMap, "SystemParameter");
  }
}
