/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalDefaultFindNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalDefaultFindNoOpRequest extends BsdRelationalDefaultRequest {
/**
 *
 * Constructor to create a   BsdRelationalDefaultFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalDefaultFindNoOpRequest(String id, BsdRelationalDefaultObjectDataList noOpIn) {
    super(id, "BsdRelationalDefaultFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdRelationalDefaultObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdRelationalDefault", noOpIn);
      }
      addInput("BsdRelationalDefault", mapList);
    }
  }
/**
 *
 * Retrieves the BsdRelationalDefaultObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalDefaultObjectDataList getOutput() {
    return BsdRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdRelationalDefaultList");
  }
}
