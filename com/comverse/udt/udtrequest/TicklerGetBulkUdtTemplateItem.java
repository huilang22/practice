/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerGetBulkUdtTemplateItem.java
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
 * Class used to create a TicklerGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TicklerGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TicklerObjectKeyData getIn;
/**
 *
 * Constructor to create a  TicklerGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TicklerGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TicklerObjectKeyData getInIn) {
    super(id, context, "TicklerGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("Tickler", TicklerObjectKeyHelper.toMap(getIn, new HashMap(), "TicklerObjectKeyData").get("TicklerObjectKeyData"));
    }
  }


/**
 *
 * Sets the Tickler
 * @param getInIn Value of the getIn
 *
 */

  public void setTickler(TicklerObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = TicklerObjectKeyHelper.fromMap(inputMap, "Tickler");
  }

/**
 *
 * Gets the Tickler
 * @return Value of the Tickler
 *
 */

  public TicklerObjectKeyData getTickler( ) {
    return getIn;
  }

}
