/*
 * Generated code DO NOT EDIT
 * Generated file: ExchangeRateClassDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ExchangeRateClassDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ExchangeRateClassDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExchangeRateClassObjectKeyData EXRCDeleteIn;
/**
 *
 * Constructor to create a  ExchangeRateClassDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExchangeRateClassDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ExchangeRateClassObjectKeyData EXRCDeleteInIn) {
    super(id, context, "ExchangeRateClassDelete");
    EXRCDeleteIn = EXRCDeleteInIn;
  }

  public void translateToMap() {
    if (EXRCDeleteIn != null) {
      EXRCDeleteIn.resetFlags(true, true);
      addInput("ExchangeRateClass", ExchangeRateClassObjectKeyHelper.toMap(EXRCDeleteIn, new HashMap(), "ExchangeRateClassObjectKeyData").get("ExchangeRateClassObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExchangeRateClass
 * @param EXRCDeleteInIn Value of the EXRCDeleteIn
 *
 */

  public void setExchangeRateClass(ExchangeRateClassObjectKeyData EXRCDeleteInIn) {
    EXRCDeleteIn = EXRCDeleteInIn;
  }

  public void translateFromMap() {
    EXRCDeleteIn = ExchangeRateClassObjectKeyHelper.fromMap(inputMap, "ExchangeRateClass");
  }

/**
 *
 * Gets the ExchangeRateClass
 * @return Value of the ExchangeRateClass
 *
 */

  public ExchangeRateClassObjectKeyData getExchangeRateClass( ) {
    return EXRCDeleteIn;
  }

}
