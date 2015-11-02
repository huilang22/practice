/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a MktCodeDeleteNoOpRequest Udt Request/Response
 *
 */
public class MktCodeDeleteNoOpRequest extends MktCodeSubRequestParent {
/**
 *
 * Constructor to create a   MktCodeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MktCodeDeleteNoOpRequest(String id, MCObjectData noOpIn) {
    super(id, "MktCodeDeleteNoOpRequest");
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
