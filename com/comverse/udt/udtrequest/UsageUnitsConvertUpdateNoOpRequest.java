/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageUnitsConvertUpdateNoOpRequest.java
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
 * NoOp class used to simulate a UsageUnitsConvertUpdateNoOpRequest Udt Request/Response
 *
 */
public class UsageUnitsConvertUpdateNoOpRequest extends UsageUnitsConvertSubRequestParent {
/**
 *
 * Constructor to create a   UsageUnitsConvertUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageUnitsConvertUpdateNoOpRequest(String id, UsageUnitsConvertObjectData noOpIn) {
    super(id, "UsageUnitsConvertUpdateNoOpRequest");
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
