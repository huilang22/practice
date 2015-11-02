/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVanityUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsVanityUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVanityUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVanityObjectData InvsVanityUpdateIn;
/**
 *
 * Constructor to create a  InvsVanityUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVanityUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVanityObjectData InvsVanityUpdateInIn) {
    super(id, context, "InvsVanityUpdate");
    InvsVanityUpdateIn = InvsVanityUpdateInIn;
  }

  public void translateToMap() {
    if (InvsVanityUpdateIn != null) {
      InvsVanityUpdateIn.resetFlags(true, true);
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(InvsVanityUpdateIn, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }


/**
 *
 * Sets the InvsVanity
 * @param InvsVanityUpdateInIn Value of the InvsVanityUpdateIn
 *
 */

  public void setInvsVanity(InvsVanityObjectData InvsVanityUpdateInIn) {
    InvsVanityUpdateIn = InvsVanityUpdateInIn;
  }

  public void translateFromMap() {
    InvsVanityUpdateIn = InvsVanityObjectHelper.fromMap(inputMap, "InvsVanity");
  }

/**
 *
 * Gets the InvsVanity
 * @return Value of the InvsVanity
 *
 */

  public InvsVanityObjectData getInvsVanity( ) {
    return InvsVanityUpdateIn;
  }

}
