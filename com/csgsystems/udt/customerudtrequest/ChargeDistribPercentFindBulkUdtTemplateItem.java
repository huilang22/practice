/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDistribPercentFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ChargeDistribPercentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ChargeDistribPercentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ChargeDistribPercentObjectFilter CDPfind_In;
/**
 *
 * Constructor to create a  ChargeDistribPercentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ChargeDistribPercentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDistribPercentObjectFilter CDPfind_InIn) {
    super(id, context, "ChargeDistribPercentFind");
    CDPfind_In = CDPfind_InIn;
  }

  public void translateToMap() {
    if (CDPfind_In != null) {
      Integer index =  CDPfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(CDPfind_In, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }


/**
 *
 * Sets the ChargeDistribPercent
 * @param CDPfind_InIn Value of the CDPfind_In
 *
 */

  public void setChargeDistribPercent(ChargeDistribPercentObjectFilter CDPfind_InIn) {
    CDPfind_In = CDPfind_InIn;
  }

  public void translateFromMap() {
    CDPfind_In = ChargeDistribPercentObjectHelper.fromMapFilter(inputMap, "ChargeDistribPercent");
  }

/**
 *
 * Gets the ChargeDistribPercent
 * @return Value of the ChargeDistribPercent
 *
 */

  public ChargeDistribPercentObjectFilter getChargeDistribPercent( ) {
    return CDPfind_In;
  }

}
