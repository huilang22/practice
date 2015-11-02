/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionCreateBulkUdtTemplateItem.java
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
 * Class used to create a CitInteractionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitInteractionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitInteractionObjectData citInteractionCreateIn;
/**
 *
 * Constructor to create a  CitInteractionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitInteractionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitInteractionObjectData citInteractionCreateInIn) {
    super(id, context, "CitInteractionCreate");
    citInteractionCreateIn = citInteractionCreateInIn;
  }

  public void translateToMap() {
    if (citInteractionCreateIn != null) {
      citInteractionCreateIn.resetFlags(true, true);
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(citInteractionCreateIn, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }


/**
 *
 * Sets the CitInteraction
 * @param citInteractionCreateInIn Value of the citInteractionCreateIn
 *
 */

  public void setCitInteraction(CitInteractionObjectData citInteractionCreateInIn) {
    citInteractionCreateIn = citInteractionCreateInIn;
  }

  public void translateFromMap() {
    citInteractionCreateIn = CitInteractionObjectHelper.fromMap(inputMap, "CitInteraction");
  }

/**
 *
 * Gets the CitInteraction
 * @return Value of the CitInteraction
 *
 */

  public CitInteractionObjectData getCitInteraction( ) {
    return citInteractionCreateIn;
  }

}
