/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropertyCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsStockPropertyCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsStockPropertyCreateNoOpRequest extends InvsStockPropertySubRequestParent {
/**
 *
 * Constructor to create a   InvsStockPropertyCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsStockPropertyCreateNoOpRequest(String id, InvsStockPropertyObjectData noOpIn) {
    super(id, "InvsStockPropertyCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(noOpIn, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }
/**
 *
 * Retrieves the InvsStockPropertyObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStockPropertyObjectData getOutput() {
    return InvsStockPropertyObjectHelper.fromMap(outputMap, "InvsStockProperty");
  }
}
