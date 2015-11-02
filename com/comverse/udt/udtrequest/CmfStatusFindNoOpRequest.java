/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a CmfStatusFindNoOpRequest Udt Request/Response
 *
 */
public class CmfStatusFindNoOpRequest extends CmfStatusRequest {
/**
 *
 * Constructor to create a   CmfStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CmfStatusFindNoOpRequest(String id, CmfStatusObjectDataList noOpIn) {
    super(id, "CmfStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CmfStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CmfStatus", noOpIn);
      }
      addInput("CmfStatus", mapList);
    }
  }
/**
 *
 * Retrieves the CmfStatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CmfStatusObjectDataList getOutput() {
    return CmfStatusObjectHelper.fromMapList(outputMap, "CmfStatusList");
  }
}
