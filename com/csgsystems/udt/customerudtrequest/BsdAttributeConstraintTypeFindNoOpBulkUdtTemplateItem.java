/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeConstraintTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintTypeObjectDataList noOpInIn) {
    super(id, context, "BsdAttributeConstraintTypeFind");
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
        mapArray[i] = BsdAttributeConstraintTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAttributeConstraintType", noOpIn);
      }
      addInput("BsdAttributeConstraintType", mapList);
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraintType
 * @param noOpInIn BsdAttributeConstraintTypeObjectDataList to set
 *
 */
  public void setBsdAttributeConstraintType(BsdAttributeConstraintTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraintType passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintTypeObjectDataList getBsdAttributeConstraintType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintTypeObjectHelper.fromMapList(inputMap, "BsdAttributeConstraintTypeList");
  }
}
