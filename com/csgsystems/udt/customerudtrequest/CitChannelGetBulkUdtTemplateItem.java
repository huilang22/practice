/*
 * Generated code DO NOT EDIT
 * Generated file: CitChannelGetBulkUdtTemplateItem.java
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
 * Class used to create a CitChannelGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CitChannelGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitChannelObjectKeyData citChannelGetIn;
/**
 *
 * Constructor to create a  CitChannelGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitChannelGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CitChannelObjectKeyData citChannelGetInIn) {
    super(id, context, "CitChannelGet");
    citChannelGetIn = citChannelGetInIn;
  }

  public void translateToMap() {
    if (citChannelGetIn != null) {
      citChannelGetIn.resetFlags(true, true);
      addInput("CitChannel", CitChannelObjectKeyHelper.toMap(citChannelGetIn, new HashMap(), "CitChannelObjectKeyData").get("CitChannelObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitChannel
 * @param citChannelGetInIn Value of the citChannelGetIn
 *
 */

  public void setCitChannel(CitChannelObjectKeyData citChannelGetInIn) {
    citChannelGetIn = citChannelGetInIn;
  }

  public void translateFromMap() {
    citChannelGetIn = CitChannelObjectKeyHelper.fromMap(inputMap, "CitChannel");
  }

/**
 *
 * Gets the CitChannel
 * @return Value of the CitChannel
 *
 */

  public CitChannelObjectKeyData getCitChannel( ) {
    return citChannelGetIn;
  }

}
