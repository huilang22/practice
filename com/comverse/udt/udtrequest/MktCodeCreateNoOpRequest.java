/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeCreateNoOpRequest.java
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
 * NoOp class used to simulate a MktCodeCreateNoOpRequest Udt Request/Response
 *
 */
public class MktCodeCreateNoOpRequest extends MktCodeSubRequestParent {
/**
 *
 * Constructor to create a   MktCodeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MktCodeCreateNoOpRequest(String id, MCObjectData noOpIn) {
    super(id, "MktCodeCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("MktCode", MCObjectHelper.toMap(noOpIn, new HashMap(), "MktCode").get("MktCode"));
    }
  }
/**
 *
 * Retrieves the MCObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public MCObjectData getOutput() {
    return MCObjectHelper.fromMap(outputMap, "MktCode");
  }
}
