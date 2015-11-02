/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGroupsFindNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentTypeGroupsFindNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentTypeGroupsFindNoOpRequest extends AdjustmentTypeGroupsRequest {
/**
 *
 * Constructor to create a   AdjustmentTypeGroupsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentTypeGroupsFindNoOpRequest(String id, AdjustmentTypeGroupsObjectDataList noOpIn) {
    super(id, "AdjustmentTypeGroupsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AdjustmentTypeGroupsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdjustmentTypeGroups", noOpIn);
      }
      addInput("AdjustmentTypeGroups", mapList);
    }
  }
/**
 *
 * Retrieves the AdjustmentTypeGroupsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTypeGroupsObjectDataList getOutput() {
    return AdjustmentTypeGroupsObjectHelper.fromMapList(outputMap, "AdjustmentTypeGroupsList");
  }
}
