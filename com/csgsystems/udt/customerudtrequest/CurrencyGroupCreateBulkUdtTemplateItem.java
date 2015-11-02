/*
 * Generated code DO NOT EDIT
 * Generated file: CurrencyGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a CurrencyGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CurrencyGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CurrencyGroupObjectData RCGCreateIn;
/**
 *
 * Constructor to create a  CurrencyGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CurrencyGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CurrencyGroupObjectData RCGCreateInIn) {
    super(id, context, "CurrencyGroupCreate");
    RCGCreateIn = RCGCreateInIn;
  }

  public void translateToMap() {
    if (RCGCreateIn != null) {
      RCGCreateIn.resetFlags(true, true);
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(RCGCreateIn, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }


/**
 *
 * Sets the CurrencyGroup
 * @param RCGCreateInIn Value of the RCGCreateIn
 *
 */

  public void setCurrencyGroup(CurrencyGroupObjectData RCGCreateInIn) {
    RCGCreateIn = RCGCreateInIn;
  }

  public void translateFromMap() {
    RCGCreateIn = CurrencyGroupObjectHelper.fromMap(inputMap, "CurrencyGroup");
  }

/**
 *
 * Gets the CurrencyGroup
 * @return Value of the CurrencyGroup
 *
 */

  public CurrencyGroupObjectData getCurrencyGroup( ) {
    return RCGCreateIn;
  }

}
