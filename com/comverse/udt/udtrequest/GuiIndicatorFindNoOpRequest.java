/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorFindNoOpRequest.java
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
 * NoOp class used to simulate a GuiIndicatorFindNoOpRequest Udt Request/Response
 *
 */
public class GuiIndicatorFindNoOpRequest extends GuiIndicatorRequest {
/**
 *
 * Constructor to create a   GuiIndicatorFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GuiIndicatorFindNoOpRequest(String id, GuiIndicatorObjectDataList noOpIn) {
    super(id, "GuiIndicatorFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GuiIndicatorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GuiIndicator", noOpIn);
      }
      addInput("GuiIndicator", mapList);
    }
  }
/**
 *
 * Retrieves the GuiIndicatorObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GuiIndicatorObjectDataList getOutput() {
    return GuiIndicatorObjectHelper.fromMapList(outputMap, "GuiIndicatorList");
  }
}
