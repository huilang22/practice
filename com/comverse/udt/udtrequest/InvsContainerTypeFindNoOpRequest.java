/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsContainerTypeFindNoOpRequest Udt Request/Response
 *
 */
public class InvsContainerTypeFindNoOpRequest extends InvsContainerTypeRequest {
/**
 *
 * Constructor to create a   InvsContainerTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsContainerTypeFindNoOpRequest(String id, InvsContainerTypeObjectDataList noOpIn) {
    super(id, "InvsContainerTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsContainerTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsContainerType", noOpIn);
      }
      addInput("InvsContainerType", mapList);
    }
  }
/**
 *
 * Retrieves the InvsContainerTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsContainerTypeObjectDataList getOutput() {
    return InvsContainerTypeObjectHelper.fromMapList(outputMap, "InvsContainerTypeList");
  }
}
