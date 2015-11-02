/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRelationalConstraintActionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationRelationalConstraintActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationRelationalConstraintActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationRelationalConstraintObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationRelationalConstraintActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationRelationalConstraintActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationRelationalConstraintObjectDataList noOpInIn) {
    super(id, context, "BsdApplicationRelationalConstraintActionFind");
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
        mapArray[i] = BsdApplicationRelationalConstraintObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationRelationalConstraint", noOpIn);
      }
      addInput("BsdApplicationRelationalConstraint", mapList);
    }
  }
/**
 *
 * Sets the  BsdApplicationRelationalConstraint
 * @param noOpInIn BsdApplicationRelationalConstraintObjectDataList to set
 *
 */
  public void setBsdApplicationRelationalConstraint(BsdApplicationRelationalConstraintObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationRelationalConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationRelationalConstraintObjectDataList getBsdApplicationRelationalConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationRelationalConstraintObjectHelper.fromMapList(inputMap, "BsdApplicationRelationalConstraintList");
  }
}
