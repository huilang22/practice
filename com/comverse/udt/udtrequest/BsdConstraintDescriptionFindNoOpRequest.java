/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdConstraintDescriptionFindNoOpRequest Udt Request/Response
 *
 */
public class BsdConstraintDescriptionFindNoOpRequest extends BsdConstraintDescriptionRequest {
/**
 *
 * Constructor to create a   BsdConstraintDescriptionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdConstraintDescriptionFindNoOpRequest(String id, BsdConstraintDescriptionObjectDataList noOpIn) {
    super(id, "BsdConstraintDescriptionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdConstraintDescriptionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdConstraintDescription", noOpIn);
      }
      addInput("BsdConstraintDescription", mapList);
    }
  }
/**
 *
 * Retrieves the BsdConstraintDescriptionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintDescriptionObjectDataList getOutput() {
    return BsdConstraintDescriptionObjectHelper.fromMapList(outputMap, "BsdConstraintDescriptionList");
  }
}
