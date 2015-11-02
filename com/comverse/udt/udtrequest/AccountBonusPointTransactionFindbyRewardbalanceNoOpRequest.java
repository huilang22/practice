/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionFindbyRewardbalanceNoOpRequest.java
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
 * NoOp class used to simulate a AccountBonusPointTransactionFindbyRewardbalanceNoOpRequest Udt Request/Response
 *
 */
public class AccountBonusPointTransactionFindbyRewardbalanceNoOpRequest extends AccountBonusPointTransactionRequest {
/**
 *
 * Constructor to create a   AccountBonusPointTransactionFindbyRewardbalanceNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountBonusPointTransactionFindbyRewardbalanceNoOpRequest(String id, AccountBonusPointTransactionObjectDataList noOpIn) {
    super(id, "AccountBonusPointTransactionFindbyRewardbalanceNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountBonusPointTransactionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountBonusPointTransaction", noOpIn);
      }
      addInput("AccountBonusPointTransaction", mapList);
    }
  }
/**
 *
 * Retrieves the AccountBonusPointTransactionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBonusPointTransactionObjectDataList getOutput() {
    return AccountBonusPointTransactionObjectHelper.fromMapList(outputMap, "AccountBonusPointTransactionList");
  }
}
