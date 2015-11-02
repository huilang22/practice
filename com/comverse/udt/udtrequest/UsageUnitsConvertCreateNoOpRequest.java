/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageUnitsConvertCreateNoOpRequest.java
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
 * NoOp class used to simulate a UsageUnitsConvertCreateNoOpRequest Udt Request/Response
 *
 */
public class UsageUnitsConvertCreateNoOpRequest extends UsageUnitsConvertSubRequestParent {
/**
 *
 * Constructor to create a   UsageUnitsConvertCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageUnitsConvertCreateNoOpRequest(String id, UsageUnitsConvertObjectData noOpIn) {
    super(id, "UsageUnitsConvertCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(noOpIn, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }
/**
 *
 * Retrieves the UsageUnitsConvertObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UsageUnitsConvertObjectData getOutput() {
    return UsageUnitsConvertObjectHelper.fromMap(outputMap, "UsageUnitsConvert");
  }
}
