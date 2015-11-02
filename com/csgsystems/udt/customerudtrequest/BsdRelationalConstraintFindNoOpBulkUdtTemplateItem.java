/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalConstraintFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintObjectDataList noOpInIn) {
    super(id, context, "BsdRelationalConstraintFind");
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
        mapArray[i] = BsdRelationalConstraintObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdRelationalConstraint", noOpIn);
      }
      addInput("BsdRelationalConstraint", mapList);
    }
  }
/**
 *
 * Sets the  BsdRelationalConstraint
 * @param noOpInIn BsdRelationalConstraintObjectDataList to set
 *
 */
  public void setBsdRelationalConstraint(BsdRelationalConstraintObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintObjectDataList getBsdRelationalConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalConstraintObjectHelper.fromMapList(inputMap, "BsdRelationalConstraintList");
  }
}
