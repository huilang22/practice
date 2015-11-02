/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationFindNoOpRequest.java
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
 * NoOp class used to simulate a VoucherLocationFindNoOpRequest Udt Request/Response
 *
 */
public class VoucherLocationFindNoOpRequest extends VoucherLocationRequest {
/**
 *
 * Constructor to create a   VoucherLocationFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherLocationFindNoOpRequest(String id, VoucherLocationObjectDataList noOpIn) {
    super(id, "VoucherLocationFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = VoucherLocationObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherLocation", noOpIn);
      }
      addInput("VoucherLocation", mapList);
    }
  }
/**
 *
 * Retrieves the VoucherLocationObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherLocationObjectDataList getOutput() {
    return VoucherLocationObjectHelper.fromMapList(outputMap, "VoucherLocationList");
  }
}
