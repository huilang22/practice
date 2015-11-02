/*
 * Generated code DO NOT EDIT
 * Generated file: CurrencyGroupDeleteBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a CurrencyGroupDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CurrencyGroupDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CurrencyGroupObjectKeyData RCGDeleteIn;
/**
 *
 * Constructor to create a  CurrencyGroupDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CurrencyGroupDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CurrencyGroupObjectKeyData RCGDeleteInIn) {
    super(id, context, "CurrencyGroupDelete");
    RCGDeleteIn = RCGDeleteInIn;
  }

  public void translateToMap() {
    if (RCGDeleteIn != null) {
      RCGDeleteIn.resetFlags(true, true);
      addInput("CurrencyGroup", CurrencyGroupObjectKeyHelper.toMap(RCGDeleteIn, new HashMap(), "CurrencyGroupObjectKeyData").get("CurrencyGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the CurrencyGroup
 * @param RCGDeleteInIn Value of the RCGDeleteIn
 *
 */

  public void setCurrencyGroup(CurrencyGroupObjectKeyData RCGDeleteInIn) {
    RCGDeleteIn = RCGDeleteInIn;
  }

  public void translateFromMap() {
    RCGDeleteIn = CurrencyGroupObjectKeyHelper.fromMap(inputMap, "CurrencyGroup");
  }

/**
 *
 * Gets the CurrencyGroup
 * @return Value of the CurrencyGroup
 *
 */

  public CurrencyGroupObjectKeyData getCurrencyGroup( ) {
    return RCGDeleteIn;
  }

}
