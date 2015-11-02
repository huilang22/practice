/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemExtendedDataDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemExtendedDataDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemExtendedDataObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcItemExtendedDataDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemExtendedDataDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemExtendedDataObjectKeyData DeleteInIn) {
    super(id, context, "CtcItemExtendedDataDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemExtendedDataObjectKeyData").get("CtcItemExtendedDataObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItemExtendedData
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcItemExtendedData(CtcItemExtendedDataObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcItemExtendedDataObjectKeyHelper.fromMap(inputMap, "CtcItemExtendedData");
  }

/**
 *
 * Gets the CtcItemExtendedData
 * @return Value of the CtcItemExtendedData
 *
 */

  public CtcItemExtendedDataObjectKeyData getCtcItemExtendedData( ) {
    return DeleteIn;
  }

}
