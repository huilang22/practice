/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationFindNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationFindNoOpRequest extends BsdApplicationRequest {
/**
 *
 * Constructor to create a   BsdApplicationFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationFindNoOpRequest(String id, BsdApplicationObjectDataList noOpIn) {
    super(id, "BsdApplicationFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdApplicationObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplication", noOpIn);
      }
      addInput("BsdApplication", mapList);
    }
  }
/**
 *
 * Retrieves the BsdApplicationObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationObjectDataList getOutput() {
    return BsdApplicationObjectHelper.fromMapList(outputMap, "BsdApplicationList");
  }
}
