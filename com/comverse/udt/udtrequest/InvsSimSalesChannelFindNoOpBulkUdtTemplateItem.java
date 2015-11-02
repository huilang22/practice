/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimSalesChannelFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimSalesChannelFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimSalesChannelObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsSimSalesChannelFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimSalesChannelFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelObjectDataList noOpInIn) {
    super(id, context, "InvsSimSalesChannelFind");
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
        mapArray[i] = InvsSimSalesChannelObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimSalesChannel", noOpIn);
      }
      addInput("InvsSimSalesChannel", mapList);
    }
  }
/**
 *
 * Sets the  InvsSimSalesChannel
 * @param noOpInIn InvsSimSalesChannelObjectDataList to set
 *
 */
  public void setInvsSimSalesChannel(InvsSimSalesChannelObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimSalesChannel passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimSalesChannelObjectDataList getInvsSimSalesChannel() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimSalesChannelObjectHelper.fromMapList(inputMap, "InvsSimSalesChannelList");
  }
}
