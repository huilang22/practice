/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDocumentDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CustomerDocumentDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerDocumentDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerDocumentObjectData noOpIn;

/**
 *
 * Constructor to create a   CustomerDocumentDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerDocumentDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDocumentObjectData noOpInIn) {
    super(id, context, "CustomerDocumentDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(noOpIn, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }
/**
 *
 * Sets the  CustomerDocument
 * @param noOpInIn CustomerDocumentObjectData to set
 *
 */
  public void setCustomerDocument(CustomerDocumentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerDocument passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerDocumentObjectData getCustomerDocument() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerDocumentObjectHelper.fromMap(inputMap, "CustomerDocument");
  }
}
