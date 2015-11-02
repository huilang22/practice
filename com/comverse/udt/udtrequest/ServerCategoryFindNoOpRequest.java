/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerCategoryFindNoOpRequest.java
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
 * NoOp class used to simulate a ServerCategoryFindNoOpRequest Udt Request/Response
 *
 */
public class ServerCategoryFindNoOpRequest extends ServerCategoryRequest {
/**
 *
 * Constructor to create a   ServerCategoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServerCategoryFindNoOpRequest(String id, SCObjectDataList noOpIn) {
    super(id, "ServerCategoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServerCategory", noOpIn);
      }
      addInput("ServerCategory", mapList);
    }
  }
/**
 *
 * Retrieves the SCObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SCObjectDataList getOutput() {
    return SCObjectHelper.fromMapList(outputMap, "ServerCategoryList");
  }
}
