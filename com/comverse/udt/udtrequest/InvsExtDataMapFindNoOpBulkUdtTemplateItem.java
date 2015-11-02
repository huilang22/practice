/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsExtDataMapFindNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsExtDataMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsExtDataMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsExtDataMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsExtDataMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsExtDataMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsExtDataMapObjectDataList noOpInIn) {
    super(id, context, "InvsExtDataMapFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = InvsExtDataMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsExtDataMap", noOpIn);
      }
      addInput("InvsExtDataMap", mapList);
    }
  }
/**
 *
 * Sets the  InvsExtDataMap
 * @param noOpInIn InvsExtDataMapObjectDataList to set
 *
 */
  public void setInvsExtDataMap(InvsExtDataMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsExtDataMap passed into the constructor
 * @return Simulated response
 *
 */
  public InvsExtDataMapObjectDataList getInvsExtDataMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsExtDataMapObjectHelper.fromMapList(inputMap, "InvsExtDataMapList");
  }
}
