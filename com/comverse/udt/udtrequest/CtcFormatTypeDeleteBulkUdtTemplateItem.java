/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcFormatTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFormatTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFormatTypeObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcFormatTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFormatTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatTypeObjectKeyData DeleteInIn) {
    super(id, context, "CtcFormatTypeDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcFormatType", CtcFormatTypeObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcFormatTypeObjectKeyData").get("CtcFormatTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcFormatType
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcFormatType(CtcFormatTypeObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcFormatTypeObjectKeyHelper.fromMap(inputMap, "CtcFormatType");
  }

/**
 *
 * Gets the CtcFormatType
 * @return Value of the CtcFormatType
 *
 */

  public CtcFormatTypeObjectKeyData getCtcFormatType( ) {
    return DeleteIn;
  }

}
