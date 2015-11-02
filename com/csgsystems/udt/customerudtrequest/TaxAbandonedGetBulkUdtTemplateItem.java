/*
 * Generated code DO NOT EDIT
 * Generated file: TaxAbandonedGetBulkUdtTemplateItem.java
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
 * Class used to create a TaxAbandonedGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxAbandonedGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxAbandonedObjectKeyData TAget_In;
/**
 *
 * Constructor to create a  TaxAbandonedGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxAbandonedGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxAbandonedObjectKeyData TAget_InIn) {
    super(id, context, "TaxAbandonedGet");
    TAget_In = TAget_InIn;
  }

  public void translateToMap() {
    if (TAget_In != null) {
      TAget_In.resetFlags(true, true);
      addInput("TaxAbandoned", TaxAbandonedObjectKeyHelper.toMap(TAget_In, new HashMap(), "TaxAbandonedObjectKeyData").get("TaxAbandonedObjectKeyData"));
    }
  }


/**
 *
 * Sets the TaxAbandoned
 * @param TAget_InIn Value of the TAget_In
 *
 */

  public void setTaxAbandoned(TaxAbandonedObjectKeyData TAget_InIn) {
    TAget_In = TAget_InIn;
  }

  public void translateFromMap() {
    TAget_In = TaxAbandonedObjectKeyHelper.fromMap(inputMap, "TaxAbandoned");
  }

/**
 *
 * Gets the TaxAbandoned
 * @return Value of the TaxAbandoned
 *
 */

  public TaxAbandonedObjectKeyData getTaxAbandoned( ) {
    return TAget_In;
  }

}
