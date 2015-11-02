/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCancelValidateNoOpRequest.java
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
 * NoOp class used to simulate a ItemCancelValidateNoOpRequest Udt Request/Response
 *
 */
public class ItemCancelValidateNoOpRequest extends ItemRequest {
/**
 *
 * Constructor to create a   ItemCancelValidateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemCancelValidateNoOpRequest(String id, ItemObjectDataList noOpIn) {
    super(id, "ItemCancelValidateNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ItemObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Item", noOpIn);
      }
      addInput("Item", mapList);
    }
  }
/**
 *
 * Retrieves the ItemObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ItemObjectDataList getOutput() {
    return ItemObjectHelper.fromMapList(outputMap, "ItemList");
  }
}
