/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentCreateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerDocumentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerDocumentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerDocumentObjectData CustomerDocumentCreateIn;
/**
 *
 * Constructor to create a  CustomerDocumentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerDocumentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentCreateInIn) {
    super(id, context, "CustomerDocumentCreate");
    CustomerDocumentCreateIn = CustomerDocumentCreateInIn;
  }

  public void translateToMap() {
    if (CustomerDocumentCreateIn != null) {
      CustomerDocumentCreateIn.resetFlags(true, true);
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(CustomerDocumentCreateIn, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }


/**
 *
 * Sets the CustomerDocument
 * @param CustomerDocumentCreateInIn Value of the CustomerDocumentCreateIn
 *
 */

  public void setCustomerDocument(CustomerDocumentObjectData CustomerDocumentCreateInIn) {
    CustomerDocumentCreateIn = CustomerDocumentCreateInIn;
  }

  public void translateFromMap() {
    CustomerDocumentCreateIn = CustomerDocumentObjectHelper.fromMap(inputMap, "CustomerDocument");
  }

/**
 *
 * Gets the CustomerDocument
 * @return Value of the CustomerDocument
 *
 */

  public CustomerDocumentObjectData getCustomerDocument( ) {
    return CustomerDocumentCreateIn;
  }

}
