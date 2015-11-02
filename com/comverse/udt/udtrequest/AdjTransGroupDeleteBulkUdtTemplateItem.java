/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AdjTransGroupDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjTransGroupDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ATGObjectKeyData ADGDeleteIn;
/**
 *
 * Constructor to create a  AdjTransGroupDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjTransGroupDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ATGObjectKeyData ADGDeleteInIn) {
    super(id, context, "AdjTransGroupDelete");
    ADGDeleteIn = ADGDeleteInIn;
  }

  public void translateToMap() {
    if (ADGDeleteIn != null) {
      ADGDeleteIn.resetFlags(true, true);
      addInput("AdjTransGroup", ATGObjectKeyHelper.toMap(ADGDeleteIn, new HashMap(), "ATGObjectKeyData").get("ATGObjectKeyData"));
    }
  }


/**
 *
 * Sets the AdjTransGroup
 * @param ADGDeleteInIn Value of the ADGDeleteIn
 *
 */

  public void setAdjTransGroup(ATGObjectKeyData ADGDeleteInIn) {
    ADGDeleteIn = ADGDeleteInIn;
  }

  public void translateFromMap() {
    ADGDeleteIn = ATGObjectKeyHelper.fromMap(inputMap, "AdjTransGroup");
  }

/**
 *
 * Gets the AdjTransGroup
 * @return Value of the AdjTransGroup
 *
 */

  public ATGObjectKeyData getAdjTransGroup( ) {
    return ADGDeleteIn;
  }

}
