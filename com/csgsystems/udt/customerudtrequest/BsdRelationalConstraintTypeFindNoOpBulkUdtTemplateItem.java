/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalConstraintTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintTypeObjectDataList noOpInIn) {
    super(id, context, "BsdRelationalConstraintTypeFind");
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
        mapArray[i] = BsdRelationalConstraintTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdRelationalConstraintType", noOpIn);
      }
      addInput("BsdRelationalConstraintType", mapList);
    }
  }
/**
 *
 * Sets the  BsdRelationalConstraintType
 * @param noOpInIn BsdRelationalConstraintTypeObjectDataList to set
 *
 */
  public void setBsdRelationalConstraintType(BsdRelationalConstraintTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalConstraintType passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintTypeObjectDataList getBsdRelationalConstraintType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalConstraintTypeObjectHelper.fromMapList(inputMap, "BsdRelationalConstraintTypeList");
  }
}
