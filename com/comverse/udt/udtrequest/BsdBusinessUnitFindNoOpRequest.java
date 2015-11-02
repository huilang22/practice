/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdBusinessUnitFindNoOpRequest Udt Request/Response
 *
 */
public class BsdBusinessUnitFindNoOpRequest extends BsdBusinessUnitRequest {
/**
 *
 * Constructor to create a   BsdBusinessUnitFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdBusinessUnitFindNoOpRequest(String id, BsdBusinessUnitObjectDataList noOpIn) {
    super(id, "BsdBusinessUnitFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdBusinessUnitObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdBusinessUnit", noOpIn);
      }
      addInput("BsdBusinessUnit", mapList);
    }
  }
/**
 *
 * Retrieves the BsdBusinessUnitObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdBusinessUnitObjectDataList getOutput() {
    return BsdBusinessUnitObjectHelper.fromMapList(outputMap, "BsdBusinessUnitList");
  }
}
