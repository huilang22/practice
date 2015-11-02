/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameFindNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a AppNameFindNoOpRequest Udt Request/Response
 *
 */
public class AppNameFindNoOpRequest extends AppNameRequest {
/**
 *
 * Constructor to create a   AppNameFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AppNameFindNoOpRequest(String id, AppNameObjectDataList noOpIn) {
    super(id, "AppNameFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AppNameObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AppName", noOpIn);
      }
      addInput("AppName", mapList);
    }
  }
/**
 *
 * Retrieves the AppNameObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AppNameObjectDataList getOutput() {
    return AppNameObjectHelper.fromMapList(outputMap, "AppNameList");
  }
}
