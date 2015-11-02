/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiVersionFindNoOpRequest.java
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
 * NoOp class used to simulate a GuiVersionFindNoOpRequest Udt Request/Response
 *
 */
public class GuiVersionFindNoOpRequest extends GuiVersionRequest {
/**
 *
 * Constructor to create a   GuiVersionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GuiVersionFindNoOpRequest(String id, GuiVersionObjectDataList noOpIn) {
    super(id, "GuiVersionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GuiVersionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GuiVersion", noOpIn);
      }
      addInput("GuiVersion", mapList);
    }
  }
/**
 *
 * Retrieves the GuiVersionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GuiVersionObjectDataList getOutput() {
    return GuiVersionObjectHelper.fromMapList(outputMap, "GuiVersionList");
  }
}
