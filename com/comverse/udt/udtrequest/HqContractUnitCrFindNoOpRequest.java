/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrFindNoOpRequest.java
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
 * NoOp class used to simulate a HqContractUnitCrFindNoOpRequest Udt Request/Response
 *
 */
public class HqContractUnitCrFindNoOpRequest extends HqContractUnitCrRequest {
/**
 *
 * Constructor to create a   HqContractUnitCrFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqContractUnitCrFindNoOpRequest(String id, HqContractUnitCrObjectDataList noOpIn) {
    super(id, "HqContractUnitCrFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = HqContractUnitCrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqContractUnitCr", noOpIn);
      }
      addInput("HqContractUnitCr", mapList);
    }
  }
/**
 *
 * Retrieves the HqContractUnitCrObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public HqContractUnitCrObjectDataList getOutput() {
    return HqContractUnitCrObjectHelper.fromMapList(outputMap, "HqContractUnitCrList");
  }
}
