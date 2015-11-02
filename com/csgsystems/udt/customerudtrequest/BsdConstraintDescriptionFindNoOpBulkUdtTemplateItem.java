/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintDescriptionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdConstraintDescriptionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdConstraintDescriptionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdConstraintDescriptionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdConstraintDescriptionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdConstraintDescriptionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintDescriptionObjectDataList noOpInIn) {
    super(id, context, "BsdConstraintDescriptionFind");
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
        mapArray[i] = BsdConstraintDescriptionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdConstraintDescription", noOpIn);
      }
      addInput("BsdConstraintDescription", mapList);
    }
  }
/**
 *
 * Sets the  BsdConstraintDescription
 * @param noOpInIn BsdConstraintDescriptionObjectDataList to set
 *
 */
  public void setBsdConstraintDescription(BsdConstraintDescriptionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdConstraintDescription passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintDescriptionObjectDataList getBsdConstraintDescription() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdConstraintDescriptionObjectHelper.fromMapList(inputMap, "BsdConstraintDescriptionList");
  }
}
