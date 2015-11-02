/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a EquipTypeCodeFindNoOpRequest Udt Request/Response
 *
 */
public class EquipTypeCodeFindNoOpRequest extends EquipTypeCodeRequest {
/**
 *
 * Constructor to create a   EquipTypeCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EquipTypeCodeFindNoOpRequest(String id, ETGObjectDataList noOpIn) {
    super(id, "EquipTypeCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ETGObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EquipTypeCode", noOpIn);
      }
      addInput("EquipTypeCode", mapList);
    }
  }
/**
 *
 * Retrieves the ETGObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ETGObjectDataList getOutput() {
    return ETGObjectHelper.fromMapList(outputMap, "EquipTypeCodeList");
  }
}
