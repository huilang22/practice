/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsBlacklistGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsBlacklistGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsBlacklistObjectKeyData InvsBlacklistGetIn;
/**
 *
 * Constructor to create a  InvsBlacklistGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsBlacklistGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsBlacklistObjectKeyData InvsBlacklistGetInIn) {
    super(id, context, "InvsBlacklistGet");
    InvsBlacklistGetIn = InvsBlacklistGetInIn;
  }

  public void translateToMap() {
    if (InvsBlacklistGetIn != null) {
      InvsBlacklistGetIn.resetFlags(true, true);
      addInput("InvsBlacklist", InvsBlacklistObjectKeyHelper.toMap(InvsBlacklistGetIn, new HashMap(), "InvsBlacklistObjectKeyData").get("InvsBlacklistObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsBlacklist
 * @param InvsBlacklistGetInIn Value of the InvsBlacklistGetIn
 *
 */

  public void setInvsBlacklist(InvsBlacklistObjectKeyData InvsBlacklistGetInIn) {
    InvsBlacklistGetIn = InvsBlacklistGetInIn;
  }

  public void translateFromMap() {
    InvsBlacklistGetIn = InvsBlacklistObjectKeyHelper.fromMap(inputMap, "InvsBlacklist");
  }

/**
 *
 * Gets the InvsBlacklist
 * @return Value of the InvsBlacklist
 *
 */

  public InvsBlacklistObjectKeyData getInvsBlacklist( ) {
    return InvsBlacklistGetIn;
  }

}
