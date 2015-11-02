/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectorGetBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * Class used to create a CollectorGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CollectorGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CollectorObjectKeyData getIn;
/**
 *
 * Constructor to create a  CollectorGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CollectorGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CollectorObjectKeyData getInIn) {
    super(id, context, "CollectorGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("Collector", CollectorObjectKeyHelper.toMap(getIn, new HashMap(), "CollectorObjectKeyData").get("CollectorObjectKeyData"));
    }
  }


/**
 *
 * Sets the Collector
 * @param getInIn Value of the getIn
 *
 */

  public void setCollector(CollectorObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = CollectorObjectKeyHelper.fromMap(inputMap, "Collector");
  }

/**
 *
 * Gets the Collector
 * @return Value of the Collector
 *
 */

  public CollectorObjectKeyData getCollector( ) {
    return getIn;
  }

}
