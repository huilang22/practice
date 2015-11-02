/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleFindNoOpRequest.java
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

import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdLocaleFindNoOpRequest Udt Request/Response
 *
 */
public class BsdLocaleFindNoOpRequest extends BsdLocaleRequest {
/**
 *
 * Constructor to create a   BsdLocaleFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdLocaleFindNoOpRequest(String id, BsdLocaleObjectDataList noOpIn) {
    super(id, "BsdLocaleFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdLocaleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdLocale", noOpIn);
      }
      addInput("BsdLocale", mapList);
    }
  }
/**
 *
 * Retrieves the BsdLocaleObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdLocaleObjectDataList getOutput() {
    return BsdLocaleObjectHelper.fromMapList(outputMap, "BsdLocaleList");
  }
}
