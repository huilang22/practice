/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationConstraintFindNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationConstraintFindNoOpRequest extends BsdApplicationConstraintRequest {
/**
 *
 * Constructor to create a   BsdApplicationConstraintFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationConstraintFindNoOpRequest(String id, BsdApplicationConstraintObjectDataList noOpIn) {
    super(id, "BsdApplicationConstraintFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdApplicationConstraintObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationConstraint", noOpIn);
      }
      addInput("BsdApplicationConstraint", mapList);
    }
  }
/**
 *
 * Retrieves the BsdApplicationConstraintObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationConstraintObjectDataList getOutput() {
    return BsdApplicationConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationConstraintList");
  }
}
