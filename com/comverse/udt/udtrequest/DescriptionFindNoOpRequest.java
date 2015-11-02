/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DescriptionFindNoOpRequest Udt Request/Response
 *
 */
public class DescriptionFindNoOpRequest extends DescriptionRequest {
/**
 *
 * Constructor to create a   DescriptionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DescriptionFindNoOpRequest(String id, DescriptionObjectDataList noOpIn) {
    super(id, "DescriptionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DescriptionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Description", noOpIn);
      }
      addInput("Description", mapList);
    }
  }
/**
 *
 * Retrieves the DescriptionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DescriptionObjectDataList getOutput() {
    return DescriptionObjectHelper.fromMapList(outputMap, "DescriptionList");
  }
}
