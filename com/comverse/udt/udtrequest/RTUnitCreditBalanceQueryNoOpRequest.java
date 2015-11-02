/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RTUnitCreditBalanceQueryNoOpRequest.java
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
 * NoOp class used to simulate a RTUnitCreditBalanceQueryNoOpRequest Udt Request/Response
 *
 */
public class RTUnitCreditBalanceQueryNoOpRequest extends RTUnitCreditBalanceSubRequestParent {
/**
 *
 * Constructor to create a   RTUnitCreditBalanceQueryNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RTUnitCreditBalanceQueryNoOpRequest(String id, RTUnitCreditBalanceQueryOutputData noOpIn) {
    super(id, "RTUnitCreditBalanceQueryNoOpRequest");
    if (noOpIn != null) {
      addInput("RTUnitCreditBalanceQueryOutputData", RTUnitCreditBalanceQueryOutputHelper.toMap(noOpIn).get("RTUnitCreditBalanceQueryOutputData"));
    }
  }
/**
 *
 * Retrieves the RTUnitCreditBalanceQueryOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public RTUnitCreditBalanceQueryOutputData getOutput() {
    return RTUnitCreditBalanceQueryOutputHelper.fromMap(outputMap);
  }
}
