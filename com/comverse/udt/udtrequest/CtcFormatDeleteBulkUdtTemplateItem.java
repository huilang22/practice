/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcFormatDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFormatDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFormatObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcFormatDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFormatDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatObjectKeyData DeleteInIn) {
    super(id, context, "CtcFormatDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcFormat", CtcFormatObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcFormatObjectKeyData").get("CtcFormatObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcFormat
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcFormat(CtcFormatObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcFormatObjectKeyHelper.fromMap(inputMap, "CtcFormat");
  }

/**
 *
 * Gets the CtcFormat
 * @return Value of the CtcFormat
 *
 */

  public CtcFormatObjectKeyData getCtcFormat( ) {
    return DeleteIn;
  }

}
