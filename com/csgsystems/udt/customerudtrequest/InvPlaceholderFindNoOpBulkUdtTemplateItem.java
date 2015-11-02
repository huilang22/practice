/*
 * Generated code DO NOT EDIT
 * Generated file: InvPlaceholderFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a InvPlaceholderFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvPlaceholderFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvPlaceholderObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvPlaceholderFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvPlaceholderFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvPlaceholderObjectDataList noOpInIn) {
    super(id, context, "InvPlaceholderFind");
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
        mapArray[i] = InvPlaceholderObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvPlaceholder", noOpIn);
      }
      addInput("InvPlaceholder", mapList);
    }
  }
/**
 *
 * Sets the  InvPlaceholder
 * @param noOpInIn InvPlaceholderObjectDataList to set
 *
 */
  public void setInvPlaceholder(InvPlaceholderObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvPlaceholder passed into the constructor
 * @return Simulated response
 *
 */
  public InvPlaceholderObjectDataList getInvPlaceholder() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvPlaceholderObjectHelper.fromMapList(inputMap, "InvPlaceholderList");
  }
}
