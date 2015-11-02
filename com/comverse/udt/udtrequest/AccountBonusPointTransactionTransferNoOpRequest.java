/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionTransferNoOpRequest.java
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
 * NoOp class used to simulate a AccountBonusPointTransactionTransferNoOpRequest Udt Request/Response
 *
 */
public class AccountBonusPointTransactionTransferNoOpRequest extends AccountBonusPointTransactionSubRequestParent {
/**
 *
 * Constructor to create a   AccountBonusPointTransactionTransferNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountBonusPointTransactionTransferNoOpRequest(String id, AccountBonusPointTransactionTransferOutputData noOpIn) {
    super(id, "AccountBonusPointTransactionTransferNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountBonusPointTransactionTransferOutputData", AccountBonusPointTransactionTransferOutputHelper.toMap(noOpIn).get("AccountBonusPointTransactionTransferOutputData"));
    }
  }
/**
 *
 * Retrieves the AccountBonusPointTransactionTransferOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBonusPointTransactionTransferOutputData getOutput() {
    return AccountBonusPointTransactionTransferOutputHelper.fromMap(outputMap);
  }
}
