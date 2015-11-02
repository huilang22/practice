/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategoryFindNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchCategoryFindNoOpRequest Udt Request/Response
 *
 */
public class BatchCategoryFindNoOpRequest extends BatchCategoryRequest {
/**
 *
 * Constructor to create a   BatchCategoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchCategoryFindNoOpRequest(String id, BatchCategoryObjectDataList noOpIn) {
    super(id, "BatchCategoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchCategoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchCategory", noOpIn);
      }
      addInput("BatchCategory", mapList);
    }
  }
/**
 *
 * Retrieves the BatchCategoryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchCategoryObjectDataList getOutput() {
    return BatchCategoryObjectHelper.fromMapList(outputMap, "BatchCategoryList");
  }
}
