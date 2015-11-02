/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * Class used to create a CitTaskDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskObjectBaseKeyData citTaskDeleteIn;
/**
 *
 * Constructor to create a  CitTaskDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectBaseKeyData citTaskDeleteInIn) {
    super(id, context, "CitTaskDelete");
    citTaskDeleteIn = citTaskDeleteInIn;
  }

  public void translateToMap() {
    if (citTaskDeleteIn != null) {
      citTaskDeleteIn.resetFlags(true, true);
      addInput("CitTask", CitTaskObjectBaseKeyHelper.toMap(citTaskDeleteIn, new HashMap(), "CitTaskObjectBaseKeyData").get("CitTaskObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the CitTask
 * @param citTaskDeleteInIn Value of the citTaskDeleteIn
 *
 */

  public void setCitTask(CitTaskObjectBaseKeyData citTaskDeleteInIn) {
    citTaskDeleteIn = citTaskDeleteInIn;
  }

  public void translateFromMap() {
    citTaskDeleteIn = CitTaskObjectBaseKeyHelper.fromMap(inputMap, "CitTask");
  }

/**
 *
 * Gets the CitTask
 * @return Value of the CitTask
 *
 */

  public CitTaskObjectBaseKeyData getCitTask( ) {
    return citTaskDeleteIn;
  }

}
