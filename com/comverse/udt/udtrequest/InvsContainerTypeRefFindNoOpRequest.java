/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeRefFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsContainerTypeRefFindNoOpRequest Udt Request/Response
 *
 */
public class InvsContainerTypeRefFindNoOpRequest extends InvsContainerTypeRefRequest {
/**
 *
 * Constructor to create a   InvsContainerTypeRefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsContainerTypeRefFindNoOpRequest(String id, InvsContainerTypeRefObjectDataList noOpIn) {
    super(id, "InvsContainerTypeRefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsContainerTypeRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsContainerTypeRef", noOpIn);
      }
      addInput("InvsContainerTypeRef", mapList);
    }
  }
/**
 *
 * Retrieves the InvsContainerTypeRefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsContainerTypeRefObjectDataList getOutput() {
    return InvsContainerTypeRefObjectHelper.fromMapList(outputMap, "InvsContainerTypeRefList");
  }
}
