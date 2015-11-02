/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintFindNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintFindNoOpRequest extends BsdAttributeConstraintRequest {
/**
 *
 * Constructor to create a   BsdAttributeConstraintFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintFindNoOpRequest(String id, BsdAttributeConstraintObjectDataList noOpIn) {
    super(id, "BsdAttributeConstraintFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdAttributeConstraintObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAttributeConstraint", noOpIn);
      }
      addInput("BsdAttributeConstraint", mapList);
    }
  }
/**
 *
 * Retrieves the BsdAttributeConstraintObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintObjectDataList getOutput() {
    return BsdAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintList");
  }
}
