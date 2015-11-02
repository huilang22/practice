/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeConstraintFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationAttributeConstraintFindNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationAttributeConstraintFindNoOpRequest extends BsdApplicationAttributeConstraintRequest {
/**
 *
 * Constructor to create a   BsdApplicationAttributeConstraintFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationAttributeConstraintFindNoOpRequest(String id, BsdApplicationAttributeConstraintObjectDataList noOpIn) {
    super(id, "BsdApplicationAttributeConstraintFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdApplicationAttributeConstraintObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationAttributeConstraint", noOpIn);
      }
      addInput("BsdApplicationAttributeConstraint", mapList);
    }
  }
/**
 *
 * Retrieves the BsdApplicationAttributeConstraintObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationAttributeConstraintObjectDataList getOutput() {
    return BsdApplicationAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeConstraintList");
  }
}
