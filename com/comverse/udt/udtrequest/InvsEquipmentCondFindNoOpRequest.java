/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsEquipmentCondFindNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentCondFindNoOpRequest extends InvsEquipmentCondRequest {
/**
 *
 * Constructor to create a   InvsEquipmentCondFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentCondFindNoOpRequest(String id, InvsEquipmentCondObjectDataList noOpIn) {
    super(id, "InvsEquipmentCondFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsEquipmentCondObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipmentCond", noOpIn);
      }
      addInput("InvsEquipmentCond", mapList);
    }
  }
/**
 *
 * Retrieves the InvsEquipmentCondObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentCondObjectDataList getOutput() {
    return InvsEquipmentCondObjectHelper.fromMapList(outputMap, "InvsEquipmentCondList");
  }
}
