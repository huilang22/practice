/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalConstraintTypeFindNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintTypeFindNoOpRequest extends BsdRelationalConstraintTypeRequest {
/**
 *
 * Constructor to create a   BsdRelationalConstraintTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintTypeFindNoOpRequest(String id, BsdRelationalConstraintTypeObjectDataList noOpIn) {
    super(id, "BsdRelationalConstraintTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdRelationalConstraintTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdRelationalConstraintType", noOpIn);
      }
      addInput("BsdRelationalConstraintType", mapList);
    }
  }
/**
 *
 * Retrieves the BsdRelationalConstraintTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintTypeObjectDataList getOutput() {
    return BsdRelationalConstraintTypeObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintTypeList");
  }
}
