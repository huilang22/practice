/*
 * Generated code DO NOT EDIT
 * Generated file: CtcUrlTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcUrlTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcUrlTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcUrlTypeObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcUrlTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcUrlTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcUrlTypeObjectKeyData DeleteInIn) {
    super(id, context, "CtcUrlTypeDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcUrlType", CtcUrlTypeObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcUrlTypeObjectKeyData").get("CtcUrlTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcUrlType
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcUrlType(CtcUrlTypeObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcUrlTypeObjectKeyHelper.fromMap(inputMap, "CtcUrlType");
  }

/**
 *
 * Gets the CtcUrlType
 * @return Value of the CtcUrlType
 *
 */

  public CtcUrlTypeObjectKeyData getCtcUrlType( ) {
    return DeleteIn;
  }

}
