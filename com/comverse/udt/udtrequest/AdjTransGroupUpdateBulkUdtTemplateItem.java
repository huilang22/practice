/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AdjTransGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjTransGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ATGObjectData ADGUpdateIn;
/**
 *
 * Constructor to create a  AdjTransGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjTransGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ATGObjectData ADGUpdateInIn) {
    super(id, context, "AdjTransGroupUpdate");
    ADGUpdateIn = ADGUpdateInIn;
  }

  public void translateToMap() {
    if (ADGUpdateIn != null) {
      ADGUpdateIn.resetFlags(true, true);
      addInput("AdjTransGroup", ATGObjectHelper.toMap(ADGUpdateIn, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }


/**
 *
 * Sets the AdjTransGroup
 * @param ADGUpdateInIn Value of the ADGUpdateIn
 *
 */

  public void setAdjTransGroup(ATGObjectData ADGUpdateInIn) {
    ADGUpdateIn = ADGUpdateInIn;
  }

  public void translateFromMap() {
    ADGUpdateIn = ATGObjectHelper.fromMap(inputMap, "AdjTransGroup");
  }

/**
 *
 * Gets the AdjTransGroup
 * @return Value of the AdjTransGroup
 *
 */

  public ATGObjectData getAdjTransGroup( ) {
    return ADGUpdateIn;
  }

}
