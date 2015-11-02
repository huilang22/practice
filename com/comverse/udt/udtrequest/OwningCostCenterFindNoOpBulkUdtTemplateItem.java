/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a OwningCostCenterFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OwningCostCenterFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OwningCostCenterObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OwningCostCenterFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OwningCostCenterFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OwningCostCenterObjectDataList noOpInIn) {
    super(id, context, "OwningCostCenterFind");
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
        mapArray[i] = OwningCostCenterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OwningCostCenter", noOpIn);
      }
      addInput("OwningCostCenter", mapList);
    }
  }
/**
 *
 * Sets the  OwningCostCenter
 * @param noOpInIn OwningCostCenterObjectDataList to set
 *
 */
  public void setOwningCostCenter(OwningCostCenterObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OwningCostCenter passed into the constructor
 * @return Simulated response
 *
 */
  public OwningCostCenterObjectDataList getOwningCostCenter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OwningCostCenterObjectHelper.fromMapList(inputMap, "OwningCostCenterList");
  }
}
