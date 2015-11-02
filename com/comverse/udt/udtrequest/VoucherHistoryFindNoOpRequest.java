/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherHistoryFindNoOpRequest.java
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
 * NoOp class used to simulate a VoucherHistoryFindNoOpRequest Udt Request/Response
 *
 */
public class VoucherHistoryFindNoOpRequest extends VoucherHistoryRequest {
/**
 *
 * Constructor to create a   VoucherHistoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherHistoryFindNoOpRequest(String id, VoucherHistoryObjectDataList noOpIn) {
    super(id, "VoucherHistoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = VoucherHistoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherHistory", noOpIn);
      }
      addInput("VoucherHistory", mapList);
    }
  }
/**
 *
 * Retrieves the VoucherHistoryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherHistoryObjectDataList getOutput() {
    return VoucherHistoryObjectHelper.fromMapList(outputMap, "VoucherHistoryList");
  }
}
