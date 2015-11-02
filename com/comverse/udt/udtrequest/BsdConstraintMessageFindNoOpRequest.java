/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdConstraintMessageFindNoOpRequest Udt Request/Response
 *
 */
public class BsdConstraintMessageFindNoOpRequest extends BsdConstraintMessageRequest {
/**
 *
 * Constructor to create a   BsdConstraintMessageFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdConstraintMessageFindNoOpRequest(String id, BsdConstraintMessageObjectDataList noOpIn) {
    super(id, "BsdConstraintMessageFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdConstraintMessageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdConstraintMessage", noOpIn);
      }
      addInput("BsdConstraintMessage", mapList);
    }
  }
/**
 *
 * Retrieves the BsdConstraintMessageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintMessageObjectDataList getOutput() {
    return BsdConstraintMessageObjectHelper.fromMapList(outputMap, "BsdConstraintMessageList");
  }
}
