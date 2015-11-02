/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a DepositTypeDeleteNoOpRequest Udt Request/Response
 *
 */
public class DepositTypeDeleteNoOpRequest extends DepositTypeSubRequestParent {
/**
 *
 * Constructor to create a   DepositTypeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DepositTypeDeleteNoOpRequest(String id, DepositTypeObjectData noOpIn) {
    super(id, "DepositTypeDeleteNoOpRequest");
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
