/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountHqContractFindNoOpRequest Udt Request/Response
 *
 */
public class AccountHqContractFindNoOpRequest extends AccountHqContractRequest {
/**
 *
 * Constructor to create a   AccountHqContractFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountHqContractFindNoOpRequest(String id, AccountHqContractObjectDataList noOpIn) {
    super(id, "AccountHqContractFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountHqContractObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountHqContract", noOpIn);
      }
      addInput("AccountHqContract", mapList);
    }
  }
/**
 *
 * Retrieves the AccountHqContractObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountHqContractObjectDataList getOutput() {
    return AccountHqContractObjectHelper.fromMapList(outputMap, "AccountHqContractList");
  }
}
