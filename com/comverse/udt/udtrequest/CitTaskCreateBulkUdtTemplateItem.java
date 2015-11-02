/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskCreateBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskObjectBaseData citTaskCreateIn;
/**
 *
 * Constructor to create a  CitTaskCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectBaseData citTaskCreateInIn) {
    super(id, context, "CitTaskCreate");
    citTaskCreateIn = citTaskCreateInIn;
  }

  public void translateToMap() {
    if (citTaskCreateIn != null) {
      citTaskCreateIn.resetFlags(true, true);
      addInput("CitTask", CitTaskObjectBaseHelper.toMap(citTaskCreateIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }


/**
 *
 * Sets the CitTask
 * @param citTaskCreateInIn Value of the citTaskCreateIn
 *
 */

  public void setCitTask(CitTaskObjectBaseData citTaskCreateInIn) {
    citTaskCreateIn = citTaskCreateInIn;
  }

  public void translateFromMap() {
    citTaskCreateIn = CitTaskObjectBaseHelper.fromMap(inputMap, "CitTask");
  }

/**
 *
 * Gets the CitTask
 * @return Value of the CitTask
 *
 */

  public CitTaskObjectBaseData getCitTask( ) {
    return citTaskCreateIn;
  }

}
