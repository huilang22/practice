/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillMessagesFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a AbiBillMessagesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiBillMessagesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiBillMessagesObjectFilter AbiBillMessagesFindIn;
/**
 *
 * Constructor to create a  AbiBillMessagesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiBillMessagesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiBillMessagesObjectFilter AbiBillMessagesFindInIn) {
    super(id, context, "AbiBillMessagesFind");
    AbiBillMessagesFindIn = AbiBillMessagesFindInIn;
  }

  public void translateToMap() {
    if (AbiBillMessagesFindIn != null) {
      Integer index =  AbiBillMessagesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AbiBillMessages", AbiBillMessagesObjectHelper.toMap(AbiBillMessagesFindIn, new HashMap(), "AbiBillMessages").get("AbiBillMessages"));
    }
  }


/**
 *
 * Sets the AbiBillMessages
 * @param AbiBillMessagesFindInIn Value of the AbiBillMessagesFindIn
 *
 */

  public void setAbiBillMessages(AbiBillMessagesObjectFilter AbiBillMessagesFindInIn) {
    AbiBillMessagesFindIn = AbiBillMessagesFindInIn;
  }

  public void translateFromMap() {
    AbiBillMessagesFindIn = AbiBillMessagesObjectHelper.fromMapFilter(inputMap, "AbiBillMessages");
  }

/**
 *
 * Gets the AbiBillMessages
 * @return Value of the AbiBillMessages
 *
 */

  public AbiBillMessagesObjectFilter getAbiBillMessages( ) {
    return AbiBillMessagesFindIn;
  }

}
