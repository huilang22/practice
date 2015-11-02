/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiNrcDucUpdateNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a AbiNrcDucUpdateNoOpRequest Udt Request/Response
 *
 */
public class AbiNrcDucUpdateNoOpRequest extends AbiNrcDucSubRequestParent {
/**
 *
 * Constructor to create a   AbiNrcDucUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AbiNrcDucUpdateNoOpRequest(String id, AbiNrcDucObjectData noOpIn) {
    super(id, "AbiNrcDucUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("AbiNrcDuc", AbiNrcDucObjectHelper.toMap(noOpIn, new HashMap(), "AbiNrcDuc").get("AbiNrcDuc"));
    }
  }
/**
 *
 * Retrieves the AbiNrcDucObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AbiNrcDucObjectData getOutput() {
    return AbiNrcDucObjectHelper.fromMap(outputMap, "AbiNrcDuc");
  }
}
