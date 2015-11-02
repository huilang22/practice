/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionActivateNoOpRequest.java
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
 * NoOp class used to simulate a AccountBonusPointTransactionActivateNoOpRequest Udt Request/Response
 *
 */
public class AccountBonusPointTransactionActivateNoOpRequest extends AccountBonusPointTransactionSubRequestParent {
/**
 *
 * Constructor to create a   AccountBonusPointTransactionActivateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountBonusPointTransactionActivateNoOpRequest(String id, AccountBonusPointTransactionObjectData noOpIn) {
    super(id, "AccountBonusPointTransactionActivateNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(noOpIn, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
/**
 *
 * Retrieves the AccountBonusPointTransactionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBonusPointTransactionObjectData getOutput() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
}
