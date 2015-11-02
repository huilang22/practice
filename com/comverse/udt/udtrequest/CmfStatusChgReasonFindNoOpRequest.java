/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusChgReasonFindNoOpRequest.java
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
 * NoOp class used to simulate a CmfStatusChgReasonFindNoOpRequest Udt Request/Response
 *
 */
public class CmfStatusChgReasonFindNoOpRequest extends CmfStatusChgReasonRequest {
/**
 *
 * Constructor to create a   CmfStatusChgReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CmfStatusChgReasonFindNoOpRequest(String id, CmfStatusChgReasonObjectDataList noOpIn) {
    super(id, "CmfStatusChgReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CmfStatusChgReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CmfStatusChgReason", noOpIn);
      }
      addInput("CmfStatusChgReason", mapList);
    }
  }
/**
 *
 * Retrieves the CmfStatusChgReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CmfStatusChgReasonObjectDataList getOutput() {
    return CmfStatusChgReasonObjectHelper.fromMapList(outputMap, "CmfStatusChgReasonList");
  }
}
