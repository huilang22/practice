/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcItemDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemObjectKeyData DeleteInIn) {
    super(id, context, "CtcItemDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcItem", CtcItemObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemObjectKeyData").get("CtcItemObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItem
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcItem(CtcItemObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcItemObjectKeyHelper.fromMap(inputMap, "CtcItem");
  }

/**
 *
 * Gets the CtcItem
 * @return Value of the CtcItem
 *
 */

  public CtcItemObjectKeyData getCtcItem( ) {
    return DeleteIn;
  }

}
