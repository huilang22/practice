/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointBalanceFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountBonusPointBalanceFindNoOpRequest Udt Request/Response
 *
 */
public class AccountBonusPointBalanceFindNoOpRequest extends AccountBonusPointBalanceRequest {
/**
 *
 * Constructor to create a   AccountBonusPointBalanceFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountBonusPointBalanceFindNoOpRequest(String id, AccountBonusPointBalanceObjectDataList noOpIn) {
    super(id, "AccountBonusPointBalanceFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountBonusPointBalanceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountBonusPointBalance", noOpIn);
      }
      addInput("AccountBonusPointBalance", mapList);
    }
  }
/**
 *
 * Retrieves the AccountBonusPointBalanceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBonusPointBalanceObjectDataList getOutput() {
    return AccountBonusPointBalanceObjectHelper.fromMapList(outputMap, "AccountBonusPointBalanceList");
  }
}
