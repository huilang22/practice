/*
 * Generated code DO NOT EDIT
 * Generated file: InvsBlacklistCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsBlacklistCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsBlacklistCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsBlacklistObjectData InvsBlacklistCreateIn;
/**
 *
 * Constructor to create a  InvsBlacklistCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsBlacklistCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsBlacklistObjectData InvsBlacklistCreateInIn) {
    super(id, context, "InvsBlacklistCreate");
    InvsBlacklistCreateIn = InvsBlacklistCreateInIn;
  }

  public void translateToMap() {
    if (InvsBlacklistCreateIn != null) {
      InvsBlacklistCreateIn.resetFlags(true, true);
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(InvsBlacklistCreateIn, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }


/**
 *
 * Sets the InvsBlacklist
 * @param InvsBlacklistCreateInIn Value of the InvsBlacklistCreateIn
 *
 */

  public void setInvsBlacklist(InvsBlacklistObjectData InvsBlacklistCreateInIn) {
    InvsBlacklistCreateIn = InvsBlacklistCreateInIn;
  }

  public void translateFromMap() {
    InvsBlacklistCreateIn = InvsBlacklistObjectHelper.fromMap(inputMap, "InvsBlacklist");
  }

/**
 *
 * Gets the InvsBlacklist
 * @return Value of the InvsBlacklist
 *
 */

  public InvsBlacklistObjectData getInvsBlacklist( ) {
    return InvsBlacklistCreateIn;
  }

}
