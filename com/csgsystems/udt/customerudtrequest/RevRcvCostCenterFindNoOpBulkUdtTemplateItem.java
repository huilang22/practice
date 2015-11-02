/*
 * Generated code DO NOT EDIT
 * Generated file: RevRcvCostCenterFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a RevRcvCostCenterFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RevRcvCostCenterFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RevRcvCostCenterObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RevRcvCostCenterFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RevRcvCostCenterFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RevRcvCostCenterObjectDataList noOpInIn) {
    super(id, context, "RevRcvCostCenterFind");
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
        mapArray[i] = RevRcvCostCenterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RevRcvCostCenter", noOpIn);
      }
      addInput("RevRcvCostCenter", mapList);
    }
  }
/**
 *
 * Sets the  RevRcvCostCenter
 * @param noOpInIn RevRcvCostCenterObjectDataList to set
 *
 */
  public void setRevRcvCostCenter(RevRcvCostCenterObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RevRcvCostCenter passed into the constructor
 * @return Simulated response
 *
 */
  public RevRcvCostCenterObjectDataList getRevRcvCostCenter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RevRcvCostCenterObjectHelper.fromMapList(inputMap, "RevRcvCostCenterList");
  }
}
