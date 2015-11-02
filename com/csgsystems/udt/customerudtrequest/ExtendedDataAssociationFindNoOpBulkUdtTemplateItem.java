/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataAssociationFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ExtendedDataAssociationFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataAssociationFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExtendedDataObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataAssociationFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataAssociationFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataObjectDataList noOpInIn) {
    super(id, context, "ExtendedDataAssociationFind");
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
        mapArray[i] = ExtendedDataObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExtendedDataAssociation", noOpIn);
      }
      addInput("ExtendedDataAssociation", mapList);
    }
  }
/**
 *
 * Sets the  ExtendedDataAssociation
 * @param noOpInIn ExtendedDataObjectDataList to set
 *
 */
  public void setExtendedDataAssociation(ExtendedDataObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExtendedDataAssociation passed into the constructor
 * @return Simulated response
 *
 */
  public ExtendedDataObjectDataList getExtendedDataAssociation() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExtendedDataObjectHelper.fromMapList(inputMap, "ExtendedDataAssociationList");
  }
}
