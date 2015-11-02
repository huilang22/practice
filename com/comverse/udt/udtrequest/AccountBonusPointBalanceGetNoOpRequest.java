/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointBalanceGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountBonusPointBalanceGetNoOpRequest Udt Request/Response
 *
 */
public class AccountBonusPointBalanceGetNoOpRequest extends AccountBonusPointBalanceSubRequestParent {
/**
 *
 * Constructor to create a   AccountBonusPointBalanceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountBonusPointBalanceGetNoOpRequest(String id, AccountBonusPointBalanceObjectData noOpIn) {
    super(id, "AccountBonusPointBalanceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountBonusPointBalance", AccountBonusPointBalanceObjectHelper.toMap(noOpIn, new HashMap(), "AccountBonusPointBalance").get("AccountBonusPointBalance"));
    }
  }
/**
 *
 * Retrieves the AccountBonusPointBalanceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBonusPointBalanceObjectData getOutput() {
    return AccountBonusPointBalanceObjectHelper.fromMap(outputMap, "AccountBonusPointBalance");
  }
}
