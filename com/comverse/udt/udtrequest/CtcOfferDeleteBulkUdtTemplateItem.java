/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcOfferDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferObjectKeyData DeleteInIn) {
    super(id, context, "CtcOfferDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOfferObjectKeyData").get("CtcOfferObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOffer
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcOffer(CtcOfferObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcOfferObjectKeyHelper.fromMap(inputMap, "CtcOffer");
  }

/**
 *
 * Gets the CtcOffer
 * @return Value of the CtcOffer
 *
 */

  public CtcOfferObjectKeyData getCtcOffer( ) {
    return DeleteIn;
  }

}
