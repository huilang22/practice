/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvPlaceholderFindNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a InvPlaceholderFindNoOpRequest Udt Request/Response
 *
 */
public class InvPlaceholderFindNoOpRequest extends InvPlaceholderRequest {
/**
 *
 * Constructor to create a   InvPlaceholderFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvPlaceholderFindNoOpRequest(String id, InvPlaceholderObjectDataList noOpIn) {
    super(id, "InvPlaceholderFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvPlaceholderObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvPlaceholder", noOpIn);
      }
      addInput("InvPlaceholder", mapList);
    }
  }
/**
 *
 * Retrieves the InvPlaceholderObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvPlaceholderObjectDataList getOutput() {
    return InvPlaceholderObjectHelper.fromMapList(outputMap, "InvPlaceholderList");
  }
}
