/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelCreateBulkUdtTemplateItem.java
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
 * Class used to create a CitChannelCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitChannelCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitChannelObjectData citChannelCreateIn;
/**
 *
 * Constructor to create a  CitChannelCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitChannelCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitChannelObjectData citChannelCreateInIn) {
    super(id, context, "CitChannelCreate");
    citChannelCreateIn = citChannelCreateInIn;
  }

  public void translateToMap() {
    if (citChannelCreateIn != null) {
      citChannelCreateIn.resetFlags(true, true);
      addInput("CitChannel", CitChannelObjectHelper.toMap(citChannelCreateIn, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }


/**
 *
 * Sets the CitChannel
 * @param citChannelCreateInIn Value of the citChannelCreateIn
 *
 */

  public void setCitChannel(CitChannelObjectData citChannelCreateInIn) {
    citChannelCreateIn = citChannelCreateInIn;
  }

  public void translateFromMap() {
    citChannelCreateIn = CitChannelObjectHelper.fromMap(inputMap, "CitChannel");
  }

/**
 *
 * Gets the CitChannel
 * @return Value of the CitChannel
 *
 */

  public CitChannelObjectData getCitChannel( ) {
    return citChannelCreateIn;
  }

}
