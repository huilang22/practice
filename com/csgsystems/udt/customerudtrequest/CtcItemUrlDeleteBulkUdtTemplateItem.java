/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemUrlDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcItemUrlDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemUrlDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemUrlObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcItemUrlDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemUrlDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemUrlObjectKeyData DeleteInIn) {
    super(id, context, "CtcItemUrlDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcItemUrl", CtcItemUrlObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemUrlObjectKeyData").get("CtcItemUrlObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItemUrl
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcItemUrl(CtcItemUrlObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcItemUrlObjectKeyHelper.fromMap(inputMap, "CtcItemUrl");
  }

/**
 *
 * Gets the CtcItemUrl
 * @return Value of the CtcItemUrl
 *
 */

  public CtcItemUrlObjectKeyData getCtcItemUrl( ) {
    return DeleteIn;
  }

}
