/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CitInteractionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitInteractionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitInteractionObjectData citInteractionUpdateIn;
/**
 *
 * Constructor to create a  CitInteractionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitInteractionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitInteractionObjectData citInteractionUpdateInIn) {
    super(id, context, "CitInteractionUpdate");
    citInteractionUpdateIn = citInteractionUpdateInIn;
  }

  public void translateToMap() {
    if (citInteractionUpdateIn != null) {
      citInteractionUpdateIn.resetFlags(true, true);
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(citInteractionUpdateIn, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }


/**
 *
 * Sets the CitInteraction
 * @param citInteractionUpdateInIn Value of the citInteractionUpdateIn
 *
 */

  public void setCitInteraction(CitInteractionObjectData citInteractionUpdateInIn) {
    citInteractionUpdateIn = citInteractionUpdateInIn;
  }

  public void translateFromMap() {
    citInteractionUpdateIn = CitInteractionObjectHelper.fromMap(inputMap, "CitInteraction");
  }

/**
 *
 * Gets the CitInteraction
 * @return Value of the CitInteraction
 *
 */

  public CitInteractionObjectData getCitInteraction( ) {
    return citInteractionUpdateIn;
  }

}
