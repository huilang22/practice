/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderLevelDeriveNoOpRequest.java
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
 * NoOp class used to simulate a OrderLevelDeriveNoOpRequest Udt Request/Response
 *
 */
public class OrderLevelDeriveNoOpRequest extends OpenItemIdMapRequest {
/**
 *
 * Constructor to create a   OrderLevelDeriveNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderLevelDeriveNoOpRequest(String id, Integer noOpIn) {
    super(id, "OrderLevelDeriveNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderLevel", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("OrderLevel");
  }
}
