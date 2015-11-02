/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointFindNoOpRequest.java
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
 * NoOp class used to simulate a CmfBonusPointFindNoOpRequest Udt Request/Response
 *
 */
public class CmfBonusPointFindNoOpRequest extends CmfBonusPointRequest {
/**
 *
 * Constructor to create a   CmfBonusPointFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CmfBonusPointFindNoOpRequest(String id, CmfBonusPointObjectDataList noOpIn) {
    super(id, "CmfBonusPointFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CmfBonusPointObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CmfBonusPoint", noOpIn);
      }
      addInput("CmfBonusPoint", mapList);
    }
  }
/**
 *
 * Retrieves the CmfBonusPointObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CmfBonusPointObjectDataList getOutput() {
    return CmfBonusPointObjectHelper.fromMapList(outputMap, "CmfBonusPointList");
  }
}
