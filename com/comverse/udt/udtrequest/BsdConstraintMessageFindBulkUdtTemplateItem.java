/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdConstraintMessageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdConstraintMessageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdConstraintMessageObjectFilter bsdConstraintMessageFindIn;
/**
 *
 * Constructor to create a  BsdConstraintMessageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdConstraintMessageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintMessageObjectFilter bsdConstraintMessageFindInIn) {
    super(id, context, "BsdConstraintMessageFind");
    bsdConstraintMessageFindIn = bsdConstraintMessageFindInIn;
  }

  public void translateToMap() {
    if (bsdConstraintMessageFindIn != null) {
      Integer index =  bsdConstraintMessageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectHelper.toMap(bsdConstraintMessageFindIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }


/**
 *
 * Sets the BsdConstraintMessage
 * @param bsdConstraintMessageFindInIn Value of the bsdConstraintMessageFindIn
 *
 */

  public void setBsdConstraintMessage(BsdConstraintMessageObjectFilter bsdConstraintMessageFindInIn) {
    bsdConstraintMessageFindIn = bsdConstraintMessageFindInIn;
  }

  public void translateFromMap() {
    bsdConstraintMessageFindIn = BsdConstraintMessageObjectHelper.fromMapFilter(inputMap, "BsdConstraintMessage");
  }

/**
 *
 * Gets the BsdConstraintMessage
 * @return Value of the BsdConstraintMessage
 *
 */

  public BsdConstraintMessageObjectFilter getBsdConstraintMessage( ) {
    return bsdConstraintMessageFindIn;
  }

}
