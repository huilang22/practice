/*
 * Generated code DO NOT EDIT
 * Generated file: InvsContainerTypeRefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsContainerTypeRefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsContainerTypeRefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsContainerTypeRefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsContainerTypeRefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsContainerTypeRefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeRefObjectDataList noOpInIn) {
    super(id, context, "InvsContainerTypeRefFind");
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
        mapArray[i] = InvsContainerTypeRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsContainerTypeRef", noOpIn);
      }
      addInput("InvsContainerTypeRef", mapList);
    }
  }
/**
 *
 * Sets the  InvsContainerTypeRef
 * @param noOpInIn InvsContainerTypeRefObjectDataList to set
 *
 */
  public void setInvsContainerTypeRef(InvsContainerTypeRefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsContainerTypeRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsContainerTypeRefObjectDataList getInvsContainerTypeRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsContainerTypeRefObjectHelper.fromMapList(inputMap, "InvsContainerTypeRefList");
  }
}
