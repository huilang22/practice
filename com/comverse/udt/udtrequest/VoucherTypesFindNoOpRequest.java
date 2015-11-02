/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesFindNoOpRequest.java
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
 * NoOp class used to simulate a VoucherTypesFindNoOpRequest Udt Request/Response
 *
 */
public class VoucherTypesFindNoOpRequest extends VoucherTypesRequest {
/**
 *
 * Constructor to create a   VoucherTypesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherTypesFindNoOpRequest(String id, VoucherTypesObjectDataList noOpIn) {
    super(id, "VoucherTypesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = VoucherTypesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherTypes", noOpIn);
      }
      addInput("VoucherTypes", mapList);
    }
  }
/**
 *
 * Retrieves the VoucherTypesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherTypesObjectDataList getOutput() {
    return VoucherTypesObjectHelper.fromMapList(outputMap, "VoucherTypesList");
  }
}
