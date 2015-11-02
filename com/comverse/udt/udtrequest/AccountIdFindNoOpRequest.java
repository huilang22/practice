/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountIdFindNoOpRequest Udt Request/Response
 *
 */
public class AccountIdFindNoOpRequest extends AccountIdRequest {
/**
 *
 * Constructor to create a   AccountIdFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountIdFindNoOpRequest(String id, AccountIdObjectDataList noOpIn) {
    super(id, "AccountIdFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountId", noOpIn);
      }
      addInput("AccountId", mapList);
    }
  }
/**
 *
 * Retrieves the AccountIdObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountIdObjectDataList getOutput() {
    return AccountIdObjectHelper.fromMapList(outputMap, "AccountIdList");
  }
}
