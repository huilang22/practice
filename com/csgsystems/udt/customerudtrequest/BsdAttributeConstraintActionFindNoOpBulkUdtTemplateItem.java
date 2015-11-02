/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintActionFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdAttributeConstraintActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintObjectDataList noOpInIn) {
    super(id, context, "BsdAttributeConstraintActionFind");
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
        mapArray[i] = BsdAttributeConstraintObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAttributeConstraint", noOpIn);
      }
      addInput("BsdAttributeConstraint", mapList);
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraint
 * @param noOpInIn BsdAttributeConstraintObjectDataList to set
 *
 */
  public void setBsdAttributeConstraint(BsdAttributeConstraintObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintObjectDataList getBsdAttributeConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintObjectHelper.fromMapList(inputMap, "BsdAttributeConstraintList");
  }
}
