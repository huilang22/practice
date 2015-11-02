/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVanityCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsVanityCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVanityCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVanityObjectData InvsVanityCreateIn;
/**
 *
 * Constructor to create a  InvsVanityCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVanityCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVanityObjectData InvsVanityCreateInIn) {
    super(id, context, "InvsVanityCreate");
    InvsVanityCreateIn = InvsVanityCreateInIn;
  }

  public void translateToMap() {
    if (InvsVanityCreateIn != null) {
      InvsVanityCreateIn.resetFlags(true, true);
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(InvsVanityCreateIn, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }


/**
 *
 * Sets the InvsVanity
 * @param InvsVanityCreateInIn Value of the InvsVanityCreateIn
 *
 */

  public void setInvsVanity(InvsVanityObjectData InvsVanityCreateInIn) {
    InvsVanityCreateIn = InvsVanityCreateInIn;
  }

  public void translateFromMap() {
    InvsVanityCreateIn = InvsVanityObjectHelper.fromMap(inputMap, "InvsVanity");
  }

/**
 *
 * Gets the InvsVanity
 * @return Value of the InvsVanity
 *
 */

  public InvsVanityObjectData getInvsVanity( ) {
    return InvsVanityCreateIn;
  }

}
