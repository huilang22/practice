/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionBaseFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentActionBaseFindNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentActionBaseFindNoOpRequest extends InvsEquipmentActionRequest {
/**
 *
 * Constructor to create a   InvsEquipmentActionBaseFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentActionBaseFindNoOpRequest(String id, InvsEquipmentActionBaseObjectDataList noOpIn) {
    super(id, "InvsEquipmentActionBaseFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsEquipmentActionBaseObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipmentAction", noOpIn);
      }
      addInput("InvsEquipmentAction", mapList);
    }
  }
/**
 *
 * Retrieves the InvsEquipmentActionBaseObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentActionBaseObjectDataList getOutput() {
    return InvsEquipmentActionBaseObjectHelper.fromMapList(outputMap, "InvsEquipmentActionList");
  }
}
