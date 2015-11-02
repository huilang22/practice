/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLocationFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsLocationFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationObjectDataList noOpInIn) {
    super(id, context, "InvsLocationFind");
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
        mapArray[i] = InvsLocationObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocation", noOpIn);
      }
      addInput("InvsLocation", mapList);
    }
  }
/**
 *
 * Sets the  InvsLocation
 * @param noOpInIn InvsLocationObjectDataList to set
 *
 */
  public void setInvsLocation(InvsLocationObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocation passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationObjectDataList getInvsLocation() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationObjectHelper.fromMapList(inputMap, "InvsLocationList");
  }
}
