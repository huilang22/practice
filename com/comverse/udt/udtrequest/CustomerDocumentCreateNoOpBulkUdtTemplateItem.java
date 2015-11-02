/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentCreateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a CustomerDocumentCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerDocumentCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerDocumentObjectData noOpIn;

/**
 *
 * Constructor to create a   CustomerDocumentCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerDocumentCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDocumentObjectData noOpInIn) {
    super(id, context, "CustomerDocumentCreate");
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
