/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountStatusFindNoOpRequest Udt Request/Response
 *
 */
public class AccountStatusFindNoOpRequest extends AccountStatusRequest {
/**
 *
 * Constructor to create a   AccountStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountStatusFindNoOpRequest(String id, AccountStatusObjectDataList noOpIn) {
    super(id, "AccountStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountStatus", noOpIn);
      }
      addInput("AccountStatus", mapList);
    }
  }
/**
 *
 * Retrieves the AccountStatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountStatusObjectDataList getOutput() {
    return AccountStatusObjectHelper.fromMapList(outputMap, "AccountStatusList");
  }
}
