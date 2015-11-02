/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointIdFindNoOpRequest.java
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
 * NoOp class used to simulate a BonusPointIdFindNoOpRequest Udt Request/Response
 *
 */
public class BonusPointIdFindNoOpRequest extends BonusPointIdRequest {
/**
 *
 * Constructor to create a   BonusPointIdFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BonusPointIdFindNoOpRequest(String id, BPIObjectDataList noOpIn) {
    super(id, "BonusPointIdFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BPIObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BonusPointId", noOpIn);
      }
      addInput("BonusPointId", mapList);
    }
  }
/**
 *
 * Retrieves the BPIObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BPIObjectDataList getOutput() {
    return BPIObjectHelper.fromMapList(outputMap, "BonusPointIdList");
  }
}
