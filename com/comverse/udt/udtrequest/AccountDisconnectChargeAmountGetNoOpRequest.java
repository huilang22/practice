/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountDisconnectChargeAmountGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountDisconnectChargeAmountGetNoOpRequest Udt Request/Response
 *
 */
public class AccountDisconnectChargeAmountGetNoOpRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a   AccountDisconnectChargeAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountDisconnectChargeAmountGetNoOpRequest(String id, AccountDisconnectChargeAmountGetOutputData noOpIn) {
    super(id, "AccountDisconnectChargeAmountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountDisconnectChargeAmountGetOutputData", AccountDisconnectChargeAmountGetOutputHelper.toMap(noOpIn).get("AccountDisconnectChargeAmountGetOutputData"));
    }
  }
/**
 *
 * Retrieves the AccountDisconnectChargeAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountDisconnectChargeAmountGetOutputData getOutput() {
    return AccountDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
}
