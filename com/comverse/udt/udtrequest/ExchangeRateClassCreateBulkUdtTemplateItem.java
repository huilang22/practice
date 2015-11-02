/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassCreateBulkUdtTemplateItem.java
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
 * Class used to create a ExchangeRateClassCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExchangeRateClassCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExchangeRateClassObjectData EXRCCreateIn;
/**
 *
 * Constructor to create a  ExchangeRateClassCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExchangeRateClassCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExchangeRateClassObjectData EXRCCreateInIn) {
    super(id, context, "ExchangeRateClassCreate");
    EXRCCreateIn = EXRCCreateInIn;
  }

  public void translateToMap() {
    if (EXRCCreateIn != null) {
      EXRCCreateIn.resetFlags(true, true);
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(EXRCCreateIn, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }


/**
 *
 * Sets the ExchangeRateClass
 * @param EXRCCreateInIn Value of the EXRCCreateIn
 *
 */

  public void setExchangeRateClass(ExchangeRateClassObjectData EXRCCreateInIn) {
    EXRCCreateIn = EXRCCreateInIn;
  }

  public void translateFromMap() {
    EXRCCreateIn = ExchangeRateClassObjectHelper.fromMap(inputMap, "ExchangeRateClass");
  }

/**
 *
 * Gets the ExchangeRateClass
 * @return Value of the ExchangeRateClass
 *
 */

  public ExchangeRateClassObjectData getExchangeRateClass( ) {
    return EXRCCreateIn;
  }

}
