/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemFormatDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemFormatDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemFormatDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemFormatObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcItemFormatDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemFormatDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemFormatObjectKeyData DeleteInIn) {
    super(id, context, "CtcItemFormatDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcItemFormat", CtcItemFormatObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemFormatObjectKeyData").get("CtcItemFormatObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItemFormat
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcItemFormat(CtcItemFormatObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcItemFormatObjectKeyHelper.fromMap(inputMap, "CtcItemFormat");
  }

/**
 *
 * Gets the CtcItemFormat
 * @return Value of the CtcItemFormat
 *
 */

  public CtcItemFormatObjectKeyData getCtcItemFormat( ) {
    return DeleteIn;
  }

}
