/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimStockPropConfigFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimStockPropConfigFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimStockPropConfigFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimStockPropConfigObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsSimStockPropConfigFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimStockPropConfigFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimStockPropConfigObjectDataList noOpInIn) {
    super(id, context, "InvsSimStockPropConfigFind");
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
        mapArray[i] = InvsSimStockPropConfigObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimStockPropConfig", noOpIn);
      }
      addInput("InvsSimStockPropConfig", mapList);
    }
  }
/**
 *
 * Sets the  InvsSimStockPropConfig
 * @param noOpInIn InvsSimStockPropConfigObjectDataList to set
 *
 */
  public void setInvsSimStockPropConfig(InvsSimStockPropConfigObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimStockPropConfig passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimStockPropConfigObjectDataList getInvsSimStockPropConfig() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimStockPropConfigObjectHelper.fromMapList(inputMap, "InvsSimStockPropConfigList");
  }
}
