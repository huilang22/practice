/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlDeleteBulkUdtTemplateItem.java
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
