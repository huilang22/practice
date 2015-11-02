/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementFindNoOpRequest.java
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
 * NoOp class used to simulate a VoucherStatusMovementFindNoOpRequest Udt Request/Response
 *
 */
public class VoucherStatusMovementFindNoOpRequest extends VoucherStatusMovementRequest {
/**
 *
 * Constructor to create a   VoucherStatusMovementFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherStatusMovementFindNoOpRequest(String id, VoucherStatusMovementObjectDataList noOpIn) {
    super(id, "VoucherStatusMovementFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = VoucherStatusMovementObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherStatusMovement", noOpIn);
      }
      addInput("VoucherStatusMovement", mapList);
    }
  }
/**
 *
 * Retrieves the VoucherStatusMovementObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusMovementObjectDataList getOutput() {
    return VoucherStatusMovementObjectHelper.fromMapList(outputMap, "VoucherStatusMovementList");
  }
}
