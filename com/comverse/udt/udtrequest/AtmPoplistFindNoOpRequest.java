/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AtmPoplistFindNoOpRequest.java
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
 * NoOp class used to simulate a AtmPoplistFindNoOpRequest Udt Request/Response
 *
 */
public class AtmPoplistFindNoOpRequest extends AtmPoplistRequest {
/**
 *
 * Constructor to create a   AtmPoplistFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AtmPoplistFindNoOpRequest(String id, AtmPoplistObjectDataList noOpIn) {
    super(id, "AtmPoplistFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AtmPoplistObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AtmPoplist", noOpIn);
      }
      addInput("AtmPoplist", mapList);
    }
  }
/**
 *
 * Retrieves the AtmPoplistObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AtmPoplistObjectDataList getOutput() {
    return AtmPoplistObjectHelper.fromMapList(outputMap, "AtmPoplistList");
  }
}
