/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a ItemTypeFindNoOpRequest Udt Request/Response
 *
 */
public class ItemTypeFindNoOpRequest extends ItemTypeRequest {
/**
 *
 * Constructor to create a   ItemTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemTypeFindNoOpRequest(String id, ItemTypeObjectDataList noOpIn) {
    super(id, "ItemTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ItemTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemType", noOpIn);
      }
      addInput("ItemType", mapList);
    }
  }
/**
 *
 * Retrieves the ItemTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ItemTypeObjectDataList getOutput() {
    return ItemTypeObjectHelper.fromMapList(outputMap, "ItemTypeList");
  }
}
