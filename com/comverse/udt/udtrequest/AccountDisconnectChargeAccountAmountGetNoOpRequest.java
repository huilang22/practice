/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountDisconnectChargeAccountAmountGetNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a AccountDisconnectChargeAccountAmountGetNoOpRequest Udt Request/Response
 *
 */
public class AccountDisconnectChargeAccountAmountGetNoOpRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a   AccountDisconnectChargeAccountAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountDisconnectChargeAccountAmountGetNoOpRequest(String id, AccountDisconnectChargeAccountAmountGetOutputData noOpIn) {
    super(id, "AccountDisconnectChargeAccountAmountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountDisconnectChargeAccountAmountGetOutputData", AccountDisconnectChargeAccountAmountGetOutputHelper.toMap(noOpIn).get("AccountDisconnectChargeAccountAmountGetOutputData"));
    }
  }
/**
 *
 * Retrieves the AccountDisconnectChargeAccountAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountDisconnectChargeAccountAmountGetOutputData getOutput() {
    return AccountDisconnectChargeAccountAmountGetOutputHelper.fromMap(outputMap);
  }
}
