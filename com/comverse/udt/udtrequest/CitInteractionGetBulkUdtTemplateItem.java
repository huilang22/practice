/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionGetBulkUdtTemplateItem.java
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
 * Class used to create a CitInteractionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CitInteractionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitInteractionObjectKeyData citInteractionGetIn;
/**
 *
 * Constructor to create a  CitInteractionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitInteractionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CitInteractionObjectKeyData citInteractionGetInIn) {
    super(id, context, "CitInteractionGet");
    citInteractionGetIn = citInteractionGetInIn;
  }

  public void translateToMap() {
    if (citInteractionGetIn != null) {
      citInteractionGetIn.resetFlags(true, true);
      addInput("CitInteraction", CitInteractionObjectKeyHelper.toMap(citInteractionGetIn, new HashMap(), "CitInteractionObjectKeyData").get("CitInteractionObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitInteraction
 * @param citInteractionGetInIn Value of the citInteractionGetIn
 *
 */

  public void setCitInteraction(CitInteractionObjectKeyData citInteractionGetInIn) {
    citInteractionGetIn = citInteractionGetInIn;
  }

  public void translateFromMap() {
    citInteractionGetIn = CitInteractionObjectKeyHelper.fromMap(inputMap, "CitInteraction");
  }

/**
 *
 * Gets the CitInteraction
 * @return Value of the CitInteraction
 *
 */

  public CitInteractionObjectKeyData getCitInteraction( ) {
    return citInteractionGetIn;
  }

}
