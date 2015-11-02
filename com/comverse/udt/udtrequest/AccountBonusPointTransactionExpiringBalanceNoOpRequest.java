/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionExpiringBalanceNoOpRequest.java
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
 * NoOp class used to simulate a AccountBonusPointTransactionExpiringBalanceNoOpRequest Udt Request/Response
 *
 */
public class AccountBonusPointTransactionExpiringBalanceNoOpRequest extends AccountBonusPointTransactionRequest {
/**
 *
 * Constructor to create a   AccountBonusPointTransactionExpiringBalanceNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountBonusPointTransactionExpiringBalanceNoOpRequest(String id, BigInteger noOpIn) {
    super(id, "AccountBonusPointTransactionExpiringBalanceNoOpRequest");
    if (noOpIn != null) {
      addInput("Amount", noOpIn);
    }
  }
/**
 *
 * Retrieves the BigInteger passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("Amount");
  }
}
