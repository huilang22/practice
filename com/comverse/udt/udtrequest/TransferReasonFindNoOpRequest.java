/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonFindNoOpRequest.java
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
 * NoOp class used to simulate a TransferReasonFindNoOpRequest Udt Request/Response
 *
 */
public class TransferReasonFindNoOpRequest extends TransferReasonRequest {
/**
 *
 * Constructor to create a   TransferReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TransferReasonFindNoOpRequest(String id, TransferReasonObjectDataList noOpIn) {
    super(id, "TransferReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TransferReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TransferReason", noOpIn);
      }
      addInput("TransferReason", mapList);
    }
  }
/**
 *
 * Retrieves the TransferReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TransferReasonObjectDataList getOutput() {
    return TransferReasonObjectHelper.fromMapList(outputMap, "TransferReasonList");
  }
}
