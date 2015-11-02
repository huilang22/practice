/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointRateFindNoOpRequest.java
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
 * NoOp class used to simulate a BonusPointRateFindNoOpRequest Udt Request/Response
 *
 */
public class BonusPointRateFindNoOpRequest extends BonusPointRateRequest {
/**
 *
 * Constructor to create a   BonusPointRateFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BonusPointRateFindNoOpRequest(String id, BonusPointRateObjectDataList noOpIn) {
    super(id, "BonusPointRateFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BonusPointRateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BonusPointRate", noOpIn);
      }
      addInput("BonusPointRate", mapList);
    }
  }
/**
 *
 * Retrieves the BonusPointRateObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BonusPointRateObjectDataList getOutput() {
    return BonusPointRateObjectHelper.fromMapList(outputMap, "BonusPointRateList");
  }
}
