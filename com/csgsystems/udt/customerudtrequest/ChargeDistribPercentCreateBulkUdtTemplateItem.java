/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDistribPercentCreateBulkUdtTemplateItem.java
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
 * Class used to create a ChargeDistribPercentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ChargeDistribPercentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ChargeDistribPercentObjectData CDPcreate_In;
/**
 *
 * Constructor to create a  ChargeDistribPercentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ChargeDistribPercentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDistribPercentObjectData CDPcreate_InIn) {
    super(id, context, "ChargeDistribPercentCreate");
    CDPcreate_In = CDPcreate_InIn;
  }

  public void translateToMap() {
    if (CDPcreate_In != null) {
      CDPcreate_In.resetFlags(true, true);
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(CDPcreate_In, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }


/**
 *
 * Sets the ChargeDistribPercent
 * @param CDPcreate_InIn Value of the CDPcreate_In
 *
 */

  public void setChargeDistribPercent(ChargeDistribPercentObjectData CDPcreate_InIn) {
    CDPcreate_In = CDPcreate_InIn;
  }

  public void translateFromMap() {
    CDPcreate_In = ChargeDistribPercentObjectHelper.fromMap(inputMap, "ChargeDistribPercent");
  }

/**
 *
 * Gets the ChargeDistribPercent
 * @return Value of the ChargeDistribPercent
 *
 */

  public ChargeDistribPercentObjectData getChargeDistribPercent( ) {
    return CDPcreate_In;
  }

}
