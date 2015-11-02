/*
 * Generated code DO NOT EDIT
 * Generated file: SvcComponentFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SvcComponentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SvcComponentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SvcComponentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SvcComponentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SvcComponentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcComponentObjectDataList noOpInIn) {
    super(id, context, "SvcComponentFind");
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
        mapArray[i] = SvcComponentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcComponent", noOpIn);
      }
      addInput("SvcComponent", mapList);
    }
  }
/**
 *
 * Sets the  SvcComponent
 * @param noOpInIn SvcComponentObjectDataList to set
 *
 */
  public void setSvcComponent(SvcComponentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SvcComponent passed into the constructor
 * @return Simulated response
 *
 */
  public SvcComponentObjectDataList getSvcComponent() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SvcComponentObjectHelper.fromMapList(inputMap, "SvcComponentList");
  }
}
