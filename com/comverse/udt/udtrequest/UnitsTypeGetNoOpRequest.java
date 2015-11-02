/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a UnitsTypeGetNoOpRequest Udt Request/Response
 *
 */
public class UnitsTypeGetNoOpRequest extends UnitsTypeSubRequestParent {
/**
 *
 * Constructor to create a   UnitsTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitsTypeGetNoOpRequest(String id, UnitsTypeObjectData noOpIn) {
    super(id, "UnitsTypeGetNoOpRequest");
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
