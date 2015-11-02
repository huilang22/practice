/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionFindBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a BsdActionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdActionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdActionObjectFilter bsdActionFindIn;
/**
 *
 * Constructor to create a  BsdActionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdActionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdActionObjectFilter bsdActionFindInIn) {
    super(id, context, "BsdActionFind");
    bsdActionFindIn = bsdActionFindInIn;
  }

  public void translateToMap() {
    if (bsdActionFindIn != null) {
      Integer index =  bsdActionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAction", BsdActionObjectHelper.toMap(bsdActionFindIn, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }


/**
 *
 * Sets the BsdAction
 * @param bsdActionFindInIn Value of the bsdActionFindIn
 *
 */

  public void setBsdAction(BsdActionObjectFilter bsdActionFindInIn) {
    bsdActionFindIn = bsdActionFindInIn;
  }

  public void translateFromMap() {
    bsdActionFindIn = BsdActionObjectHelper.fromMapFilter(inputMap, "BsdAction");
  }

/**
 *
 * Gets the BsdAction
 * @return Value of the BsdAction
 *
 */

  public BsdActionObjectFilter getBsdAction( ) {
    return bsdActionFindIn;
  }

}
