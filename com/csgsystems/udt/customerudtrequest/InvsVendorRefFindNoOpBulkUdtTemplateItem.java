/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorRefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsVendorRefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsVendorRefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsVendorRefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsVendorRefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsVendorRefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorRefObjectDataList noOpInIn) {
    super(id, context, "InvsVendorRefFind");
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
        mapArray[i] = InvsVendorRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsVendorRef", noOpIn);
      }
      addInput("InvsVendorRef", mapList);
    }
  }
/**
 *
 * Sets the  InvsVendorRef
 * @param noOpInIn InvsVendorRefObjectDataList to set
 *
 */
  public void setInvsVendorRef(InvsVendorRefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsVendorRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVendorRefObjectDataList getInvsVendorRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsVendorRefObjectHelper.fromMapList(inputMap, "InvsVendorRefList");
  }
}
