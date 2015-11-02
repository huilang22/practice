/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentFindBulkUdtTemplateItem.java
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
 * Class used to create a CustomerDocumentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerDocumentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerDocumentObjectFilter CustomerDocumentFindIn;
/**
 *
 * Constructor to create a  CustomerDocumentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerDocumentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDocumentObjectFilter CustomerDocumentFindInIn) {
    super(id, context, "CustomerDocumentFind");
    CustomerDocumentFindIn = CustomerDocumentFindInIn;
  }

  public void translateToMap() {
    if (CustomerDocumentFindIn != null) {
      Integer index =  CustomerDocumentFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(CustomerDocumentFindIn, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }


/**
 *
 * Sets the CustomerDocument
 * @param CustomerDocumentFindInIn Value of the CustomerDocumentFindIn
 *
 */

  public void setCustomerDocument(CustomerDocumentObjectFilter CustomerDocumentFindInIn) {
    CustomerDocumentFindIn = CustomerDocumentFindInIn;
  }

  public void translateFromMap() {
    CustomerDocumentFindIn = CustomerDocumentObjectHelper.fromMapFilter(inputMap, "CustomerDocument");
  }

/**
 *
 * Gets the CustomerDocument
 * @return Value of the CustomerDocument
 *
 */

  public CustomerDocumentObjectFilter getCustomerDocument( ) {
    return CustomerDocumentFindIn;
  }

}
