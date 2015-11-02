/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a TicklerCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class TicklerCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TicklerObjectData ticCrIn;
/**
 *
 * Constructor to create a  TicklerCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TicklerCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, TicklerObjectData ticCrInIn) {
    super(id, context, "TicklerCreate");
    ticCrIn = ticCrInIn;
  }

  public void translateToMap() {
    if (ticCrIn != null) {
      ticCrIn.resetFlags(true, true);
      addInput("Tickler", TicklerObjectHelper.toMap(ticCrIn, new HashMap(), "Tickler").get("Tickler"));
    }
  }


/**
 *
 * Sets the Tickler
 * @param ticCrInIn Value of the ticCrIn
 *
 */

  public void setTickler(TicklerObjectData ticCrInIn) {
    ticCrIn = ticCrInIn;
  }

  public void translateFromMap() {
    ticCrIn = TicklerObjectHelper.fromMap(inputMap, "Tickler");
  }

/**
 *
 * Gets the Tickler
 * @return Value of the Tickler
 *
 */

  public TicklerObjectData getTickler( ) {
    return ticCrIn;
  }

}
