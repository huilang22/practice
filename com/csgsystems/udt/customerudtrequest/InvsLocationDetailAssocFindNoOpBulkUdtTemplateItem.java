/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailAssocFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLocationDetailAssocFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationDetailAssocFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationTablesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsLocationDetailAssocFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationDetailAssocFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationTablesObjectDataList noOpInIn) {
    super(id, context, "InvsLocationDetailAssocFind");
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
        mapArray[i] = InvsLocationTablesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocationDetailAssoc", noOpIn);
      }
      addInput("InvsLocationDetailAssoc", mapList);
    }
  }
/**
 *
 * Sets the  InvsLocationDetailAssoc
 * @param noOpInIn InvsLocationTablesObjectDataList to set
 *
 */
  public void setInvsLocationDetailAssoc(InvsLocationTablesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationDetailAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationTablesObjectDataList getInvsLocationDetailAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationTablesObjectHelper.fromMapList(inputMap, "InvsLocationDetailAssocList");
  }
}
