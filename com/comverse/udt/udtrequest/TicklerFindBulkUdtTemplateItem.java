/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerFindBulkUdtTemplateItem.java
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
 * Class used to create a TicklerFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TicklerFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TicklerObjectFilter findIn;
/**
 *
 * Constructor to create a  TicklerFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TicklerFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TicklerObjectFilter findInIn) {
    super(id, context, "TicklerFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Tickler", TicklerObjectHelper.toMap(findIn, new HashMap(), "Tickler").get("Tickler"));
    }
  }


/**
 *
 * Sets the Tickler
 * @param findInIn Value of the findIn
 *
 */

  public void setTickler(TicklerObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = TicklerObjectHelper.fromMapFilter(inputMap, "Tickler");
  }

/**
 *
 * Gets the Tickler
 * @return Value of the Tickler
 *
 */

  public TicklerObjectFilter getTickler( ) {
    return findIn;
  }

}
