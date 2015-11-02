/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a DepositTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class DepositTypeUpdateNoOpRequest extends DepositTypeSubRequestParent {
/**
 *
 * Constructor to create a   DepositTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DepositTypeUpdateNoOpRequest(String id, DepositTypeObjectData noOpIn) {
    super(id, "DepositTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("DepositType", DepositTypeObjectHelper.toMap(noOpIn, new HashMap(), "DepositType").get("DepositType"));
    }
  }
/**
 *
 * Retrieves the DepositTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DepositTypeObjectData getOutput() {
    return DepositTypeObjectHelper.fromMap(outputMap, "DepositType");
  }
}
