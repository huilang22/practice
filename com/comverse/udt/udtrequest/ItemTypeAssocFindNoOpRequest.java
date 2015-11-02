/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocFindNoOpRequest.java
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
 * NoOp class used to simulate a ItemTypeAssocFindNoOpRequest Udt Request/Response
 *
 */
public class ItemTypeAssocFindNoOpRequest extends ItemTypeAssocRequest {
/**
 *
 * Constructor to create a   ItemTypeAssocFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemTypeAssocFindNoOpRequest(String id, ItemTypeAssocObjDataList noOpIn) {
    super(id, "ItemTypeAssocFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ItemTypeAssocObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemTypeAssoc", noOpIn);
      }
      addInput("ItemTypeAssoc", mapList);
    }
  }
/**
 *
 * Retrieves the ItemTypeAssocObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ItemTypeAssocObjDataList getOutput() {
    return ItemTypeAssocObjHelper.fromMapList(outputMap, "ItemTypeAssocList");
  }
}
