/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvdReserveEndUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvdReserveEndUpdateNoOpRequest extends InvdReserveEndSubRequestParent {
/**
 *
 * Constructor to create a   InvdReserveEndUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdReserveEndUpdateNoOpRequest(String id, InvdReserveEndObjectData noOpIn) {
    super(id, "InvdReserveEndUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(noOpIn, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }
/**
 *
 * Retrieves the InvdReserveEndObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvdReserveEndObjectData getOutput() {
    return InvdReserveEndObjectHelper.fromMap(outputMap, "InvdReserveEnd");
  }
}
