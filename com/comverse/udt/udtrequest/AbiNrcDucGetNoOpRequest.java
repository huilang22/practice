/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiNrcDucGetNoOpRequest.java
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
 * NoOp class used to simulate a AbiNrcDucGetNoOpRequest Udt Request/Response
 *
 */
public class AbiNrcDucGetNoOpRequest extends AbiNrcDucSubRequestParent {
/**
 *
 * Constructor to create a   AbiNrcDucGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AbiNrcDucGetNoOpRequest(String id, AbiNrcDucObjectData noOpIn) {
    super(id, "AbiNrcDucGetNoOpRequest");
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
