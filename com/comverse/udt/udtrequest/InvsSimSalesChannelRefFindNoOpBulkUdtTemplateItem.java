/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimSalesChannelRefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimSalesChannelRefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimSalesChannelRefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsSimSalesChannelRefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimSalesChannelRefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelRefObjectDataList noOpInIn) {
    super(id, context, "InvsSimSalesChannelRefFind");
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
        mapArray[i] = InvsSimSalesChannelRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimSalesChannelRef", noOpIn);
      }
      addInput("InvsSimSalesChannelRef", mapList);
    }
  }
/**
 *
 * Sets the  InvsSimSalesChannelRef
 * @param noOpInIn InvsSimSalesChannelRefObjectDataList to set
 *
 */
  public void setInvsSimSalesChannelRef(InvsSimSalesChannelRefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimSalesChannelRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimSalesChannelRefObjectDataList getInvsSimSalesChannelRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimSalesChannelRefObjectHelper.fromMapList(inputMap, "InvsSimSalesChannelRefList");
  }
}
