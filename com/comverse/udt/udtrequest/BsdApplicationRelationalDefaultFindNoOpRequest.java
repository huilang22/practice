/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalDefaultFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationRelationalDefaultFindNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationRelationalDefaultFindNoOpRequest extends BsdApplicationRelationalDefaultRequest {
/**
 *
 * Constructor to create a   BsdApplicationRelationalDefaultFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationRelationalDefaultFindNoOpRequest(String id, BsdApplicationRelationalDefaultObjectDataList noOpIn) {
    super(id, "BsdApplicationRelationalDefaultFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdApplicationRelationalDefaultObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationRelationalDefault", noOpIn);
      }
      addInput("BsdApplicationRelationalDefault", mapList);
    }
  }
/**
 *
 * Retrieves the BsdApplicationRelationalDefaultObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationRelationalDefaultObjectDataList getOutput() {
    return BsdApplicationRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalDefaultList");
  }
}
