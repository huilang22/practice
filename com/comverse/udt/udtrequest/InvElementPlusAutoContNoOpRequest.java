/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusAutoContNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvElementPlusAutoContNoOpRequest Udt Request/Response
 *
 */
public class InvElementPlusAutoContNoOpRequest extends InvElementPlusRequest {
/**
 *
 * Constructor to create a   InvElementPlusAutoContNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvElementPlusAutoContNoOpRequest(String id, InvElementPlusObjDataList noOpIn) {
    super(id, "InvElementPlusAutoContNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvElementPlusObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvElementPlus", noOpIn);
      }
      addInput("InvElementPlus", mapList);
    }
  }
/**
 *
 * Retrieves the InvElementPlusObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementPlusObjDataList getOutput() {
    return InvElementPlusObjHelper.fromMapList(outputMap, "InvElementPlusList");
  }
}
