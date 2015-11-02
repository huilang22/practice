/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvOutletFindNoOpRequest.java
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

import com.csgsystems.ppv.data.*;

/**
 *
 * NoOp class used to simulate a PpvOutletFindNoOpRequest Udt Request/Response
 *
 */
public class PpvOutletFindNoOpRequest extends PpvOutletRequest {
/**
 *
 * Constructor to create a   PpvOutletFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PpvOutletFindNoOpRequest(String id, PpvOutletObjectDataList noOpIn) {
    super(id, "PpvOutletFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PpvOutletObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PpvOutlet", noOpIn);
      }
      addInput("PpvOutlet", mapList);
    }
  }
/**
 *
 * Retrieves the PpvOutletObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PpvOutletObjectDataList getOutput() {
    return PpvOutletObjectHelper.fromMapList(outputMap, "PpvOutletList");
  }
}
