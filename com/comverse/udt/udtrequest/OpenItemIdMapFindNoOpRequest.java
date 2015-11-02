/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a OpenItemIdMapFindNoOpRequest Udt Request/Response
 *
 */
public class OpenItemIdMapFindNoOpRequest extends OpenItemIdMapRequest {
/**
 *
 * Constructor to create a   OpenItemIdMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OpenItemIdMapFindNoOpRequest(String id, OpenItemIdMapObjectDataList noOpIn) {
    super(id, "OpenItemIdMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = OpenItemIdMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OpenItemIdMap", noOpIn);
      }
      addInput("OpenItemIdMap", mapList);
    }
  }
/**
 *
 * Retrieves the OpenItemIdMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public OpenItemIdMapObjectDataList getOutput() {
    return OpenItemIdMapObjectHelper.fromMapList(outputMap, "OpenItemIdMapList");
  }
}
