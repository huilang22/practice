/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintTypeFindNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintTypeFindNoOpRequest extends BsdAttributeConstraintTypeRequest {
/**
 *
 * Constructor to create a   BsdAttributeConstraintTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintTypeFindNoOpRequest(String id, BsdAttributeConstraintTypeObjectDataList noOpIn) {
    super(id, "BsdAttributeConstraintTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdAttributeConstraintTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAttributeConstraintType", noOpIn);
      }
      addInput("BsdAttributeConstraintType", mapList);
    }
  }
/**
 *
 * Retrieves the BsdAttributeConstraintTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintTypeObjectDataList getOutput() {
    return BsdAttributeConstraintTypeObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintTypeList");
  }
}
