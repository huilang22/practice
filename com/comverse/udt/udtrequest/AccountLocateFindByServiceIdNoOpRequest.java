/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByServiceIdNoOpRequest.java
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
 * NoOp class used to simulate a AccountLocateFindByServiceIdNoOpRequest Udt Request/Response
 *
 */
public class AccountLocateFindByServiceIdNoOpRequest extends AccountLocateRequest {
/**
 *
 * Constructor to create a   AccountLocateFindByServiceIdNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountLocateFindByServiceIdNoOpRequest(String id, ServiceLocateXIDObjectDataList noOpIn) {
    super(id, "AccountLocateFindByServiceIdNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceLocateXIDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountLocate", noOpIn);
      }
      addInput("AccountLocate", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceLocateXIDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceLocateXIDObjectDataList getOutput() {
    return ServiceLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
}
