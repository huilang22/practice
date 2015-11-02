/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropConfigCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsStockPropConfigCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsStockPropConfigCreateNoOpRequest extends InvsStockPropConfigSubRequestParent {
/**
 *
 * Constructor to create a   InvsStockPropConfigCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsStockPropConfigCreateNoOpRequest(String id, InvsStockPropConfigObjectData noOpIn) {
    super(id, "InvsStockPropConfigCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(noOpIn, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }
/**
 *
 * Retrieves the InvsStockPropConfigObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStockPropConfigObjectData getOutput() {
    return InvsStockPropConfigObjectHelper.fromMap(outputMap, "InvsStockPropConfig");
  }
}
