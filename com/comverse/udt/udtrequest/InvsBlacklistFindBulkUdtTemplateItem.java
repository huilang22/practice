/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsBlacklistFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsBlacklistFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsBlacklistObjectFilter InvsBlacklistFindIn;
/**
 *
 * Constructor to create a  InvsBlacklistFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsBlacklistFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsBlacklistObjectFilter InvsBlacklistFindInIn) {
    super(id, context, "InvsBlacklistFind");
    InvsBlacklistFindIn = InvsBlacklistFindInIn;
  }

  public void translateToMap() {
    if (InvsBlacklistFindIn != null) {
      Integer index =  InvsBlacklistFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(InvsBlacklistFindIn, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }


/**
 *
 * Sets the InvsBlacklist
 * @param InvsBlacklistFindInIn Value of the InvsBlacklistFindIn
 *
 */

  public void setInvsBlacklist(InvsBlacklistObjectFilter InvsBlacklistFindInIn) {
    InvsBlacklistFindIn = InvsBlacklistFindInIn;
  }

  public void translateFromMap() {
    InvsBlacklistFindIn = InvsBlacklistObjectHelper.fromMapFilter(inputMap, "InvsBlacklist");
  }

/**
 *
 * Gets the InvsBlacklist
 * @return Value of the InvsBlacklist
 *
 */

  public InvsBlacklistObjectFilter getInvsBlacklist( ) {
    return InvsBlacklistFindIn;
  }

}
