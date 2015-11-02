/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDocumentFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CustomerDocumentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerDocumentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerDocumentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CustomerDocumentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerDocumentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDocumentObjectDataList noOpInIn) {
    super(id, context, "CustomerDocumentFind");
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
        mapArray[i] = CustomerDocumentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerDocument", noOpIn);
      }
      addInput("CustomerDocument", mapList);
    }
  }
/**
 *
 * Sets the  CustomerDocument
 * @param noOpInIn CustomerDocumentObjectDataList to set
 *
 */
  public void setCustomerDocument(CustomerDocumentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerDocument passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerDocumentObjectDataList getCustomerDocument() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerDocumentObjectHelper.fromMapList(inputMap, "CustomerDocumentList");
  }
}
