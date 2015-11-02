/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionFindBulkUdtTemplateItem.java
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
 * Class used to create a UsageJurisdictionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageJurisdictionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageJurisdictionObjectFilter UsageJurisdictionFindIn;
/**
 *
 * Constructor to create a  UsageJurisdictionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageJurisdictionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageJurisdictionObjectFilter UsageJurisdictionFindInIn) {
    super(id, context, "UsageJurisdictionFind");
    UsageJurisdictionFindIn = UsageJurisdictionFindInIn;
  }

  public void translateToMap() {
    if (UsageJurisdictionFindIn != null) {
      Integer index =  UsageJurisdictionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(UsageJurisdictionFindIn, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }


/**
 *
 * Sets the UsageJurisdiction
 * @param UsageJurisdictionFindInIn Value of the UsageJurisdictionFindIn
 *
 */

  public void setUsageJurisdiction(UsageJurisdictionObjectFilter UsageJurisdictionFindInIn) {
    UsageJurisdictionFindIn = UsageJurisdictionFindInIn;
  }

  public void translateFromMap() {
    UsageJurisdictionFindIn = UsageJurisdictionObjectHelper.fromMapFilter(inputMap, "UsageJurisdiction");
  }

/**
 *
 * Gets the UsageJurisdiction
 * @return Value of the UsageJurisdiction
 *
 */

  public UsageJurisdictionObjectFilter getUsageJurisdiction( ) {
    return UsageJurisdictionFindIn;
  }

}
