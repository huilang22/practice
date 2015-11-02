/*
 * Generated code DO NOT EDIT
 * Generated file: InvdViewsFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvdViewsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdViewsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdViewsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvdViewsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdViewsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdViewsObjectDataList noOpInIn) {
    super(id, context, "InvdViewsFind");
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
        mapArray[i] = InvdViewsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdViews", noOpIn);
      }
      addInput("InvdViews", mapList);
    }
  }
/**
 *
 * Sets the  InvdViews
 * @param noOpInIn InvdViewsObjectDataList to set
 *
 */
  public void setInvdViews(InvdViewsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdViews passed into the constructor
 * @return Simulated response
 *
 */
  public InvdViewsObjectDataList getInvdViews() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdViewsObjectHelper.fromMapList(inputMap, "InvdViewsList");
  }
}
