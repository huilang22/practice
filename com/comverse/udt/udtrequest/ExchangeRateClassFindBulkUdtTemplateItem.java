/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassFindBulkUdtTemplateItem.java
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
 * Class used to create a ExchangeRateClassFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExchangeRateClassFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExchangeRateClassObjectFilter EXRCFindIn;
/**
 *
 * Constructor to create a  ExchangeRateClassFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExchangeRateClassFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ExchangeRateClassObjectFilter EXRCFindInIn) {
    super(id, context, "ExchangeRateClassFind");
    EXRCFindIn = EXRCFindInIn;
  }

  public void translateToMap() {
    if (EXRCFindIn != null) {
      Integer index =  EXRCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(EXRCFindIn, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }


/**
 *
 * Sets the ExchangeRateClass
 * @param EXRCFindInIn Value of the EXRCFindIn
 *
 */

  public void setExchangeRateClass(ExchangeRateClassObjectFilter EXRCFindInIn) {
    EXRCFindIn = EXRCFindInIn;
  }

  public void translateFromMap() {
    EXRCFindIn = ExchangeRateClassObjectHelper.fromMapFilter(inputMap, "ExchangeRateClass");
  }

/**
 *
 * Gets the ExchangeRateClass
 * @return Value of the ExchangeRateClass
 *
 */

  public ExchangeRateClassObjectFilter getExchangeRateClass( ) {
    return EXRCFindIn;
  }

}
