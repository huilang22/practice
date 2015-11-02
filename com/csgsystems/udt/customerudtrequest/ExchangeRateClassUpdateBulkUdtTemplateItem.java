/*
 * Generated code DO NOT EDIT
 * Generated file: ExchangeRateClassUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ExchangeRateClassUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExchangeRateClassUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExchangeRateClassObjectData EXRCUpdateIn;
/**
 *
 * Constructor to create a  ExchangeRateClassUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExchangeRateClassUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExchangeRateClassObjectData EXRCUpdateInIn) {
    super(id, context, "ExchangeRateClassUpdate");
    EXRCUpdateIn = EXRCUpdateInIn;
  }

  public void translateToMap() {
    if (EXRCUpdateIn != null) {
      EXRCUpdateIn.resetFlags(true, true);
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(EXRCUpdateIn, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }


/**
 *
 * Sets the ExchangeRateClass
 * @param EXRCUpdateInIn Value of the EXRCUpdateIn
 *
 */

  public void setExchangeRateClass(ExchangeRateClassObjectData EXRCUpdateInIn) {
    EXRCUpdateIn = EXRCUpdateInIn;
  }

  public void translateFromMap() {
    EXRCUpdateIn = ExchangeRateClassObjectHelper.fromMap(inputMap, "ExchangeRateClass");
  }

/**
 *
 * Gets the ExchangeRateClass
 * @return Value of the ExchangeRateClass
 *
 */

  public ExchangeRateClassObjectData getExchangeRateClass( ) {
    return EXRCUpdateIn;
  }

}
