/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillImagePageFindNoOpRequest.java
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
 * NoOp class used to simulate a BillImagePageFindNoOpRequest Udt Request/Response
 *
 */
public class BillImagePageFindNoOpRequest extends BillImagePageRequest {
/**
 *
 * Constructor to create a   BillImagePageFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillImagePageFindNoOpRequest(String id, BillImagePageObjectDataList noOpIn) {
    super(id, "BillImagePageFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BillImagePageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillImagePage", noOpIn);
      }
      addInput("BillImagePage", mapList);
    }
  }
/**
 *
 * Retrieves the BillImagePageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BillImagePageObjectDataList getOutput() {
    return BillImagePageObjectHelper.fromMapList(outputMap, "BillImagePageList");
  }
}
