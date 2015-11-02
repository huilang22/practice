/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSalesChannelFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSalesChannelFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSalesChannelFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSalesChannelObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsSalesChannelFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSalesChannelFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSalesChannelObjectDataList noOpInIn) {
    super(id, context, "InvsSalesChannelFind");
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
        mapArray[i] = InvsSalesChannelObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSalesChannel", noOpIn);
      }
      addInput("InvsSalesChannel", mapList);
    }
  }
/**
 *
 * Sets the  InvsSalesChannel
 * @param noOpInIn InvsSalesChannelObjectDataList to set
 *
 */
  public void setInvsSalesChannel(InvsSalesChannelObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSalesChannel passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSalesChannelObjectDataList getInvsSalesChannel() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSalesChannelObjectHelper.fromMapList(inputMap, "InvsSalesChannelList");
  }
}
