/*
 * Generated code DO NOT EDIT
 * Generated file: SalesChannelFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SalesChannelFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SalesChannelFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SalesChannelObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SalesChannelFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SalesChannelFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SalesChannelObjectDataList noOpInIn) {
    super(id, context, "SalesChannelFind");
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
        mapArray[i] = SalesChannelObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SalesChannel", noOpIn);
      }
      addInput("SalesChannel", mapList);
    }
  }
/**
 *
 * Sets the  SalesChannel
 * @param noOpInIn SalesChannelObjectDataList to set
 *
 */
  public void setSalesChannel(SalesChannelObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SalesChannel passed into the constructor
 * @return Simulated response
 *
 */
  public SalesChannelObjectDataList getSalesChannel() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SalesChannelObjectHelper.fromMapList(inputMap, "SalesChannelList");
  }
}
