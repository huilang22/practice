/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoFindNoOpRequest.java
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
 * NoOp class used to simulate a VoucherStatusInfoFindNoOpRequest Udt Request/Response
 *
 */
public class VoucherStatusInfoFindNoOpRequest extends VoucherStatusInfoRequest {
/**
 *
 * Constructor to create a   VoucherStatusInfoFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherStatusInfoFindNoOpRequest(String id, VoucherStatusInfoObjectDataList noOpIn) {
    super(id, "VoucherStatusInfoFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = VoucherStatusInfoObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherStatusInfo", noOpIn);
      }
      addInput("VoucherStatusInfo", mapList);
    }
  }
/**
 *
 * Retrieves the VoucherStatusInfoObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusInfoObjectDataList getOutput() {
    return VoucherStatusInfoObjectHelper.fromMapList(outputMap, "VoucherStatusInfoList");
  }
}
