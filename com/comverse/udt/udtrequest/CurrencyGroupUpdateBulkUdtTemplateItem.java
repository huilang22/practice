/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CurrencyGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CurrencyGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CurrencyGroupObjectData RCGUpdateIn;
/**
 *
 * Constructor to create a  CurrencyGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CurrencyGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CurrencyGroupObjectData RCGUpdateInIn) {
    super(id, context, "CurrencyGroupUpdate");
    RCGUpdateIn = RCGUpdateInIn;
  }

  public void translateToMap() {
    if (RCGUpdateIn != null) {
      RCGUpdateIn.resetFlags(true, true);
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(RCGUpdateIn, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }


/**
 *
 * Sets the CurrencyGroup
 * @param RCGUpdateInIn Value of the RCGUpdateIn
 *
 */

  public void setCurrencyGroup(CurrencyGroupObjectData RCGUpdateInIn) {
    RCGUpdateIn = RCGUpdateInIn;
  }

  public void translateFromMap() {
    RCGUpdateIn = CurrencyGroupObjectHelper.fromMap(inputMap, "CurrencyGroup");
  }

/**
 *
 * Gets the CurrencyGroup
 * @return Value of the CurrencyGroup
 *
 */

  public CurrencyGroupObjectData getCurrencyGroup( ) {
    return RCGUpdateIn;
  }

}
