/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatableUnitClassCreateNoOpRequest.java
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
 * NoOp class used to simulate a RatableUnitClassCreateNoOpRequest Udt Request/Response
 *
 */
public class RatableUnitClassCreateNoOpRequest extends RatableUnitClassSubRequestParent {
/**
 *
 * Constructor to create a   RatableUnitClassCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RatableUnitClassCreateNoOpRequest(String id, RUCObjectData noOpIn) {
    super(id, "RatableUnitClassCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("RatableUnitClass", RUCObjectHelper.toMap(noOpIn, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }
/**
 *
 * Retrieves the RUCObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RUCObjectData getOutput() {
    return RUCObjectHelper.fromMap(outputMap, "RatableUnitClass");
  }
}
