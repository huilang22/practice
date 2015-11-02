/*
 * Generated code DO NOT EDIT
 * Generated file: CitChannelDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CitChannelDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CitChannelDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitChannelObjectKeyData citChannelDeleteIn;
/**
 *
 * Constructor to create a  CitChannelDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitChannelDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CitChannelObjectKeyData citChannelDeleteInIn) {
    super(id, context, "CitChannelDelete");
    citChannelDeleteIn = citChannelDeleteInIn;
  }

  public void translateToMap() {
    if (citChannelDeleteIn != null) {
      citChannelDeleteIn.resetFlags(true, true);
      addInput("CitChannel", CitChannelObjectKeyHelper.toMap(citChannelDeleteIn, new HashMap(), "CitChannelObjectKeyData").get("CitChannelObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitChannel
 * @param citChannelDeleteInIn Value of the citChannelDeleteIn
 *
 */

  public void setCitChannel(CitChannelObjectKeyData citChannelDeleteInIn) {
    citChannelDeleteIn = citChannelDeleteInIn;
  }

  public void translateFromMap() {
    citChannelDeleteIn = CitChannelObjectKeyHelper.fromMap(inputMap, "CitChannel");
  }

/**
 *
 * Gets the CitChannel
 * @return Value of the CitChannel
 *
 */

  public CitChannelObjectKeyData getCitChannel( ) {
    return citChannelDeleteIn;
  }

}
