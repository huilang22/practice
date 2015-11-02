/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemActionFindNoOpRequest.java
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
 * NoOp class used to simulate a ItemActionFindNoOpRequest Udt Request/Response
 *
 */
public class ItemActionFindNoOpRequest extends ItemActionRequest {
/**
 *
 * Constructor to create a   ItemActionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemActionFindNoOpRequest(String id, ItemActionObjectDataList noOpIn) {
    super(id, "ItemActionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ItemActionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemAction", noOpIn);
      }
      addInput("ItemAction", mapList);
    }
  }
/**
 *
 * Retrieves the ItemActionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ItemActionObjectDataList getOutput() {
    return ItemActionObjectHelper.fromMapList(outputMap, "ItemActionList");
  }
}
