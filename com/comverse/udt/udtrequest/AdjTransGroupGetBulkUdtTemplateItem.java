/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a AdjTransGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjTransGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ATGObjectKeyData ADGGetIn;
/**
 *
 * Constructor to create a  AdjTransGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjTransGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ATGObjectKeyData ADGGetInIn) {
    super(id, context, "AdjTransGroupGet");
    ADGGetIn = ADGGetInIn;
  }

  public void translateToMap() {
    if (ADGGetIn != null) {
      ADGGetIn.resetFlags(true, true);
      addInput("AdjTransGroup", ATGObjectKeyHelper.toMap(ADGGetIn, new HashMap(), "ATGObjectKeyData").get("ATGObjectKeyData"));
    }
  }


/**
 *
 * Sets the AdjTransGroup
 * @param ADGGetInIn Value of the ADGGetIn
 *
 */

  public void setAdjTransGroup(ATGObjectKeyData ADGGetInIn) {
    ADGGetIn = ADGGetInIn;
  }

  public void translateFromMap() {
    ADGGetIn = ATGObjectKeyHelper.fromMap(inputMap, "AdjTransGroup");
  }

/**
 *
 * Gets the AdjTransGroup
 * @return Value of the AdjTransGroup
 *
 */

  public ATGObjectKeyData getAdjTransGroup( ) {
    return ADGGetIn;
  }

}
