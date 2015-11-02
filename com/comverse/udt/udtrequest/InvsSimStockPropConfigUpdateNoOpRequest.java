/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimStockPropConfigUpdateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsSimStockPropConfigUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsSimStockPropConfigUpdateNoOpRequest extends InvsSimStockPropConfigSubRequestParent {
/**
 *
 * Constructor to create a   InvsSimStockPropConfigUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimStockPropConfigUpdateNoOpRequest(String id, InvsSimStockPropConfigObjectData noOpIn) {
    super(id, "InvsSimStockPropConfigUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }
/**
 *
 * Retrieves the InvsSimStockPropConfigObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimStockPropConfigObjectData getOutput() {
    return InvsSimStockPropConfigObjectHelper.fromMap(outputMap, "InvsSimStockPropConfig");
  }
}
