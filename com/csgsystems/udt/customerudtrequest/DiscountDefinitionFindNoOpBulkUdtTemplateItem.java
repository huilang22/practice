/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountDefinitionFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DiscountDefinitionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountDefinitionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DiscountDefinitionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DiscountDefinitionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountDefinitionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscountDefinitionObjectDataList noOpInIn) {
    super(id, context, "DiscountDefinitionFind");
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
        mapArray[i] = DiscountDefinitionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscountDefinition", noOpIn);
      }
      addInput("DiscountDefinition", mapList);
    }
  }
/**
 *
 * Sets the  DiscountDefinition
 * @param noOpInIn DiscountDefinitionObjectDataList to set
 *
 */
  public void setDiscountDefinition(DiscountDefinitionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public DiscountDefinitionObjectDataList getDiscountDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DiscountDefinitionObjectHelper.fromMapList(inputMap, "DiscountDefinitionList");
  }
}
