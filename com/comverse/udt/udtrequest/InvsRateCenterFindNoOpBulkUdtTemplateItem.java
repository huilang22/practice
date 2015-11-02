/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsRateCenterFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsRateCenterFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsRateCenterObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsRateCenterFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsRateCenterFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsRateCenterObjectDataList noOpInIn) {
    super(id, context, "InvsRateCenterFind");
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
        mapArray[i] = InvsRateCenterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsRateCenter", noOpIn);
      }
      addInput("InvsRateCenter", mapList);
    }
  }
/**
 *
 * Sets the  InvsRateCenter
 * @param noOpInIn InvsRateCenterObjectDataList to set
 *
 */
  public void setInvsRateCenter(InvsRateCenterObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsRateCenter passed into the constructor
 * @return Simulated response
 *
 */
  public InvsRateCenterObjectDataList getInvsRateCenter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsRateCenterObjectHelper.fromMapList(inputMap, "InvsRateCenterList");
  }
}
