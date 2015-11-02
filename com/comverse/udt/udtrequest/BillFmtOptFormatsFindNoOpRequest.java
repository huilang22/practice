/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a BillFmtOptFormatsFindNoOpRequest Udt Request/Response
 *
 */
public class BillFmtOptFormatsFindNoOpRequest extends BillFmtOptFormatsRequest {
/**
 *
 * Constructor to create a   BillFmtOptFormatsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillFmtOptFormatsFindNoOpRequest(String id, BillFmtOptFormatsObjectDataList noOpIn) {
    super(id, "BillFmtOptFormatsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BillFmtOptFormatsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillFmtOptFormats", noOpIn);
      }
      addInput("BillFmtOptFormats", mapList);
    }
  }
/**
 *
 * Retrieves the BillFmtOptFormatsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BillFmtOptFormatsObjectDataList getOutput() {
    return BillFmtOptFormatsObjectHelper.fromMapList(outputMap, "BillFmtOptFormatsList");
  }
}
