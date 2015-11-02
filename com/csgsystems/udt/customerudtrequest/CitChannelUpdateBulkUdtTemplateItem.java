/*
 * Generated code DO NOT EDIT
 * Generated file: CitChannelUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a CitChannelUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitChannelUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitChannelObjectData citChannelUpdateIn;
/**
 *
 * Constructor to create a  CitChannelUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitChannelUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitChannelObjectData citChannelUpdateInIn) {
    super(id, context, "CitChannelUpdate");
    citChannelUpdateIn = citChannelUpdateInIn;
  }

  public void translateToMap() {
    if (citChannelUpdateIn != null) {
      citChannelUpdateIn.resetFlags(true, true);
      addInput("CitChannel", CitChannelObjectHelper.toMap(citChannelUpdateIn, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }


/**
 *
 * Sets the CitChannel
 * @param citChannelUpdateInIn Value of the citChannelUpdateIn
 *
 */

  public void setCitChannel(CitChannelObjectData citChannelUpdateInIn) {
    citChannelUpdateIn = citChannelUpdateInIn;
  }

  public void translateFromMap() {
    citChannelUpdateIn = CitChannelObjectHelper.fromMap(inputMap, "CitChannel");
  }

/**
 *
 * Gets the CitChannel
 * @return Value of the CitChannel
 *
 */

  public CitChannelObjectData getCitChannel( ) {
    return citChannelUpdateIn;
  }

}
