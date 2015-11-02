/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionGetBulkUdtTemplateItem.java
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
 * Class used to create a UsageJurisdictionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageJurisdictionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageJurisdictionObjectKeyData UsageJurisdictionGetIn;
/**
 *
 * Constructor to create a  UsageJurisdictionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageJurisdictionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageJurisdictionObjectKeyData UsageJurisdictionGetInIn) {
    super(id, context, "UsageJurisdictionGet");
    UsageJurisdictionGetIn = UsageJurisdictionGetInIn;
  }

  public void translateToMap() {
    if (UsageJurisdictionGetIn != null) {
      UsageJurisdictionGetIn.resetFlags(true, true);
      addInput("UsageJurisdiction", UsageJurisdictionObjectKeyHelper.toMap(UsageJurisdictionGetIn, new HashMap(), "UsageJurisdictionObjectKeyData").get("UsageJurisdictionObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsageJurisdiction
 * @param UsageJurisdictionGetInIn Value of the UsageJurisdictionGetIn
 *
 */

  public void setUsageJurisdiction(UsageJurisdictionObjectKeyData UsageJurisdictionGetInIn) {
    UsageJurisdictionGetIn = UsageJurisdictionGetInIn;
  }

  public void translateFromMap() {
    UsageJurisdictionGetIn = UsageJurisdictionObjectKeyHelper.fromMap(inputMap, "UsageJurisdiction");
  }

/**
 *
 * Gets the UsageJurisdiction
 * @return Value of the UsageJurisdiction
 *
 */

  public UsageJurisdictionObjectKeyData getUsageJurisdiction( ) {
    return UsageJurisdictionGetIn;
  }

}
