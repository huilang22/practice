/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDistribPercentGetBulkUdtTemplateItem.java
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
 * Class used to create a ChargeDistribPercentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ChargeDistribPercentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ChargeDistribPercentObjectKeyData CDPget_In;
/**
 *
 * Constructor to create a  ChargeDistribPercentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ChargeDistribPercentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDistribPercentObjectKeyData CDPget_InIn) {
    super(id, context, "ChargeDistribPercentGet");
    CDPget_In = CDPget_InIn;
  }

  public void translateToMap() {
    if (CDPget_In != null) {
      CDPget_In.resetFlags(true, true);
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectKeyHelper.toMap(CDPget_In, new HashMap(), "ChargeDistribPercentObjectKeyData").get("ChargeDistribPercentObjectKeyData"));
    }
  }


/**
 *
 * Sets the ChargeDistribPercent
 * @param CDPget_InIn Value of the CDPget_In
 *
 */

  public void setChargeDistribPercent(ChargeDistribPercentObjectKeyData CDPget_InIn) {
    CDPget_In = CDPget_InIn;
  }

  public void translateFromMap() {
    CDPget_In = ChargeDistribPercentObjectKeyHelper.fromMap(inputMap, "ChargeDistribPercent");
  }

/**
 *
 * Gets the ChargeDistribPercent
 * @return Value of the ChargeDistribPercent
 *
 */

  public ChargeDistribPercentObjectKeyData getChargeDistribPercent( ) {
    return CDPget_In;
  }

}
