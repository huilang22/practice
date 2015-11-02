/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskObjectBaseData citTaskUpdateIn;
/**
 *
 * Constructor to create a  CitTaskUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectBaseData citTaskUpdateInIn) {
    super(id, context, "CitTaskUpdate");
    citTaskUpdateIn = citTaskUpdateInIn;
  }

  public void translateToMap() {
    if (citTaskUpdateIn != null) {
      citTaskUpdateIn.resetFlags(true, true);
      addInput("CitTask", CitTaskObjectBaseHelper.toMap(citTaskUpdateIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }


/**
 *
 * Sets the CitTask
 * @param citTaskUpdateInIn Value of the citTaskUpdateIn
 *
 */

  public void setCitTask(CitTaskObjectBaseData citTaskUpdateInIn) {
    citTaskUpdateIn = citTaskUpdateInIn;
  }

  public void translateFromMap() {
    citTaskUpdateIn = CitTaskObjectBaseHelper.fromMap(inputMap, "CitTask");
  }

/**
 *
 * Gets the CitTask
 * @return Value of the CitTask
 *
 */

  public CitTaskObjectBaseData getCitTask( ) {
    return citTaskUpdateIn;
  }

}
