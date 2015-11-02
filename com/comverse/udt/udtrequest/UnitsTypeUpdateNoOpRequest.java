/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a UnitsTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class UnitsTypeUpdateNoOpRequest extends UnitsTypeSubRequestParent {
/**
 *
 * Constructor to create a   UnitsTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitsTypeUpdateNoOpRequest(String id, UnitsTypeObjectData noOpIn) {
    super(id, "UnitsTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(noOpIn, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }
/**
 *
 * Retrieves the UnitsTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UnitsTypeObjectData getOutput() {
    return UnitsTypeObjectHelper.fromMap(outputMap, "UnitsType");
  }
}
