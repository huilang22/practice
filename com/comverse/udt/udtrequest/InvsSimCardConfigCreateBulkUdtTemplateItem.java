/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimCardConfigCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimCardConfigCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimCardConfigObjectData InvsSimCardConfigCreateIn;
/**
 *
 * Constructor to create a  InvsSimCardConfigCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimCardConfigCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigObjectData InvsSimCardConfigCreateInIn) {
    super(id, context, "InvsSimCardConfigCreate");
    InvsSimCardConfigCreateIn = InvsSimCardConfigCreateInIn;
  }

  public void translateToMap() {
    if (InvsSimCardConfigCreateIn != null) {
      InvsSimCardConfigCreateIn.resetFlags(true, true);
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(InvsSimCardConfigCreateIn, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }


/**
 *
 * Sets the InvsSimCardConfig
 * @param InvsSimCardConfigCreateInIn Value of the InvsSimCardConfigCreateIn
 *
 */

  public void setInvsSimCardConfig(InvsSimCardConfigObjectData InvsSimCardConfigCreateInIn) {
    InvsSimCardConfigCreateIn = InvsSimCardConfigCreateInIn;
  }

  public void translateFromMap() {
    InvsSimCardConfigCreateIn = InvsSimCardConfigObjectHelper.fromMap(inputMap, "InvsSimCardConfig");
  }

/**
 *
 * Gets the InvsSimCardConfig
 * @return Value of the InvsSimCardConfig
 *
 */

  public InvsSimCardConfigObjectData getInvsSimCardConfig( ) {
    return InvsSimCardConfigCreateIn;
  }

}
