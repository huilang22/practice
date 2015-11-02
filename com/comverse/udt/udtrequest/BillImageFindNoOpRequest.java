/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillImageFindNoOpRequest.java
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
 * NoOp class used to simulate a BillImageFindNoOpRequest Udt Request/Response
 *
 */
public class BillImageFindNoOpRequest extends BillImageRequest {
/**
 *
 * Constructor to create a   BillImageFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillImageFindNoOpRequest(String id, BillImageObjectDataList noOpIn) {
    super(id, "BillImageFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BillImageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillImage", noOpIn);
      }
      addInput("BillImage", mapList);
    }
  }
/**
 *
 * Retrieves the BillImageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BillImageObjectDataList getOutput() {
    return BillImageObjectHelper.fromMapList(outputMap, "BillImageList");
  }
}
