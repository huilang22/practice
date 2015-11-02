/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ExchangeRateClassGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ExchangeRateClassGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExchangeRateClassObjectKeyData EXRCGetIn;
/**
 *
 * Constructor to create a  ExchangeRateClassGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExchangeRateClassGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ExchangeRateClassObjectKeyData EXRCGetInIn) {
    super(id, context, "ExchangeRateClassGet");
    EXRCGetIn = EXRCGetInIn;
  }

  public void translateToMap() {
    if (EXRCGetIn != null) {
      EXRCGetIn.resetFlags(true, true);
      addInput("ExchangeRateClass", ExchangeRateClassObjectKeyHelper.toMap(EXRCGetIn, new HashMap(), "ExchangeRateClassObjectKeyData").get("ExchangeRateClassObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExchangeRateClass
 * @param EXRCGetInIn Value of the EXRCGetIn
 *
 */

  public void setExchangeRateClass(ExchangeRateClassObjectKeyData EXRCGetInIn) {
    EXRCGetIn = EXRCGetInIn;
  }

  public void translateFromMap() {
    EXRCGetIn = ExchangeRateClassObjectKeyHelper.fromMap(inputMap, "ExchangeRateClass");
  }

/**
 *
 * Gets the ExchangeRateClass
 * @return Value of the ExchangeRateClass
 *
 */

  public ExchangeRateClassObjectKeyData getExchangeRateClass( ) {
    return EXRCGetIn;
  }

}
