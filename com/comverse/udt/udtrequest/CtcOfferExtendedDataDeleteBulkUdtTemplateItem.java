/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferExtendedDataDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferExtendedDataDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferExtendedDataObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcOfferExtendedDataDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferExtendedDataDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferExtendedDataObjectKeyData DeleteInIn) {
    super(id, context, "CtcOfferExtendedDataDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOfferExtendedDataObjectKeyData").get("CtcOfferExtendedDataObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOfferExtendedData
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcOfferExtendedData(CtcOfferExtendedDataObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcOfferExtendedDataObjectKeyHelper.fromMap(inputMap, "CtcOfferExtendedData");
  }

/**
 *
 * Gets the CtcOfferExtendedData
 * @return Value of the CtcOfferExtendedData
 *
 */

  public CtcOfferExtendedDataObjectKeyData getCtcOfferExtendedData( ) {
    return DeleteIn;
  }

}
