/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CustomerDocumentDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerDocumentDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerDocumentObjectData CustomerDocumentDeleteIn;
/**
 *
 * Constructor to create a  CustomerDocumentDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerDocumentDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentDeleteInIn) {
    super(id, context, "CustomerDocumentDelete");
    CustomerDocumentDeleteIn = CustomerDocumentDeleteInIn;
  }

  public void translateToMap() {
    if (CustomerDocumentDeleteIn != null) {
      CustomerDocumentDeleteIn.resetFlags(true, true);
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(CustomerDocumentDeleteIn, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }


/**
 *
 * Sets the CustomerDocument
 * @param CustomerDocumentDeleteInIn Value of the CustomerDocumentDeleteIn
 *
 */

  public void setCustomerDocument(CustomerDocumentObjectData CustomerDocumentDeleteInIn) {
    CustomerDocumentDeleteIn = CustomerDocumentDeleteInIn;
  }

  public void translateFromMap() {
    CustomerDocumentDeleteIn = CustomerDocumentObjectHelper.fromMap(inputMap, "CustomerDocument");
  }

/**
 *
 * Gets the CustomerDocument
 * @return Value of the CustomerDocument
 *
 */

  public CustomerDocumentObjectData getCustomerDocument( ) {
    return CustomerDocumentDeleteIn;
  }

}
