/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdObjectAttributeFindNoOpRequest Udt Request/Response
 *
 */
public class BsdObjectAttributeFindNoOpRequest extends BsdObjectAttributeRequest {
/**
 *
 * Constructor to create a   BsdObjectAttributeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdObjectAttributeFindNoOpRequest(String id, BsdObjectAttributeObjectDataList noOpIn) {
    super(id, "BsdObjectAttributeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdObjectAttributeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdObjectAttribute", noOpIn);
      }
      addInput("BsdObjectAttribute", mapList);
    }
  }
/**
 *
 * Retrieves the BsdObjectAttributeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectAttributeObjectDataList getOutput() {
    return BsdObjectAttributeObjectHelper.fromMapList(outputMap, "BsdObjectAttributeList");
  }
}
