/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountFindByOrderNumberNoOpRequest.java
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
 * NoOp class used to simulate a AccountFindByOrderNumberNoOpRequest Udt Request/Response
 *
 */
public class AccountFindByOrderNumberNoOpRequest extends AccountRequest {
/**
 *
 * Constructor to create a   AccountFindByOrderNumberNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountFindByOrderNumberNoOpRequest(String id, AccountXIDObjectDataList noOpIn) {
    super(id, "AccountFindByOrderNumberNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountXIDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Account", noOpIn);
      }
      addInput("Account", mapList);
    }
  }
/**
 *
 * Retrieves the AccountXIDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountXIDObjectDataList getOutput() {
    return AccountXIDObjectHelper.fromMapList(outputMap, "AccountList");
  }
}
