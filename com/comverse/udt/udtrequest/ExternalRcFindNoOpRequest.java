/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcFindNoOpRequest.java
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
 * NoOp class used to simulate a ExternalRcFindNoOpRequest Udt Request/Response
 *
 */
public class ExternalRcFindNoOpRequest extends ExternalRcRequest {
/**
 *
 * Constructor to create a   ExternalRcFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExternalRcFindNoOpRequest(String id, ExternalRcObjectDataList noOpIn) {
    super(id, "ExternalRcFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ExternalRcObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExternalRc", noOpIn);
      }
      addInput("ExternalRc", mapList);
    }
  }
/**
 *
 * Retrieves the ExternalRcObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ExternalRcObjectDataList getOutput() {
    return ExternalRcObjectHelper.fromMapList(outputMap, "ExternalRcList");
  }
}
