/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a VoucherStatusFindNoOpRequest Udt Request/Response
 *
 */
public class VoucherStatusFindNoOpRequest extends VoucherStatusRequest {
/**
 *
 * Constructor to create a   VoucherStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherStatusFindNoOpRequest(String id, VoucherStatusObjectDataList noOpIn) {
    super(id, "VoucherStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = VoucherStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherStatus", noOpIn);
      }
      addInput("VoucherStatus", mapList);
    }
  }
/**
 *
 * Retrieves the VoucherStatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusObjectDataList getOutput() {
    return VoucherStatusObjectHelper.fromMapList(outputMap, "VoucherStatusList");
  }
}
