/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerDocumentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerDocumentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerDocumentObjectData CustomerDocumentUpdateIn;
/**
 *
 * Constructor to create a  CustomerDocumentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerDocumentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentUpdateInIn) {
    super(id, context, "CustomerDocumentUpdate");
    CustomerDocumentUpdateIn = CustomerDocumentUpdateInIn;
  }

  public void translateToMap() {
    if (CustomerDocumentUpdateIn != null) {
      CustomerDocumentUpdateIn.resetFlags(true, true);
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(CustomerDocumentUpdateIn, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }


/**
 *
 * Sets the CustomerDocument
 * @param CustomerDocumentUpdateInIn Value of the CustomerDocumentUpdateIn
 *
 */

  public void setCustomerDocument(CustomerDocumentObjectData CustomerDocumentUpdateInIn) {
    CustomerDocumentUpdateIn = CustomerDocumentUpdateInIn;
  }

  public void translateFromMap() {
    CustomerDocumentUpdateIn = CustomerDocumentObjectHelper.fromMap(inputMap, "CustomerDocument");
  }

/**
 *
 * Gets the CustomerDocument
 * @return Value of the CustomerDocument
 *
 */

  public CustomerDocumentObjectData getCustomerDocument( ) {
    return CustomerDocumentUpdateIn;
  }

}
