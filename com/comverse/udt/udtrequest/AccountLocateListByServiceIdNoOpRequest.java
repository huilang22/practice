/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateListByServiceIdNoOpRequest.java
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
 * NoOp class used to simulate a AccountLocateListByServiceIdNoOpRequest Udt Request/Response
 *
 */
public class AccountLocateListByServiceIdNoOpRequest extends AccountLocateRequest {
/**
 *
 * Constructor to create a   AccountLocateListByServiceIdNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountLocateListByServiceIdNoOpRequest(String id, AccountLocateXIDObjectDataList noOpIn) {
    super(id, "AccountLocateListByServiceIdNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountLocateXIDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountLocate", noOpIn);
      }
      addInput("AccountLocate", mapList);
    }
  }
/**
 *
 * Retrieves the AccountLocateXIDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountLocateXIDObjectDataList getOutput() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
}
