/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountInsertFindNoOpRequest Udt Request/Response
 *
 */
public class AccountInsertFindNoOpRequest extends AccountInsertRequest {
/**
 *
 * Constructor to create a   AccountInsertFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountInsertFindNoOpRequest(String id, AccountInsertObjectDataList noOpIn) {
    super(id, "AccountInsertFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountInsertObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountInsert", noOpIn);
      }
      addInput("AccountInsert", mapList);
    }
  }
/**
 *
 * Retrieves the AccountInsertObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountInsertObjectDataList getOutput() {
    return AccountInsertObjectHelper.fromMapList(outputMap, "AccountInsertList");
  }
}
