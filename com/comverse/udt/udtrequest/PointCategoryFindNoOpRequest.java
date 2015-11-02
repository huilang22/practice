/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryFindNoOpRequest.java
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
 * NoOp class used to simulate a PointCategoryFindNoOpRequest Udt Request/Response
 *
 */
public class PointCategoryFindNoOpRequest extends PointCategoryRequest {
/**
 *
 * Constructor to create a   PointCategoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PointCategoryFindNoOpRequest(String id, PointCategoryObjectDataList noOpIn) {
    super(id, "PointCategoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PointCategoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PointCategory", noOpIn);
      }
      addInput("PointCategory", mapList);
    }
  }
/**
 *
 * Retrieves the PointCategoryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PointCategoryObjectDataList getOutput() {
    return PointCategoryObjectHelper.fromMapList(outputMap, "PointCategoryList");
  }
}
