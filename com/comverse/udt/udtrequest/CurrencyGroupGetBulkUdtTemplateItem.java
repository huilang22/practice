/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a CurrencyGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CurrencyGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CurrencyGroupObjectKeyData RCGGetIn;
/**
 *
 * Constructor to create a  CurrencyGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CurrencyGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CurrencyGroupObjectKeyData RCGGetInIn) {
    super(id, context, "CurrencyGroupGet");
    RCGGetIn = RCGGetInIn;
  }

  public void translateToMap() {
    if (RCGGetIn != null) {
      RCGGetIn.resetFlags(true, true);
      addInput("CurrencyGroup", CurrencyGroupObjectKeyHelper.toMap(RCGGetIn, new HashMap(), "CurrencyGroupObjectKeyData").get("CurrencyGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the CurrencyGroup
 * @param RCGGetInIn Value of the RCGGetIn
 *
 */

  public void setCurrencyGroup(CurrencyGroupObjectKeyData RCGGetInIn) {
    RCGGetIn = RCGGetInIn;
  }

  public void translateFromMap() {
    RCGGetIn = CurrencyGroupObjectKeyHelper.fromMap(inputMap, "CurrencyGroup");
  }

/**
 *
 * Gets the CurrencyGroup
 * @return Value of the CurrencyGroup
 *
 */

  public CurrencyGroupObjectKeyData getCurrencyGroup( ) {
    return RCGGetIn;
  }

}
