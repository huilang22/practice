/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentGetBulkUdtTemplateItem.java
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
 * Class used to create a CustomerDocumentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerDocumentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerDocumentObjectKeyData CustomerDocumentGetIn;
/**
 *
 * Constructor to create a  CustomerDocumentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerDocumentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDocumentObjectKeyData CustomerDocumentGetInIn) {
    super(id, context, "CustomerDocumentGet");
    CustomerDocumentGetIn = CustomerDocumentGetInIn;
  }

  public void translateToMap() {
    if (CustomerDocumentGetIn != null) {
      CustomerDocumentGetIn.resetFlags(true, true);
      addInput("CustomerDocument", CustomerDocumentObjectKeyHelper.toMap(CustomerDocumentGetIn, new HashMap(), "CustomerDocumentObjectKeyData").get("CustomerDocumentObjectKeyData"));
    }
  }


/**
 *
 * Sets the CustomerDocument
 * @param CustomerDocumentGetInIn Value of the CustomerDocumentGetIn
 *
 */

  public void setCustomerDocument(CustomerDocumentObjectKeyData CustomerDocumentGetInIn) {
    CustomerDocumentGetIn = CustomerDocumentGetInIn;
  }

  public void translateFromMap() {
    CustomerDocumentGetIn = CustomerDocumentObjectKeyHelper.fromMap(inputMap, "CustomerDocument");
  }

/**
 *
 * Gets the CustomerDocument
 * @return Value of the CustomerDocument
 *
 */

  public CustomerDocumentObjectKeyData getCustomerDocument( ) {
    return CustomerDocumentGetIn;
  }

}
