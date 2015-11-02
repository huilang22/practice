/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentActionFindNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentActionFindNoOpRequest extends InvsEquipmentActionRequest {
/**
 *
 * Constructor to create a   InvsEquipmentActionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentActionFindNoOpRequest(String id, InvsEquipmentActionObjectDataList noOpIn) {
    super(id, "InvsEquipmentActionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsEquipmentActionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipmentAction", noOpIn);
      }
      addInput("InvsEquipmentAction", mapList);
    }
  }
/**
 *
 * Retrieves the InvsEquipmentActionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentActionObjectDataList getOutput() {
    return InvsEquipmentActionObjectHelper.fromMapList(outputMap, "InvsEquipmentActionList");
  }
}
