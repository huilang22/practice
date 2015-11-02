/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementDataFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a SlaMeasurementDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SlaMeasurementDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SlaMeasurementDataObjectFilter SlaMeasurementDataFindIn;
/**
 *
 * Constructor to create a  SlaMeasurementDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SlaMeasurementDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SlaMeasurementDataObjectFilter SlaMeasurementDataFindInIn) {
    super(id, context, "SlaMeasurementDataFind");
    SlaMeasurementDataFindIn = SlaMeasurementDataFindInIn;
  }

  public void translateToMap() {
    if (SlaMeasurementDataFindIn != null) {
      Integer index =  SlaMeasurementDataFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SlaMeasurementData", SlaMeasurementDataObjectHelper.toMap(SlaMeasurementDataFindIn, new HashMap(), "SlaMeasurementData").get("SlaMeasurementData"));
    }
  }


/**
 *
 * Sets the SlaMeasurementData
 * @param SlaMeasurementDataFindInIn Value of the SlaMeasurementDataFindIn
 *
 */

  public void setSlaMeasurementData(SlaMeasurementDataObjectFilter SlaMeasurementDataFindInIn) {
    SlaMeasurementDataFindIn = SlaMeasurementDataFindInIn;
  }

  public void translateFromMap() {
    SlaMeasurementDataFindIn = SlaMeasurementDataObjectHelper.fromMapFilter(inputMap, "SlaMeasurementData");
  }

/**
 *
 * Gets the SlaMeasurementData
 * @return Value of the SlaMeasurementData
 *
 */

  public SlaMeasurementDataObjectFilter getSlaMeasurementData( ) {
    return SlaMeasurementDataFindIn;
  }

}
