/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonFindNoOpRequest.java
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
 * NoOp class used to simulate a ConnectReasonFindNoOpRequest Udt Request/Response
 *
 */
public class ConnectReasonFindNoOpRequest extends ConnectReasonRequest {
/**
 *
 * Constructor to create a   ConnectReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConnectReasonFindNoOpRequest(String id, ConnectReasonObjectDataList noOpIn) {
    super(id, "ConnectReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ConnectReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ConnectReason", noOpIn);
      }
      addInput("ConnectReason", mapList);
    }
  }
/**
 *
 * Retrieves the ConnectReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ConnectReasonObjectDataList getOutput() {
    return ConnectReasonObjectHelper.fromMapList(outputMap, "ConnectReasonList");
  }
}
