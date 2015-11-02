/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemFindNoOpRequest.java
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
 * NoOp class used to simulate a OpenItemFindNoOpRequest Udt Request/Response
 *
 */
public class OpenItemFindNoOpRequest extends OpenItemRequest {
/**
 *
 * Constructor to create a   OpenItemFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OpenItemFindNoOpRequest(String id, OpenItemObjectDataList noOpIn) {
    super(id, "OpenItemFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = OpenItemObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OpenItem", noOpIn);
      }
      addInput("OpenItem", mapList);
    }
  }
/**
 *
 * Retrieves the OpenItemObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public OpenItemObjectDataList getOutput() {
    return OpenItemObjectHelper.fromMapList(outputMap, "OpenItemList");
  }
}
