/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskGetBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskObjectBaseKeyData citTaskGetIn;
/**
 *
 * Constructor to create a  CitTaskGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectBaseKeyData citTaskGetInIn) {
    super(id, context, "CitTaskGet");
    citTaskGetIn = citTaskGetInIn;
  }

  public void translateToMap() {
    if (citTaskGetIn != null) {
      citTaskGetIn.resetFlags(true, true);
      addInput("CitTask", CitTaskObjectBaseKeyHelper.toMap(citTaskGetIn, new HashMap(), "CitTaskObjectBaseKeyData").get("CitTaskObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the CitTask
 * @param citTaskGetInIn Value of the citTaskGetIn
 *
 */

  public void setCitTask(CitTaskObjectBaseKeyData citTaskGetInIn) {
    citTaskGetIn = citTaskGetInIn;
  }

  public void translateFromMap() {
    citTaskGetIn = CitTaskObjectBaseKeyHelper.fromMap(inputMap, "CitTask");
  }

/**
 *
 * Gets the CitTask
 * @return Value of the CitTask
 *
 */

  public CitTaskObjectBaseKeyData getCitTask( ) {
    return citTaskGetIn;
  }

}
