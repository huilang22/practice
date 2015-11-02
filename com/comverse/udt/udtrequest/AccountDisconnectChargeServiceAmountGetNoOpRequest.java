/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountDisconnectChargeServiceAmountGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountDisconnectChargeServiceAmountGetNoOpRequest Udt Request/Response
 *
 */
public class AccountDisconnectChargeServiceAmountGetNoOpRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a   AccountDisconnectChargeServiceAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountDisconnectChargeServiceAmountGetNoOpRequest(String id, AccountDisconnectChargeServiceAmountGetOutputData noOpIn) {
    super(id, "AccountDisconnectChargeServiceAmountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountDisconnectChargeServiceAmountGetOutputData", AccountDisconnectChargeServiceAmountGetOutputHelper.toMap(noOpIn).get("AccountDisconnectChargeServiceAmountGetOutputData"));
    }
  }
/**
 *
 * Retrieves the AccountDisconnectChargeServiceAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountDisconnectChargeServiceAmountGetOutputData getOutput() {
    return AccountDisconnectChargeServiceAmountGetOutputHelper.fromMap(outputMap);
  }
}
