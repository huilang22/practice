/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountBalancesFindNoOpRequest Udt Request/Response
 *
 */
public class AccountBalancesFindNoOpRequest extends AccountBalancesRequest {
/**
 *
 * Constructor to create a   AccountBalancesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountBalancesFindNoOpRequest(String id, AccountBalancesObjectDataList noOpIn) {
    super(id, "AccountBalancesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountBalancesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountBalances", noOpIn);
      }
      addInput("AccountBalances", mapList);
    }
  }
/**
 *
 * Retrieves the AccountBalancesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBalancesObjectDataList getOutput() {
    return AccountBalancesObjectHelper.fromMapList(outputMap, "AccountBalancesList");
  }
}
