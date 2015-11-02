/*
 * Generated code DO NOT EDIT
 * Generated file: InvsBlacklistUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a InvsBlacklistUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsBlacklistUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsBlacklistObjectData InvsBlacklistUpdateIn;
/**
 *
 * Constructor to create a  InvsBlacklistUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsBlacklistUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsBlacklistObjectData InvsBlacklistUpdateInIn) {
    super(id, context, "InvsBlacklistUpdate");
    InvsBlacklistUpdateIn = InvsBlacklistUpdateInIn;
  }

  public void translateToMap() {
    if (InvsBlacklistUpdateIn != null) {
      InvsBlacklistUpdateIn.resetFlags(true, true);
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(InvsBlacklistUpdateIn, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }


/**
 *
 * Sets the InvsBlacklist
 * @param InvsBlacklistUpdateInIn Value of the InvsBlacklistUpdateIn
 *
 */

  public void setInvsBlacklist(InvsBlacklistObjectData InvsBlacklistUpdateInIn) {
    InvsBlacklistUpdateIn = InvsBlacklistUpdateInIn;
  }

  public void translateFromMap() {
    InvsBlacklistUpdateIn = InvsBlacklistObjectHelper.fromMap(inputMap, "InvsBlacklist");
  }

/**
 *
 * Gets the InvsBlacklist
 * @return Value of the InvsBlacklist
 *
 */

  public InvsBlacklistObjectData getInvsBlacklist( ) {
    return InvsBlacklistUpdateIn;
  }

}
