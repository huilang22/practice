/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimCardConfigGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimCardConfigGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimCardConfigObjectKeyData InvsSimCardConfigGetIn;
/**
 *
 * Constructor to create a  InvsSimCardConfigGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimCardConfigGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigObjectKeyData InvsSimCardConfigGetInIn) {
    super(id, context, "InvsSimCardConfigGet");
    InvsSimCardConfigGetIn = InvsSimCardConfigGetInIn;
  }

  public void translateToMap() {
    if (InvsSimCardConfigGetIn != null) {
      InvsSimCardConfigGetIn.resetFlags(true, true);
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectKeyHelper.toMap(InvsSimCardConfigGetIn, new HashMap(), "InvsSimCardConfigObjectKeyData").get("InvsSimCardConfigObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsSimCardConfig
 * @param InvsSimCardConfigGetInIn Value of the InvsSimCardConfigGetIn
 *
 */

  public void setInvsSimCardConfig(InvsSimCardConfigObjectKeyData InvsSimCardConfigGetInIn) {
    InvsSimCardConfigGetIn = InvsSimCardConfigGetInIn;
  }

  public void translateFromMap() {
    InvsSimCardConfigGetIn = InvsSimCardConfigObjectKeyHelper.fromMap(inputMap, "InvsSimCardConfig");
  }

/**
 *
 * Gets the InvsSimCardConfig
 * @return Value of the InvsSimCardConfig
 *
 */

  public InvsSimCardConfigObjectKeyData getInvsSimCardConfig( ) {
    return InvsSimCardConfigGetIn;
  }

}
