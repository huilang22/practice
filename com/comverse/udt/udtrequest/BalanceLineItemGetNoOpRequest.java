/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemGetNoOpRequest.java
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
 * NoOp class used to simulate a BalanceLineItemGetNoOpRequest Udt Request/Response
 *
 */
public class BalanceLineItemGetNoOpRequest extends BalanceLineItemSubRequestParent {
/**
 *
 * Constructor to create a   BalanceLineItemGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BalanceLineItemGetNoOpRequest(String id, BalanceLineItemObjectData noOpIn) {
    super(id, "BalanceLineItemGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(noOpIn, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
/**
 *
 * Retrieves the BalanceLineItemObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BalanceLineItemObjectData getOutput() {
    return BalanceLineItemObjectHelper.fromMap(outputMap, "BalanceLineItem");
  }
}
