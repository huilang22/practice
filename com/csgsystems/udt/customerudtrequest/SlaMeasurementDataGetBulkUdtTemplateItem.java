/*
 * Generated code DO NOT EDIT
 * Generated file: SlaMeasurementDataGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a SlaMeasurementDataGetBulkUdtTemplateItem Bulk Template
 *
 */

public class SlaMeasurementDataGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SlaMeasurementDataObjectKeyData SlaMeasurementDataGetIn;
/**
 *
 * Constructor to create a  SlaMeasurementDataGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SlaMeasurementDataGetBulkUdtTemplateItem(String id, BSDMSessionContext context, SlaMeasurementDataObjectKeyData SlaMeasurementDataGetInIn) {
    super(id, context, "SlaMeasurementDataGet");
    SlaMeasurementDataGetIn = SlaMeasurementDataGetInIn;
  }

  public void translateToMap() {
    if (SlaMeasurementDataGetIn != null) {
      SlaMeasurementDataGetIn.resetFlags(true, true);
      addInput("SlaMeasurementData", SlaMeasurementDataObjectKeyHelper.toMap(SlaMeasurementDataGetIn, new HashMap(), "SlaMeasurementDataObjectKeyData").get("SlaMeasurementDataObjectKeyData"));
    }
  }


/**
 *
 * Sets the SlaMeasurementData
 * @param SlaMeasurementDataGetInIn Value of the SlaMeasurementDataGetIn
 *
 */

  public void setSlaMeasurementData(SlaMeasurementDataObjectKeyData SlaMeasurementDataGetInIn) {
    SlaMeasurementDataGetIn = SlaMeasurementDataGetInIn;
  }

  public void translateFromMap() {
    SlaMeasurementDataGetIn = SlaMeasurementDataObjectKeyHelper.fromMap(inputMap, "SlaMeasurementData");
  }

/**
 *
 * Gets the SlaMeasurementData
 * @return Value of the SlaMeasurementData
 *
 */

  public SlaMeasurementDataObjectKeyData getSlaMeasurementData( ) {
    return SlaMeasurementDataGetIn;
  }

}
