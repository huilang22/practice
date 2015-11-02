/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeRefGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a StatisticTypeRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class StatisticTypeRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatisticTypeRefObjectKeyData StatisticTypeRefGetIn;
/**
 *
 * Constructor to create a  StatisticTypeRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatisticTypeRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, StatisticTypeRefObjectKeyData StatisticTypeRefGetInIn) {
    super(id, context, "StatisticTypeRefGet");
    StatisticTypeRefGetIn = StatisticTypeRefGetInIn;
  }

  public void translateToMap() {
    if (StatisticTypeRefGetIn != null) {
      StatisticTypeRefGetIn.resetFlags(true, true);
      addInput("StatisticTypeRef", StatisticTypeRefObjectKeyHelper.toMap(StatisticTypeRefGetIn, new HashMap(), "StatisticTypeRefObjectKeyData").get("StatisticTypeRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the StatisticTypeRef
 * @param StatisticTypeRefGetInIn Value of the StatisticTypeRefGetIn
 *
 */

  public void setStatisticTypeRef(StatisticTypeRefObjectKeyData StatisticTypeRefGetInIn) {
    StatisticTypeRefGetIn = StatisticTypeRefGetInIn;
  }

  public void translateFromMap() {
    StatisticTypeRefGetIn = StatisticTypeRefObjectKeyHelper.fromMap(inputMap, "StatisticTypeRef");
  }

/**
 *
 * Gets the StatisticTypeRef
 * @return Value of the StatisticTypeRef
 *
 */

  public StatisticTypeRefObjectKeyData getStatisticTypeRef( ) {
    return StatisticTypeRefGetIn;
  }

}
