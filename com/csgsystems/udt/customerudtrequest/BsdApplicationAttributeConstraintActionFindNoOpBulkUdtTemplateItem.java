/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationAttributeConstraintActionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationAttributeConstraintActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationAttributeConstraintActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationAttributeConstraintObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationAttributeConstraintActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationAttributeConstraintActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationAttributeConstraintObjectDataList noOpInIn) {
    super(id, context, "BsdApplicationAttributeConstraintActionFind");
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
        mapArray[i] = BsdApplicationAttributeConstraintObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationAttributeConstraint", noOpIn);
      }
      addInput("BsdApplicationAttributeConstraint", mapList);
    }
  }
/**
 *
 * Sets the  BsdApplicationAttributeConstraint
 * @param noOpInIn BsdApplicationAttributeConstraintObjectDataList to set
 *
 */
  public void setBsdApplicationAttributeConstraint(BsdApplicationAttributeConstraintObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationAttributeConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationAttributeConstraintObjectDataList getBsdApplicationAttributeConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationAttributeConstraintObjectHelper.fromMapList(inputMap, "BsdApplicationAttributeConstraintList");
  }
}
