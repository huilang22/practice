/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * Class used to create a CitInteractionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CitInteractionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitInteractionObjectKeyData citInteractionDeleteIn;
/**
 *
 * Constructor to create a  CitInteractionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitInteractionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CitInteractionObjectKeyData citInteractionDeleteInIn) {
    super(id, context, "CitInteractionDelete");
    citInteractionDeleteIn = citInteractionDeleteInIn;
  }

  public void translateToMap() {
    if (citInteractionDeleteIn != null) {
      citInteractionDeleteIn.resetFlags(true, true);
      addInput("CitInteraction", CitInteractionObjectKeyHelper.toMap(citInteractionDeleteIn, new HashMap(), "CitInteractionObjectKeyData").get("CitInteractionObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitInteraction
 * @param citInteractionDeleteInIn Value of the citInteractionDeleteIn
 *
 */

  public void setCitInteraction(CitInteractionObjectKeyData citInteractionDeleteInIn) {
    citInteractionDeleteIn = citInteractionDeleteInIn;
  }

  public void translateFromMap() {
    citInteractionDeleteIn = CitInteractionObjectKeyHelper.fromMap(inputMap, "CitInteraction");
  }

/**
 *
 * Gets the CitInteraction
 * @return Value of the CitInteraction
 *
 */

  public CitInteractionObjectKeyData getCitInteraction( ) {
    return citInteractionDeleteIn;
  }

}
