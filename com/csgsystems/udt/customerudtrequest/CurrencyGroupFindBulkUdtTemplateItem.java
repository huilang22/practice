/*
 * Generated code DO NOT EDIT
 * Generated file: CurrencyGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a CurrencyGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CurrencyGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CurrencyGroupObjectFilter RCGFindIn;
/**
 *
 * Constructor to create a  CurrencyGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CurrencyGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CurrencyGroupObjectFilter RCGFindInIn) {
    super(id, context, "CurrencyGroupFind");
    RCGFindIn = RCGFindInIn;
  }

  public void translateToMap() {
    if (RCGFindIn != null) {
      Integer index =  RCGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(RCGFindIn, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }


/**
 *
 * Sets the CurrencyGroup
 * @param RCGFindInIn Value of the RCGFindIn
 *
 */

  public void setCurrencyGroup(CurrencyGroupObjectFilter RCGFindInIn) {
    RCGFindIn = RCGFindInIn;
  }

  public void translateFromMap() {
    RCGFindIn = CurrencyGroupObjectHelper.fromMapFilter(inputMap, "CurrencyGroup");
  }

/**
 *
 * Gets the CurrencyGroup
 * @return Value of the CurrencyGroup
 *
 */

  public CurrencyGroupObjectFilter getCurrencyGroup( ) {
    return RCGFindIn;
  }

}
