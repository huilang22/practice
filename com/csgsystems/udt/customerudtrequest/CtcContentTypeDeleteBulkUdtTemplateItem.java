/*
 * Generated code DO NOT EDIT
 * Generated file: CtcContentTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcContentTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcContentTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcContentTypeObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcContentTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcContentTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcContentTypeObjectKeyData DeleteInIn) {
    super(id, context, "CtcContentTypeDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcContentType", CtcContentTypeObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcContentTypeObjectKeyData").get("CtcContentTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcContentType
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcContentType(CtcContentTypeObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcContentTypeObjectKeyHelper.fromMap(inputMap, "CtcContentType");
  }

/**
 *
 * Gets the CtcContentType
 * @return Value of the CtcContentType
 *
 */

  public CtcContentTypeObjectKeyData getCtcContentType( ) {
    return DeleteIn;
  }

}
